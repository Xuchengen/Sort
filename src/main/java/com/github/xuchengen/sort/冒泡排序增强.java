package com.github.xuchengen.sort;

import java.util.Arrays;

public class 冒泡排序增强 {

    public static void main(String[] args) {
        int[] i = new int[]{9, 4, 3, 2, 5};
        sort(i);
        System.out.println(Arrays.toString(i));
    }

    public static void sort(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    flag = false;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (flag) {
                break;
            }
        }
    }

}
