package com.java.myapp;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.Container.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class GuiComponents extends JFrame{
	private JPanel JP;
	//private JPanel JP1;
	private JTextField JF;
	private JButton JBT;
	private JTextArea JA;
	private JScrollPane JSP;
	private JList JL;
	private JComboBox JC;
	private JRadioButton JR1,JR2,JR3;
	private JCheckBox JCB1,JCB2;
	//private JButtonGroup JBG;

	public GuiComponents(){
		JP= new JPanel(new FlowLayout());
		JPanel jPanel = new JPanel(new FlowLayout());
		//JP1= new JPanel(new FlowLayout());
		JF = new JTextField("TextField");
		JBT= new JButton("Button");
		JA = new JTextArea("Text Area");
		JSP = new JScrollPane();
		JL = new JList();
		JR1= new JRadioButton("often");
		JR2= new JRadioButton("Somtime");
		JR3= new JRadioButton("Never");
		JCB1=new JCheckBox("Lable");
		JCB1=new JCheckBox();
		//JBG =new JButtonGroup();
		ButtonGroup g = new ButtonGroup();

		String[] Co = {"YES","NO"};
		String[] Lis ={"1","2","3","4","5","6","7","8","9","10"};

		JC  = new JComboBox(Co);
		JL  = new JList(Lis);
		JSP = new JScrollPane(JL);
		
		g.add(JR1);
		g.add(JR2);
		g.add(JR3);
        ButtonGroup b=g;
		JP.add(JBT);
		JP.add(JCB1);
		JP.add(JCB2);
		JP.add(JF);
		JP.add(JA);

		jPanel.add(JSP);
		jPanel.add(JC);
		jPanel.add(b);

		Container c = getContentPane();

		c.setLayout(new BorderLayout());
	    c.add(b,BorderLayout.NORTH);
	    c.add(jPanel,BorderLayout.CENTER);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}


	public static void main(String[] args){
		 GuiComponents c = new GuiComponents();
	}	
}