package com.sort;

/**
 * @author zqw
 * @create 2020-08-28 21:58
 */
public class MergeSortJava {

    public static void mergeSort(int[] arr, int left, int right, int[] tempArr) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, tempArr);
            mergeSort(arr, mid + 1, right, tempArr);
            merge(arr, left, mid, right, tempArr);
        }

    }

    public static void merge(int[] arr, int left, int mid, int right, int[] tempArr) {
        int i = left;
        int j = mid + 1;
        int temp = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tempArr[temp] = arr[i];
                temp++;
                i++;
            } else {
                tempArr[temp] = arr[j];
                temp++;
                j++;
            }
        }
        while (i <= mid) {
            tempArr[temp] = arr[i];
            temp++;
            i++;
        }
        while (j <= right) {
            tempArr[temp] = arr[j];
            temp++;
            j++;
        }
        temp = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = tempArr[temp];
            temp++;
            tempLeft++;
        }
    }

}
