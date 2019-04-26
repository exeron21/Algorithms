package win.bojack.algorithm4;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Ch91 {
    public static void main(String[] args) {
        int N = StdIn.readInt();

        double rw = 0.5 / N - 0.001;
        for (int i =0;i<N;i++) {
            double r = StdRandom.random();
            double x = 1.0 * i / N + rw;
            double y = r / 2.0;
            double rh = r / 2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }
}
