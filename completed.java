package UPP;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class completed {
	JPanel jp4=new JPanel();
	public BufferedImage anim1;
	
	completed(){
		
		try {
			anim1 = ImageIO.read(new File("C:\\Users\\Sheraz Ahmed\\Downloads\\tick.png"));
		
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e+"Exception caught at Logic");
		}
		
		jp4.setBounds(00, 00, 700,600);
		jp4.setLayout(null);
		jp4.setBackground(null);
		jp4.setVisible(true);
		//jp.add(new JLabel(new ImageIcon(getClass().getResource("").getPath()+"2.jpg")));
		
		JLabel l=new JLabel("MCS Petrol Pump");
		l.setBounds(200,20,500,50);
		l.setForeground(new Color(1,87,155));
		l.setFont(new Font("Comic Sans MS",00,36));
		l.setVisible(true);
		jp4.add(l);
		
		JTextField l1=new JTextField("	            Fueling");
		l1.setBounds(0,100,700,50);
		l1.setFont(new Font("Comic Sans MS",00,30));
		l1.setBackground(new Color(1,87,155));
		l1.setForeground(Color.WHITE);
		l1.setEditable(false);
		l1.setVisible(true);
		jp4.add(l1);
		
		JLabel piclabel=new JLabel(new ImageIcon(anim1));
		piclabel.setBounds(200,270,40,40);
		piclabel.setFont(new Font("Comic Sans MS",00,20));
		piclabel.setVisible(true);
		jp4.add(piclabel);
		
		JLabel l2=new JLabel("Fuelinng Completed");
		l2.setBounds(270,270,500,40);
		l2.setForeground(new Color(1,87,155));
		l2.setFont(new Font("Comic Sans MS",00,25));
		l2.setVisible(true);
		jp4.add(l2);
		
		JLabel l3=new JLabel("Thankyou");
		l3.setBounds(275,380,500,70);
		l3.setForeground(new Color(1,87,155));
		l3.setFont(new Font("Comic Sans MS",00,40));
		l3.setVisible(true);
		jp4.add(l3);
		
	}

}
