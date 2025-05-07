package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai41 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai41() {
        setTitle("Open Dialog Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);

        // JPanel chứa các thành phần
        JPanel panel = new JPanel();
        add(panel, BorderLayout.CENTER);

        // JButton "Open Dialog"
        JButton openDialogButton = new JButton("Open Dialog");
        panel.add(openDialogButton);

        // ActionListener để mở JDialog khi nhấn nút
        openDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tạo JDialog mới
                JDialog dialog = new JDialog(Bai41.this, "Dialog", true);
                dialog.setSize(200, 150);
                dialog.setLocationRelativeTo(Bai41.this); // Đặt vị trí trung tâm
                dialog.setLayout(new BorderLayout());

                // JLabel "Dialog Opened" trong JDialog
                JLabel dialogLabel = new JLabel("Dialog Opened", SwingConstants.CENTER);
                dialog.add(dialogLabel, BorderLayout.CENTER);

                dialog.setVisible(true);  // Hiển thị JDialog
            }
        });
    }

    public static void main(String[] args) {
        Bai41 frame = new Bai41();
        frame.setVisible(true);
    }
}
