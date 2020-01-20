package com.github.springbootactivemq.controller;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 上午2:19 2020/1/20
 * 项目名称 spring-boot-activemq
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class UserInfoController {

    @Resource
    private JmsTemplate jmsTemplate;

    @GetMapping("/data/{data}")
    public String send2(@PathVariable String data) {
        jmsTemplate.convertAndSend("user:new", data);
        return data;
    }

}
