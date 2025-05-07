package Baitap;

import javax.swing.*;
import java.awt.*;

public class Bai20 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai20() {
        setTitle("Tabbed Pane Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);

        // Tạo JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Thêm tab "Home"
        JPanel homePanel = new JPanel();
        homePanel.add(new JLabel("Welcome to the Home tab!"));
        tabbedPane.addTab("Home", homePanel);

        // Thêm tab "Profile"
        JPanel profilePanel = new JPanel();
        profilePanel.add(new JLabel("This is your Profile tab."));
        tabbedPane.addTab("Profile", profilePanel);

        // Thêm tab "Settings"
        JPanel settingsPanel = new JPanel();
        settingsPanel.add(new JLabel("Settings can be configured here."));
        tabbedPane.addTab("Settings", settingsPanel);

        // Thêm JTabbedPane vào JFrame
        add(tabbedPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Bai20 frame = new Bai20();
        frame.setVisible(true);
    }
}
