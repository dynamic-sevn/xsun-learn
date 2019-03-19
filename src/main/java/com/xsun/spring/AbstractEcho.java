package com.xsun.spring;

import org.springframework.stereotype.Component;

@Component
public abstract class AbstractEcho {
    public void run(String name){
        System.out.println(name + " hello! " + getBaby());
    }

    protected abstract String getBaby();
}
