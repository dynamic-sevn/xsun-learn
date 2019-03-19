package com.xsun.spring;

import org.springframework.stereotype.Component;

@Component
public class SunhaoranEcho extends AbstractEcho {
    public void echo(){
        super.run("sunhaoran");
    }

    @Override
    protected String getBaby() {
        return "yejiawen";
    }
}