package com.intelematics.architecture.typesafe.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource(properties = "example.configuration.value=test")
@RunWith(SpringRunner.class)
public class ConfigurationTest
{
    @Autowired
    private Configuration configuration;

    @Test
    public void shouldBeValid()
    {
        assertThat(configuration.getValue()).isEqualTo("test");
    }
}
