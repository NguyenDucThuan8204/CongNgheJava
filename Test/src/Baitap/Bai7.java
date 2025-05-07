package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai7 extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai7 frame = new Bai7();
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
    public Bai7() {
        // Cấu hình JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        
        // Đặt kích thước tối thiểu và tối đa
        setMinimumSize(new Dimension(200, 150));
        setMaximumSize(new Dimension(800, 600));
        
        setTitle("Resizable Window");

        // Tạo JLabel hiển thị dòng chữ giữa cửa sổ
        JLabel label = new JLabel("Resizable Window", JLabel.CENTER);
        getContentPane().add(label, BorderLayout.CENTER);
    }
}
