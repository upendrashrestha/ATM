package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CheckBalance {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBalance window = new CheckBalance();
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
	public CheckBalance() {
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
		
		JLabel lblNewLabel = new JLabel("Check Balance");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 564, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnDrawAmount = new JButton("Draw Amount");
		btnDrawAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDrawAmount.setBounds(33, 136, 202, 50);
		frame.getContentPane().add(btnDrawAmount);
		
		JButton btnUtilityPayment = new JButton("Utility Payment");
		btnUtilityPayment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUtilityPayment.setBounds(355, 136, 202, 50);
		frame.getContentPane().add(btnUtilityPayment);
		
		JButton btnDepositAmount = new JButton("Deposit Amount");
		btnDepositAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDepositAmount.setBounds(33, 228, 202, 50);
		frame.getContentPane().add(btnDepositAmount);
	}

}
