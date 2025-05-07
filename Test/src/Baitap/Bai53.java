package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai53 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblTime; // JLabel để hiển thị thời gian

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai53 frame = new Bai53();
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
    public Bai53() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200); // Kích thước cửa sổ
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Tạo JLabel để hiển thị thời gian
        lblTime = new JLabel("00:00:00");
        lblTime.setFont(new Font("Arial", Font.PLAIN, 40)); // Cỡ chữ lớn để hiển thị rõ
        lblTime.setHorizontalAlignment(SwingConstants.CENTER); // Căn giữa chữ
        lblTime.setBounds(50, 50, 200, 60); // Vị trí và kích thước của JLabel
        contentPane.add(lblTime);

        // Tạo một Thread để cập nhật thời gian mỗi giây
        Thread timeThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        // Lấy thời gian hiện tại
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        String currentTime = sdf.format(new Date()); // Định dạng thời gian hiện tại thành HH:mm:ss
                        
                        // Cập nhật thời gian lên JLabel trong EDT
                        lblTime.setText(currentTime);
                        
                        // Ngủ 1 giây để tiếp tục cập nhật
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        
        // Bắt đầu thread thời gian
        timeThread.start();
    }
}
