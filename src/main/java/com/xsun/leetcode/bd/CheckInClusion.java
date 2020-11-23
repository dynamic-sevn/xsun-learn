package com.xsun.leetcode.bd;

import java.util.HashMap;
import java.util.Map;

/**
 * created at 下午1:34, 2019/2/17
 *
 * @author sunhaoran
 */
public class CheckInClusion {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false ;
        }

        Map<Character, Integer> charNumMap = getCharMap(s1);

        for(int i = 0; i < s2.length() - s1.length() + 1; i++){
            Map<Character, Integer> s2CharNumMap = getCharMap(s2.substring(i, i + s1.length())) ;
            boolean isContain = true ;
            for(Character ch : charNumMap.keySet()){
                if(!charNumMap.get(ch).equals(s2CharNumMap.get(ch))){
                    isContain = false;
                    break;
                }
            }

            if(isContain){
                return true ;
            }
        }
        return false ;

    }

    private Map<Character, Integer> getCharMap(String str) {
        Map<Character, Integer> charNumMap = new HashMap<>() ;

        for(int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i) ;
            charNumMap.put(ch, charNumMap.get(ch) == null ? 1 : charNumMap.get(ch) + 1 ) ;
        }
        return charNumMap ;
    }
}
