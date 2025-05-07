package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai31 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai31() {
        setTitle("JSplitPane Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);

        // Tạo JSplitPane
        JList<String> list = new JList<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"});
        JTextArea textArea = new JTextArea();

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(list), new JScrollPane(textArea));
        splitPane.setDividerLocation(200); // Vị trí chia mặc định

        // Thêm JSplitPane vào JFrame
        add(splitPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Bai31 frame = new Bai31();
        frame.setVisible(true);
    }
}
