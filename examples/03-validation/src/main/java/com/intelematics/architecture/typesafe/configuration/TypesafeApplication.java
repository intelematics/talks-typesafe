package com.intelematics.architecture.typesafe.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Configuration.class)
public class TypesafeApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(TypesafeApplication.class, args);
    }
}
