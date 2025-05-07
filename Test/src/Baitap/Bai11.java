package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Bai11 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai11 frame = new Bai11();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Bai11() {
        setTitle("System Info");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200); // Kích thước cửa sổ
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null); // Sử dụng layout null để tùy chỉnh vị trí các component

        // Lấy thông tin hệ điều hành và phiên bản Java
        String osName = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");

        // JLabel hiển thị tên hệ điều hành
        JLabel lblOsName = new JLabel("OS: " + osName);
        lblOsName.setBounds(10, 30, 250, 20); // Vị trí và kích thước của JLabel
        contentPane.add(lblOsName);

        // JLabel hiển thị phiên bản Java
        JLabel lblJavaVersion = new JLabel("Java Version: " + javaVersion);
        lblJavaVersion.setBounds(10, 60, 250, 20); // Vị trí và kích thước của JLabel
        contentPane.add(lblJavaVersion);
    }
}
