package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import states.ATM.ATMContext;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrawOtherAmount {

	private JFrame frame;
	private JTextField textField;
	private ATMContext atmContext;

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
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 50));
		frame.getContentPane().setBackground(new Color(0, 102, 102));
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JLabel lblEnterAmount = new JLabel("Enter Amount");
		lblEnterAmount.setForeground(new Color(255, 255, 255));
		lblEnterAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAmount.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblEnterAmount.setBounds(10, 50, 574, 44);
		frame.getContentPane().add(lblEnterAmount);

		JLabel lblNewLabel = new JLabel("$");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(37, 130, 46, 80);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(82, 142, 415, 71);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setDocument(new LimitDocument(3));

		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double amount = Double.parseDouble(textField.getText());
				atmContext = atmContext.getInstance();
				atmContext.drawAmount(amount);
			}
		});
		btnOk.setBackground(new Color(0, 0, 153));
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOk.setForeground(new Color(255, 255, 255));
		btnOk.setBounds(82, 276, 156, 50);
		frame.getContentPane().add(btnOk);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose(); // closes the window--cannot be recovered
				LastTranscation lastTrascation = new LastTranscation();
				lastTrascation.NewScreen();
			}
		});
		btnCancel.setBackground(new Color(0, 0, 153));
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBounds(341, 276, 156, 50);
		frame.getContentPane().add(btnCancel);
	}

	public void NewScreen() {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				DrawOtherAmount drawOthers = new DrawOtherAmount();
				drawOthers.frame.setVisible(true);
			}
		});
	}

}
