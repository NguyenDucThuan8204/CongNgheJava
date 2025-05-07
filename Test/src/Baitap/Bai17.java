package Baitap;

import javax.swing.*;
import java.awt.FlowLayout;

public class Bai17 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai17() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        setTitle("Login Form");
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20)); // Căn giữa các thành phần

        // Thêm các thành phần vào form
        JLabel lblUsername = new JLabel("Username:");
        add(lblUsername);

        JTextField txtUsername = new JTextField(20);
        add(txtUsername);

        JLabel lblPassword = new JLabel("Password:");
        add(lblPassword);

        JPasswordField txtPassword = new JPasswordField(20);
        add(txtPassword);

        JButton btnLogin = new JButton("Login");
        add(btnLogin);
    }

    public static void main(String[] args) {
        Bai17 frame = new Bai17();
        frame.setVisible(true);
    }
}
