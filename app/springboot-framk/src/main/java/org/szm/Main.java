package org.szm;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication(scanBasePackages = "org.szm")
public class Main implements ApplicationContextAware {
//    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//
//    }

    /**
     *extends SpringBootServletInitializer
     */
    public static ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Main.context = applicationContext;
    }

    @Bean
    public RequestContextListener requestContextListener(){
        return new RequestContextListener();
    }

}