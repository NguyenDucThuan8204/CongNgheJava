package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai28 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai28() {
        setTitle("JTable Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);

        // Dữ liệu bảng (Tên, Tuổi, Điểm)
        Object[][] data = {
            {"Nguyễn Văn A", 20, 8.5},
            {"Trần Thị B", 22, 7.0},
            {"Phạm Minh C", 21, 6.5},
            {"Lê Thanh D", 23, 9.0},
            {"Đặng Hoàng E", 20, 8.0}
        };

        // Tên cột
        String[] columnNames = {"Tên", "Tuổi", "Điểm"};

        // Tạo JTable
        JTable table = new JTable(data, columnNames);

        // Đưa JTable vào JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Bai28 frame = new Bai28();
        frame.setVisible(true);
    }
}
