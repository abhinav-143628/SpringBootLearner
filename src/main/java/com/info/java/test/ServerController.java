package com.info.java.test;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

/**
 * Created by abhdogra1 on 12/27/2018.
 */

@Component
public class ServerController implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
    @Override
    public void customize(ConfigurableWebServerFactory configurableWebServerFactory) {
       // configurableWebServerFactory.setPort(8181);
    }
}
