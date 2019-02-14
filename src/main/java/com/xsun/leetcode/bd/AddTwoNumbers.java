package com.xsun.leetcode.bd;

import com.xsun.leetcode.util.ListNode;

/**
 * created at 下午8:43, 2019/2/14
 *
 * @author sunhaoran
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodePoint1 = l1, nodePoint2 = l2 ;
        int i = 0, j = 0 ;
        while(nodePoint1 != null){
            i++ ;
            nodePoint1 = nodePoint1.next ;
        }
        while (nodePoint2 != null){
            j++ ;
            nodePoint2 = nodePoint2.next ;
        }
        int diff ;
        nodePoint1 = l1 ;
        nodePoint2 = l2 ;
        ListNode sumNode = new ListNode(-1) ;
        ListNode nodePoint3 = sumNode ;
        if(i > j){
            diff = i - j ;
            for(int k = 0; k < diff; k++){
                nodePoint3.next = new ListNode(nodePoint1.val);
                nodePoint3 = nodePoint3.next ;
                nodePoint1 = nodePoint1.next ;
            }
        }else{
            diff = j - i ;
            for(int k = 0; k < diff; k++){
                nodePoint3.next = new ListNode(nodePoint2.val) ;
                nodePoint3 = nodePoint3.next ;
                nodePoint2 = nodePoint2.next ;
            }
        }
        int carry = 0 ;
        while(nodePoint1 != null){
            int sum = nodePoint1.val + nodePoint2.val + carry;
            carry = sum / 10 ;
            nodePoint3.next = new ListNode(sum % 10) ;
            nodePoint3 = nodePoint3.next ;
            nodePoint1 = nodePoint1.next ;
            nodePoint2 = nodePoint2.next ;
        }

        return sumNode.next ;

    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2){
        ListNode nodePoint1 = l1, nodePoint2 = l2 ;

        int carry = 0 ;
        ListNode sumNode = new ListNode(-1) ;
        ListNode nodePoint3 = sumNode ;
        while(nodePoint1 != null && nodePoint2 != null){
            int sum = nodePoint1.val + nodePoint2.val + carry ;
            carry = sum / 10 ;
            nodePoint3.next = new ListNode(sum % 10) ;
            nodePoint3 = nodePoint3.next ;
            nodePoint1 = nodePoint1.next ;
            nodePoint2 = nodePoint2.next ;
        }

        ListNode diffNode = nodePoint1 ;
        if(diffNode == null){
            diffNode = nodePoint2 ;
        }

        while(diffNode != null){
            int sum = diffNode.val + carry ;
            carry = sum / 10 ;
            nodePoint3.next = new ListNode(sum % 10) ;
            nodePoint3 = nodePoint3.next ;
            diffNode = diffNode.next ;
        }
        if(carry != 0){
            nodePoint3.next = new ListNode(carry) ;
        }
        return sumNode.next ;
    }
}
