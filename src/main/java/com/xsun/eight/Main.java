package com.xsun.eight;

/**
 * created at 上午11:30, 2019/1/22
 *
 * @author sunhaoran
 */
public class Main {
    public static void main(String[] args) {
        Demo<String> demo = new Demo<>("sunhaoran") ;

        // hello 仅占位，可以理解为形参
        demo.test(hello -> "function " + hello);
    }
}
