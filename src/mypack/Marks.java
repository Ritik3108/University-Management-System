/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame{

   JTextArea t1;
   JPanel p1;
   
   Marks(String str){
	   super("Student Marks");
       setSize(500,600);
       setLocationRelativeTo(null);
		setResizable(false);
       setLayout(new BorderLayout());
       
       p1 = new JPanel();

       t1 = new JTextArea(50,15);
       JScrollPane jsp = new JScrollPane(t1);
       t1.setFont(new Font("Senserif",Font.ITALIC,18));
       
       add(p1,"North");
       
       add(jsp,"Center");
       
       JLabel j4=new JLabel("Back");
       j4.setBounds(870,485,170,20);
       j4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));

       p1.add(j4);
       
		
		ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/tenth.png"));
		Image im2=i11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ImageIcon i12=new ImageIcon(im2);
       j4.setIcon(i12);
       
       j4.addMouseListener(new MouseAdapter()
		{
	      public void mouseClicked(MouseEvent er)
	      {
	    	  setVisible(false);
	    	  new Project().setVisible(true);
	      }
		});
       
       setVisible(true);
       mark(str);
   }
   
   public void mark(String s){
    try{
           Conn c = new Conn();
           
           t1.setText("\tResult of Examination\n\nSubject\n");
           
           ResultSet rs1 = c.s.executeQuery("select * from subject where rollno="+s);
           
           if(rs1.next()){
               t1.append("\n\t"+rs1.getString("subject1"));
               t1.append("\n\t"+rs1.getString("subject2"));
               t1.append("\n\t"+rs1.getString("subject3"));
               t1.append("\n\t"+rs1.getString("subject4"));
               t1.append("\n\t"+rs1.getString("subject5"));
//               t1.append("\n-----------------------------------------");
//               t1.append("\n");
           }
           
           ResultSet rs2 = c.s.executeQuery("select * from marks where rollno="+s);
           
           if(rs2.next()){
               t1.append("\nMarks\n\n\t"+rs2.getString("marks1"));
               t1.append("\n\t"+rs2.getString("marks2"));
               t1.append("\n\t"+rs2.getString("marks3"));
               t1.append("\n\t"+rs2.getString("marks4"));
               t1.append("\n\t"+rs2.getString("marks5"));
//               t1.append("\n-----------------------------------------");
//               t1.append("\n");
           }
         
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   public static void main(String[] args){
    new Marks("1778310047").setVisible(true);
   }
}