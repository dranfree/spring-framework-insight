package com.dingdong.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @author GuanShan
 * @since 2020.12.09
 */
@Component
public class EchoServiceImpl implements EchoService {
    @Override
    @LoggingRequired
    public String echo(String message) {
        System.out.println("message: " + message);
        return message;
    }
}