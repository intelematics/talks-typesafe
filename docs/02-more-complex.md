# More Complex Configuration

## Show some more interesting configuration
[Spring Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config-typesafe-configuration-properties)

### Create a configuration class that contains list of properties
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

### Create a configuration class that contains a nested object

```java
@ConfigurationProperties("example.nested")
public class NestedConfiguration
{
    private Connection connection;

    public Connection getConnection()
    {
        return connection;
    }

    public void setConnection(Connection connection)
    {
        this.connection = connection;
    }

    public static class Connection
    {
        private URL url;
        private String username;
        private String password;

        public URL getUrl()
        {
            return url;
        }

        public void setUrl(URL url)
        {
            this.url = url;
        }

        public String getUsername()
        {
            return username;
        }

        public void setUsername(String username)
        {
            this.username = username;
        }

        public String getPassword()
        {
            return password;
        }

        public void setPassword(String password)
        {
            this.password = password;
        }
    }
}
```

Then this can be configured via yaml or properties.

Properties
```properties
example.nested.connection.url=http://example.com
example.nested.connection.username=my-username
example.nested.connection.password=stop-peeking
```

Yaml
```yaml
example.nested.connection:
  url: http://example.com
  username: my-username
  password: stop-peeking
```

### Configure list of nested objects
```java
@ConfigurationProperties("example.nestedlist")
public class NestedListConfiguration
{
    List<Client> clients;

    public List<Client> getClients()
    {
        return clients;
    }

    public void setClients(List<Client> clients)
    {
        this.clients = clients;
    }

    public static class Client {
        private URL url;
        private String name;

        public URL getUrl()
        {
            return url;
        }

        public void setUrl(URL url)
        {
            this.url = url;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }
    }
}
```

Properties
```properties
example.nestedlist.clients[0].url=https://google.com.au
example.nestedlist.clients[0].name=Google Australia
example.nestedlist.clients[1].url=https://aws.amazon.com
example.nestedlist.clients[1].name=Amazon AWS
```

Yaml
```yaml
example:
  nestedlist:
    clients:
      - url: "https://google.com.au"
        name: "Google Australia"
      - url: "https://aws.amazon.com"
        name: "Amazon AWS"
```

Naming conventions can support [Relaxed Binding](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config-relaxed-binding)
