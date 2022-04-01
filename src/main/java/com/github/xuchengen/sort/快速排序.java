package com.github.xuchengen.sort;

import java.util.Arrays;

public class 快速排序 {

    public static void main(String[] args) {
        int[] i = new int[]{9, 4, 3, 2, 5, 1, 7, 12, 18, 6, 15};
        sort(i, 0, i.length - 1);
        System.out.println(Arrays.toString(i));
    }

    public static void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int l = left;
        int r = right;
        while (l < r) {
            while (l < r && array[r] >= array[left]) r--;
            while (l < r && array[l] <= array[left]) l++;
            if (l == r) {
                int temp = array[r];
                array[r] = array[left];
                array[left] = temp;
            } else {
                int temp = array[r];
                array[r] = array[l];
                array[l] = temp;
            }
        }
        sort(array, left, l - 1);
        sort(array, r + 1, right);
    }
}
