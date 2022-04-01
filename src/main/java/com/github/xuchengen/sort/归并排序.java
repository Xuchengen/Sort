package com.github.xuchengen.sort;

import java.util.Arrays;

public class 归并排序 {

    public static void main(String[] args) {
        int[] i = new int[]{9, 4, 3, 2, 5, -1, 7, 6, 1, 0, 8};
        int[] temp = new int[i.length];
        sort(i, 0, i.length - 1, temp);
        System.out.println(Arrays.toString(i));
    }

    public static void sort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(array, 0, mid, temp);
            sort(array, mid + 1, right, temp);
            merge(array, left, mid, right, temp);
        }
    }

    public static void merge(int[] array, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[t] = array[i];
                i++;
                t++;
            } else {
                temp[t] = array[j];
                j++;
                t++;
            }
        }
        while (i <= mid) {
            temp[t] = array[i];
            t++;
            i++;
        }
        while (j <= right) {
            temp[t] = array[j];
            t++;
            j++;
        }
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            array[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }
}
