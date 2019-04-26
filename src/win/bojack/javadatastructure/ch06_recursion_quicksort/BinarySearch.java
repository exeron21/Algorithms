package win.bojack.javadatastructure.ch06_recursion_quicksort;

import static win.bojack.javadatastructure.ch03_basicsorting.BasicSort.genData;
import static win.bojack.javadatastructure.ch03_basicsorting.BasicSort.insertSort;
import static win.bojack.javadatastructure.ch03_basicsorting.BasicSort.printResult;

public class BinarySearch {

    static int len = 1000;
    static int[] arr = new int[len];

    public static void main(String[] args) {
        genData(arr);
        int[] arr2 = insertSort(arr,1);
        printResult(arr2,arr2.length);
        int sea = 341;
        int idx = recursion(arr2, 0, arr2.length, sea);
        System.out.println(arr2[idx]);
        int idx2 = iteration(arr2, 0, arr2.length, sea);
        System.out.println(arr2[idx2]);
    }

    // 迭代方式二分查找法
    private static int iteration(int[] arr, int lo ,int hi, int sea) {
        while(hi > lo) {
            int idx = (lo + hi) / 2;
            if (arr[idx] > sea) {
                hi = idx - 1;
            } else if (arr[idx] < sea) {
                lo = idx + 1;
            } else {
                return arr[idx];
            }
        }
        return -1;
    }

    // 递归方式二分查找法
    private static int recursion(int[] arr , int lo, int hi, int sea) {
        int idx = (lo + hi) / 2 ;
        if (lo > hi) {
            return -1;
        } else if (arr[idx] > sea) {
            return recursion(arr, lo, idx - 1, sea);
        } else if (arr[idx] < sea) {
            return recursion(arr, idx + 1, hi, sea);
        } else {
            return arr[idx];
        }
    }
}
