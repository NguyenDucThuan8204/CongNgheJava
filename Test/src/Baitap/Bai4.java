package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Bai4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai4 frame = new Bai4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Bai4() {
		setTitle("Image Viewer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Load ảnh gốc
		ImageIcon originalIcon = new ImageIcon("C:\\Users\\thuan\\Downloads\\tải xuống.jpg\r\n"
				+ ""); // Đổi đường dẫn nếu cần

		// Resize ảnh về 500x400
		Image image = originalIcon.getImage();
		Image resizedImage = image.getScaledInstance(500, 400, Image.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);

		// Đặt vào JLabel
		JLabel lblImage = new JLabel(resizedIcon);
		contentPane.add(lblImage);

		pack(); // Căn kích thước vừa đủ JLabel
		setLocationRelativeTo(null);
	}
}
