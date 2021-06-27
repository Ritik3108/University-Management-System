package mypack;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdateTeacher extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	JButton b1,b2,b3;
	Choice ch;
	
			
	UpdateTeacher()
	{
		super("Update Teacher");
		setSize(1000,850);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		
		l8=new JLabel("Update Teacher Details...");
		l8.setBounds(40,30,400,40);
		l8.setFont(new Font("Serif",Font.ITALIC,35));
		add(l8);
		
		l15=new JLabel("Select EMP ID to Update the Data of Teacher");
		l15.setBounds(40,90,450,40);
		l15.setFont(new Font("Serif",Font.ITALIC,23));
		add(l15);
		
		l1=new JLabel("Name");
		l1.setBounds(100,190,100,30);
		l1.setFont(new Font("serif",Font.BOLD,20));
		add(l1); 
		
		l2=new JLabel("Age");
		l2.setBounds(100,240,100,30);
		l2.setFont(new Font("serif",Font.BOLD,20));
		add(l2);
		
		l3=new JLabel("Address");
		l3.setBounds(100,290,100,30);
		l3.setFont(new Font("serif",Font.BOLD,20));
		add(l3);
		
		l4=new JLabel("Email ID");
		l4.setBounds(100,340,100,30);
		l4.setFont(new Font("serif",Font.BOLD,20));
		add(l4);
		
		l5=new JLabel("CLASS XII(%)");
		l5.setBounds(100,390,150,30);
		l5.setFont(new Font("serif",Font.BOLD,20));
		add(l5);
		
		l6=new JLabel("EMP ID");
		l6.setBounds(100,440,100,30);
		l6.setFont(new Font("serif",Font.BOLD,20));
		add(l6);
		
		l7=new JLabel("Dept.");
		l7.setBounds(100,490,100,30);
		l7.setFont(new Font("serif",Font.BOLD,20));
		add(l7);
		
		t1=new JTextField();
		t1.setBounds(250,190,130,30);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(250,240,130,30);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(250,290,130,30);
		add(t3);
		
		t4=new JTextField();
		t4.setBounds(250,340,130,30);
		add(t4);
		
		t5=new JTextField();
		t5.setBounds(250,390,130,30);
		add(t5);
		
		t6=new JTextField();
		t6.setBounds(250,440,130,30);
		add(t6);
		
		t13=new JTextField();
		t13.setBounds(250,490,130,30);
		add(t13);
		
		l9=new JLabel("Father's Name");
		l9.setBounds(430,190,160,30);
		l9.setFont(new Font("serif",Font.BOLD,20));
		add(l9);
		
		l10=new JLabel("DOB(dd/mm/yyyy)");
		l10.setBounds(430,240,160,30);
		l10.setFont(new Font("serif",Font.BOLD,20));
		add(l10);
		
		l11=new JLabel("Phone No.");
		l11.setBounds(430,290,160,30);
		l11.setFont(new Font("serif",Font.BOLD,20));
		add(l11);
		
		l12=new JLabel("CLASS X(%)");
		l12.setBounds(430,340,160,30);
		l12.setFont(new Font("serif",Font.BOLD,20));
		add(l12);
		
		l13=new JLabel("Aadhar No.");
		l13.setBounds(430,390,160,30);
		l13.setFont(new Font("serif",Font.BOLD,20));
		add(l13);
		
		l14=new JLabel("Course");
		l14.setBounds(430,440,160,30);
		l14.setFont(new Font("serif",Font.BOLD,20));
		add(l14);
		
		t7=new JTextField();
		t7.setBounds(630,190,130,30);
		add(t7);
		
		t8=new JTextField();
		t8.setBounds(630,240,130,30);
		add(t8);
		
		t9=new JTextField();
		t9.setBounds(630,290,130,30);
		add(t9);
		
		t10=new JTextField();
		t10.setBounds(630,340,130,30);
		add(t10);
		
		t11=new JTextField();
		t11.setBounds(630,390,130,30);
		add(t11);
		
		ch=new Choice();
		ch.setBounds(550,92,220,30);
		ch.setFont(new Font("serif",Font.BOLD,20));
		add(ch);
		
		try
		{
			Conn cc = new Conn();
			String sql="select * from teacher";
			ResultSet rs=cc.s.executeQuery(sql);
			
			while(rs.next())
			{
				ch.add(rs.getString("emp_id"));
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		t14=new JTextField();
		t14.setBounds(630,440,130,30);
		add(t14);
		
		b1=new JButton("UPDATE");
		b1.setBounds(340,570,100,40);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Cancel");
		b2.setBounds(500,570,100,40);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		add(b2);
		b2.addActionListener(this);
		
		b3=new JButton("Search");
		b3.setBounds(850,85,100,40);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		add(b3);
		b3.addActionListener(this);
		
	setVisible(true);}
	
	   
	
		
		public void actionPerformed(ActionEvent e)
		{
			String a=t1.getText();
			String b=t2.getText();
			String c=t3.getText();
			String d=t4.getText();
			String E=t5.getText();
			String f=t6.getText();
			String g=t7.getText();
			String h=t8.getText();
			String i=t9.getText();
			String j=t10.getText();
			String k=t11.getText();
			
			String l=t13.getText();
			String m=t14.getText();
			
			Conn cc=new Conn();
			
			if(e.getSource()==b1) {
			try
			{
				
				String q="update teacher set name='"+a+"',fathers_name='"+g+"',age='"+b+"', dob='"+h+"',address='"+c+"',phone='"+i+"',email='"
						+ ""+d+"',class_x='"+j+"',class_xii='"+E+"',aadhar='"+k+"',course='"+m+"',emp_id='"+f+"',dept='"+l+"' where emp_id='"+ch.getSelectedItem()+"'";
				cc.s.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"Teacher Details Updated Successfully");
				setVisible(false);
			}
			
			catch(Exception er)
			{
				System.out.println(er);
			}}
			else if(e.getSource()==b2)
			{
             this.setVisible(false);
             new Project().setVisible(true);
			}
			else if(e.getSource()==b3)
			{
				try
				{
					String str="select * from teacher where emp_id = '"+ch.getSelectedItem()+"'";
					ResultSet rs=cc.s.executeQuery(str);
					
					if(rs.next())
					{
						setVisible(true);
						
						t1.setText(rs.getString(1));
						t2.setText(rs.getString(3));
						t3.setText(rs.getString(5));
						t4.setText(rs.getString(7));
						t5.setText(rs.getString(9));
						t6.setText(rs.getString(12));
						t7.setText(rs.getString(2));
						t8.setText(rs.getString(4));
						t9.setText(rs.getString(6));
						t10.setText(rs.getString(8));
						t11.setText(rs.getString(10));
						t13.setText(rs.getString(13));
						t14.setText(rs.getString(11));

					}
				}
				catch(Exception ee)
				{
					
				}
			}
		
		
		
		}		
		
	public static void main(String[] args) {

		new UpdateTeacher().setVisible(true);
	}

}
