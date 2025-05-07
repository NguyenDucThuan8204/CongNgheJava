package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai27 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JProgressBar progressBar;

    public Bai27() {
        setTitle("JProgressBar Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        setLayout(new FlowLayout());

        // Tạo JProgressBar
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        add(progressBar);

        // Tạo JButton Start
        JButton startButton = new JButton("Start");
        add(startButton);

        // Lắng nghe sự kiện nhấn nút Start
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tạo một thread để tăng giá trị của progress bar từ 0 lên 100 trong 5 giây
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i <= 100; i++) {
                            progressBar.setValue(i);
                            try {
                                Thread.sleep(50); // Delay 50ms để hoàn thành trong 5 giây
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });
    }

    public static void main(String[] args) {
        Bai27 frame = new Bai27();
        frame.setVisible(true);
    }
}
