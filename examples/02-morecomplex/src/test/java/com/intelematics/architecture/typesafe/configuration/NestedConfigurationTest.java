package com.intelematics.architecture.typesafe.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NestedConfigurationTest
{
    @Autowired
    NestedConfiguration nestedConfiguration;

    @Test
    public void urlHasExampleDotComAsHost()
    {
        assertThat(nestedConfiguration.getConnection().getUrl()).hasHost("example.com");
    }
}
