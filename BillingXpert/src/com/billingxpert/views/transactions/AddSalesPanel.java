package com.billingxpert.views.transactions;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFormattedTextField;
//import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTextArea;

public class AddSalesPanel extends JPanel {
	
	private JTextField voucherNumberTextField;

	private static final long serialVersionUID = 2505241L;
	
	Font fontSegoe = new Font("Segoe UI Variable", Font.PLAIN, 20);
	Font fontTempus = new Font("Tempus Sans ITC", Font.BOLD, 20);
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public AddSalesPanel() {
		setLayout(null);
		
		JLabel tagLabel = new JLabel("Add Sales Voucher");
		tagLabel.setForeground(SystemColor.textHighlight);
		tagLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 35));
		tagLabel.setBounds(326, 23, 374, 55);
		add(tagLabel);
		
		JLabel dateLabel = new JLabel("Date :");
		dateLabel.setFont(fontTempus);
		dateLabel.setBounds(34, 135, 75, 35);
		add(dateLabel);
		
		voucherNumberTextField = new JTextField();
		voucherNumberTextField.setFont(fontSegoe);
		voucherNumberTextField.setBounds(769, 133, 186, 35);
		add(voucherNumberTextField);
		voucherNumberTextField.setColumns(10);
		
		JFormattedTextField dateFormattedTextField = new JFormattedTextField();
		dateLabel.setLabelFor(dateFormattedTextField);
		dateFormattedTextField.setFont(fontSegoe);
		dateFormattedTextField.setBounds(119, 133, 167, 35);
		add(dateFormattedTextField);
		
		JLabel voucherNumberLabel = new JLabel("Vch No. :");
		voucherNumberLabel.setLabelFor(dateFormattedTextField);
		voucherNumberLabel.setFont(fontTempus);
		voucherNumberLabel.setBounds(657, 135, 102, 35);
		add(voucherNumberLabel);
		
		JLabel partyLabel = new JLabel("Party  :");
		partyLabel.setFont(fontTempus);
		partyLabel.setBounds(32, 196, 77, 35);
		add(partyLabel);
		
		JFormattedTextField PartyField = new JFormattedTextField();
		PartyField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		PartyField.setBounds(119, 196, 167, 35);
		add(PartyField);
		
		JPanel receiptPanel = new JPanel();
		receiptPanel.setLayout(null);
		receiptPanel.setBounds(-19, 298, 1069, 201);
		add(receiptPanel);
		
		JLabel lblSNo = new JLabel("S No.");
		lblSNo.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblSNo.setBounds(60, 0, 50, 35);
		receiptPanel.add(lblSNo);
		
		JLabel itemLabel = new JLabel("Item");
		itemLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		itemLabel.setBounds(110, 0, 235, 35);
		receiptPanel.add(itemLabel);
		
		JLabel qualityLabel = new JLabel("Quality");
		qualityLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		qualityLabel.setBounds(345, 0, 130, 35);
		receiptPanel.add(qualityLabel);
		
		JLabel unitLabel = new JLabel("Unit");
		unitLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		unitLabel.setBounds(475, 0, 132, 35);
		receiptPanel.add(unitLabel);
		
		JLabel priceLabel = new JLabel("Price(Rs.)");
		priceLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		priceLabel.setBounds(607, 0, 218, 35);
		receiptPanel.add(priceLabel);
		
		JLabel lblSNo_1 = new JLabel("1");
		lblSNo_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblSNo_1.setBounds(60, 37, 50, 35);
		receiptPanel.add(lblSNo_1);
		
		JLabel lblSNo_2 = new JLabel("2");
		lblSNo_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblSNo_2.setBounds(60, 70, 50, 35);
		receiptPanel.add(lblSNo_2);
		
		JLabel lblSNo_3 = new JLabel("3");
		lblSNo_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblSNo_3.setBounds(60, 104, 50, 35);
		receiptPanel.add(lblSNo_3);
		
		JLabel lblSNo_4 = new JLabel("4");
		lblSNo_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblSNo_4.setBounds(60, 137, 50, 35);
		receiptPanel.add(lblSNo_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(110, 34, 235, 35);
		receiptPanel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(110, 68, 235, 35);
		receiptPanel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(110, 102, 235, 35);
		receiptPanel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(110, 135, 235, 35);
		receiptPanel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(345, 34, 130, 35);
		receiptPanel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(345, 68, 130, 35);
		receiptPanel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(345, 102, 130, 35);
		receiptPanel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(345, 135, 130, 35);
		receiptPanel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(475, 35, 132, 35);
		receiptPanel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(475, 68, 132, 35);
		receiptPanel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_14.setColumns(10);
		textField_14.setBounds(475, 102, 132, 35);
		receiptPanel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_15.setColumns(10);
		textField_15.setBounds(475, 135, 132, 35);
		receiptPanel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_16.setColumns(10);
		textField_16.setBounds(607, 34, 219, 35);
		receiptPanel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_17.setColumns(10);
		textField_17.setBounds(607, 67, 219, 35);
		receiptPanel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_18.setColumns(10);
		textField_18.setBounds(607, 101, 219, 35);
		receiptPanel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_19.setColumns(10);
		textField_19.setBounds(607, 134, 219, 35);
		receiptPanel.add(textField_19);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(824, 34, 219, 35);
		receiptPanel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(824, 68, 219, 35);
		receiptPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(824, 102, 219, 35);
		receiptPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(824, 135, 219, 35);
		receiptPanel.add(textField_3);
		
		JLabel lblAmountrs = new JLabel("Amount(Rs.)");
		lblAmountrs.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblAmountrs.setBounds(825, 0, 218, 35);
		receiptPanel.add(lblAmountrs);
		
		
		

	}
}
