package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DrawOtherAmount {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawOtherAmount window = new DrawOtherAmount();
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
	public DrawOtherAmount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterAmount = new JLabel("Enter Amount");
		lblEnterAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAmount.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEnterAmount.setBounds(10, 11, 564, 44);
		frame.getContentPane().add(lblEnterAmount);
		
		JLabel lblNewLabel = new JLabel("$");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(67, 112, 46, 38);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(101, 110, 139, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setDocument(new LimitDocument(3));
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(84, 226, 156, 50);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(338, 226, 156, 50);
		frame.getContentPane().add(btnCancel);
	}

}
