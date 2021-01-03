package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calci {

	private JFrame frame;
	private JTextField display;
	
	double num1;
	double num2;
	double res;
	String op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
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
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setFont(new Font("Verdana", Font.BOLD, 25));
		display.setBackground(Color.WHITE);
		display.setBounds(10, 11, 416, 59);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton one = new JButton("1");
		one.setBackground(Color.WHITE);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"1";
				display.setText(num);
			}
		});
		one.setBounds(10, 88, 89, 23);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.setBackground(Color.WHITE);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"2";
				display.setText(num);
			}
		});
		two.setBounds(115, 88, 89, 23);
		frame.getContentPane().add(two);
		
		JButton three = new JButton("3");
		three.setBackground(Color.WHITE);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"3";
				display.setText(num);
			}
		});
		three.setBounds(228, 88, 89, 23);
		frame.getContentPane().add(three);
		
		JButton four = new JButton("4");
		four.setBackground(Color.WHITE);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"4";
				display.setText(num);
			}
		});
		four.setBounds(10, 127, 89, 23);
		frame.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.setBackground(Color.WHITE);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"5";
				display.setText(num);
			}
		});
		five.setBounds(115, 127, 89, 23);
		frame.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.setBackground(Color.WHITE);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"6";
				display.setText(num);
			}
		});
		six.setBounds(228, 127, 89, 23);
		frame.getContentPane().add(six);
		
		JButton seven = new JButton("7");
		seven.setBackground(Color.WHITE);
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"7";
				display.setText(num);
			}
		});
		seven.setBounds(10, 167, 89, 23);
		frame.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.setBackground(Color.WHITE);
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"8";
				display.setText(num);
			}
		});
		eight.setBounds(115, 167, 89, 23);
		frame.getContentPane().add(eight);
		
		JButton nine = new JButton("9");
		nine.setBackground(Color.WHITE);
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"9";
				display.setText(num);
			}
		});
		nine.setBounds(228, 167, 89, 23);
		frame.getContentPane().add(nine);
		
		JButton dot = new JButton(".");
		dot.setBackground(Color.WHITE);
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+".";
				display.setText(num);
			}
		});
		dot.setBounds(10, 201, 89, 23);
		frame.getContentPane().add(dot);
		
		JButton zero = new JButton("0");
		zero.setBackground(Color.WHITE);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=display.getText()+"0";
				display.setText(num);
			}
		});
		zero.setBounds(115, 201, 89, 23);
		frame.getContentPane().add(zero);
		
		JButton clear = new JButton("C");
		clear.setBackground(Color.WHITE);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
			}
		});
		clear.setBounds(228, 201, 89, 23);
		frame.getContentPane().add(clear);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="+";
			}
		});
		plus.setForeground(Color.BLACK);
		plus.setBackground(new Color(255, 0, 0));
		plus.setBounds(337, 88, 89, 23);
		frame.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="-";
			}
		});
		minus.setBackground(new Color(255, 0, 0));
		minus.setBounds(337, 127, 89, 23);
		frame.getContentPane().add(minus);
		
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="*";
			}
		});
		multiply.setBackground(new Color(255, 0, 0));
		multiply.setBounds(337, 167, 89, 23);
		frame.getContentPane().add(multiply);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="/";
			}
		});
		divide.setBackground(new Color(255, 0, 0));
		divide.setBounds(337, 201, 89, 23);
		frame.getContentPane().add(divide);
		
		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(display.getText());
				if(op.equals("+")) {
					res=num1+num2;
				}
				else if(op.equals("-")) {
					res=num1-num2;
				}
				else if(op.equals("*")) {
					res=num1*num2;
				}
				else if(op.equals("/")) {
					res=num1/num2;
				}
				display.setText(res+"");
			}
		});
		equals.setBackground(new Color(255, 0, 0));
		equals.setBounds(10, 235, 416, 23);
		frame.getContentPane().add(equals);
	}
}
