package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Bai30 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai30() {
        setTitle("JToolBar Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);

        // Tạo JToolBar
        JToolBar toolBar = new JToolBar();
        JButton newButton = new JButton("New");
        JButton saveButton = new JButton("Save");
        JButton openButton = new JButton("Open");

        toolBar.add(newButton);
        toolBar.add(saveButton);
        toolBar.add(openButton);

        // Lắng nghe sự kiện cho các nút
        newButton.addActionListener(this::showMessage);
        saveButton.addActionListener(this::showMessage);
        openButton.addActionListener(this::showMessage);

        // Thêm JToolBar vào JFrame
        add(toolBar, BorderLayout.NORTH);
    }

    // Hàm hiển thị thông báo khi nhấn nút
    private void showMessage(ActionEvent e) {
        String command = e.getActionCommand();
        JOptionPane.showMessageDialog(this, command + " button clicked.");
    }

    public static void main(String[] args) {
        Bai30 frame = new Bai30();
        frame.setVisible(true);
    }
}
