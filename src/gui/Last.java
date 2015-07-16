package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Last {

	private JFrame frame;
	static int interval;
	static Timer timer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Last window = new Last();
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
	public Last() {
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

		JLabel lblNewLabel = new JLabel("Thank you For Choosing Rango Bank");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 52, 564, 33);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Helping Customers");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 226, 564, 33);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Please take your receipt");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 298, 564, 33);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(
				"C:\\Users\\Dell\\Desktop\\mainlogo.png"));
		lblNewLabel_3.setBounds(10, 111, 564, 89);
		frame.getContentPane().add(lblNewLabel_3);

		int secs = 5;
		int delay = 1000;
		int period = 1000;
		
		timer = new Timer();
		interval = secs;
		System.out.println(secs);
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				System.out.println(setInterval());
				
				if(interval==0)
				{
					frame.dispose(); //closes the window--cannot be recovered
					Main main = new Main();
					main.NewScreen();
				}

			}
		}, delay, period);

	}

	
	private static final int setInterval() {
		if (interval == 1)
			timer.cancel();
		return --interval;
	}

	public void NewScreen() {
		// TODO Auto-generated method stub

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				Last last = new Last();
				last.frame.setVisible(true);
			}
		});
	}
}
