package com.github.xuchengen.sort;

import java.util.Arrays;

public class 选择排序 {

    public static void main(String[] args) {
        int[] i = new int[]{9, 4, 3, 2, 5};
        sort(i);
        System.out.println(Arrays.toString(i));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            // 在当前数之后的所有数中找到最小的数
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            // 将当前数与最小数的进行交换
            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }

}
