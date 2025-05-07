package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai40 extends JFrame {

    private static final long serialVersionUID = 1L;
    private int count = 0;  // Biến đếm số lần nhấn

    public Bai40() {
        setTitle("Click Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);

        // JPanel chứa các thành phần
        JPanel panel = new JPanel();
        add(panel, BorderLayout.CENTER);

        // JLabel hiển thị số lần nhấn
        JLabel countLabel = new JLabel("Count: 0");
        panel.add(countLabel);

        // JButton "Click Me"
        JButton clickButton = new JButton("Click Me");
        panel.add(clickButton);

        // ActionListener để tăng giá trị đếm khi nhấn nút
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                countLabel.setText("Count: " + count);  // Cập nhật JLabel
            }
        });
    }

    public static void main(String[] args) {
        Bai40 frame = new Bai40();
        frame.setVisible(true);
    }
}
