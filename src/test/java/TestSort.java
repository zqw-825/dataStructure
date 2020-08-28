import com.sort.QuickSortJava;
import com.util.Util;
import com.sort.MergeSortJava;
import org.junit.After;
import org.junit.Test;

/**
 * @author zqw
 * @create 2020-08-28 22:01
 */
public class TestSort {


    @Test
    public void QuickSortTest() {
        int[] arr = Util.getArr(20);
        int[] tempArr = new int[20];
        QuickSortJava.quickSort(arr,0,arr.length-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }


    @Test  //归并排序测试
    public void MergeSortTest() {
        int[] arr = Util.getArr(20);
        int[] tempArr = new int[20];
        MergeSortJava.mergeSort(arr, 0, arr.length - 1, tempArr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
