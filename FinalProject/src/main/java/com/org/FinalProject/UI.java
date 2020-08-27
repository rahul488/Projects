package com.org.FinalProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UI extends JFrame implements ActionListener{
	JLabel l;
	JTextField tf;
	JButton b1;
	static List<EventDetails> res;
	JTextArea ta;
	public void createUI() {
		
		setSize(450,450);
		setLayout(null);
		setTitle("ID-INFORMATION");
		
		Container c=getContentPane();
		c.setBackground(Color.WHITE);
		JPanel p=new JPanel();
		
		p.setBounds(40,20,350,370);
		p.setBackground(Color.black);
		l=new JLabel();
		l.setBounds(90, 100, 200, 50);
		l.setText("Enter Event ID");
		l.setFont(new Font("Serif",Font.BOLD,27));
		l.setForeground(Color.blue);
		
		tf=new JTextField();
		tf.setBounds(60,150,230,35);
		tf.setBackground(Color.DARK_GRAY);
		tf.setFont(new Font("Serif",Font.BOLD,27));
		tf.setForeground(Color.RED);
		
		b1=new JButton("Find");
		b1.setBounds(130,200,70,30);
		b1.setBackground(Color.DARK_GRAY);
		b1.setFont(new Font("Serif",Font.BOLD,16));
		b1.setForeground(Color.green);
		
		b1.addActionListener(this);
		tf.addActionListener(this);
		
		p.add(l);
		p.add(tf);
		p.add(b1);
		p.setLayout(null);
		
		add(p);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase("find")) {
			String s=tf.getText();
			
			Main m=new Main();
			
			 res=m.getDetails(Integer.valueOf(s));
			if(res.isEmpty()) {
				tf.setText("Data is not found");
			}
			else
			{
				OutPutScreen Op=new OutPutScreen();
				Op.createOutputScreen();
			}
		}
		
	}
	
}
