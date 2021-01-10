package edu.htu.programming.week14.session1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtResult;
	private double number1;
	private double number2;
	private char operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCalculator frame = new FrmCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmCalculator() {
		setTitle("HTU Programming Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtResult = new JTextField();
		txtResult.setBounds(10, 11, 299, 40);
		contentPane.add(txtResult);
		txtResult.setColumns(10);

		JButton btnNewButton = new JButton("8");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText() + "8");
			}
		});
		btnNewButton.setBounds(90, 62, 67, 51);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText() + "7");
			}
		});
		btnNewButton_1.setBounds(10, 62, 67, 51);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText() + "9");
			}
		});
		btnNewButton_2.setBounds(167, 62, 67, 51);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText() + "4");
			}
		});
		btnNewButton_3.setBounds(10, 124, 67, 51);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText() + "5");
			}
		});
		btnNewButton_4.setBounds(90, 124, 67, 51);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText() + "6");
			}
		});
		btnNewButton_5.setBounds(167, 124, 67, 51);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText() + "1");
			}
		});
		btnNewButton_6.setBounds(10, 182, 67, 51);
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText() + "2");
			}
		});
		btnNewButton_7.setBounds(90, 186, 67, 51);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText() + "3");
			}
		});
		btnNewButton_8.setBounds(167, 182, 67, 51);
		contentPane.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(txtResult.getText());
				txtResult.setText("");
				operation = '+';
			}
		});
		btnNewButton_9.setBounds(244, 62, 67, 51);
		contentPane.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("-");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(txtResult.getText());
				txtResult.setText("");
				operation = '-';
			}
		});
		btnNewButton_10.setBounds(244, 124, 67, 51);
		contentPane.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(txtResult.getText());
				txtResult.setText("");
				operation = '*';
			}
		});
		btnNewButton_11.setBounds(244, 182, 67, 51);
		contentPane.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("C");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("");
				number1=0;
			}
		});
		btnNewButton_12.setBounds(10, 244, 67, 51);
		contentPane.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleEqual();
			}
		});
		btnNewButton_13.setBounds(90, 244, 67, 51);
		contentPane.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("0");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText() + "0");
			}
		});
		btnNewButton_14.setBounds(167, 244, 67, 51);
		contentPane.add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(txtResult.getText());
				txtResult.setText("");
				operation = '/';
			}
		});
		btnNewButton_15.setBounds(244, 244, 67, 51);
		contentPane.add(btnNewButton_15);
		setLocationRelativeTo(null);
	}

	private void handleEqual() {
		double number2 = Double.parseDouble(txtResult.getText());
		double result = 0;
		switch (operation) {
		case '+':
			result = number1 + number2;
			break;
		case '-':
			result = number1 - number2;
			break;
		case '*':
			result = number1 * number2;
			break;
		case '/':
			result = number1 / number2;
			break;
		}
		txtResult.setText(result+"");
	}

}
