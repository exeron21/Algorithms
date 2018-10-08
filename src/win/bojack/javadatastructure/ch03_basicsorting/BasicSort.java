package win.bojack.javadatastructure.ch03_basicsorting;

import java.util.Random;

public class BasicSort {
    static int len = 50000;
    static int[] arr = new int[len];
    static boolean print_result = true;

    public static void main(String[] args) {
        genData(arr);
        int[] tmp = arr.clone();
//        printResult(arr);
        long t1 = System.currentTimeMillis();
        int[] bubbleSort = bubbleSort();
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        if (print_result)
            printResult(bubbleSort, 1000);
        arr = tmp.clone();
        int[] selectSort = selectSort();
        long t3 = System.currentTimeMillis();
        System.out.println(t3-t2);
        if (print_result)
            printResult(selectSort, 1000);
        arr = tmp.clone();
        int[] insertSort = insertSort(arr,1);
        long t4 = System.currentTimeMillis();
        System.out.println(t4-t3);
        if (print_result)
            printResult(insertSort, 1000);
    }

    public static void printResult(int[] arr, int size) {
        for (int i = 0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] insertSort(int[] arr, int splitPos) {
        int j;
        int len = arr.length;
        for (int i = splitPos; i <len; i++) {
            int tmp = arr[i];
            j = i;
            while(j>0 && arr[j-1] >= tmp) {
                arr[j] = arr[j-1];
                --j;
            }
            arr[j] = tmp;
        }
        return arr;
    }

    public static int[] selectSort() {
        int len2 = len;
        for (int i = 0; i <len - 1; i++) {
            len2 --;
            int max = 0;
            for (int j = 0;j<len2; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            if (arr[max] > arr[len2]) {
                int tmp = arr[max];
                arr[max] = arr[len2];
                arr[len2] = tmp;
            }
        }
        return arr;
    }

    public static void genData(int[] arr) {
        int len = arr.length;
        Random ran = new Random();
        for (int i = 0;i<len;i++) {
            int r = ran.nextInt(len);
            arr[i] = r;
        }
    }

    public static int[] bubbleSort() {
        int len2 = len;
        for (int i = 0; i <len; i++) {
            len2 --;
            for (int j = 0;j<len2; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
