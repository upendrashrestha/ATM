package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccoutSelect {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccoutSelect window = new AccoutSelect();
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
	public AccoutSelect() {
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
		
		JLabel lblNewLabel = new JLabel("WELCOME USER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 564, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSelectAccountType = new JLabel("Select Account Type:");
		lblSelectAccountType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSelectAccountType.setBounds(26, 97, 257, 33);
		frame.getContentPane().add(lblSelectAccountType);
		
		JButton btnCurrent = new JButton("Current");
		btnCurrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCurrent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCurrent.setBounds(29, 211, 138, 50);
		frame.getContentPane().add(btnCurrent);
		
		JButton btnSaving = new JButton("Saving");
		btnSaving.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSaving.setBounds(235, 211, 138, 50);
		frame.getContentPane().add(btnSaving);
		
		JButton btnChangePin = new JButton("Change Pin");
		btnChangePin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangePin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnChangePin.setBounds(421, 211, 138, 50);
		frame.getContentPane().add(btnChangePin);
	}

}
