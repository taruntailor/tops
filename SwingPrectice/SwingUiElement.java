package SwingPrectice;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingUiElement {
//	ArrayList<E>
	
	public static void main(String[] args) {
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		JCheckBox chk1,chk2;
		JTextField nameText,emailText;
		JTextArea textArea;
		JButton btn;
		JPasswordField passtext;
		JComboBox comboBox;
		String[]statehai= {"Guj","U.P","M.P","Maharashtra"};
		JRadioButton radiomale,radiofemele;
		ButtonGroup btnGroup;
		
		
		
		JFrame frame= new JFrame("Registration Form");
	frame.setLayout(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   Container c=frame.getContentPane();
  // c.setBackground(Color.magenta);
		//frame.setLocationRelativeTo(null);
		frame.setSize(1000,800);
		l1=new JLabel("Name");
		l1.setBounds(50,50,100,50);
		nameText=new JTextField();
		nameText.setBounds(110,65,130,30);
		
		l2=new JLabel("Email");
		l2.setBounds(50,100,100,50);
		
		emailText=new JTextField();
		emailText.setBounds(110,110,130,30);
		l3=new JLabel("Password");
		l3.setBounds(40,150,60,50);
		passtext=new JPasswordField();
		passtext.setBounds(110,165,130,30);
		
		
		l4=new JLabel("Address");
		l4.setBounds(40,210,60,50);
		textArea=new JTextArea();
		textArea.setBounds(110,210,200,100);
		
		l6=new JLabel("Hobby");
		l6.setBounds(40,350,60,50);
		chk1=new JCheckBox("Circket");
		chk1.setBounds(110, 360, 100, 35);
		chk2=new JCheckBox("Kabaddi");
		chk2.setBounds(220, 360, 100, 35);
		
		l7=new JLabel("State");
		l7.setBounds(40,390,60,50);
		comboBox=new JComboBox<>(statehai);
		comboBox.setBounds(110,397,100,35);
		
		
		l8=new JLabel("Gendre");
		l8.setBounds(40, 450, 60,50);
		radiomale=new JRadioButton("Male");
		radiomale.setBounds(110,459,90,35);
		radiofemele=new JRadioButton("Female");
		radiofemele.setBounds(200,459,100,35);
		btnGroup =new ButtonGroup();
		btnGroup.add(radiomale);
		btnGroup.add(radiofemele);
		
		
		
		
		btn=new JButton("Submit");
		Cursor crCursor=new Cursor(Cursor.HAND_CURSOR);
		btn.setCursor(crCursor);
		//btn.setBounds(110,350,100,30);
		//btn.setVisible(false);
		
		l5=new JLabel("");
		l5.setBounds(110,450,450,150);
		
		
		
	
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
	    c.add(nameText);
		c.add(emailText);
		c.add(passtext);
		c.add(textArea);
		c.add(btn);
		c.add(l5);
		c.add(l6);
		c.add(chk1);
		c.add(chk2);
		c.add(l7);
		c.add(comboBox);
		c.add(l8);
		//c.add(btnGroup);
		c.add(radiofemele);
		c.add(radiomale);
		//c.add(btnGroup);
		
		
		
	btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String name=nameText.getText();
			String email=emailText.getText();
			String pass=passtext.getText();
			String address=textArea.getText();
			String stroreGendre = null;
			String stateSoreString="null";
//			String button=btn.
			
			if (chk1.isSelected()) {
				stroreGendre="Cricket";
			}
			 if(chk2.isSelected()){
				stroreGendre="Kabaddi";
				
			}
			
			 l5.setText("Name :"+name+"       \n"+"Email :"+email+"     \n"+"password"+pass+"     \n"+"Address :"+address+"  \n"+"Hobby:"+stroreGendre);
			
			
			
			
		}
	});
		frame.setVisible(true);
	}
	
	

}
