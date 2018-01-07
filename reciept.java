package UPP;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class reciept {

	JPanel jp6=new JPanel();
	public boolean abc;
	public BufferedImage anim1;
	
	
	reciept(){
		

		try {
			anim1 = ImageIO.read(new File("C:\\Users\\Sheraz Ahmed\\Downloads\\cash.png"));
		
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e+"Exception caught at Logic");
		}
		
		jp6.setBounds(00, 00, 700,600);
		jp6.setLayout(null);
		jp6.setBackground(null);
		jp6.setVisible(true);
		//jp.add(new JLabel(new ImageIcon(getClass().getResource("").getPath()+"2.jpg")));
		
		JLabel l=new JLabel("MCS Petrol Pump");
		l.setBounds(200,20,500,50);
		l.setForeground(new Color(1,87,155));
		l.setFont(new Font("Comic Sans MS",00,36));
		l.setVisible(true);
		jp6.add(l);
		
		JTextField l1=new JTextField("	  Collect Your Reciept");
		l1.setBounds(0,100,700,50);
		l1.setFont(new Font("Comic Sans MS",00,30));
		l1.setBackground(new Color(1,87,155));
		l1.setForeground(Color.WHITE);
		l1.setEditable(false);
		l1.setVisible(true);
		jp6.add(l1);
		
		model md=new model();	
		
		JPanel p2=new JPanel();
		p2.setBounds(210, 200, 300, 250);
		p2.setBackground(Color.WHITE);
		p2.setForeground(new Color(1,87,155));
		p2.setLayout(null);
		
		JTextField f1=new JTextField("	Reciept");
		f1.setFont(new Font("Comic Sans MS",00,20));
		f1.setBounds(210, 220, 300, 40);
		f1.setEditable(false);
		f1.setForeground(Color.WHITE);
		f1.setBackground(new Color(1,87,155));
		
		controller c=new controller();
		if(c.f.abc==true){md.setfueltype("Petrol");}
		else if (c.f.abc==false){md.setfueltype("Diesel");}
		
		JLabel l2=new JLabel("Fuel Type      : "+md.getfueltype());
		l2.setFont(new Font("Comic Sans MS",00,15));
		l2.setBounds(230, 290,200, 20);
		l2.setForeground(new Color(1,87,155));
		l2.setBackground(Color.white);
		jp6.add(l2);
		
		quantity qt=new quantity();
		//md.setqty(Integer.parseInt(qt.tf1.getText()));
		
		JLabel l3=new JLabel("Quantity       : "+qt.m.getqty());
		l3.setFont(new Font("Comic Sans MS",00,15));
		l3.setBounds(230, 320,200, 20);
		l3.setForeground(new Color(1,87,155));
		l3.setBackground(Color.white);
		jp6.add(l3);
		
		md.setprice();
		JLabel l4=new JLabel("Amount          : "+qt.m.getprice());
		l4.setFont(new Font("Comic Sans MS",00,15));
		l4.setBounds(230, 350,200, 20);
		l4.setForeground(new Color(1,87,155));
		l4.setBackground(Color.white);
		jp6.add(l4);
		
		
		
		JLabel l5=new JLabel("Unit Price      : "+md.fuelunitprice());
		l5.setFont(new Font("Comic Sans MS",00,15));
		l5.setBounds(230, 380,200, 20);
		l5.setForeground(new Color(1,87,155));
		l5.setBackground(Color.white);
		jp6.add(l5);
		
		jp6.add(f1);
		jp6.add(p2);

		
		JButton jb=new JButton("Proceed For Fueling");
		jb.setFont(new Font("Comic Sans MS",00,20));
		jb.setBounds(400, 500, 250, 40);
		jb.setBackground(new Color(1,87,155));
		jb.setForeground(Color.white);
		jp6.add(jb);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new controller().recieptnext();

					
			}
		});
	}	
	public void paint(Graphics g){
		g.drawImage(anim1, 0, 250,200,350,null);
	}
}
