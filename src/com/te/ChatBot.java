package com.te;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class FinalChatBox extends JFrame {

	private JTextArea ca = new JTextArea();
	private JTextField cf = new JTextField();
	private JButton b = new JButton();
	private JLabel l = new JLabel();

	public FinalChatBox() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(350, 700);
		f.getContentPane().setBackground(Color.lightGray);
		f.setTitle("ChatBot");
		f.add(ca);
		f.add(cf);
		ca.setSize(350, 630);
		ca.setLocation(1, 1);
		ca.setBackground(Color.CYAN);
		ca.setText("Welcome To TestYantra Say hi To Start\n");
		cf.setSize(245, 30);
		cf.setLocation(1, 633);
		l.setText("SEND");
		f.add(b);
		b.add(l);
		b.setSize(79, 24);
		b.setLocation(252, 637);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == b) {
					String str = cf.getText().toLowerCase();
					ca.append("You---> " + str + "\n");
					cf.setText("");
					if (str.contains("hi")) {
						reply("Hi there");
						ca.append("Select \n1.About Company\n2.Number Of Employees\n3.Location\n4.CEO\n");
					} else if (str.chars().allMatch(Character::isDigit)) {
						switch (str) {
						case "1":
							ca.append(s + "Test Yantra Software Solutions is one of the largest "
									+ "\nTesting Services & Training organizations with its presence "
									+ "\nacross the globe managing QA Services, Crowd Testing"
									+ "\n Services, & Professional Services" + "\n");
							break;
						case "2":
							ca.append(
									s + "Test Yantra Software Solutions employs 1,001 to \n\t5,000 employees in India."
											+ "\n");
							break;
						case "3":
							ca.append(s
									+ " 1] 50, 2nd Floor, Brigade MLR Center, Vanivilas Rd,\n\tGandhi Bazaar, Basavanagudi, Bengaluru,\n\tKarnataka 560004, India Bengaluru"
									+ "\n");
							break;
						case "4":
							ca.append(s + "\tGirish Ramanna\n"
									+ " Founder and CEO, Test Yantra Software Solutions\n Entrepreneur with a vision of making a difference to society \n through improving employability of huge number of graduates, \n engineers and other professionals in the IT space, specifically \n in the field of software testing and related areas. "
									+ "\n");
							break;
						default:
							ca.append(s + "You selected Wrong Input Say hi to Start" + "\n");
							break;
						}

					}

					else {
						reply("I cant Understand Say hi to Start");
					}
				}
			}
		});
	}

	static String s = "ChatBot---> ";

	public void reply(String st) {
		ca.append(s + st + "\n");

	}
}

public class ChatBot {

	public static void main(String[] args) {
		FinalChatBox b = new FinalChatBox();
	}

}
