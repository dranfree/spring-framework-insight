package com.dingdong.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author GuanShan
 * @since 2020.12.08
 */
@Component
public class InitializationBean {

    @PostConstruct
    public void init() {
        System.out.println("I'm init()...");
    }

//    public void initialize() {
//        System.out.println("I'm initialize()...");
//    }
}