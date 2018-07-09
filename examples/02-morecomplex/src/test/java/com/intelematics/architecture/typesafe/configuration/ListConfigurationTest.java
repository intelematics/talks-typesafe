package com.intelematics.architecture.typesafe.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ListConfigurationTest
{
    @Autowired
    private ListConfiguration listConfiguration;

    @Test
    public void shouldContainTwoValues()
    {
        assertThat(listConfiguration.getProperties()).hasSize(2);
    }

    @Test
    public void firstElementShouldBeOne()
    {
        assertThat(listConfiguration.getProperties().get(0)).isEqualTo("one");
    }

    @Test
    public void secondElementShouldBeTwo()
    {
        assertThat(listConfiguration.getProperties().get(1)).isEqualTo("two");
    }
}
