package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai9 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai9 frame = new Bai9();
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
    public Bai9() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400); // Đặt kích thước của JFrame
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null); // Thiết lập layout của contentPane

        // Tạo JButton "Open Dialog"
        JButton btnOpenDialog = new JButton("Open Dialog");
        btnOpenDialog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mở JDialog khi nhấn nút
                showDialog();
            }
        });
        btnOpenDialog.setBounds(175, 150, 150, 30); // Đặt vị trí và kích thước của nút
        contentPane.add(btnOpenDialog);
    }

    // Phương thức để mở JDialog
    private void showDialog() {
        JDialog dialog = new JDialog(this, "Dialog", true); // Tạo JDialog, true để nó là modal
        dialog.setSize(200, 150); // Đặt kích thước cho JDialog

        // Thêm JLabel vào JDialog
        JLabel label = new JLabel("This is a dialog", JLabel.CENTER);
        dialog.add(label);

        dialog.setLocationRelativeTo(this); // Đặt JDialog ở giữa JFrame chính
        dialog.setVisible(true); // Hiển thị JDialog
    }
}
