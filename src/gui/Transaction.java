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
import java.awt.Color;

public class Transaction {

	private JFrame frame;
	private ATMContext atmContext;
	private DrawAmountFastCash fastCash;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction window = new Transaction();
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
	public Transaction() {
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
		
		JLabel lblNewLabel = new JLabel("Check Balance");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 564, 63);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCheckBalance = new JButton("Check Balance");
		btnCheckBalance.setBackground(new Color(0, 0, 153));
		btnCheckBalance.setForeground(new Color(255, 255, 255));
		btnCheckBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				atmContext = ATMContext.getInstance();
				double balance = atmContext.checkBalance();
				
				frame.dispose(); //closes the window--cannot be recovered
				DisplayBalance dispBal = new DisplayBalance();
				dispBal.NewScreen(Double.toString(balance));
			}
		});
		btnCheckBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCheckBalance.setBounds(355, 136, 202, 50);
		frame.getContentPane().add(btnCheckBalance);
		
		JButton btnDrawAmount = new JButton("Draw Amount");
		btnDrawAmount.setBackground(new Color(0, 0, 153));
		btnDrawAmount.setForeground(new Color(255, 255, 255));
		btnDrawAmount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fastCash = new DrawAmountFastCash();
				fastCash.NewScreen();
			}
		});
		btnDrawAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDrawAmount.setBounds(33, 136, 202, 50);
		frame.getContentPane().add(btnDrawAmount);
		
		JButton btnUtilityPayment = new JButton("Utility Payment");
		btnUtilityPayment.setBackground(new Color(0, 0, 204));
		btnUtilityPayment.setForeground(new Color(255, 255, 255));
		btnUtilityPayment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUtilityPayment.setBounds(355, 228, 202, 50);
		frame.getContentPane().add(btnUtilityPayment);
		
		JButton btnDepositAmount = new JButton("Deposit Amount");
		btnDepositAmount.setBackground(new Color(0, 0, 153));
		btnDepositAmount.setForeground(new Color(255, 255, 255));
		btnDepositAmount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				atmContext = ATMContext.getInstance();
				atmContext.depositAmount();
			}
		});
		btnDepositAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDepositAmount.setBounds(33, 228, 202, 50);
		frame.getContentPane().add(btnDepositAmount);
	}

	public void NewScreen() {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				Transaction chkBalance = new Transaction();
				chkBalance.frame.setVisible(true);
			}
		});
	}
}
