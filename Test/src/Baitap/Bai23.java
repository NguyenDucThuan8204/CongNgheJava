package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai23 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private String currentExpression = "";

    public Bai23() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 400);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Tạo JTextField ở trên cùng để hiển thị kết quả
        textField = new JTextField();
        textField.setEditable(false);
        gbc.gridwidth = 4; // Chiếm toàn bộ chiều rộng
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(textField, gbc);

        // Các nút máy tính (0-9, +, -, *, /, =)
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
        };

        // Thêm các nút vào GridBagLayout
        gbc.gridwidth = 1;
        int gridX = 0;
        int gridY = 1;
        for (int i = 0; i < buttons.length; i++) {
            JButton button = new JButton(buttons[i]);
            gbc.gridx = gridX;
            gbc.gridy = gridY;
            add(button, gbc);

            // Sự kiện khi nhấn nút
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.equals("=")) {
                        try {
                            // Tính toán biểu thức khi nhấn "="
                            currentExpression = calculate(currentExpression);
                            textField.setText(currentExpression);
                        } catch (Exception ex) {
                            textField.setText("Error");
                        }
                    } else {
                        // Cập nhật biểu thức khi nhấn các nút
                        currentExpression += command;
                        textField.setText(currentExpression);
                    }
                }
            });

            // Điều chỉnh vị trí các nút
            gridX++;
            if (gridX > 3) {
                gridX = 0;
                gridY++;
            }
        }
    }

    // Hàm tính toán đơn giản
    private String calculate(String expression) {
        // Ví dụ đơn giản tính toán với các phép toán cơ bản (+, -, *, /)
        double result = 0;
        String[] parts = expression.split("[-+*/]");
        if (parts.length > 1) {
            double num1 = Double.parseDouble(parts[0].trim());
            double num2 = Double.parseDouble(parts[1].trim());
            char operator = expression.charAt(parts[0].length());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if (num2 != 0) {
                        result = num1 / num2; 
                    } else {
                        return "Error";
                    }
                    break;
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Bai23 frame = new Bai23();
        frame.setVisible(true);
    }
}
