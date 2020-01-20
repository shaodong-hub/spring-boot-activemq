package com.github.springbootactivemq.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <p>
 * 创建时间为 上午2:18 2020/1/20
 * 项目名称 spring-boot-activemq
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Slf4j
@Component
public class UserInfoListener {

    @JmsListener(destination = "user:new")
    @SendTo("result:user")
    public String handle1(String message) {
        log.info("handle1:" + message);
        return message + " " + new Date().toString();
    }

    @JmsListener(destination = "result:user")
    public void handle2(String message) {
        log.info("handle2:" + message);
    }

}
