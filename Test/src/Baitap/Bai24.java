package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Bai24 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai24() {
        setTitle("JCheckBox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        setLayout(new FlowLayout());

        // Tạo JCheckBox
        JCheckBox checkBox = new JCheckBox("Enable Background");
        add(checkBox);

        // Lắng nghe sự kiện chọn hay bỏ chọn
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkBox.isSelected()) {
                    getContentPane().setBackground(Color.GREEN); // Màu nền xanh khi chọn
                } else {
                    getContentPane().setBackground(null); // Màu nền mặc định khi bỏ chọn
                }
            }
        });
    }

    public static void main(String[] args) {
        Bai24 frame = new Bai24();
        frame.setVisible(true);
    }
}
