package com.billingxpert.views.administrator;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UpdateItemPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 36534132L;
	private JTextField nameTextField;
	private JTextField unitTextField;
	private JTextField hsnTextField;

	/**
	 * Create the panel.
	 */
	public UpdateItemPanel() {
		setBackground(SystemColor.info);
		setLayout(null);

		JLabel tagLabel = new JLabel("Update Item");
		tagLabel.setForeground(SystemColor.textHighlight);
		tagLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 35));
		tagLabel.setBounds(151, 10, 240, 55);
		add(tagLabel);

		JLabel nameLabel = new JLabel("Name*");
		nameLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		nameLabel.setBounds(30, 105, 75, 35);
		add(nameLabel);

		nameTextField = new JTextField();
		nameLabel.setLabelFor(nameTextField);
		nameTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		nameTextField.setBounds(220, 105, 270, 35);
		add(nameTextField);
		nameTextField.setColumns(10);

		JLabel unitLabel = new JLabel("Unit");
		unitLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		unitLabel.setBounds(30, 231, 160, 35);
		add(unitLabel);

		unitTextField = new JTextField();
		unitLabel.setLabelFor(unitTextField);
		unitTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		unitTextField.setColumns(10);
		unitTextField.setBounds(220, 229, 160, 35);
		add(unitTextField);

		JLabel hsnLabel = new JLabel("HSN");
		hsnLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		hsnLabel.setBounds(30, 169, 75, 35);
		add(hsnLabel);

		hsnTextField = new JTextField();
		hsnLabel.setLabelFor(hsnTextField);
		hsnTextField.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		hsnTextField.setColumns(10);
		hsnTextField.setBounds(220, 167, 270, 35);
		add(hsnTextField);

		JButton saveButton = new JButton("Save");
		saveButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		saveButton.setBounds(183, 303, 171, 44);
		add(saveButton);

	}
}
