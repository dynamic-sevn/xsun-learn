package com.xsun.eight;

/**
 * created at 上午10:16, 2019/1/22
 *
 * @author sunhaoran
 */
public class Demo<T> {
    private T data ;

    Demo(T t){
        data = t ;
    }
    public void test(FunctionInterfaceTest<T> function){
        System.out.println(function.accept(data)) ;
    }
}
