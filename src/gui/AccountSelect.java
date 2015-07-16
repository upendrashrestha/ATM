package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import states.ATM.ATMContext;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AccountSelect {

	private JFrame frame;
	private ATMContext atmContext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountSelect window = new AccountSelect();
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
	public AccountSelect() {
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
		frame.setResizable(false);

		JLabel lblNewLabel = new JLabel("WELCOME USER");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 564, 40);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblSelectAccountType = new JLabel("Select Account Type:");
		lblSelectAccountType.setForeground(new Color(255, 255, 255));
		lblSelectAccountType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSelectAccountType.setBounds(26, 97, 257, 33);
		frame.getContentPane().add(lblSelectAccountType);

		JButton btnCurrent = new JButton("Current");
		btnCurrent.setBackground(new Color(0, 0, 153));
		btnCurrent.setForeground(new Color(255, 255, 255));
		btnCurrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose(); //closes the window--cannot be recovered
				Transcation chkBalance = new Transcation();
				chkBalance.NewScreen();
			}
		});
		btnCurrent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCurrent.setBounds(26, 175, 257, 50);
		frame.getContentPane().add(btnCurrent);

		JButton btnSaving = new JButton("Saving");
		btnSaving.setBackground(new Color(0, 0, 153));
		btnSaving.setForeground(new Color(255, 255, 255));
		btnSaving.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSaving.setBounds(26, 256, 257, 50);
		frame.getContentPane().add(btnSaving);

		JButton btnChangePin = new JButton("Change Pin");
		btnChangePin.setBackground(new Color(0, 0, 153));
		btnChangePin.setForeground(new Color(255, 255, 255));
		btnChangePin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangePin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnChangePin.setBounds(413, 62, 161, 50);
		frame.getContentPane().add(btnChangePin);
	}

	public void NewScreen() {
		// TODO Auto-generated method stub

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				AccountSelect selectAc = new AccountSelect();
				selectAc.frame.setVisible(true);
			}
		});
	}


}
