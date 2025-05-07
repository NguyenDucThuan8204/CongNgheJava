package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai6 extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai6 frame = new Bai6();
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
    public Bai6() {
        // Cấu hình JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        setTitle("Custom Icon Window");

        // Đặt biểu tượng cửa sổ (logo.png)
        ImageIcon icon = new ImageIcon("logo.png"); // Đảm bảo logo.png nằm trong thư mục dự án hoặc đường dẫn chính xác
        setIconImage(icon.getImage());

        // Tạo JLabel hiển thị dòng chữ giữa cửa sổ
        JLabel label = new JLabel("Custom Icon Window", JLabel.CENTER);
        getContentPane().add(label, BorderLayout.CENTER); // Thêm label vào giữa cửa sổ
    }
}
