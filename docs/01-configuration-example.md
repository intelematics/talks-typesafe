# Configuration

## Show simple example of how type-safe configuration is bound.
[Spring Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config-typesafe-configuration-properties)

Create a bean class to represent the configuration:

```java
public class Configuration
{
    private String value;

    public String getValue()
    {
        return value;
    }
    
    public void setValue(String value)
    {
        this.value = value;
    }
}
```

Mark class as configuration class, apply configuration prefix

```java
import org.springframework.boot.context.properties.ConfigurationProperties;
...

@ConfigurationProperties("example.configuration")
```

Inform Spring of that property configuration:

This can be attached to any @Configuration class (including SpringBootApplication!)

```java
import org.springframework.boot.context.properties.EnableConfigurationProperties;
...

@EnableConfigurationProperties(Configuration.class)

```

Add the annotation processor to help Intellij autocomplete this new configuration [Intellij Blog Post](https://plugins.jetbrains.com/plugin/10229-spring-assistant)
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>
```
As per the blog, when you add this dependency OR change the configuration properties rebuild the project.
