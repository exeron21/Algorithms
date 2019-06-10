package gyz;

public class A {
    int x = 1;
    static int y;

    void f() {
        x = 123;
        y = 123;
        this.x = 231;
        A.y = 999;

        int x = 222;
        int y = 34;
    }

    public static void main(String[] args) {
        System.out.println(new A().x);
    }
}
