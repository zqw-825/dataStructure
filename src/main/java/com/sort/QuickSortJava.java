package com.sort;

/**
 * @author zqw
 * @create 2020-08-28 22:48
 */
public class QuickSortJava {
    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int mid = (right + left) / 2;
        int pivot = arr[mid];
        while (l < r) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            arr[l] = arr[l] ^ arr[r];
            arr[r] = arr[l] ^ arr[r];
            arr[l] = arr[l] ^ arr[r];
            if (arr[l] == pivot) {
                r--;
            }
            if (arr[r] == pivot) {
                l++;
            }
        }
        if (l == r) {
            l++;
            r--;
        }
        if (l < right) {
            quickSort(arr, l, right);
        }
        if (r > left) {
            quickSort(arr, left, r);
        }

    }

}
