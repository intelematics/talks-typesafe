package com.intelematics.architecture.typesafe.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NestedListConfigurationTest
{
    @Autowired
    private NestedListConfiguration configuration;

    @Test
    public void twoClientsConfigured()
    {
        assertThat(configuration.getClients()).hasSize(2);
    }

    @Test
    public void firstClientIsGoogleAustralia()
    {
        assertThat(configuration.getClients().get(0).getName()).isEqualTo("Google Australia");
    }
}
