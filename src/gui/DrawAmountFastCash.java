package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class DrawAmountFastCash {

	private JFrame frame;

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
		
		JLabel lblNewLabel = new JLabel("Fast Cash");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 564, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnDraw = new JButton("20$");
		btnDraw.setBackground(new Color(0, 0, 153));
		btnDraw.setForeground(new Color(255, 255, 255));
		btnDraw.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDraw.setBounds(34, 130, 200, 50);
		frame.getContentPane().add(btnDraw);
		
		JButton button = new JButton("40$");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 153));
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(342, 130, 200, 50);
		frame.getContentPane().add(button);
		
		JButton btnOthers = new JButton("Other");
		btnOthers.setBackground(new Color(0, 0, 153));
		btnOthers.setForeground(new Color(255, 255, 255));
		btnOthers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOthers.setBounds(34, 239, 200, 50);
		frame.getContentPane().add(btnOthers);
	}

}
