package com.xsun.leetcode.bd;

import com.xsun.leetcode.util.ListNode;
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

    @Test
    public void threeSumTest(){
        ThreeSum obj = new ThreeSum() ;
        int[] nums = {-1, 0, 1, 2, -1, -4} ;
        System.out.println(obj.threeSum(nums)) ;
    }

    @Test
    public void addTwoNumbers(){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers() ;

        ListNode node1 = new ListNode(2) ;
        ListNode p1 = node1 ;
        node1.next = new ListNode(4) ;
        node1 = node1.next ;
        node1.next = new ListNode(3) ;

        ListNode node2 = new ListNode(5) ;
        ListNode p2 = node2 ;
        node2.next = new ListNode(6) ;
        node2 = node2.next ;
        node2.next = new ListNode(4) ;

        addTwoNumbers.addTwoNumbers(p1, p2) ;

    }

    @Test
    public void longestCommonPrefix(){
        LongestCommonPrefix commonPrefix = new LongestCommonPrefix() ;
        String[] strs1 = {"flower","flow","flight"} ;
        String[] strs2 = {"dog","racecar","car"} ;
        Assert.assertEquals("fl", commonPrefix.longestCommonPrefix(strs1)) ;
        Assert.assertEquals("", commonPrefix.longestCommonPrefix(strs2));
    }

    @Test
    public void checkInClusionTest(){
        CheckInClusion checkInClusion = new CheckInClusion();
        Assert.assertTrue(checkInClusion.checkInclusion("ab", "eidbaooo"));
        Assert.assertFalse(checkInClusion.checkInclusion("ab", "eidboaoo"));
        Assert.assertTrue(checkInClusion.checkInclusion("adc", "dcda"));
    }
}
