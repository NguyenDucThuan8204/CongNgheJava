package Baitap;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Bai34 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai34() {
        setTitle("JSpinner Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);

        // Tạo JSpinner với giá trị từ 1 đến 100
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));

        // JLabel hiển thị giá trị hiện tại
        JLabel valueLabel = new JLabel("Current Value: " + spinner.getValue());

        // Lắng nghe sự kiện thay đổi giá trị của JSpinner
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                valueLabel.setText("Current Value: " + spinner.getValue());
            }
        });

        // Cấu hình giao diện
        setLayout(new FlowLayout());
        add(spinner);
        add(valueLabel);
    }

    public static void main(String[] args) {
        Bai34 frame = new Bai34();
        frame.setVisible(true);
    }
}
