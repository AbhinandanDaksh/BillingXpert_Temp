package com.billingxpert.views;

//import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
//import java.awt.image.*;

import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
//import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class LoginPage extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,600);
		setResizable(false);
		setTitle("BillingXpert");
		setLocationRelativeTo(null);
		JLabel welcome=new JLabel("Login");
		welcome.setFont(new Font("Tahoma", Font.BOLD, 45));
		Container container =this.getContentPane();
		container.setLayout(null);
		welcome.setBounds(177,215,133,78);
		container.add(welcome);
		
		
//		
//		JLabel img1=new JLabel();
//		ImageIcon img=new ImageIcon(/BillingXpert/img/BillingXpert.jpg);
//		img1.setIcon(img);
//		add(img1);
		
		
		textField = new JTextField();
		textField.setBounds(208, 327, 236, 32);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("UserID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(76, 327, 96, 32);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Password :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(69, 385, 115, 25);
		getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(208, 386, 236, 32);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(76, 474, 145, 42);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register\r\n");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(268, 474, 145, 42);
		getContentPane().add(btnNewButton_1);
		setVisible(true);
//		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
//	private void initialize() {
//		frame = new JFrame();
//		
//		JLabel lblNewLabel = new JLabel("Login");
////		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
////		lblNewLabel.setBackground(new Color(240, 240, 240));
//		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setBounds(182, 67, 182, 83);
//
//		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
//	}
}
