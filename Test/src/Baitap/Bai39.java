package Baitap;

import javax.swing.*;
import java.awt.event.*;

public class Bai39 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai39() {
        setTitle("Key Listener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);

        // JTextField để người dùng nhập văn bản
        JTextField textField = new JTextField();
        add(textField, "North");

        // JLabel hiển thị ký tự đã gõ
        JLabel label = new JLabel("You typed: ");
        add(label, "Center");

        // KeyListener để theo dõi các phím gõ
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                label.setText("You typed: " + keyChar);
            }
        });
    }

    public static void main(String[] args) {
        Bai39 frame = new Bai39();
        frame.setVisible(true);
    }
}
