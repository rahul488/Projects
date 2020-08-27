package com.org.FinalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.List;

import javax.swing.JFrame;

public class OutPutScreen extends JFrame{
	TextArea ta;
	public void createOutputScreen() {
		setSize(900,900);
		setLayout(null);
		setTitle("INFORMATION");
		ta=new TextArea();
		ta.setBounds(20, 20, 850, 850);
		ta.setEditable(false);
		ta.setBackground(Color.CYAN);
		ta.setFont(new Font("Serif",Font.BOLD,16));
		add(ta);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		printInformation();
	}
	private void printInformation() {
		for(EventDetails ed:UI.res) {
			String s="";
			s+=ed.getLevel()+" "+ed.getDateTime()+" "+ed.getSource()+" "+ed.getTaskCategory();
			ta.append(s+"\n");
		}
		
	}
}
