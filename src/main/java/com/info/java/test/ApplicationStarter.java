package com.info.java.test;

import com.info.java.other.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

/**
 * Created by abhdogra1 on 12/14/2018.
 */

@SpringBootApplication
@EnableConfigurationProperties(MyReadConfiguration.class)
public class ApplicationStarter implements CommandLineRunner{

    @Autowired
    Hello hel;

    @Autowired
    Environment env;

    @Autowired
    MyReadConfiguration myConfig;

    ServerProperties prop;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class,args);
    }


    @Override
    public void run(String... strings) throws Exception {
        hel.print();
       // prop.setPort(9090);

        String keyValue = env.getProperty("server.port");
        System.out.println(keyValue);
        System.out.println(myConfig.getHeadOffice());
        System.out.println(myConfig.getLocations());
        System.out.println(myConfig.getPost());


    }
}
