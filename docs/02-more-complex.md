# Configuration

## Show some more interesting configuration
[Spring Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config-typesafe-configuration-properties)

Create a configuration class that contains list of properties
```java
@ConfigurationProperties("example.list")
public class ListConfiguration
{
    private List<String> properties = new ArrayList<>();

    public List<String> getProperties() {
        return properties;
    }
}   public List<String> getProperties() {
        return properties;
    }
}
```
Configure the list in properties format - see [Properties](/examples/02-morecomplex/src/main/resources/application-properties.properties)
```properties
example.list.properties[0]=one
example.list.properties[1]=two
```
or yaml - see [Yaml](/examples/02-morecomplex/src/main/resources/application.yaml)
```yaml
example.list.properties:
  - "one"
  - "two"
```
