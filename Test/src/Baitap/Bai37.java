package Baitap;

import javax.swing.*;
import java.awt.event.*;

public class Bai37 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai37() {
        setTitle("Mouse Coordinates");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);

        // JLabel hiển thị tọa độ chuột
        JLabel label = new JLabel("Mouse at: (0, 0)");
        add(label);

        // MouseListener để theo dõi tọa độ chuột
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
    }

    public static void main(String[] args) {
        Bai37 frame = new Bai37();
        frame.setVisible(true);
    }
}
