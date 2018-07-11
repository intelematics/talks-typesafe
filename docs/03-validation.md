# Validation

## You can use javax.validation to validate the objects.

Add javax.validation api
```xml
<dependency>
    <groupId>javax.validation</groupId>
    <artifactId>validation-api</artifactId>
    <version>2.0.1.Final</version>
</dependency>
```

Add a matching javax.validation implementation
```xml
<dependency>
    <groupId>org.hibernate.validator</groupId>
    <artifactId>hibernate-validator</artifactId>
    <version>6.0.10.Final</version>
    <scope>provided</scope>
</dependency>
```

Add some bean validation
```java
import javax.validation.constraints.NotBlank;

...
@NotBlank
private final String value;
```

[Bean Validation website](https://beanvalidation.org/)
