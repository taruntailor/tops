package SwingPrectice;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

class RegistrationForm {
	JFrame jFrame;
	JFrame frame;
	JPanel northPanel, westPanel;
	JPanel formPanel, buttonPanel, buttonGridPanel, buttonResetPanel, genderPanel;
	JLabel lblTitle;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;
	JButton exitButton, registerButton, deleteButton, updateButton, resetButton;
	JRadioButton radioMale, radioFemale;
	ButtonGroup genderGroup;
	public RegistrationForm() {
		
		JLabel lblTitle = new JLabel("REGISTRATION FORM");
		
		
		l1 = new JLabel("ID");
		l2 = new JLabel("NAME");
		l3 = new JLabel("GENDER");
		l4 = new JLabel("ADDRESS");
		l5 = new JLabel("CONTACT");

		t1 = new JTextField(15);
		t1.setEnabled(false);
		t2 = new JTextField(15);
		t3 = new JTextField(15);
		t4 = new JTextField(15);
		t5 = new JTextField(15);

		exitButton = new JButton("Exit");
		registerButton = new JButton("Register");
		deleteButton = new JButton("Delete");
		deleteButton.setEnabled(false);
		updateButton = new JButton("Update");
		updateButton.setEnabled(false);
		resetButton = new JButton("Reset");
		resetButton.setPreferredSize(new Dimension(120, 25));

		frame = new JFrame();
		frame.setTitle("Java Swing Practical");
		frame.setSize(900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		northPanel = new JPanel(new FlowLayout());
		northPanel.add(lblTitle);

		westPanel = new JPanel(new BorderLayout());
		westPanel.setPreferredSize(new Dimension(350, 0));
		westPanel.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(), "Registration Details",
				TitledBorder.CENTER, TitledBorder.TOP));
		// westPanel.setBackground(Color.ORANGE);

		genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		radioMale = new JRadioButton("Male", true);
		radioFemale = new JRadioButton("Female");
		genderGroup = new ButtonGroup();
		genderGroup.add(radioMale);
		genderGroup.add(radioFemale);

		genderPanel.add(radioMale);
		genderPanel.add(radioFemale);

		formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
		formPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

		formPanel.add(l1);
		formPanel.add(t1);
		formPanel.add(l2);
		formPanel.add(t2);
		formPanel.add(l3);
		formPanel.add(genderPanel);
		formPanel.add(l4);
		formPanel.add(t4);
		formPanel.add(l5);
		formPanel.add(t5);

		buttonPanel = new JPanel(new BorderLayout());
		buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		buttonGridPanel = new JPanel(new GridLayout(2, 2, 10, 10));
		buttonGridPanel.add(exitButton);
		buttonGridPanel.add(registerButton);
		buttonGridPanel.add(deleteButton);
		buttonGridPanel.add(updateButton);

		buttonResetPanel = new JPanel(new FlowLayout());
		buttonResetPanel.add(resetButton);

		buttonPanel.add(buttonGridPanel, BorderLayout.NORTH);
		buttonPanel.add(buttonResetPanel, BorderLayout.CENTER);

		westPanel.add(formPanel, BorderLayout.NORTH);
		westPanel.add(buttonPanel, BorderLayout.SOUTH);

		// add other panels to main frame layout
		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(westPanel, BorderLayout.WEST);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		registerButton.addActionListener((ActionListener) new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String name = t2.getText();
				String address = t4.getText();
				String contact = t5.getText();
				String gender = radioMale.isSelected() ? "Male" : "Female";

//				System.out.println("Name : " + name);
//				System.out.println("Gender : " + gender);
//				System.out.println("Contact : " + contact);
//				System.out.println("Address : " + address);
			}
		});

	}
	
	
	
}

public class form {

	public static void main(String[] args) {
		
		new RegistrationForm();;
	}
}
