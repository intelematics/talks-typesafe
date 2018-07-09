package com.intelematics.architecture.typesafe.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.URL;
import java.util.List;

@ConfigurationProperties("example.nestedlist")
public class NestedListConfiguration
{
    List<Client> clients;

    public List<Client> getClients()
    {
        return clients;
    }

    public void setClients(List<Client> clients)
    {
        this.clients = clients;
    }

    public static class Client {
        private URL url;
        private String name;

        public URL getUrl()
        {
            return url;
        }

        public void setUrl(URL url)
        {
            this.url = url;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }
    }
}
