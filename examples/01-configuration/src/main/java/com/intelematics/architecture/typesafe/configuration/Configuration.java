package com.intelematics.architecture.typesafe.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("example.configuration")
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
