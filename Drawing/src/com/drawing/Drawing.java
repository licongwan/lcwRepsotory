package com.drawing;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Drawing extends JPanel{
	public static void main(String[] args){
		new Drawing();
	}
	public Drawing(){
		JFrame jf= new JFrame();
		JTextField jtf = new JTextField(20);
		jf.setBounds(20,10,300,200);
		this.add(jtf);
		jf.add(this);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g){
		try {
			g.drawImage(ImageIO.read(new File("C:\\Users\\¿Ó¥œ\\Desktop\\timg.jpg")),0,0,this.getWidth(),this.getHeight(),null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
