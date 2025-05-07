package Baitap;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Bai14 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblResponse;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai14 frame = new Bai14();
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
    public Bai14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Tạo JButton "Show Message"
        JButton btnShowMessage = new JButton("Show Message");
        btnShowMessage.setBounds(90, 50, 120, 40);
        contentPane.add(btnShowMessage);
        
        // Tạo JLabel để hiển thị phản hồi
        lblResponse = new JLabel("Response: ");
        lblResponse.setBounds(90, 120, 120, 30);
        contentPane.add(lblResponse);
        
        // Thêm ActionListener cho JButton
        btnShowMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hiển thị JOptionPane với 3 tùy chọn Yes/No/Cancel
                int response = JOptionPane.showOptionDialog(
                    null, 
                    "Do you want to continue?", 
                    "Choose an option", 
                    JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    new Object[] {"Yes", "No", "Cancel"}, 
                    "Yes");

                // Cập nhật JLabel theo lựa chọn
                switch (response) {
                    case JOptionPane.YES_OPTION:
                        lblResponse.setText("Response: Yes");
                        break;
                    case JOptionPane.NO_OPTION:
                        lblResponse.setText("Response: No");
                        break;
                    case JOptionPane.CANCEL_OPTION:
                        lblResponse.setText("Response: Cancel");
                        break;
                    default:
                        lblResponse.setText("Response: No selection");
                        break;
                }
            }
        });
    }
}
