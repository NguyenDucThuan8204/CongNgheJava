package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai8 extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai8 frame = new Bai8();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Bai8() {
        // Cấu hình JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 400);
        setTitle("Colored Background");

        // Đặt màu nền
        getContentPane().setBackground(Color.GREEN);

        // Tạo JLabel hiển thị dòng chữ giữa cửa sổ
        JLabel label = new JLabel("Colored Background", JLabel.CENTER);
        getContentPane().add(label, BorderLayout.CENTER);
    }
}
