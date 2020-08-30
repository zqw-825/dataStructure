package com.search;

import java.util.ArrayList;

/**
 * @author zqw
 * @create 2020-08-28 23:17
 */
public class BinarySearch {
    public static ArrayList<Integer> binarySearch(int[] arr, int left, int right, int findVal) {
        ArrayList<Integer> list = new ArrayList<>();
        if (findVal < arr[left] || findVal > arr[right] || left > right) {
            return list;
        }
        int flag = left + (right - left)/ 2;

        if (findVal < arr[flag]) {
            return binarySearch(arr, left, flag - 1, findVal);
        } else if (findVal > arr[flag]) {
            return binarySearch(arr, flag + 1, right, findVal);
        } else {
            while (flag >= 0 &&arr[flag] == findVal) {
                flag--;
            }
            while (flag < arr.length-1 && arr[flag + 1] == findVal) {
                list.add(flag + 1);
                flag++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3,4,5,6,7,8};
        ArrayList<Integer> integers = binarySearch(ints, 0, ints.length - 1, 3);
        System.out.println(integers);
    }
}
