package UPP;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class instruction {

	public JPanel jp3 = new JPanel();

	instruction() {

		jp3.setBounds(00, 00, 700, 600);
		jp3.setLayout(null);
		jp3.setBackground(null);
		jp3.setVisible(true);
		// jp.add(new JLabel(new
		// ImageIcon(getClass().getResource("").getPath()+"2.jpg")));

		JLabel l = new JLabel("Welcome to mcs Petrol Pump");
		l.setBounds(110, 20, 500, 50);
		l.setFont(new Font("Comic Sans MS", 00, 36));
		l.setForeground(new Color(1,87,155));
		l.setVisible(true);
		jp3.add(l);

		JTextField l1 = new JTextField("	      Instructions");
		l1.setBounds(00, 100, 700, 50);
		l1.setEditable(false);
		l1.setFont(new Font("Comic Sans MS", 00, 30));
		l1.setBackground(new Color(1,87,155));
		l1.setForeground(Color.WHITE);
		l1.setVisible(true);
		l1.repaint();
		jp3.add(l1);

		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		JLabel l6 = new JLabel();
		
		l2.setVisible(true);
		l2.setBounds(80, 180, 500, 40);
		l2.setFont(new Font("Comic Sans MS", 00, 20));
		l2.setText("1 --> Press the Proceed button on Main Menu.");
		l2.setForeground(new Color(1,87,155));
		
		l3.setVisible(true);
		l3.setBounds(80, 230, 500, 40);
		l3.setFont(new Font("Comic Sans MS", 00, 20));
		l3.setText("2 --> Select the Payment Method.");
		l3.setForeground(new Color(1,87,155));
		
		l4.setVisible(true);
		l4.setBounds(80, 280, 500, 40);
		l4.setFont(new Font("Comic Sans MS", 00, 20));
		l4.setText("3 --> Enter the quantity of fuel.");
		l4.setForeground(new Color(1,87,155));
		
		l5.setVisible(true);
		l5.setBounds(80, 330, 500, 40);
		l5.setFont(new Font("Comic Sans MS", 00, 20));
		l5.setText("\n4 --> Make Transaction and collect the reciept.");
		l5.setForeground(new Color(1,87,155));
		
		l6.setVisible(true);
		l6.setBounds(80, 380, 500, 40);
		l6.setFont(new Font("Comic Sans MS", 00, 20));
		l6.setText("\n5 --> Now you can start fueling your vehicle.");
		l6.setForeground(new Color(1,87,155));
		
		jp3.add(l2);
		jp3.add(l3);
		jp3.add(l4);
		jp3.add(l5);
		jp3.add(l6);
		
		
		JButton jb=new JButton("Back");
		jb.setFont(new Font("Comic Sans MS",00,20));
		jb.setBounds(100, 500, 100, 40);
		jb.setBackground(new Color(1,87,155));
		jb.setForeground(Color.WHITE);
		jp3.add(jb);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			new controller().bck1();
			}
		});
		jp3.repaint();
	}
}
