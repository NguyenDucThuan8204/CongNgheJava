package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

public class Bai2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2 frame = new Bai2();
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
	public Bai2() {
		setTitle("Welcome"); // Tiêu đề cửa sổ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300); // Kích thước bất kỳ (chuẩn)
		setLocationRelativeTo(null); // Căn giữa màn hình

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Hiển thị hộp thoại khi mở ứng dụng
		JOptionPane.showMessageDialog(this, "Welcome to Java Swing");

		// Khi bấm OK, chỉ cần để người dùng bấm nút (vì đã set EXIT_ON_CLOSE)
	}
}
