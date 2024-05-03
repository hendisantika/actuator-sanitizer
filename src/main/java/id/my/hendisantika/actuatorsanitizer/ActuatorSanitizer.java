package id.my.hendisantika.actuatorsanitizer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.endpoint.SanitizableData;
import org.springframework.boot.actuate.endpoint.SanitizingFunction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * Project : actuator-sanitizer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/4/24
 * Time: 06:53
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ActuatorSanitizer implements SanitizingFunction {

    private static final String[] REGEX_PARTS = {"*", "$", "^", "+"};
    private static final Set<String> DEFAULT_KEYS_TO_SANITIZE = Set.of("password", "secret");
    private final List<Pattern> keysToSanitize = new ArrayList<>();

    public ActuatorSanitizer(@Value("${management.endpoint.additionalKeysToSanitize:}") List<String> additionalKeys) {
        addKeysToSanitize(DEFAULT_KEYS_TO_SANITIZE);
        addKeysToSanitize(additionalKeys);
    }

    @Override
    public SanitizableData apply(SanitizableData data) {
        if (data.getValue() == null) {
            return data;
        }

        for (Pattern pattern : keysToSanitize) {
            if (pattern.matcher(data.getKey()).matches()) {
                return data.withValue(SanitizableData.SANITIZED_VALUE);
            }
        }
        return data;
    }

    private void addKeysToSanitize(Collection<String> keysToSanitize) {
        for (String key : keysToSanitize) {
            this.keysToSanitize.add(getPattern(key));
        }
    }

    private Pattern getPattern(String value) {
        if (isRegex(value)) {
            return Pattern.compile(value, Pattern.CASE_INSENSITIVE);
        }
        return Pattern.compile(".*" + value + "$", Pattern.CASE_INSENSITIVE);
    }

    private boolean isRegex(String value) {
        for (String part : REGEX_PARTS) {
            if (value.contains(part)) {
                return true;
            }
        }
        return false;
    }
}
