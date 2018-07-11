package com.intelematics.architecture.typesafe.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@JsonTest
public class JsonTestBeanLoggerTest
{
    @Autowired
    private ApplicationContext context;

    @Test
    public void logAllLoadedBeans()
    {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("=================");
        System.out.println(beanDefinitionNames.length);
        System.out.println("=================");
        for (String name : beanDefinitionNames)
        {
            System.out.println(name);
        }
    }
}
