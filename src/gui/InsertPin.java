package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import states.ATM.ATMContext;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertPin {

	JFrame frame;
	private JPasswordField passwordField;
	private ATMContext atm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertPin window = new InsertPin();
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
	public InsertPin() {
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
		
		JLabel lblInsertPin = new JLabel("Please Insert Pin");
		lblInsertPin.setForeground(new Color(255, 255, 255));
		lblInsertPin.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertPin.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblInsertPin.setBounds(10, 11, 564, 50);
		frame.getContentPane().add(lblInsertPin);
		
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 153));
		btnNewButton.setOpaque(true);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				atm = ATMContext.getInstance();
				boolean isSuccess = atm.insertPin(passwordField.getText());
				
				if(isSuccess){
					
					frame.dispose(); //closes the window--cannot be recovered
					AccountSelect selectAc = new AccountSelect();
					selectAc.NewScreen();
				}
				else{
					
					frame.dispose(); //closes the window--cannot be recovered
					Main main = new Main();
					main.NewScreen();
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(196, 228, 200, 50);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField(4);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(196, 136, 200, 44);
		passwordField.setDocument(new LimitDocument(4));
		frame.getContentPane().add(passwordField);
	}

	public void NewScreen() {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				InsertPin insertPin=new InsertPin();
				insertPin.frame.setVisible(true);
			}
		});
	}
}
