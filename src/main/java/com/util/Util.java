package com.util;

/**
 * @author zqw
 * @create 2020-08-28 22:25
 */
public class Util {
    //获取一个随机长度的数组
    public static int[] getArr(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }
        return arr;
    }

    //遍历一个数组

}
