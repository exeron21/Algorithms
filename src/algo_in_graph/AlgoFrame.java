package algo_in_graph;

import javax.swing.*;
import java.awt.*;

public class AlgoFrame extends JFrame {

    private int weight;

    public int getWeight() {
        return weight;
    }

    @Override
    public int getHeight() {
        return height;
    }

    private int height;
    public AlgoFrame(String title) {
        this(title, 800, 600);
    }
    public AlgoFrame(String title, int weight, int height) {
        super(title);
        this.weight = weight;
        this.height = height;
        AlgoCanvas canvas = new AlgoCanvas();
        canvas.setPreferredSize(new Dimension(weight, height));
        setContentPane(canvas);
        pack();

//        setSize(weight, height);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
    private class AlgoCanvas extends JPanel{
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(100,100,400,400);
        }
    }
}
