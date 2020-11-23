package com.xsun.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created at 14:57, 2019-08-06
 *
 * @author sunhaoran
 */
public class List2ArrayTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        String[] array = new String[3];
        String[] array1 = new String[2];
        String[] array2 = new String[5];

        System.out.println(Arrays.toString(list.toArray(array)));
        System.out.println(Arrays.toString(list.toArray(array1)));
        System.out.println(Arrays.toString(list.toArray(array2)));

    }
}
