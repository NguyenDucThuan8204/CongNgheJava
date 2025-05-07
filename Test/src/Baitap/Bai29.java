package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai29 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai29() {
        setTitle("CardLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);

        // Tạo CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel cards = new JPanel(cardLayout);

        // Tạo các JPanel cho từng card
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Page 1"));
        JPanel card2 = new JPanel();
        card2.add(new JButton("Click"));

        // Thêm các card vào JPanel
        cards.add(card1, "Card 1");
        cards.add(card2, "Card 2");

        // Thêm JButton "Switch" để chuyển đổi giữa hai card
        JButton switchButton = new JButton("Switch");
        switchButton.addActionListener(e -> cardLayout.next(cards));

        // Cấu hình giao diện
        setLayout(new BorderLayout());
        add(cards, BorderLayout.CENTER);
        add(switchButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Bai29 frame = new Bai29();
        frame.setVisible(true);
    }
}
