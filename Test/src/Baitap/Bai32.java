package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai32 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai32() {
        setTitle("JTextArea Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);

        // Tạo JTextArea trong JScrollPane
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Tạo JButton "Clear" để xóa nội dung
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> textArea.setText("")); // Xóa nội dung khi nhấn "Clear"
        add(clearButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Bai32 frame = new Bai32();
        frame.setVisible(true);
    }
}
