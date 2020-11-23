package com.xsun.sort;

/**
 * created at 3:18 下午, 2020/11/23
 *
 * @author sunhaoran
 */
public class QuickSort {
    public static void sort(int[] arr, int left, int right){

        if (left >= right) {
            return ;
        }

        int start = left, end = right;
        int val = arr[start];
        while (start < end) {
            while (start < end && val <= arr[end]) {
                end--;
            }
            // start == end, 不变
            arr[start] = arr[end];
            while (start < end && val > arr[start]) {
                start ++;
            }
            arr[end] = arr[start];

        }
        arr[start] = val;
        sort(arr, left, start - 1);
        sort(arr, start + 1, right);
    }
}
