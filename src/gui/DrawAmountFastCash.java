package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import states.ATM.ATMContext;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrawAmountFastCash {

	private JFrame frame;
	private ATMContext atmContext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawAmountFastCash window = new DrawAmountFastCash();
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
	public DrawAmountFastCash() {
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

		JLabel lblNewLabel = new JLabel("Draw Cash");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 60, 564, 43);
		frame.getContentPane().add(lblNewLabel);

		JButton btnDraw = new JButton("$20");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double amount=20;
				atmContext=atmContext.getInstance();
				atmContext.drawAmount(amount);

				double balance = atmContext.checkBalance();

				frame.dispose(); //closes the window--cannot be recovered
				DisplayBalance dispBal = new DisplayBalance();
				dispBal.NewScreen(Double.toString(balance));

			}
		});
		btnDraw.setBackground(new Color(0, 0, 153));
		btnDraw.setForeground(new Color(255, 255, 255));
		btnDraw.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDraw.setBounds(49, 166, 200, 50);
		frame.getContentPane().add(btnDraw);

		JButton button = new JButton("$40");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double amount=40;
				atmContext=atmContext.getInstance();
				atmContext.drawAmount(amount);

				double balance = atmContext.checkBalance();

				frame.dispose(); //closes the window--cannot be recovered
				DisplayBalance dispBal = new DisplayBalance();
				dispBal.NewScreen(Double.toString(balance));

			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 153));
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(49, 254, 200, 50);
		frame.getContentPane().add(button);

		JButton btnOthers = new JButton("Other");
		btnOthers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				frame.dispose(); //closes the window--cannot be recovered
				DrawOtherAmount drawOthers = new DrawOtherAmount();
				drawOthers.NewScreen();
			}
		});
		btnOthers.setBackground(new Color(0, 0, 153));
		btnOthers.setForeground(new Color(255, 255, 255));
		btnOthers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOthers.setBounds(356, 166, 200, 50);
		frame.getContentPane().add(btnOthers);
	}

	public void NewScreen() {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				DrawAmountFastCash drawAmountFastCash = new DrawAmountFastCash();
				drawAmountFastCash.frame.setVisible(true);
			}
		});
	}

}
