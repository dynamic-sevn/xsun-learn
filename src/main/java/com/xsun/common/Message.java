package com.xsun.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * created at 19:28, 2019-08-21
 *
 * @author sunhaoran
 */
public class Message {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputCount = sc.next();
        int count = Integer.parseInt(inputCount, 16) ;
        List<String> array = new ArrayList<>();
        for(int i = 0; i < count - 1; i++){
            String num = sc.next();
            if("A".equals(num)){
                array.add("12");
                array.add("34");
            } else if("B".equals(num)){
                array.add("AB");
                array.add("CD");
            } else {
                array.add(num);
            }
        }
        int size = array.size() + 1;
        StringBuffer output = new StringBuffer(Integer.toHexString(size).toUpperCase() + " ");
        array.forEach(a -> output.append(a).append(" "));
        System.out.println(output.substring(0, output.length() - 1));
    }
}
