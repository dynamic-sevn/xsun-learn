package com.xsun.leetcode.bd;

import org.junit.Assert;
import org.junit.Test;

/**
 * created at 下午7:35, 2019/2/8
 *
 * @author sunhaoran
 */
public class LeetCodeTest {

    @Test
    public void lengthOfLongestSubStringTest(){
        LengthOfLongestSubstring obj = new LengthOfLongestSubstring() ;
        Assert.assertEquals(3, obj.lengthOfLongestSubString("abcabcbb")) ;
        Assert.assertEquals(1, obj.lengthOfLongestSubString("bbbbb"));
        Assert.assertEquals(3, obj.lengthOfLongestSubString("pwwkew"));

        Assert.assertEquals(3, obj.optimizeLengthOfLongestSubString("abcabcbb")) ;
        Assert.assertEquals(1, obj.optimizeLengthOfLongestSubString("bbbbb"));
        Assert.assertEquals(3, obj.optimizeLengthOfLongestSubString("pwwkew"));
    }
}
