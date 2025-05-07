package Baitap;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Bai16 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai16() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        setTitle("BorderLayout Example");
        setLayout(new BorderLayout());

        // Thêm JLabel vào từng vùng
        JLabel labelNorth = new JLabel("North", JLabel.CENTER);
        labelNorth.setBackground(Color.RED);
        labelNorth.setOpaque(true);
        add(labelNorth, BorderLayout.NORTH);

        JLabel labelSouth = new JLabel("South", JLabel.CENTER);
        labelSouth.setBackground(Color.GREEN);
        labelSouth.setOpaque(true);
        add(labelSouth, BorderLayout.SOUTH);

        JLabel labelEast = new JLabel("East", JLabel.CENTER);
        labelEast.setBackground(Color.YELLOW);
        labelEast.setOpaque(true);
        add(labelEast, BorderLayout.EAST);

        JLabel labelWest = new JLabel("West", JLabel.CENTER);
        labelWest.setBackground(Color.BLUE);
        labelWest.setOpaque(true);
        add(labelWest, BorderLayout.WEST);

        JLabel labelCenter = new JLabel("Center", JLabel.CENTER);
        labelCenter.setBackground(Color.CYAN);
        labelCenter.setOpaque(true);
        add(labelCenter, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Bai16 frame = new Bai16();
        frame.setVisible(true);
    }
}
