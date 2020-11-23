package com.xsun.leetcode.bd;

/**
 * created at 下午7:40, 2019/2/16
 *
 * @author sunhaoran
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "" ;
        }

        StringBuilder commonStr = new StringBuilder() ;

        int min = Integer.MAX_VALUE ;

        for(String str : strs){
            if(str == null || str.length() == 0){
                return commonStr.toString() ;
            }
            min = Math.min(min, str.length()) ;
        }
        String firstStr = strs[0] ;
        for(int i = 0; i < min; i++){
            char ch = firstStr.charAt(i) ;
            for(int j = 1; j < strs.length; j++){
                if(ch != strs[j].charAt(i)){
                    return commonStr.toString() ;
                }
            }
            commonStr.append(firstStr.charAt(i)) ;
        }

        return commonStr.toString() ;

    }
}
