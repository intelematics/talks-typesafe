package com.intelematics.architecture.typesafe.configuration;

import java.util.Objects;

public class InputModel
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        InputModel that = (InputModel) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(value);
    }

    @Override
    public String toString()
    {
        return "InputModel{" +
                "value='" + value + '\'' +
                '}';
    }
}
