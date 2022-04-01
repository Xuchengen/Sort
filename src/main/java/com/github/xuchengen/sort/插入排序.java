package com.github.xuchengen.sort;

import java.util.Arrays;

public class 插入排序 {

    public static void main(String[] args) {
        int[] i = new int[]{9, 4, 3, 2, 5};
        sort(i);
        System.out.println(Arrays.toString(i));
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int currentIndex = i;
            while (currentIndex > 0 && currentValue < array[currentIndex - 1]) {
                array[currentIndex] = array[currentIndex - 1];
                currentIndex--;
            }
            array[currentIndex] = currentValue;
        }
    }

}
// 原数组
// [9,4,3,2,5]
// 第一次while|下标为1，值为4|下标1大于0，且4小于前值9，交换值|下标减1变0，值为4|(0>0 && 4<?)=false
// [4,9,3,2,5]
// while不满足条件进入第二次for
// 第一次while|下标为2，值为9|下标2大于0，且3小于前值9，交换值|下标减1变1，值为3|(1>0 && 3<4)=true
// [4,3,9,2,5]
// while条件满足进入第二次while|下标为1，值为3小于前值4，交换值|下标减1变0，值为3|(0>0 && 3<?)=false
// [3,4,9,2,5]
// while条件不满足进入第三次for
// 第一次while|下标为3，值为2|下标3大于0，且2小于前值9，交换值|下标减1变2，值为2|(2>0 && 2<4)=true
// [3,4,2,9,5]
// while条件满足进入第二次while|下标2大于0，且2小于前值4，交换值|下标减1变1，值为2|(1>0 && 2<3)=true
// [3,2,4,9,5]
// while条件满足进入第三次while|下标为1大于0，且2小于前值3，交换值|下标减1变0，值为2|(0>0 && 2<?)=false
// [2,3,4,9,5]
// while条件不满足进入第四次for
// 第一次while|下标为4，值为5|下标4大于0，且5小于前值9，交换值|下标减1变3，值为5|(3>0 && 5<4)=false
// [2,3,4,5,9]
