# actuator-sanitizer

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/actuator-sanitizer.git`
2. Navigate to the folder: `cd actuator-sanitizer`
3. Run the application: `mvn clean spring-boot:run`
4. Open your favorite browser: http://localhost:8080/actuator/env

Before enable ENV values

```shell
// 20240504065331
// http://localhost:8080/actuator/env

{
  "activeProfiles": [
    
  ],
  "propertySources": [
    {
      "name": "server.ports",
      "properties": {
        "local.server.port": {
          "value": "******"
        }
      }
    },
    {
      "name": "servletContextInitParams",
      "properties": {
        
      }
    },
    {
      "name": "systemProperties",
      "properties": {
        "java.specification.version": {
          "value": "******"
        },
        "sun.jnu.encoding": {
          "value": "******"
        },
        "java.class.path": {
          "value": "******"
        },
        "java.vm.vendor": {
          "value": "******"
        },
        "sun.arch.data.model": {
          "value": "******"
        },
        "java.vendor.url": {
          "value": "******"
        },
        "catalina.useNaming": {
          "value": "******"
        },
        "user.timezone": {
          "value": "******"
        },
        "java.vm.specification.version": {
          "value": "******"
        },
        "os.name": {
          "value": "******"
        },
        "sun.java.launcher": {
          "value": "******"
        },
        "user.country": {
          "value": "******"
        },
        "sun.boot.library.path": {
          "value": "******"
        },
        "spring.application.admin.enabled": {
          "value": "******"
        },
        "sun.java.command": {
          "value": "******"
        },
        "com.sun.management.jmxremote": {
          "value": "******"
        },
        "http.nonProxyHosts": {
          "value": "******"
        },
        "jdk.debug": {
          "value": "******"
        },
        "spring.liveBeansView.mbeanDomain": {
          "value": "******"
        },
        "sun.cpu.endian": {
          "value": "******"
        },
        "user.home": {
          "value": "******"
        },
        "user.language": {
          "value": "******"
        },
        "sun.stderr.encoding": {
          "value": "******"
        },
        "java.specification.vendor": {
          "value": "******"
        },
        "java.version.date": {
          "value": "******"
        },
        "java.home": {
          "value": "******"
        },
        "spring.output.ansi.enabled": {
          "value": "******"
        },
        "file.separator": {
          "value": "******"
        },
        "java.vm.compressedOopsMode": {
          "value": "******"
        },
        "sun.stdout.encoding": {
          "value": "******"
        },
        "line.separator": {
          "value": "******"
        },
        "java.vm.specification.vendor": {
          "value": "******"
        },
        "java.specification.name": {
          "value": "******"
        },
        "FILE_LOG_CHARSET": {
          "value": "******"
        },
        "java.awt.headless": {
          "value": "******"
        },
        "apple.awt.application.name": {
          "value": "******"
        },
        "sun.management.compiler": {
          "value": "******"
        },
        "ftp.nonProxyHosts": {
          "value": "******"
        },
        "java.runtime.version": {
          "value": "******"
        },
        "user.name": {
          "value": "******"
        },
        "spring.jmx.enabled": {
          "value": "******"
        },
        "stdout.encoding": {
          "value": "******"
        },
        "path.separator": {
          "value": "******"
        },
        "management.endpoints.jmx.exposure.include": {
          "value": "******"
        },
        "os.version": {
          "value": "******"
        },
        "java.runtime.name": {
          "value": "******"
        },
        "file.encoding": {
          "value": "******"
        },
        "java.vm.name": {
          "value": "******"
        },
        "java.vendor.version": {
          "value": "******"
        },
        "java.vendor.url.bug": {
          "value": "******"
        },
        "java.io.tmpdir": {
          "value": "******"
        },
        "catalina.home": {
          "value": "******"
        },
        "java.version": {
          "value": "******"
        },
        "user.dir": {
          "value": "******"
        },
        "os.arch": {
          "value": "******"
        },
        "java.vm.specification.name": {
          "value": "******"
        },
        "PID": {
          "value": "******"
        },
        "CONSOLE_LOG_CHARSET": {
          "value": "******"
        },
        "catalina.base": {
          "value": "******"
        },
        "native.encoding": {
          "value": "******"
        },
        "java.library.path": {
          "value": "******"
        },
        "java.vm.info": {
          "value": "******"
        },
        "stderr.encoding": {
          "value": "******"
        },
        "java.vendor": {
          "value": "******"
        },
        "java.vm.version": {
          "value": "******"
        },
        "java.rmi.server.randomIDs": {
          "value": "******"
        },
        "sun.io.unicode.encoding": {
          "value": "******"
        },
        "socksNonProxyHosts": {
          "value": "******"
        },
        "java.class.version": {
          "value": "******"
        },
        "LOGGED_APPLICATION_NAME": {
          "value": "******"
        }
      }
    },
    {
      "name": "systemEnvironment",
      "properties": {
        "HOMEBREW_PREFIX": {
          "value": "******",
          "origin": "System Environment Property \"HOMEBREW_PREFIX\""
        },
        "SDKMAN_CANDIDATES_API": {
          "value": "******",
          "origin": "System Environment Property \"SDKMAN_CANDIDATES_API\""
        },
        "MANPATH": {
          "value": "******",
          "origin": "System Environment Property \"MANPATH\""
        },
        "COMMAND_MODE": {
          "value": "******",
          "origin": "System Environment Property \"COMMAND_MODE\""
        },
        "INFOPATH": {
          "value": "******",
          "origin": "System Environment Property \"INFOPATH\""
        },
        "SHELL": {
          "value": "******",
          "origin": "System Environment Property \"SHELL\""
        },
        "TMPDIR": {
          "value": "******",
          "origin": "System Environment Property \"TMPDIR\""
        },
        "__CFBundleIdentifier": {
          "value": "******",
          "origin": "System Environment Property \"__CFBundleIdentifier\""
        },
        "HOME": {
          "value": "******",
          "origin": "System Environment Property \"HOME\""
        },
        "HOMEBREW_REPOSITORY": {
          "value": "******",
          "origin": "System Environment Property \"HOMEBREW_REPOSITORY\""
        },
        "PATH": {
          "value": "******",
          "origin": "System Environment Property \"PATH\""
        },
        "LOGNAME": {
          "value": "******",
          "origin": "System Environment Property \"LOGNAME\""
        },
        "NVM_RC_VERSION": {
          "value": "******",
          "origin": "System Environment Property \"NVM_RC_VERSION\""
        },
        "__CF_USER_TEXT_ENCODING": {
          "value": "******",
          "origin": "System Environment Property \"__CF_USER_TEXT_ENCODING\""
        },
        "XPC_FLAGS": {
          "value": "******",
          "origin": "System Environment Property \"XPC_FLAGS\""
        },
        "BUN_INSTALL": {
          "value": "******",
          "origin": "System Environment Property \"BUN_INSTALL\""
        },
        "NVM_CD_FLAGS": {
          "value": "******",
          "origin": "System Environment Property \"NVM_CD_FLAGS\""
        },
        "IDEA_INITIAL_DIRECTORY": {
          "value": "******",
          "origin": "System Environment Property \"IDEA_INITIAL_DIRECTORY\""
        },
        "NVM_DIR": {
          "value": "******",
          "origin": "System Environment Property \"NVM_DIR\""
        },
        "LC_CTYPE": {
          "value": "******",
          "origin": "System Environment Property \"LC_CTYPE\""
        },
        "JAVA_HOME": {
          "value": "******",
          "origin": "System Environment Property \"JAVA_HOME\""
        },
        "SDKMAN_VERSION": {
          "value": "******",
          "origin": "System Environment Property \"SDKMAN_VERSION\""
        },
        "SSH_AUTH_SOCK": {
          "value": "******",
          "origin": "System Environment Property \"SSH_AUTH_SOCK\""
        },
        "MAVEN_HOME": {
          "value": "******",
          "origin": "System Environment Property \"MAVEN_HOME\""
        },
        "OLDPWD": {
          "value": "******",
          "origin": "System Environment Property \"OLDPWD\""
        },
        "SDKMAN_DIR": {
          "value": "******",
          "origin": "System Environment Property \"SDKMAN_DIR\""
        },
        "SDKMAN_CANDIDATES_DIR": {
          "value": "******",
          "origin": "System Environment Property \"SDKMAN_CANDIDATES_DIR\""
        },
        "HERD_PHP_83_INI_SCAN_DIR": {
          "value": "******",
          "origin": "System Environment Property \"HERD_PHP_83_INI_SCAN_DIR\""
        },
        "XPC_SERVICE_NAME": {
          "value": "******",
          "origin": "System Environment Property \"XPC_SERVICE_NAME\""
        },
        "HERD_PHP_82_INI_SCAN_DIR": {
          "value": "******",
          "origin": "System Environment Property \"HERD_PHP_82_INI_SCAN_DIR\""
        },
        "USER": {
          "value": "******",
          "origin": "System Environment Property \"USER\""
        },
        "SDKMAN_PLATFORM": {
          "value": "******",
          "origin": "System Environment Property \"SDKMAN_PLATFORM\""
        },
        "HOMEBREW_CELLAR": {
          "value": "******",
          "origin": "System Environment Property \"HOMEBREW_CELLAR\""
        },
        "GRADLE_HOME": {
          "value": "******",
          "origin": "System Environment Property \"GRADLE_HOME\""
        },
        "PWD": {
          "value": "******",
          "origin": "System Environment Property \"PWD\""
        },
        "PNPM_HOME": {
          "value": "******",
          "origin": "System Environment Property \"PNPM_HOME\""
        }
      }
    },
    {
      "name": "Config resource 'class path resource [application.yml]' via location 'optional:classpath:/'",
      "properties": {
        "spring.application.name": {
          "value": "******",
          "origin": "class path resource [application.yml] - 3:11"
        },
        "server.port": {
          "value": "******",
          "origin": "class path resource [application.yml] - 5:9"
        },
        "test.password": {
          "value": "******",
          "origin": "class path resource [application.yml] - 8:13"
        },
        "management.endpoints.web.exposure.include": {
          "value": "******",
          "origin": "class path resource [application.yml] - 14:18"
        }
      }
    }
  ]
}
```

After Show Env Vars

```shell
// 20240504065430
// http://localhost:8080/actuator/env

