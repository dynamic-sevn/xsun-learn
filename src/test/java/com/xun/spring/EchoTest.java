package com.xun.spring;

import com.xsun.spring.AbstractEcho;
import com.xsun.spring.SunhaoranEcho;
import com.xsun.spring.YejiawenEcho;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( "classpath*:/*.xml")
public class EchoTest {
    @Resource
    private SunhaoranEcho sunhaoranEcho ;
    @Resource
    private YejiawenEcho yejiawenEcho ;

    @Test
    public void echoTest(){
        sunhaoranEcho.echo();
        yejiawenEcho.echo();
        sunhaoranEcho.echo();
    }


}
