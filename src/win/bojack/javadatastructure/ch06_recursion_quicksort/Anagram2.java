package win.bojack.javadatastructure.ch06_recursion_quicksort;

public class Anagram2 {

    static char[] words = "cat".toCharArray();
    static int len = words.length;
    static int count = 1;

    public static void main(String[] args) {
        anagram(len);
    }

    public static void rotate2(int size) {
        int i;
        int pos = len - size;
        char tmp = words[pos];
        for (i = pos + 1;i<len; i++) { // 下一行是words[i-1]，所以这里要用i = pos + 1
            words[i - 1] = words[i];
        }
        words[i - 1] = tmp;
    }

    private static void anagram(int size) {
        if (size == 1) {
            display();
            return ;
        }
        for (int i = 0; i< size; i++) {
            anagram(size - 1);
            rotate2(size);
        }
    }

    private static void display() {
        System.out.print(count++ + " ");
        for (int i=0;i<len;i++) {
            System.out.print(words[i]);
        }
        System.out.println();
    }
}
