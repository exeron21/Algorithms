package test;

public class AutoBoxingTest {
    public static void main(String[] args) {
        long start = System.nanoTime();
        for(int i =0; i< 1000000;i++) {
            Integer in = i;
        }

        long time2 = System.nanoTime();
        System.out.println(time2 - start);

        for(int i =0; i< 1000000;i++) {
            int in = i;
        }

        long time3 = System.nanoTime();

        System.out.println(time3 - time2);
    }
}
