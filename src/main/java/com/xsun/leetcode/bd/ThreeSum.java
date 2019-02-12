package com.xsun.leetcode.bd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * created at 上午11:47, 2019/2/12
 *
 * @author sunhaoran
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> retList = new ArrayList<>() ;
        List<Integer> numList = new ArrayList<>() ;
        for(int i : nums){
            numList.add(i) ;
        }

        Collections.sort(numList);
        for(int i = 0; i < numList.size(); i++){
            // 防止在 i 处重复进行计算
            if(i != 0 && numList.get(i).equals(numList.get(i - 1))){
                continue;
            }

            int l = i+1, r = numList.size() - 1 ;
            while(l < r){
                int s = numList.get(i) + numList.get(l) + numList.get(r) ;
                if(s == 0){
                    retList.add(Arrays.asList(numList.get(i), numList.get(l), numList.get(r))) ;
                    l++;
                    r--;
                    while(l < r && numList.get(l).equals(numList.get(l - 1))){
                        l++ ;
                    }
                    while(l < r && numList.get(r).equals(numList.get(r + 1))){
                        r-- ;
                    }
                }else if(s > 0){
                    r-- ;
                }else{
                    l++ ;
                }
            }
        }

        return retList ;
    }
}
