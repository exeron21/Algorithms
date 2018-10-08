package win.bojack.javadatastructure.ch03_basicsorting;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
//        Random ran = new Random(100);
//        for (int i = 0;i<1000;i++) {
//            System.out.println(ran.nextInt(1000));
//        }

        genData();
    }
    static int len = 100;
    static int[] arr = new int[len];

    private static void genData() {
        Random ran = new Random();
        for (int i = 0;i<len;i++) {
            int r = ran.nextInt(len);
            System.out.print(r + " ");
            arr[i] = r;
        }
        System.out.println();

        for (int i = 0;i<len;i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
