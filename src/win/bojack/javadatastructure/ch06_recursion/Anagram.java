package win.bojack.javadatastructure.ch06_recursion;

/**
 * 给出一个单词，计算出所有可能的字母组合
 */
public class Anagram {
    static String word = "cats";
    static int len = word.length();
    static char[] arr = new char[len];
    static int count = 0;

    public static void doAnagram(int size) {
        if (size == 1) {
            return ;
        }
        for (int i = 0;i<size;i++) {
            doAnagram(size - 1);
            rotate(size);
            displayWord();
        }
    }
    public static void rotate(int size) {
        int j ;
        int pos = len - size;
        char tmp = arr[pos];
        for (j = pos +1 ;j<len;j++) {
            arr[j-1] = arr[j];
        }
        arr[j-1] = tmp;
    }

    public static void displayWord() {
        System.out.print(count + "\t");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        count ++;
    }
    public static void main(String[] args) {
        arr = word.toCharArray();
        doAnagram(len);
    }
}
