package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai36 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai36() {
        setTitle("Change Text Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);

        // JPanel chứa các thành phần
        JPanel panel = new JPanel();
        add(panel, BorderLayout.CENTER);

        // JLabel với văn bản ban đầu
        JLabel label = new JLabel("Original Text");
        panel.add(label);

        // JButton "Change"
        JButton changeButton = new JButton("Change");
        panel.add(changeButton);

        // Sự kiện khi nhấn nút "Change"
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Text Changed");
            }
        });
    }

    public static void main(String[] args) {
        Bai36 frame = new Bai36();
        frame.setVisible(true);
    }
}
