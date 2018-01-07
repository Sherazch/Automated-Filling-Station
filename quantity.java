package UPP;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class quantity {
	
	model m = new model();
	JPanel jp5=new JPanel();
	JTextField tf3=new JTextField();
	JTextField tf1=new JTextField();
	
	quantity(){
		jp5.setBounds(00, 00, 700,600);
		jp5.setLayout(null);
		jp5.setBackground(null);
		jp5.setVisible(true);
		//jp.add(new JLabel(new ImageIcon(getClass().getResource("").getPath()+"2.jpg")));
		
		JLabel l=new JLabel("MCS Petrol Pump");
		l.setBounds(200,20,500,50);
		l.setFont(new Font("Comic Sans MS",00,36));
		l.setForeground(new Color(1,87,155));
		l.setVisible(true);
		jp5.add(l);
		
		JTextField l1=new JTextField("	Enter Quantity of Fuel");
		l1.setBounds(0,100,700,50);
		l1.setFont(new Font("Comic Sans MS",00,30));
		l1.setBackground(new Color(1,87,155));
		l1.setForeground(Color.white);
		l1.setEditable(false);
		l1.setVisible(true);
		jp5.add(l1);
		
		
		JTextField tf2=new JTextField();
		
		//Thread trd=new Thread();
		
		tf1.setBounds(250,250,150,50);
		
		JLabel l3=new JLabel("Quantity    : ");
		l3.setBounds(100,250,150,40);
		l3.setForeground(new Color(1,87,155));
		l3.setFont(new Font("Comic Sans MS",00,20));
		l3.setVisible(true);
		jp5.add(l3);
		
		JLabel l4=new JLabel("  Ltr");
		l4.setBounds(410,250,150,40);
		l4.setForeground(new Color(1,87,155));
		l4.setFont(new Font("Comic Sans MS",00,20));
		l4.setVisible(true);
		jp5.add(l4);
		
		tf2.setBounds(250,300,150,50);
		
		JLabel l5=new JLabel("Amount      : ");
		l5.setBounds(100,300,150,40);
		l5.setForeground(new Color(1,87,155));
		l5.setFont(new Font("Comic Sans MS",00,20));
		l5.setVisible(true);
		jp5.add(l5);
		
		JLabel l6=new JLabel("  Rs");
		l6.setBounds(410,300,150,40);
		l6.setForeground(new Color(1,87,155));
		l6.setFont(new Font("Comic Sans MS",00,20));
		l6.setVisible(true);
		jp5.add(l6);
		
		tf3.setBounds(250,350,150,50);
		
		JLabel l7=new JLabel("Unit Price  : ");
		l7.setBounds(100,350,150,40);
		l7.setForeground(new Color(1,87,155));
		l7.setFont(new Font("Comic Sans MS",00,20));
		l7.setVisible(true);
		jp5.add(l7);
		
		JLabel l8=new JLabel("  Rs/Ltr");
		l8.setBounds(410,350,150,40);
		l8.setForeground(new Color(1,87,155));
		l8.setFont(new Font("Comic Sans MS",00,20));
		l8.setVisible(true);
		jp5.add(l8);
		
		tf3.setText(String.valueOf(new model().fuelunitprice()));
		
		tf1.setFont(new Font("Comic Sans MS",00,20));
		tf2.setFont(new Font("Comic Sans MS",00,20));
		tf3.setFont(new Font("Comic Sans MS",00,20));
		
		tf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				m.setqty(Integer.parseInt(tf1.getText()));
			//	System.out.println(m.qunt);
				//System.out.println(m.getprice());
				//new model().getqty();
				//System.out.println(Integer.parseInt(tf1.getText()));
				//System.out.println(new model().getqty());
				//new model().setprice();
				//System.out.println(new model().getprice());
				tf2.setText(String.valueOf(m.getprice()));
				
				
	}
});
		//trd.run();
		
		tf1.setVisible(true);
		tf2.setVisible(true);
		tf3.setVisible(true);
		
		tf2.setEditable(false);
		tf3.setEditable(false);
		
		tf1.setBackground(Color.white);
		tf2.setBackground(Color.white);
		tf3.setBackground(Color.white);
		
		tf1.setForeground(new Color(1,87,155));
		tf2.setForeground(new Color(1,87,155));
		tf3.setForeground(new Color(1,87,155));
		
		
		
		
		jp5.add(tf1);
		jp5.add(tf2);
		jp5.add(tf3);
		
		JButton jb=new JButton("Proceed for Transaction");
		jb.setFont(new Font("Comic Sans MS",00,20));
		jb.setBounds(380, 500, 270, 40);
		jb.setBackground(new Color(1,87,155));
		jb.setForeground(Color.white);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new controller().Next4();

					
			}
		});


		JButton jb1=new JButton("Back");
		jb1.setFont(new Font("Comic Sans MS",00,20));
		jb1.setBounds(50, 500, 100, 40);
		jb1.setBackground(new Color(1,87,155));
		jb1.setForeground(Color.white);
		jp5.add(jb1);
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new controller().back3();
				
			}
		});
		
	
		jp5.add(jb);
		

		
		
	}

}
