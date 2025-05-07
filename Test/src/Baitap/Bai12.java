package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Bai12 extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        // Cập nhật giao diện tùy chỉnh trước khi tạo giao diện người dùng
        try {
            // Sử dụng giao diện Nimbus
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            // Hoặc sử dụng giao diện Metal bằng cách thay thế dòng trên bằng:
            // UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        // Khởi chạy giao diện người dùng trong một thread an toàn
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai12 frame = new Bai12();
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
    public Bai12() {
        setTitle("Custom Look and Feel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300); // Kích thước cửa sổ chính

        // Tạo JLabel và đặt nó ở giữa
        JLabel label = new JLabel("Custom Look and Feel", JLabel.CENTER);
        add(label); // Thêm JLabel vào JFrame

        // Thiết lập layout cho JFrame
        setLayout(null);
        label.setBounds(100, 120, 200, 30); // Đặt vị trí và kích thước cho JLabel
    }
}
