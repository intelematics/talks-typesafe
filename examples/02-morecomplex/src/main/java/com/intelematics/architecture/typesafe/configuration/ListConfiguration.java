package com.intelematics.architecture.typesafe.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties("example.list")
public class ListConfiguration
{
    private List<String> properties = new ArrayList<>();

    public List<String> getProperties() {
        return properties;
    }
}
