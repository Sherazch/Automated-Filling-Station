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
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class languageselection {
	
	JPanel jp=new JPanel();
	public Icon img;
	public BufferedImage anim1;
	languageselection(){
	
		try {
			anim1 = ImageIO.read(new File("C:\\Users\\Sheraz Ahmed\\Downloads\\123.png"));
		
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e+"Exception caught at Logic");
		}
		
		//img=new ImageIcon("C:\\Users\\Sheraz Ahmed\\Downloads\\2.JPG");
		jp.setBounds(00, 00, 700,600);
		jp.setLayout(null);
		jp.setBackground(null);
		jp.setVisible(true);
		
		JLabel l=new JLabel("Welcome to Mcs Petrol Pump");
		l.setBounds(110,20,500,50);
		l.setFont(new Font("Comic Sans MS",00,36));
		l.setForeground(new Color(1,87,155));
		l.setVisible(true);
		jp.add(l);
		
		JTextField l1=new JTextField("	  Select Your Language");
		l1.setBounds(00,100,700,50);
		l1.setBackground(new Color(1,87,155));
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Comic Sans MS",00,30));
		l1.setEditable(false);
		l1.setVisible(true);
		jp.add(l1);
		
		JLabel piclabel=new JLabel(new ImageIcon(anim1));
		piclabel.setBounds(100,160,260,400);
		//piclabel.setBackground(Color.red);
		piclabel.setFont(new Font("Comic Sans MS",00,20));
		piclabel.setVisible(true);
		jp.add(piclabel);
		
		JButton jb=new JButton("Next");
		jb.setFont(new Font("Comic Sans MS",00,20));
		jb.setBounds(550, 500, 100, 40);
		jb.setBackground(new Color(1,87,155));
		jb.setForeground(Color.white);
		jp.add(jb);
		
		JRadioButton jrb1=new JRadioButton();
		jrb1.setFont(new Font("Comic Sans MS",00,25));
		jrb1.setBounds(450,230,150,50);
		jrb1.setText("English");
		jrb1.setBackground(null);
		jrb1.setForeground(new Color(1,87,155));
		jp.add(jrb1);
		
		JRadioButton jrb2=new JRadioButton();
		jrb2.setFont(new Font("Comic Sans MS",00,25));
		jrb2.setBounds(450,290,150,50);
		jrb2.setText("Urdu");
		jrb2.setBackground(null);
		jrb2.setForeground(new Color(1,87,155));
		jp.add(jrb2);
		
		jrb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			jrb2.setSelected(false);
			jrb1.setSelected(true);
			}
		});

		jrb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jrb1.setSelected(false);
				jrb2.setSelected(true);
	}
});
		
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//new controller().Next1();
				if(jrb1.isSelected()== true){
					new controller().Next1();
					}
					else if (jrb2.isSelected()==true){
						JOptionPane.showMessageDialog(null, "\tSorry for Inconvenience\nUrdu language is not yet feeded");
					}
			}
		});
		
	}

}
