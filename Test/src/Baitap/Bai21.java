package Baitap;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Bai21 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel lblItemCount;

    public Bai21() {
        setTitle("City List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 400);
        setLayout(new BorderLayout());

        // Tạo danh sách các thành phố
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Phoenix");
        cities.add("Philadelphia");
        cities.add("San Antonio");
        cities.add("San Diego");
        cities.add("Dallas");
        cities.add("San Jose");

        // Tạo JList và đặt nó trong JScrollPane
        JList<String> cityList = new JList<>(cities.toArray(new String[0]));
        JScrollPane scrollPane = new JScrollPane(cityList);
        add(scrollPane, BorderLayout.CENTER);

        // Thêm JLabel hiển thị số lượng mục trong danh sách
        lblItemCount = new JLabel("Number of cities: " + cities.size());
        add(lblItemCount, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Bai21 frame = new Bai21();
        frame.setVisible(true);
    }
}
