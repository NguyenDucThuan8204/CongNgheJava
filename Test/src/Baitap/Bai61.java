package Baitap;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Bai61 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblNewLabel; // Khai báo JLabel làm biến thành viên

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai61 frame = new Bai61();
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
    public Bai61() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(100, 50, 250, 150); // Chỉnh lại vị trí và kích thước của JLabel
        contentPane.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Load Image");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mở hộp thoại chọn tệp
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Chọn hình ảnh");
                fileChooser.setAcceptAllFileFilterUsed(false);
                fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif"));

                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    // Tạo SwingWorker để tải hình ảnh từ thư viện
                    new ImageLoaderWorker(selectedFile).execute();
                }
            }
        });
        btnNewButton.setBounds(150, 200, 120, 30); // Chỉnh lại vị trí và kích thước của JButton
        contentPane.add(btnNewButton);
    }

    // SwingWorker để tải hình ảnh từ tệp và hiển thị lên JLabel
    class ImageLoaderWorker extends SwingWorker<ImageIcon, Void> {
        private File imageFile;

        public ImageLoaderWorker(File imageFile) {
            this.imageFile = imageFile;
        }

        @Override
        protected ImageIcon doInBackground() throws Exception {
            try {
                // Đọc hình ảnh từ tệp
                BufferedImage image = ImageIO.read(imageFile);
                return new ImageIcon(image);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void done() {
            try {
                // Lấy kết quả sau khi hình ảnh đã tải xong
                ImageIcon icon = get();
                if (icon != null) {
                    lblNewLabel.setIcon(icon); // Cập nhật hình ảnh lên JLabel
                } else {
                    lblNewLabel.setText("Failed to load image.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
