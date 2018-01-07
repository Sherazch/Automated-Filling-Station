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


public class transaction {

	JPanel jp6=new JPanel();
	public boolean abc;
	public BufferedImage anim1,anim2;
	
	
	transaction(){
		

		try {
			anim1 = ImageIO.read(new File("C:\\Users\\Sheraz Ahmed\\Downloads\\cash.png"));
			anim2 = ImageIO.read(new File("C:\\Users\\Sheraz Ahmed\\Downloads\\atm.png"));
		
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
		
		JTextField l1=new JTextField("	Make Your Transaction");
		l1.setBounds(0,100,700,50);
		l1.setFont(new Font("Comic Sans MS",00,30));
		l1.setBackground(new Color(1,87,155));
		l1.setForeground(Color.WHITE);
		l1.setEditable(false);
		l1.setVisible(true);
		jp6.add(l1);
		
		model m1=new model();
		payment ps=new payment();
		if(ps.abc==true){m1.setpaymentmethod("Credit Card");}
		else if (ps.abc==false){m1.setpaymentmethod("Cash");}
		
		
		JLabel l2=new JLabel("Insert Your "+m1.getpaymentmethod());
		System.out.println("ab check kr "+m1.getpaymentmethod());
		l2.setBounds(370,200,500,50);
		l2.setForeground(new Color(1,87,155));
		l2.setFont(new Font("Comic Sans MS",00,25));
		l2.setBackground(null);
		l2.setVisible(true);
		jp6.add(l2);
		
		
		JLabel piclabel=new JLabel(new ImageIcon(anim1));
		piclabel.setBounds(100,220,120,120);
		//piclabel.setBackground(Color.red);
		piclabel.setFont(new Font("Comic Sans MS",00,20));
		piclabel.setVisible(true);
		jp6.add(piclabel);
		
		JLabel piclabel1=new JLabel(new ImageIcon(anim2));
		piclabel1.setBounds(360,260,200,200);
		//piclabel.setBackground(Color.red);
		piclabel1.setFont(new Font("Comic Sans MS",00,20));
		piclabel1.setVisible(true);
		jp6.add(piclabel1);
		
				
		


		
		JButton jb=new JButton("Proceed For Reciept");
		jb.setFont(new Font("Comic Sans MS",00,20));
		jb.setBounds(400, 500, 250, 40);
		jb.setBackground(new Color(1,87,155));
		jb.setForeground(Color.white);
		jp6.add(jb);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new controller().Nextreciept();

					
			}
		});
	}	
	public void paint(Graphics g){
		g.drawImage(anim1, 0, 250,200,350,null);
	}
}
