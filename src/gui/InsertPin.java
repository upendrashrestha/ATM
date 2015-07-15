package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class InsertPin {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertPin window = new InsertPin();
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
	public InsertPin() {
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
		
		JLabel lblInsertPin = new JLabel("Please Insert Pin");
		lblInsertPin.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertPin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblInsertPin.setBounds(10, 11, 564, 50);
		frame.getContentPane().add(lblInsertPin);
		
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(196, 228, 200, 50);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField(4);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(196, 136, 200, 44);
		passwordField.setDocument(new LimitDocument(4));
		frame.getContentPane().add(passwordField);
	}
}