{
  "activeProfiles": [
    
  ],
  "propertySources": [
    {
      "name": "server.ports",
      "properties": {
        "local.server.port": {
          "value": 8080
        }
      }
    },
    {
      "name": "servletContextInitParams",
      "properties": {
        
      }
    },
    {
      "name": "systemProperties",
      "properties": {
        "java.specification.version": {
          "value": "21"
        },
        "sun.jnu.encoding": {
          "value": "UTF-8"
        },
        "java.class.path": {
          "value": "/Users/hendisantika/IdeaProjects/actuator-sanitizer/target/classes:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-web/3.2.5/spring-boot-starter-web-3.2.5.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter/3.2.5/spring-boot-starter-3.2.5.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot/3.2.5/spring-boot-3.2.5.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/3.2.5/spring-boot-autoconfigure-3.2.5.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-logging/3.2.5/spring-boot-starter-logging-3.2.5.jar:/Users/hendisantika/.m2/repository/ch/qos/logback/logback-classic/1.4.14/logback-classic-1.4.14.jar:/Users/hendisantika/.m2/repository/ch/qos/logback/logback-core/1.4.14/logback-core-1.4.14.jar:/Users/hendisantika/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.21.1/log4j-to-slf4j-2.21.1.jar:/Users/hendisantika/.m2/repository/org/apache/logging/log4j/log4j-api/2.21.1/log4j-api-2.21.1.jar:/Users/hendisantika/.m2/repository/org/slf4j/jul-to-slf4j/2.0.13/jul-to-slf4j-2.0.13.jar:/Users/hendisantika/.m2/repository/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.jar:/Users/hendisantika/.m2/repository/org/yaml/snakeyaml/2.2/snakeyaml-2.2.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-json/3.2.5/spring-boot-starter-json-3.2.5.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.15.4/jackson-databind-2.15.4.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.15.4/jackson-annotations-2.15.4.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.15.4/jackson-core-2.15.4.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.15.4/jackson-datatype-jdk8-2.15.4.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.15.4/jackson-datatype-jsr310-2.15.4.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.15.4/jackson-module-parameter-names-2.15.4.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/3.2.5/spring-boot-starter-tomcat-3.2.5.jar:/Users/hendisantika/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/10.1.20/tomcat-embed-core-10.1.20.jar:/Users/hendisantika/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/10.1.20/tomcat-embed-el-10.1.20.jar:/Users/hendisantika/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.20/tomcat-embed-websocket-10.1.20.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-web/6.1.6/spring-web-6.1.6.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-beans/6.1.6/spring-beans-6.1.6.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-webmvc/6.1.6/spring-webmvc-6.1.6.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-aop/6.1.6/spring-aop-6.1.6.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-context/6.1.6/spring-context-6.1.6.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-expression/6.1.6/spring-expression-6.1.6.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-actuator/3.2.5/spring-boot-starter-actuator-3.2.5.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/3.2.5/spring-boot-actuator-autoconfigure-3.2.5.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-actuator/3.2.5/spring-boot-actuator-3.2.5.jar:/Users/hendisantika/.m2/repository/io/micrometer/micrometer-observation/1.12.5/micrometer-observation-1.12.5.jar:/Users/hendisantika/.m2/repository/io/micrometer/micrometer-commons/1.12.5/micrometer-commons-1.12.5.jar:/Users/hendisantika/.m2/repository/io/micrometer/micrometer-jakarta9/1.12.5/micrometer-jakarta9-1.12.5.jar:/Users/hendisantika/.m2/repository/io/micrometer/micrometer-core/1.12.5/micrometer-core-1.12.5.jar:/Users/hendisantika/.m2/repository/org/hdrhistogram/HdrHistogram/2.1.12/HdrHistogram-2.1.12.jar:/Users/hendisantika/.m2/repository/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.jar:/Users/hendisantika/.m2/repository/org/slf4j/slf4j-api/2.0.13/slf4j-api-2.0.13.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-core/6.1.6/spring-core-6.1.6.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-jcl/6.1.6/spring-jcl-6.1.6.jar"
        },
        "java.vm.vendor": {
          "value": "Amazon.com Inc."
        },
        "sun.arch.data.model": {
          "value": "64"
        },
        "java.vendor.url": {
          "value": "https://aws.amazon.com/corretto/"
        },
        "catalina.useNaming": {
          "value": "false"
        },
        "user.timezone": {
          "value": "Asia/Jakarta"
        },
        "java.vm.specification.version": {
          "value": "21"
        },
        "os.name": {
          "value": "Mac OS X"
        },
        "sun.java.launcher": {
          "value": "SUN_STANDARD"
        },
        "user.country": {
          "value": "US"
        },
        "sun.boot.library.path": {
          "value": "/Users/hendisantika/.sdkman/candidates/java/21-amzn/lib"
        },
        "spring.application.admin.enabled": {
          "value": "true"
        },
        "sun.java.command": {
          "value": "id.my.hendisantika.actuatorsanitizer.ActuatorSanitizerApplication"
        },
        "com.sun.management.jmxremote": {
          "value": ""
        },
        "http.nonProxyHosts": {
          "value": "local|*.local|169.254/16|*.169.254/16"
        },
        "jdk.debug": {
          "value": "release"
        },
        "spring.liveBeansView.mbeanDomain": {
          "value": ""
        },
        "sun.cpu.endian": {
          "value": "little"
        },
        "user.home": {
          "value": "/Users/hendisantika"
        },
        "user.language": {
          "value": "en"
        },
        "sun.stderr.encoding": {
          "value": "UTF-8"
        },
        "java.specification.vendor": {
          "value": "Oracle Corporation"
        },
        "java.version.date": {
          "value": "2023-09-19"
        },
        "java.home": {
          "value": "/Users/hendisantika/.sdkman/candidates/java/21-amzn"
        },
        "spring.output.ansi.enabled": {
          "value": "always"
        },
        "file.separator": {
          "value": "/"
        },
        "java.vm.compressedOopsMode": {
          "value": "Zero based"
        },
        "sun.stdout.encoding": {
          "value": "UTF-8"
        },
        "line.separator": {
          "value": "\n"
        },
        "java.vm.specification.vendor": {
          "value": "Oracle Corporation"
        },
        "java.specification.name": {
          "value": "Java Platform API Specification"
        },
        "FILE_LOG_CHARSET": {
          "value": "UTF-8"
        },
        "java.awt.headless": {
          "value": "true"
        },
        "apple.awt.application.name": {
          "value": "ActuatorSanitizerApplication"
        },
        "sun.management.compiler": {
          "value": "HotSpot 64-Bit Tiered Compilers"
        },
        "ftp.nonProxyHosts": {
          "value": "local|*.local|169.254/16|*.169.254/16"
        },
        "java.runtime.version": {
          "value": "21+35-LTS"
        },
        "user.name": {
          "value": "hendisantika"
        },
        "spring.jmx.enabled": {
          "value": "true"
        },
        "stdout.encoding": {
          "value": "UTF-8"
        },
        "path.separator": {
          "value": ":"
        },
        "management.endpoints.jmx.exposure.include": {
          "value": "*"
        },
        "os.version": {
          "value": "14.4.1"
        },
        "java.runtime.name": {
          "value": "OpenJDK Runtime Environment"
        },
        "file.encoding": {
          "value": "UTF-8"
        },
        "java.vm.name": {
          "value": "OpenJDK 64-Bit Server VM"
        },
        "java.vendor.version": {
          "value": "Corretto-21.0.0.35.1"
        },
        "java.vendor.url.bug": {
          "value": "https://github.com/corretto/corretto-21/issues/"
        },
        "java.io.tmpdir": {
          "value": "/var/folders/yz/hxmck30d35v217pmh9f2js480000gn/T/"
        },
        "catalina.home": {
          "value": "/private/var/folders/yz/hxmck30d35v217pmh9f2js480000gn/T/tomcat.8080.6172486094404257541"
        },
        "java.version": {
          "value": "21"
        },
        "user.dir": {
          "value": "/Users/hendisantika/IdeaProjects/actuator-sanitizer"
        },
        "os.arch": {
          "value": "aarch64"
        },
        "java.vm.specification.name": {
          "value": "Java Virtual Machine Specification"
        },
        "PID": {
          "value": "49529"
        },
        "CONSOLE_LOG_CHARSET": {
          "value": "UTF-8"
        },
        "catalina.base": {
          "value": "/private/var/folders/yz/hxmck30d35v217pmh9f2js480000gn/T/tomcat.8080.6172486094404257541"
        },
        "native.encoding": {
          "value": "UTF-8"
        },
        "java.library.path": {
          "value": "/Users/hendisantika/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:."
        },
        "java.vm.info": {
          "value": "mixed mode, emulated-client, sharing"
        },
        "stderr.encoding": {
          "value": "UTF-8"
        },
        "java.vendor": {
          "value": "Amazon.com Inc."
        },
        "java.vm.version": {
          "value": "21+35-LTS"
        },
        "java.rmi.server.randomIDs": {
          "value": "true"
        },
        "sun.io.unicode.encoding": {
          "value": "UnicodeBig"
        },
        "socksNonProxyHosts": {
          "value": "local|*.local|169.254/16|*.169.254/16"
        },
        "java.class.version": {
          "value": "65.0"
        },
        "LOGGED_APPLICATION_NAME": {
          "value": "[actuator-sanitizer] "
        }
      }
    },
    {
      "name": "systemEnvironment",
      "properties": {
        "HOMEBREW_PREFIX": {
          "value": "/opt/homebrew",
          "origin": "System Environment Property \"HOMEBREW_PREFIX\""
        },
        "SDKMAN_CANDIDATES_API": {
          "value": "https://api.sdkman.io/2",
          "origin": "System Environment Property \"SDKMAN_CANDIDATES_API\""
        },
        "MANPATH": {
          "value": "/opt/homebrew/share/man::",
          "origin": "System Environment Property \"MANPATH\""
        },
        "COMMAND_MODE": {
          "value": "unix2003",
          "origin": "System Environment Property \"COMMAND_MODE\""
        },
        "INFOPATH": {
          "value": "/opt/homebrew/share/info:",
          "origin": "System Environment Property \"INFOPATH\""
        },
        "SHELL": {
          "value": "/bin/zsh",
          "origin": "System Environment Property \"SHELL\""
        },
        "TMPDIR": {
          "value": "/var/folders/yz/hxmck30d35v217pmh9f2js480000gn/T/",
          "origin": "System Environment Property \"TMPDIR\""
        },
        "__CFBundleIdentifier": {
          "value": "com.jetbrains.intellij",
          "origin": "System Environment Property \"__CFBundleIdentifier\""
        },
        "HOME": {
          "value": "/Users/hendisantika",
          "origin": "System Environment Property \"HOME\""
        },
        "HOMEBREW_REPOSITORY": {
          "value": "/opt/homebrew",
          "origin": "System Environment Property \"HOMEBREW_REPOSITORY\""
        },
        "PATH": {
          "value": "/Users/hendisantika/Library/Application Support/Herd/bin/:/Users/hendisantika/.bun/bin:/Users/hendisantika/Library/pnpm:/opt/homebrew/Cellar/gradle/8.4/bin:/Users/hendisantika/opt/anaconda3/bin:/Users/hendisantika/.sdkman/candidates/maven/current/bin:/Users/hendisantika/.sdkman/candidates/java/current/bin:/Users/hendisantika/.sdkman/candidates/gradle/current/bin:/Users/hendisantika/.composer/vendor/bin:/opt/homebrew/opt/openjdk/bin:/Applications/Sublime Text.app/Contents/SharedSupport/bin:/opt/homebrew/bin:/opt/homebrew/sbin:/usr/local/bin:/System/Cryptexes/App/usr/bin:/usr/bin:/bin:/usr/sbin:/sbin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/local/bin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/bin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/appleinternal/bin:/Library/Apple/usr/bin:/usr/local/share/dotnet:~/.dotnet/tools:/usr/local/go/bin:/Library/Frameworks/Mono.framework/Versions/Current/Commands:/Users/hendisantika/.cargo/bin:/Users/powercommerce/Library/Application Support/JetBrains/Toolbox/scripts:/usr/local/opt/mongodb-community@4.4/bin:/usr/local/opt/mongodb-community@4.4/bin",
          "origin": "System Environment Property \"PATH\""
        },
        "LOGNAME": {
          "value": "hendisantika",
          "origin": "System Environment Property \"LOGNAME\""
        },
        "NVM_RC_VERSION": {
          "value": "",
          "origin": "System Environment Property \"NVM_RC_VERSION\""
        },
        "__CF_USER_TEXT_ENCODING": {
          "value": "0x1F5:0x0:0x0",
          "origin": "System Environment Property \"__CF_USER_TEXT_ENCODING\""
        },
        "XPC_FLAGS": {
          "value": "0x0",
          "origin": "System Environment Property \"XPC_FLAGS\""
        },
        "BUN_INSTALL": {
          "value": "/Users/hendisantika/.bun",
          "origin": "System Environment Property \"BUN_INSTALL\""
        },
        "NVM_CD_FLAGS": {
          "value": "-q",
          "origin": "System Environment Property \"NVM_CD_FLAGS\""
        },
        "IDEA_INITIAL_DIRECTORY": {
          "value": "/",
          "origin": "System Environment Property \"IDEA_INITIAL_DIRECTORY\""
        },
        "NVM_DIR": {
          "value": "/Users/hendisantika/Library/Application Support/Herd/config/nvm",
          "origin": "System Environment Property \"NVM_DIR\""
        },
        "LC_CTYPE": {
          "value": "en_US.UTF-8",
          "origin": "System Environment Property \"LC_CTYPE\""
        },
        "JAVA_HOME": {
          "value": "/Users/hendisantika/.sdkman/candidates/java/current",
          "origin": "System Environment Property \"JAVA_HOME\""
        },
        "SDKMAN_VERSION": {
          "value": "5.18.0",
          "origin": "System Environment Property \"SDKMAN_VERSION\""
        },
        "SSH_AUTH_SOCK": {
          "value": "/private/tmp/com.apple.launchd.yprMicdT6W/Listeners",
          "origin": "System Environment Property \"SSH_AUTH_SOCK\""
        },
        "MAVEN_HOME": {
          "value": "/Users/hendisantika/.sdkman/candidates/maven/current",
          "origin": "System Environment Property \"MAVEN_HOME\""
        },
        "OLDPWD": {
          "value": "/",
          "origin": "System Environment Property \"OLDPWD\""
        },
        "SDKMAN_DIR": {
          "value": "/Users/hendisantika/.sdkman",
          "origin": "System Environment Property \"SDKMAN_DIR\""
        },
        "SDKMAN_CANDIDATES_DIR": {
          "value": "/Users/hendisantika/.sdkman/candidates",
          "origin": "System Environment Property \"SDKMAN_CANDIDATES_DIR\""
        },
        "HERD_PHP_83_INI_SCAN_DIR": {
          "value": "/Users/hendisantika/Library/Application Support/Herd/config/php/83/",
          "origin": "System Environment Property \"HERD_PHP_83_INI_SCAN_DIR\""
        },
        "XPC_SERVICE_NAME": {
          "value": "application.com.jetbrains.intellij.119711754.119714813",
          "origin": "System Environment Property \"XPC_SERVICE_NAME\""
        },
        "HERD_PHP_82_INI_SCAN_DIR": {
          "value": "/Users/hendisantika/Library/Application Support/Herd/config/php/82/",
          "origin": "System Environment Property \"HERD_PHP_82_INI_SCAN_DIR\""
        },
        "USER": {
          "value": "hendisantika",
          "origin": "System Environment Property \"USER\""
        },
        "SDKMAN_PLATFORM": {
          "value": "darwinarm64",
          "origin": "System Environment Property \"SDKMAN_PLATFORM\""
        },
        "HOMEBREW_CELLAR": {
          "value": "/opt/homebrew/Cellar",
          "origin": "System Environment Property \"HOMEBREW_CELLAR\""
        },
        "GRADLE_HOME": {
          "value": "/opt/homebrew/Cellar/gradle/8.4",
          "origin": "System Environment Property \"GRADLE_HOME\""
        },
        "PWD": {
          "value": "/Users/hendisantika/IdeaProjects/actuator-sanitizer",
          "origin": "System Environment Property \"PWD\""
        },
        "PNPM_HOME": {
          "value": "/Users/hendisantika/Library/pnpm",
          "origin": "System Environment Property \"PNPM_HOME\""
        }
      }
    },
    {
      "name": "Config resource 'class path resource [application.yml]' via location 'optional:classpath:/'",
      "properties": {
        "spring.application.name": {
          "value": "actuator-sanitizer",
          "origin": "class path resource [application.yml] - 3:11"
        },
        "server.port": {
          "value": 8080,
          "origin": "class path resource [application.yml] - 5:9"
        },
        "test.password": {
          "value": "******",
          "origin": "class path resource [application.yml] - 8:13"
        },
        "management.endpoints.web.exposure.include": {
          "value": "*",
          "origin": "class path resource [application.yml] - 14:18"
        },
        "management.endpoint.env.show-values": {
          "value": "always",
          "origin": "class path resource [application.yml] - 17:20"
        }
      }
    }
  ]
}
```
