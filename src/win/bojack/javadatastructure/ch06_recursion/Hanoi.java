package win.bojack.javadatastructure.ch06_recursion;

public class Hanoi {

    public static void run(int top, char from , char inter, char to) {
        if (top == 1) {
            System.out.println("Moving " + top + " disks from " + from + " to " + to + ".");
        } else {
            run(top - 1, from ,to , inter);
            System.out.println("Moving " + top + " disks from " + from + " to " + to + ".");
            run(top - 1, inter ,from , to);
        }
    }

    public static void main(String[] args) {
        run(2, 'A', 'B', 'C');
    }
}
