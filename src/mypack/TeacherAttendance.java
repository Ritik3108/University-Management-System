package mypack;

import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TeacherAttendance extends JFrame implements ActionListener {
	
	JLabel l1,l2,l3;
	JButton b1,b2;
	Choice c1,c2,c3;              //or ComboBox
	
	TeacherAttendance()
	{
		super("TeacherAttendance");
		setLayout(new GridLayout(4,2,50,50));
		
		c1=new Choice();
		try
		{
			Conn cc=new Conn();
			ResultSet rs=cc.s.executeQuery("select * from teacher");
			while(rs.next())
			{
				c1.add(rs.getString("emp_id"));
			}
		}
		catch(Exception ev)
		{
			
		}
		add(new JLabel("Select EMP ID"));
		add(c1);
		
		c2=new Choice();
		c2.add("Present");
		c2.add("Absent");
		c2.add("Leave");
		
		add(new JLabel("First Half"));
		add(c2);
		
		
		c3=new Choice();
		c3.add("Present");
		c3.add("Absent");
		c3.add("Leave");
		
		add(new JLabel("Second Half"));
		add(c3);
		
		b1=new JButton("Submit");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		add(b1);
		
		b1.addActionListener(this);
		
		b2=new JButton("Cancel");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		add(b2);
		
		b2.addActionListener(this);

		
		
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}

	
	public void actionPerformed(ActionEvent e)
	{
		String s1=c2.getSelectedItem();
		String s2=c3.getSelectedItem();
		String s3=new Date().toString();
		String s4=c1.getSelectedItem();
		String s5="insert into attendance_teacher values('"+s4+"','"+s3+"','"+s1+"','"+s2+"')";
		

		if(e.getSource()==b1)
		{
			try
			{
				Conn cc=new Conn();
				cc.s.executeUpdate(s5);
				JOptionPane.showMessageDialog(null, "Attendance Inserted Successfully");
				this.setVisible(false);
			}
			catch(Exception ev)
			{
			//ev.printStackTrace();	
			}
		}
		else if(e.getSource()==b2)
		{
			setVisible(false);
			new Project().setVisible(true);
		}
	}
	public static void main(String[] args) {

		new TeacherAttendance();
	}

}

