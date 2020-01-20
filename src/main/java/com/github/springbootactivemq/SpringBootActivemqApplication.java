package com.github.springbootactivemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;


/**
 * @author shao
 */
@EnableJms
@SpringBootApplication
public class SpringBootActivemqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootActivemqApplication.class, args);
    }

}
