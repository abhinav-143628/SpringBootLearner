package com.info.java.test;

import javafx.fxml.Initializable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by abhdogra1 on 12/27/2018.
 */
public class SpringLifeCycleTest implements Initializable, DisposableBean, Aware, BeanPostProcessor {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
