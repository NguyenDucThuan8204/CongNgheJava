package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai19 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setTitle("Nested Layout with BoxLayout");

        // JPanel chính với BoxLayout dọc
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Thêm 2 JPanel con với BoxLayout ngang
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        panel1.add(new JLabel("Label 1"));
        panel1.add(new JLabel("Label 2"));
        panel1.add(new JButton("Button 1"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(new JLabel("Label 3"));
        panel2.add(new JLabel("Label 4"));
        panel2.add(new JButton("Button 2"));

        // Thêm các JPanel con vào JPanel chính
        mainPanel.add(panel1);
        mainPanel.add(panel2);

        // Thêm JPanel chính vào JFrame
        add(mainPanel);
    }

    public static void main(String[] args) {
        Bai19 frame = new Bai19();
        frame.setVisible(true);
    }
}
