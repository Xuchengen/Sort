package com.github.xuchengen.sort;

import java.util.Arrays;

public class 希尔排序 {

    public static void main(String[] args) {
        int[] i = new int[]{9, 4, 3, 2, 5, 1, 7, 12, 18, 6, 15};
        sort(i);
        System.out.println(Arrays.toString(i));
    }

    public static void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int currentValue = array[i];
                int currentIndex = i;
                while (currentIndex - gap >= 0 && currentValue < array[currentIndex - gap]) {
                    array[currentIndex] = array[currentIndex - gap];
                    currentIndex -= gap;
                }
                array[currentIndex] = currentValue;
            }
        }
    }
}
