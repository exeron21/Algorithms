package test;

public class AutoBoxingTest {
    private double side1;
    private double side2;
    private double side3;

    AutoBoxingTest() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    AutoBoxingTest(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    class C {

    }
    protected class D {

    }
    private class B {

    }
    public class E {

    }
    public static void main(String[] arge) {
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
