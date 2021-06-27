package mypack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentAttendanceDetails extends JFrame implements ActionListener{
	
	JTable t;
	JButton b1;
	String s1[]= {"Roll no.","Date-Time","First Half","Second Half"};
	String s2[][]=new String[15][4];
	int i=0,j=0;
	
	
	StudentAttendanceDetails()
	{
		super("StudentAttendanceDetails");
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		
		try
		{
			String s3="select * from attendance_student";
			Conn cc=new Conn();
			ResultSet rs=cc.s.executeQuery(s3);
			while(rs.next())
			{
				s2[i][j++]=rs.getString("rollno");
				s2[i][j++]=rs.getString("Date");
				s2[i][j++]=rs.getString("first");
				s2[i][j++]=rs.getString("second");
				i++;
				j=0;

			}
			t=new JTable(s2,s1);
			
		}
		catch(Exception ev)
		{
			
		}
		
		b1=new JButton("Print");
		add(b1,"South");
		JScrollPane sp=new JScrollPane(t);
		add(sp);
		b1.addActionListener(this);
		
		
		setVisible(true);
		
		
		
	}

	public void actionPerformed(ActionEvent ee)
	{
		try
		{
           t.print();
		}
		catch(Exception ev) {}
	}
	public static void main(String[] args) {

		new StudentAttendanceDetails();
	}

}
