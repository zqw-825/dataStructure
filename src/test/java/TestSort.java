import com.search.BinarySearch;
import com.sort.QuickSortJava;
import com.util.Util;
import com.sort.MergeSortJava;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author zqw
 * @create 2020-08-28 22:01
 */
public class TestSort {
    @Test //二分查找测试
    public void BinSearchTest(){
        int[] arr = Util.getArr(20);
        QuickSortJava.quickSort(arr,0,arr.length-1);
        Util.arrToString(arr);
        ArrayList flag = BinarySearch.binarySearch(arr, 0, arr.length-1, 3);
        System.out.println(flag);

    }

    @Test //快速排序测试
    public void QuickSortTest() {
        int[] arr = Util.getArr();
        Util.arrToString(arr);
        QuickSortJava.quickSort(arr,0,arr.length-1);
        Util.arrToString(arr);
    }


    @Test  //归并排序测试
    public void MergeSortTest() {
        int[] arr = Util.getArr();
        int[] tempArr = new int[20];
        Util.arrToString(arr);
        MergeSortJava.mergeSort(arr, 0, arr.length - 1, tempArr);
        Util.arrToString(arr);
    }

}
