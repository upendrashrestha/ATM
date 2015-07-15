package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import states.ATM.ATMContext;

public class CheckBalance {

	private JFrame frame;
	private ATMContext atmContext;

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
		
		JButton btnCheckBalance = new JButton("Check Balance");
		btnCheckBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				atmContext = ATMContext.getInstance();
				atmContext.checkBalance();
			}
		});
		btnCheckBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCheckBalance.setBounds(355, 136, 202, 50);
		frame.getContentPane().add(btnCheckBalance);
		
		JButton btnDrawAmount = new JButton("Draw Amount");
		btnDrawAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDrawAmount.setBounds(33, 136, 202, 50);
		frame.getContentPane().add(btnDrawAmount);
		
		JButton btnUtilityPayment = new JButton("Utility Payment");
		btnUtilityPayment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUtilityPayment.setBounds(355, 228, 202, 50);
		frame.getContentPane().add(btnUtilityPayment);
		
		JButton btnDepositAmount = new JButton("Deposit Amount");
		btnDepositAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDepositAmount.setBounds(33, 228, 202, 50);
		frame.getContentPane().add(btnDepositAmount);
	}

	public void NewScreen() {
		// TODO Auto-generated method stub

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				CheckBalance chkBalance = new CheckBalance();
				chkBalance.frame.setVisible(true);
			}
		});
	}
}
