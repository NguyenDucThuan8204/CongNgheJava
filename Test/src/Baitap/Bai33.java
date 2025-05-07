package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai33 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai33() {
        setTitle("GridBagLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);

        // Tạo GridBagLayout và GridBagConstraints
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // JLabel "Name"
        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        // JTextField cho tên
        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameField, gbc);

        // JLabel "Age"
        JLabel ageLabel = new JLabel("Age:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(ageLabel, gbc);

        // JSpinner cho tuổi
        JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 1, 100, 1));
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(ageSpinner, gbc);

        // JButton "Submit"
        JButton submitButton = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(submitButton, gbc);
    }

    public static void main(String[] args) {
        Bai33 frame = new Bai33();
        frame.setVisible(true);
    }
}
