package gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

public class ProcessingWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcessingWindow window = new ProcessingWindow();
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
	public ProcessingWindow() {
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
		
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\Dell\\Desktop\\loading.gif"));
		lblNewLabel.setBounds(10, 11, 574, 350);
		frame.getContentPane().add(lblNewLabel);
	}
	public void NewScreen() {
		// TODO Auto-generated method stub

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				ProcessingWindow processingWindow = new ProcessingWindow();
				processingWindow.frame.setVisible(true);
			}
		});
	}
}
