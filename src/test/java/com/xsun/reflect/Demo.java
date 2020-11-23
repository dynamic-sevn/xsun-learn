package com.xsun.reflect;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * created at 下午9:21, 2019/3/1
 *
 * @author sunhaoran
 */
public class Demo {
    @Test
    public void TestRef() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Executer executer = new Executer() ;
        executer.echo();
    }
}
