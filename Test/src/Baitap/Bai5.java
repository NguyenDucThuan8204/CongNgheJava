package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.SwingConstants;

public class Bai5 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai5 frame = new Bai5();
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
    public Bai5() {
        setTitle("Digital Clock"); // Đặt tiêu đề
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200); // Kích thước cửa sổ
        setLocationRelativeTo(null); // Căn giữa màn hình

        contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // Lấy thời gian hiện tại
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = now.format(formatter);

        // Tạo JLabel hiển thị thời gian
        JLabel lblTime = new JLabel(formattedTime, SwingConstants.CENTER);
        lblTime.setFont(lblTime.getFont().deriveFont(36f)); // Cỡ chữ to hơn

        contentPane.add(lblTime, BorderLayout.CENTER);
    }
}
