package com.xsun.sort;

import java.util.Arrays;

/**
 * created at 11:05 下午, 2020/11/23
 *
 * @author sunhaoran
 */
public class MergeSort {
    public static void sort(int[] arr) {
//        int[] tempArr = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);

    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return ;
        }
        int len = end - start;
        int mid = (end + start) / 2;

        int[] tempArr = new int[len + 1];

        int start1 = start;
        int end1 = mid;
        int start2 = mid + 1;
        int end2 = end;

        mergeSort(arr, start1, end1);
        mergeSort(arr, start2, end2);
        int pos = 0;
        while (start1 <= end1 && start2 <= end2) {
            tempArr[pos++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        while (start1 <= end1) {
            tempArr[pos++] = arr[start1++];
        }
        while (start2 <= end2) {
            tempArr[pos++] = arr[start2++];
        }

        System.arraycopy(tempArr, 0, arr, start, len + 1);
    }
}
