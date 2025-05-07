package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai35 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai35() {
        setTitle("Multiple Layout Managers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);

        // Sử dụng BorderLayout cho JFrame
        setLayout(new BorderLayout());

        // Vùng Center là JPanel với GridLayout 3x3
        JPanel gridPanel = new JPanel(new GridLayout(3, 3));
        for (int i = 1; i <= 9; i++) {
            gridPanel.add(new JButton("Button " + i));
        }
        add(gridPanel, BorderLayout.CENTER);

        // Vùng South chứa JButton "Reset"
        JButton resetButton = new JButton("Reset");
        add(resetButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Bai35 frame = new Bai35();
        frame.setVisible(true);
    }
}
