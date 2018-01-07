package UPP;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class View extends JFrame {
	//public Image img;
	
	//BufferedImage anim1;
//	img = new ImageIcon(getClass().getResource("").getPath()+"1.jpg").getImage();	
	int x=(int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2);
	int y=(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2);
	View(){
		
		setTitle("MCS Petrol Pump");
		setBounds(x-350,y-300,700,600);
		setVisible(true);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
	}
	
	public void addpanel(JPanel p){
		super.add(p);
	}

}
