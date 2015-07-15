package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class UtilityPaymentType {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UtilityPaymentType window = new UtilityPaymentType();
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
	public UtilityPaymentType() {
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
		
		JLabel lblNewLabel = new JLabel("Utility Bill");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 564, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnTelephoneBill = new JButton("Telephone Bill");
		btnTelephoneBill.setBounds(52, 190, 200, 50);
		frame.getContentPane().add(btnTelephoneBill);
		
		JButton btnHouseRent = new JButton("House Rent");
		btnHouseRent.setBounds(335, 190, 200, 50);
		frame.getContentPane().add(btnHouseRent);
	}

}
