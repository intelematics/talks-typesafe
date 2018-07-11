package com.intelematics.architecture.typesafe.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@JsonTest
public class InputModelTest
{
    @Autowired
    public ObjectMapper mapper;

    @Autowired
    private JacksonTester<InputModel> json;

    @Test
    public void validateEmptyValue() throws Exception
    {
        String content = "{}";
        assertThat(json.parse(content)).isEqualTo(new InputModel());
    }

    @Test
    public void name() throws Exception
    {
        InputModel model = new InputModel();
        model.setValue("the new value");

        assertThat(json.write(model)).hasJsonPathValue("@.value", "the new value");
    }
}
