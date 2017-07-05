package com.kamil.hello.service;

import org.springframework.stereotype.Component;

/**
 * Created by alienor on 6/26/17.
 */
@Component
public class HelloService {

    public String sayHello(String name){
        return "Hello: " + name + " !";
    }
}
