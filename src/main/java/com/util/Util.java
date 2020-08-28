package com.util;

import javax.sound.midi.Soundbank;

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
    public static int[] getArr() {
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        return arr;
    }

    //遍历打印数组
    public static void arrToString(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
