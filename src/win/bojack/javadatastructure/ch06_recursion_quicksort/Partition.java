package win.bojack.javadatastructure.ch06_recursion_quicksort;

import static win.bojack.javadatastructure.ch03_basicsorting.BasicSort.genData;
import static win.bojack.javadatastructure.ch03_basicsorting.BasicSort.printResult;

public class Partition {

    static int n = 10;
    static int[] arr = new int[n];

    public static void main(String[] args) {
        genData(arr);
        printResult(arr, n);
        int pivot = n/2;
        partition(0, n - 1,pivot);
        printResult(arr, n);
    }

    private static int partition(int left, int right, int pivot) {
        int leftPtr = left - 1; // 这里起始下标要-1，结束下标要加1，是因为下面的while语句中使用了++leftPtr这种语法
        int rightPtr = right + 1;
        while (true) {
            while(leftPtr < right && arr[++leftPtr] < pivot); // 这两句代码会一直执行，直到条件为否，也就是从左边找到一个大于“枢纽”的元素，
            while(rightPtr > left && arr[--rightPtr] > pivot);// 然后在右边找到一个小于“枢纽”的元素
            if (leftPtr >= rightPtr)  // 如果这时左侧指针已经大于等于右侧指针了，说明分区已经完成
                break;
            else
                swap(leftPtr,rightPtr); // 如果左侧指针还小于右侧指针，说明整个数组还未处理完成，互换两个元素的位置
        }
        return leftPtr; // 返回分区的下标
    }

    /**
     * 将数组中两个元素互换位置
     * @param leftPtr
     * @param rightPtr
     */
    private static void swap(int leftPtr, int rightPtr) {
        int tmp = arr[leftPtr];
        arr[leftPtr] = arr[rightPtr];
        arr[rightPtr] = tmp;
    }
}
