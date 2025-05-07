package Baitap;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Bai26 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai26() {
        setTitle("JSlider Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        setLayout(new BorderLayout());

        // Tạo JSlider
        JSlider slider = new JSlider(0, 255, 0);
        slider.setMajorTickSpacing(51);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        add(slider, BorderLayout.CENTER);

        // Lắng nghe sự kiện thay đổi giá trị của JSlider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                getContentPane().setBackground(new Color(value, value, value)); // Đổi màu nền RGB
            }
        });
    }

    public static void main(String[] args) {
        Bai26 frame = new Bai26();
        frame.setVisible(true);
    }
}
