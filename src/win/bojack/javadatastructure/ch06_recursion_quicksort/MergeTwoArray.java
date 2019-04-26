package win.bojack.javadatastructure.ch06_recursion_quicksort;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a = {1,8,19,44,56,70};
        int[] b = {5,18,39,41,51,60,78,84,89,90,99};

        int[] r = merge(a,b);
        for (int i = 0; i<r.length; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();
    }

    private static int[] merge(int[] a, int[] b) {
        int lena = a.length;
        int lenb = b.length;
        int idxa = 0;
        int idxb = 0;
        int[] c = new int[lena + lenb];
        int idxc = 0;
        while(idxa < lena && idxb < lenb) {
            if (a[idxa] > b[idxb]) {
                c[idxc++] = b[idxb++];
            } else {
                c[idxc++] = a[idxa++];
            }
        }
        while(idxa < lena) {
            c[idxc++] = a[idxa++];
        }
        while(idxb < lenb) {
            c[idxc++] = b[idxb++];
        }
        return c;
    }
}
