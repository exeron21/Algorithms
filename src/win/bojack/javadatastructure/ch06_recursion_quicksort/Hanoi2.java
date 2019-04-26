package win.bojack.javadatastructure.ch06_recursion_quicksort;

public class Hanoi2 {


    public static void move(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("move 1 disk  from " + from + " to " + to + ".");
        } else {
            move(topN - 1, from, to, inter);
            System.out.println("move " + topN + " disks from " + from + " to " + to + ".");
            move(topN - 1, inter, from, to);
        }
    }

    public static void main(String[] args) {
        move(4, 'A', 'B','C');
    }
}
