package com.xsun.leetcode.bd;

import java.util.HashSet;
import java.util.Set;

/**
 * created at 下午7:02, 2019/2/8
 *
 * @author sunhaoran
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubString(String s){
        if(s == null || s.length() == 0){
            return 0 ;
        }
        int len = 1 ;
        for(int i = 0; i < s.length() - 1; i++){
            int j = i ;
            while(j < s.length() - 1 && !s.substring(i, j + 1).contains(s.charAt(j+1) + "")){
                j++ ;
            }
            if(j + 1 - i > len){
                len = j + 1 -i ;
            }
        }
        return len ;
    }

    public int optimizeLengthOfLongestSubString(String s){
        if(s == null || s.length() == 0){
            return 0 ;
        }

        int i = 0, j = 0 ;
        Set<Character> charSet = new HashSet<>() ;
        int maxLen = 0 ;
        while (i < s.length() && j < s.length()){
            if(!charSet.contains(s.charAt(j))){
                charSet.add(s.charAt(j++)) ;
            }else{
                maxLen = Math.max(maxLen, j-i) ;
                charSet.remove(s.charAt(i++)) ;
            }
        }

        // 处理直到最后一个字符的情况
        maxLen = Math.max(maxLen, j - i) ;

        return maxLen;

    }
}
