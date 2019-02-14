package com.xsun.eight;

import com.alibaba.fastjson.JSON;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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
        demo.test(hello -> "[function]" + hello);
        final List<Integer> finalList = new ArrayList<>() ;
        finalList.add(5);


        System.out.println(finalList);

        System.out.println(LocalDateTime.now().withHour(23).withMinute(59).withSecond(59));
        System.out.println(LocalDateTime.now().withHour(14).withMinute(55).format(DateTimeFormatter.ofPattern("HH:mm")));

        System.out.println(JSON.toJSONString(new Date()));
        System.out.println(UUID.randomUUID());
    }
}
