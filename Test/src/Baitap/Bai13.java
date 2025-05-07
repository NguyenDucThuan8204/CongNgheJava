package Baitap;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class Bai13 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai13 frame = new Bai13();
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
    public Bai13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Tạo JButton "Open Child Window"
        JButton btnOpenChildWindow = new JButton("Open Child Window");
        btnOpenChildWindow.setBounds(150, 100, 150, 40);
        contentPane.add(btnOpenChildWindow);
        
        // Thêm ActionListener cho JButton
        btnOpenChildWindow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tạo JFrame con
                JFrame childFrame = new JFrame("Child Window");
                childFrame.setSize(200, 200);
                childFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                // Thêm JLabel vào JFrame con
                JLabel label = new JLabel("Child Window", JLabel.CENTER);
                childFrame.add(label);
                
                // Hiển thị JFrame con
                childFrame.setVisible(true);
            }
        });
    }
}
