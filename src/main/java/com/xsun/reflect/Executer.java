package com.xsun.reflect;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * created at 下午9:09, 2019/3/1
 *
 * @author sunhaoran
 */
public class Executer {
    public void echo() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = Class.forName("com.xsun.reflect.TestImpl") ;
        ITest test = (ITest) clazz.newInstance();
        Method method = clazz.getMethod("test") ;
        method.invoke(test) ;
    }
}
