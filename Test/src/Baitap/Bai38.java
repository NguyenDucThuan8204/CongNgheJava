package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Bai38 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai38() {
        setTitle("Double Click to Change Color");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 400);

        // JLabel hiển thị mã màu RGB hiện tại
        JLabel label = new JLabel("RGB: (0, 0, 0)", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        // MouseListener để đổi màu nền khi nhấp đúp
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    // Tạo màu ngẫu nhiên
                    Random rand = new Random();
                    int r = rand.nextInt(256);
                    int g = rand.nextInt(256);
                    int b = rand.nextInt(256);

                    // Đổi màu nền và cập nhật mã màu RGB
                    getContentPane().setBackground(new Color(r, g, b));
                    label.setText("RGB: (" + r + ", " + g + ", " + b + ")");
                }
            }
        });
    }

    public static void main(String[] args) {
        Bai38 frame = new Bai38();
        frame.setVisible(true);
    }
}
