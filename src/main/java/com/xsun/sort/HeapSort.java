package com.xsun.sort;

/**
 * created at 11:35 上午, 2020/11/26
 *
 * @author sunhaoran
 */
public class HeapSort {
    public static void sort(int[] a){
        for (int i = a.length / 2 - 1; i >= 0; i--) { // 注意 a.length / 2 - 1
            adjustHeap(a, i, a.length);
        }
        for (int i = 0; i < a.length; i++) {
            swap(a, 0, a.length - i - 1);
            adjustHeap(a, 0, a.length - i - 1); // 注意 -1
        }

    }

    private static void adjustHeap(int[] a, int i, int end) {
        int k = i;
        while (k * 2 + 1 < end) {
            int lchild = 2 * k + 1;
            int rchild = lchild + 1;
            int childIdx = lchild;
            if (rchild < end && a[rchild] > a[lchild]) {
                childIdx = rchild;
            }
            if (a[k] < a[childIdx]) {
                swap(a, k, childIdx);
            }
            k = childIdx;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
