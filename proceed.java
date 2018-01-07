package UPP;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class proceed  {
	public Icon img;
	public BufferedImage anim1;
	public JPanel jp2=new JPanel();
	proceed(){
		

		try {
			anim1 = ImageIO.read(new File("C:\\Users\\Sheraz Ahmed\\Downloads\\123.png"));
		
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e+"Exception caught at Logic");
		}
		//img=new ImageIcon("C:\\Users\\Sheraz Ahmed\\Downloads\\123.JPG");
		jp2.setBounds(00, 00, 700,600);
		jp2.setLayout(null);
		jp2.setBackground(null);
		jp2.setVisible(true);
		//jp.add(new JLabel(new ImageIcon(getClass().getResource("").getPath()+"2.jpg")));
		
		JLabel l=new JLabel("Welcome to mcs Petrol Pump");
		l.setBounds(110,20,500,50);
		l.setFont(new Font("Comic Sans MS",00,36));
		l.setForeground(new Color(1,87,155));
		l.setVisible(true);
		jp2.add(l);
		
		JTextField l1=new JTextField("	        Main Menu");
		l1.setBounds(0,100,700,50);
		l1.setFont(new Font("Comic Sans MS",00,30));
		l1.setBackground(new Color(1,87,155));
		l1.setForeground(Color.white);
		l1.setEditable(false);
		l1.setVisible(true);
		jp2.add(l1);
		
		JLabel piclabel=new JLabel(new ImageIcon(anim1));
		piclabel.setBounds(100,160,260,400);
		//piclabel.setBackground(Color.red);
		piclabel.setFont(new Font("Comic Sans MS",00,20));
		piclabel.setVisible(true);
		jp2.add(piclabel);
		
		JButton jb1=new JButton("Proceed");
		JButton jb2=new JButton("Instructions");
		
		jb1.setBounds(450,230,150,50);
		jb1.setBackground(new Color(1,87,155));
		jb1.setVisible(true);
		jb1.setForeground(Color.white);
		jb1.setFont(new Font("Comic Sans MS",00,20));
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new controller().Next2();
			}
		});
		jp2.add(jb1);
		
		jb2.setBounds(450,300,150,50);
		jb2.setForeground(Color.WHITE);
		jb2.setBackground(new Color(1,87,155));
		jb2.setVisible(true);
		jb2.setFont(new Font("Comic Sans MS",00,20));
		jp2.add(jb2);
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new controller().instn();
			}
		});
	}
	

}
