package com.info.java.test;

import com.info.java.other.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by abhdogra1 on 12/27/2018.
 */
@Configuration
public class ApplicationConfiguration {

    @Bean(name = "HelloBean")
    public Hello getHello(){
        return new Hello();
    }
}
