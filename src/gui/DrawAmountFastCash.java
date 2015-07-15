package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

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
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fast Cash");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 564, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnDraw = new JButton("20$");
		btnDraw.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDraw.setBounds(34, 130, 200, 50);
		frame.getContentPane().add(btnDraw);
		
		JButton button = new JButton("40$");
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(342, 130, 200, 50);
		frame.getContentPane().add(button);
		
		JButton btnOthers = new JButton("Other");
		btnOthers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOthers.setBounds(34, 239, 200, 50);
		frame.getContentPane().add(btnOthers);
	}

}
