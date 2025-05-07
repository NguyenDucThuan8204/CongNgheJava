package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai25 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai25() {
        setTitle("JRadioButton Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        setLayout(new FlowLayout());

        // Tạo ButtonGroup và JRadioButton
        ButtonGroup group = new ButtonGroup();
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        group.add(maleButton);
        group.add(femaleButton);

        // Thêm các JRadioButton vào JFrame
        add(maleButton);
        add(femaleButton);

        // JLabel hiển thị lựa chọn
        JLabel label = new JLabel("Selected: None");
        add(label);

        // Lắng nghe sự kiện chọn JRadioButton
        maleButton.addActionListener(e -> label.setText("Selected: Male"));
        femaleButton.addActionListener(e -> label.setText("Selected: Female"));
    }

    public static void main(String[] args) {
        Bai25 frame = new Bai25();
        frame.setVisible(true);
    }
}
