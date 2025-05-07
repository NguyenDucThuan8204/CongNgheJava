package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai22 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel lblSelection;

    public Bai22() {
        setTitle("Fruit Selection");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        setLayout(new FlowLayout());

        // Tạo JComboBox với 5 loại trái cây
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        JComboBox<String> comboBox = new JComboBox<>(fruits);
        add(comboBox);

        // JLabel hiển thị lựa chọn của người dùng
        lblSelection = new JLabel("Selected fruit: ");
        add(lblSelection);

        // ActionListener để cập nhật JLabel khi người dùng chọn một loại trái cây
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFruit = (String) comboBox.getSelectedItem();
                lblSelection.setText("Selected fruit: " + selectedFruit);
            }
        });
    }

    public static void main(String[] args) {
        Bai22 frame = new Bai22();
        frame.setVisible(true);
    }
}
