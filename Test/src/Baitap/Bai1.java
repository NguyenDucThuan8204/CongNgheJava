package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class Bai1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai1 frame = new Bai1();
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
	public Bai1() {
		setTitle("My First Swing App"); // Đặt tiêu đề
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300); // Đặt kích thước đúng yêu cầu
		setLocationRelativeTo(null); // Căn giữa màn hình

		contentPane = new JPanel(new BorderLayout()); // Dùng BorderLayout
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Tạo JLabel "Hello World" căn giữa
		JLabel lblHello = new JLabel("Hello World", SwingConstants.CENTER);
		contentPane.add(lblHello, BorderLayout.CENTER);
	}

}
