package com.xsun.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * created at 10:58 下午, 2020/11/23
 *
 * @author sunhaoran
 */
public class SortTest {
    private static int[] arr = {54,28,72,83,96,53,43,643,73};
    private static int[] arr2 = {};

    @Test
    public void quickSortTest(){
        QuickSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        QuickSort.sort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));

    }

    @Test
    public void mergeSortTest(){
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        MergeSort.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    @Test
    public void heapSortTest(){
        HeapSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        HeapSort.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

}
