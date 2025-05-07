package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai62 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel model;
    private int idCounter = 1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai62 frame = new Bai62();
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
    public Bai62() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Tạo DefaultTableModel với 3 cột
        model = new DefaultTableModel(new Object[][] {},
                new String[] { "ID", "Name", "Time" });

        // Tạo JTable và gán model
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 50, 400, 200);
        contentPane.add(scrollPane);
        
        // Sử dụng Timer để cập nhật bảng mỗi 2 giây
        Timer timer = new Timer(2000, e -> updateTable());
        timer.start();
    }

    /**
     * Phương thức cập nhật bảng mỗi 2 giây.
     */
    private void updateTable() {
        // Lấy thời gian hiện tại
        String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
        
        // Thêm bản ghi mới vào bảng
        model.addRow(new Object[] { idCounter++, "Name " + idCounter, currentTime });
    }
}
