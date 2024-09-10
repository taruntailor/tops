package SwingPrectice;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class UserData {

	JTextField collage;
	JLabel l2, l3, l4, l5, l6, l7, l8, l9, l20, l21;
	JFrame frame;
	JTextField firstname, MiddleInitial, lastname;
	JLabel gender;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	JButton submitButton;

	private String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

	private String months[] = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };

	private String years[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
			"2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
			"2019" };

	public UserData() {
		frame = new JFrame();
		frame.setTitle("College Admissions Form");
		frame.setSize(800, 600);

//		collage = new JLabel();
		collage.setText("College Admissions Form");
		collage.setBounds(300, 10, 200, 30);
		collage=new JTextField();
		collage.setBounds(110,65,130,30);

		l2 = new JLabel();
		l2.setText("----------------------------------------------");
		l2.setBounds(280, 25, 200, 30);

		l3 = new JLabel();
		l3.setText("name");
		l3.setBounds(50, 40, 100, 30);

		firstname = new JTextField();
		firstname.setBounds(50, 80, 200, 30);

		MiddleInitial = new JTextField();
		MiddleInitial.setBounds(300, 80, 200, 30);

		lastname = new JTextField();
		lastname.setBounds(550, 80, 200, 30);

		l4 = new JLabel();
		l4.setText("first name");
		l4.setBounds(50, 100, 100, 30);

		l5 = new JLabel();
		l5.setText("Middle Initial");
		l5.setBounds(300, 100, 100, 30);

		l6 = new JLabel();
		l6.setText("last name");
		l6.setBounds(550, 100, 200, 30);

		l7 = new JLabel();
		l7.setText("Birth Date :");
		l7.setBounds(50, 140, 200, 30);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(200, 20);
		date.setLocation(120, 150);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(200, 20);
		month.setLocation(320, 150);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(200, 20);
		year.setLocation(500, 150);

		l8 = new JLabel();
		l8.setText("date");
		l8.setSize(200, 20);
		l8.setLocation(120, 170);

		l9 = new JLabel();
		l9.setText("month");
		l9.setSize(200, 20);
		l9.setLocation(320, 170);

		l20 = new JLabel();
		l20.setText("year");
		l20.setSize(200, 20);
		l20.setLocation(500, 170);

		l21 = new JLabel();
		l21.setBounds(50, 300, 500, 30);

		submitButton = new JButton("submit");
		submitButton.setBounds(300, 350, 100, 30);

		// add element into frame
		frame.add(collage);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
		frame.add(l9);
		frame.add(l20);
		frame.add(l21);
		frame.add(firstname);
		frame.add(MiddleInitial);
		frame.add(lastname);
		frame.add(date);
		frame.add(year);
		frame.add(month);
		frame.add(submitButton);

//		frame.add(gender);

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
//				String year = year.getBytes();
				
			}

		});

	}

	
}


public class CollageForm {

	public static void main(String[] args) {

		new UserData();

	}

}

