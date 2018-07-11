package com.intelematics.architecture.typesafe.configuration;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.util.EnvironmentTestUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.isA;

public class ConfigurationTest
{
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp()
    {
        context = new AnnotationConfigApplicationContext();
    }

    @Test
    public void shouldFailOnNullConfigurationValue()
    {
        expectException();
    }

    @Test
    public void shouldFailOnEmptyConfigurationValue()
    {
        setConfigValue("");

        expectException();
    }

    @Test
    public void shouldWorkWhenValueHasContent()
    {
        setConfigValue("configured");

        expectNoException();
    }

    private void setConfigValue(final String value) {
        EnvironmentTestUtils.addEnvironment(this.context, String.format("example.configuration.value=%s", value));

    }

    private void expectException()
    {
        context.register(Config.class);
        expectedException.expectCause(isA(BeanCreationException.class));
        context.refresh();
    }

    private void expectNoException()
    {
        context.register(Config.class);
        context.refresh();
    }

    @TestConfiguration
    @EnableConfigurationProperties(Configuration.class)
    public static class Config
    {
        @Autowired
        private Configuration value;

        public Configuration getValue()
        {
            return value;
        }

        public void setValue(Configuration value)
        {
            this.value = value;
        }
    }
}
