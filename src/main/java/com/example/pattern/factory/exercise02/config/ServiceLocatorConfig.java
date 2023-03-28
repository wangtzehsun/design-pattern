package com.example.pattern.factory.exercise02.config;

import com.example.pattern.factory.exercise02.PaymentServiceFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceLocatorConfig {

    @Bean
    public FactoryBean<?> getBean(){
        ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(PaymentServiceFactory.class);
        bean.setServiceLocatorExceptionClass(new BusinessException("=================", new Throwable()).getClass());
        return bean;
    }

}
