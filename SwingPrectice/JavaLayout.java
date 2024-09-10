package SwingPrectice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class JavaLayout {
	public static void main(String[] args) {

		JButton b1, b2, b3, b4, b5;

		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		// frame.setLayout(new BorderLayout());

		frame.setLayout(new FlowLayout(FlowLayout.TRAILING, 20, 20));
		
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Button 4");
		b5 = new JButton("Button 5");

		// Border Layout
		// frame.add(b1, BorderLayout.NORTH);
		// frame.add(b2, BorderLayout.WEST);
		// frame.add(b3, BorderLayout.SOUTH);
		// frame.add(b4, BorderLayout.EAST);
		// frame.add(b5, BorderLayout.CENTER);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
