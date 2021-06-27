package mypack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Splash {

	public static void main(String[] args) {
		Frame fr=new Frame();
		fr.setVisible(true);
		 int i;
	        int x=1;
	        for(i=2;i<=600;i+=4,x+=1){
	            fr.setLocation((500-((i+x)/2) ),300-(i/2));
	            fr.setSize(i+4*x,i+x/2);
	            
	            try{
	                Thread.sleep(10);
	            }catch(Exception e) { }
	        }
	    }
	}
class Frame extends JFrame implements ActionListener {
	
	
    Thread obj;
	Frame()
	{
		super("University Management System");
		
		setLayout(new FlowLayout());
		ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/first.jpg"));
		Image i2=I1.getImage().getScaledInstance(1500,700,Image.SCALE_DEFAULT);
		ImageIcon I2=new ImageIcon(i2);
		
		JLabel l1=new JLabel(I2);
		add(l1);
		
		
		
		
		JButton b1=new JButton("WELCOME! CLICK HERE TO CONTINUE");
		b1.setBounds(600,450,300,40);
		
		l1.add(b1);
		b1.addActionListener(this);
		}
	
	public void actionPerformed(ActionEvent ev)
	{
		
		this.setVisible(false);
		new Login().setVisible(true);
		
		
	    }}
