package com.github.xuchengen.sort;

import java.util.Arrays;

public class 冒泡排序 {

    public static void main(String[] args) {
        int[] i = new int[]{9, 4, 3, 2, 5};
        sort(i);
        System.out.println(Arrays.toString(i));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
