package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class UtilityPayment {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UtilityPayment window = new UtilityPayment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UtilityPayment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 102));
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Utility Bill Payment");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 564, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bill Amount : $");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(96, 164, 138, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("20");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(229, 168, 46, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setBackground(new Color(0, 0, 153));
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPay.setForeground(new Color(255, 255, 255));
		btnPay.setBounds(76, 257, 200, 50);
		frame.getContentPane().add(btnPay);
		
		JButton btnCancle = new JButton("Cancel");
		btnCancle.setForeground(new Color(255, 255, 255));
		btnCancle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancle.setBackground(new Color(0, 0, 153));
		btnCancle.setBounds(325, 257, 200, 50);
		frame.getContentPane().add(btnCancle);
	}

}
