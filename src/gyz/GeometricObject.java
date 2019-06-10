package gyz;

public class GeometricObject {
    boolean filled;
    String color;
    public double PI = 3.14;

    void f() {
        color = "haha";
        this.color = "haha";
        String color = "hehe";
    }

    @Override
    public String toString() {
        return "GeometricObject";
    }

    public void setColor(String a) {
        color = a;
    }

    public void setFilled(boolean b) {
        filled = b;
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }
}
