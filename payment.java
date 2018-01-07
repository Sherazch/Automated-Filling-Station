package UPP;

import java.awt.Color;
import java.awt.Font;
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


public class payment {

	JPanel jp4=new JPanel();
	public boolean abc;
	public BufferedImage anim1;
	
	payment(){
		
		try {
			anim1 = ImageIO.read(new File("C:\\Users\\Sheraz Ahmed\\Downloads\\cash.png"));
		
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
		
		JTextField l1=new JTextField("               Select Your Payment Method");
		l1.setBounds(0,100,700,50);
		l1.setFont(new Font("Comic Sans MS",00,30));
		l1.setBackground(new Color(1,87,155));
		l1.setForeground(Color.WHITE);
		l1.setEditable(false);
		l1.setVisible(true);
		jp4.add(l1);
		
		JLabel piclabel=new JLabel(new ImageIcon(anim1));
		piclabel.setBounds(100,220,120,120);
		//piclabel.setBackground(Color.red);
		piclabel.setFont(new Font("Comic Sans MS",00,20));
		piclabel.setVisible(true);
		jp4.add(piclabel);
		
		

		JRadioButton jrb1=new JRadioButton();
		JRadioButton jrb2=new JRadioButton();

		jrb1.setFont(new Font("Comic Sans MS",00,25));
		jrb1.setBounds(350,230,250,50);
		jrb1.setText("By Cash");
		
		jrb1.setBackground(null);
		jrb1.setForeground(new Color(1,87,155));
		jp4.add(jrb1);
		
		
		jrb2.setFont(new Font("Comic Sans MS",00,25));
		jrb2.setBounds(350,290,250,50);
		jrb2.setText("By Credit Card");
		jrb2.setBackground(null);
		jrb2.setForeground(new Color(1,87,155));
		jp4.add(jrb2);
		
		jrb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			jrb2.setSelected(false);
			jrb1.setSelected(true);
			abc=false;
			}
		});

		jrb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jrb1.setSelected(false);
				jrb2.setSelected(true);
				abc=true;
	}
});
		
		JButton jb=new JButton("Next");
		jb.setFont(new Font("Comic Sans MS",00,20));
		jb.setBounds(550, 500, 100, 40);
		jb.setBackground(new Color(1,87,155));
		jb.setForeground(Color.white);
		jp4.add(jb);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//new controller().Next1();
				if(jrb1.isSelected()== true){
					new controller().pmt();
					}
					else if (jrb2.isSelected()==true){
						new controller().pmt();
					}
			}
		});
		
		
		JButton jb1=new JButton("Back");
		jb1.setFont(new Font("Comic Sans MS",00,20));
		jb1.setBounds(50, 500, 100, 40);
		jb1.setBackground(new Color(1,87,155));
		jb1.setForeground(Color.white);
		jp4.add(jb1);
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new controller().back2();
				
			}
		});
		
		
	}
}
