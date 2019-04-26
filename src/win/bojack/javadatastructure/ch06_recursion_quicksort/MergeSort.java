package win.bojack.javadatastructure.ch06_recursion_quicksort;

import static win.bojack.javadatastructure.ch03_basicsorting.BasicSort.genData;

public class MergeSort {
    static int len = 50;
    static int[] arr = new int[len];
    static boolean print_result = true;

    public static void main(String[] args) {
        genData(arr);
        mergeSort(arr,0,arr.length);
    }


    public static void mergeSort(int[] arr, int lo, int hi) {
        System.out.println("lo = " + lo + ",hi = " + hi);
        if (lo == hi) {
            return;
        } else {
            int mid = (lo + hi) / 2;
            mergeSort(arr, lo, mid);
            mergeSort(arr, mid + 1, hi);
            merge(arr, lo, mid+ 1, hi);
        }
    }

    private static void merge(int[] arr, int lo, int i, int hi) {
        int j = 0;
        int lo2 = lo;
        int mid = hi -1;
        int n = hi - lo + 1;
        while (lo <= mid && i <= hi) {

        }
    }
}
