package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai65 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblTime;
    private JButton btnStart, btnStop, btnReset;
    private Timer timer;
    private int seconds = 0; // Thời gian tính bằng giây
    private boolean isRunning = false; // Trạng thái của đồng hồ

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai65 frame = new Bai65();
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
    public Bai65() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Tạo JLabel để hiển thị thời gian
        lblTime = new JLabel("Thời gian: 00:00");
        lblTime.setBounds(81, 41, 153, 29);
        contentPane.add(lblTime);

        // Tạo nút Start
        btnStart = new JButton("Start");
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });
        btnStart.setBounds(81, 165, 85, 21);
        contentPane.add(btnStart);
        
        // Tạo nút Stop
        btnStop = new JButton("Stop");
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });
        btnStop.setBounds(189, 165, 85, 21);
        contentPane.add(btnStop);
        
        // Tạo nút Reset
        btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetTimer();
            }
        });
        btnReset.setBounds(296, 165, 85, 21);
        contentPane.add(btnReset);
        
        // Tạo Timer để tăng giây mỗi lần
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seconds++;
                updateTimeLabel();
            }
        });
    }

    /**
     * Phương thức để bắt đầu đồng hồ
     */
    private void startTimer() {
        if (!isRunning) {
            isRunning = true;
            timer.start(); // Bắt đầu chạy Timer
            btnStart.setEnabled(false); // Vô hiệu hóa nút Start khi đồng hồ đang chạy
        }
    }

    /**
     * Phương thức để dừng đồng hồ
     */
    private void stopTimer() {
        if (isRunning) {
            isRunning = false;
            timer.stop(); // Dừng Timer
            btnStart.setEnabled(true); // Kích hoạt lại nút Start
        }
    }

    /**
     * Phương thức để reset đồng hồ
     */
    private void resetTimer() {
        stopTimer(); // Dừng đồng hồ nếu đang chạy
        seconds = 0; // Đặt lại thời gian về 0
        updateTimeLabel(); // Cập nhật lại hiển thị thời gian
    }

    /**
     * Phương thức để cập nhật thời gian hiển thị trên JLabel
     */
    private void updateTimeLabel() {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        String timeString = String.format("Thời gian: %02d:%02d", minutes, remainingSeconds);
        lblTime.setText(timeString);
    }
}
