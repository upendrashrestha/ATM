package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.SwingConstants;

import states.ATM.ATMContext;

public class messageDialog {

	private JFrame frame;
	static int interval;
	static Timer timer;
	private ATMContext atmContext;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					messageDialog window = new messageDialog();
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
	public messageDialog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 102));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Message");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 81, 574, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Money Pareser is open for deposit.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 209, 574, 61);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		int secs = 5;
		int delay = 1000;
		int period = 1000;
		
		timer = new Timer();
		interval = secs;
		//System.out.println(secs);
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
			//	System.out.println(setInterval());
				setInterval();
				
				if(interval == 0)
				{
					timer.cancel();
					frame.dispose(); //closes the window--cannot be recovered
					atmContext = ATMContext.getInstance();
					double balance = atmContext.checkBalance();

					
					DisplayBalance dispBal = new DisplayBalance();
					dispBal.NewScreen(Double.toString(balance));
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

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				messageDialog message = new messageDialog();
				message.frame.setVisible(true);
			}
		});
	}
}
