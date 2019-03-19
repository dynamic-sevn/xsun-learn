package com.xsun.spring;

import org.springframework.stereotype.Component;

@Component
public class YejiawenEcho extends AbstractEcho {

    public void echo(){
        super.run("yejiawen");
    }

    @Override
    protected String getBaby() {
        return "sunhaoran";
    }
}
