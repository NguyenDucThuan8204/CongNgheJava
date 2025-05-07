package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai18 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai18() {
        setTitle("Chess Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 400);
        setLayout(new GridLayout(8, 8)); // GridLayout 8x8

        // Thêm 64 JPanel với màu đen và trắng xen kẽ
        for (int i = 0; i < 64; i++) {
            JPanel panel = new JPanel();
            if ((i / 8 + i % 8) % 2 == 0) {
                panel.setBackground(Color.WHITE); // Ô trắng
            } else {
                panel.setBackground(Color.BLACK); // Ô đen
            }
            add(panel);
        }
    }

    public static void main(String[] args) {
        Bai18 frame = new Bai18();
        frame.setVisible(true);
    }
}
