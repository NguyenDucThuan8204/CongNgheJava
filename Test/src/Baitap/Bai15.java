package Baitap;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Bai15 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai15 frame = new Bai15();
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
    public Bai15() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Vô hiệu hóa nút X
        setBounds(100, 100, 400, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Tạo JButton "Exit"
        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(150, 100, 100, 40);
        contentPane.add(btnExit);

        // Thêm ActionListener cho JButton
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Đóng ứng dụng khi nhấn nút "Exit"
            }
        });
    }
}
