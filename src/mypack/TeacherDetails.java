package mypack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TeacherDetails extends JFrame implements ActionListener{
	
	JLabel j1,j2,j3;
	JTextField t1;
	JTable t;
	JButton b1,b2,b3;
	String s1[]= {"Name","Father's Name","Age","Date of Birth","Address","Phone","Email","Class X(%)",
			      "Class XII(%)","Aadhar No.","Course","Employere ID","Department"};
	
	String s2[][]=new String[20][13];
	int i=0,j=0;
	
	TeacherDetails()
	{
		super("View Teacher Details");
		setSize(1200,650);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		
		j1=new JLabel("Enter EMP ID to Delete Teacher");
		j1.setBounds(60,360,400,30);
		j1.setFont(new Font("Serif",Font.BOLD,20));
		add(j1);
		
		t1=new JTextField();
		t1.setBounds(380,363,300,30);
		t1.setFont(new Font("Serif",Font.BOLD,16));
		add(t1);
		
		b1=new JButton("Delete");
		b1.setBounds(700,363,100,30);
		b1.setFont(new Font("Serif",Font.BOLD,16));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		add(b1);
		
		b1.addActionListener(this);
		
		
		j2=new JLabel("Add New Teacher");
		j2.setBounds(60,450,300,30);
		j2.setFont(new Font("Serif",Font.BOLD,20));
		add(j2);
		
		b2=new JButton("ADD");
		b2.setBounds(350,450,100,30);
		b2.setFont(new Font("Serif",Font.BOLD,16));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		add(b2);
		
		b2.addActionListener(this);

		j3=new JLabel("Update Teacher Details");
		j3.setBounds(60,520,300,30);
		j3.setFont(new Font("Serif",Font.BOLD,20));
		add(j3);
		
		b3=new JButton("UPDATE");
		b3.setBounds(350,520,100,30);
		b3.setFont(new Font("Serif",Font.BOLD,16));
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		add(b3);
		b3.addActionListener(this);

		
		getContentPane().setBackground(Color.WHITE);
		
		
		try
		{
			String s3="select * from teacher";
			Conn cc=new Conn();
			ResultSet rs=cc.s.executeQuery(s3);
			while(rs.next())
			{
				s2[i][j++]=rs.getString("name");
				s2[i][j++]=rs.getString("fathers_name");
				s2[i][j++]=rs.getString("age");
				s2[i][j++]=rs.getString("dob");
				s2[i][j++]=rs.getString("address");
				s2[i][j++]=rs.getString("phone");
				s2[i][j++]=rs.getString("email");
				s2[i][j++]=rs.getString("class_x");
				s2[i][j++]=rs.getString("class_xii");
				s2[i][j++]=rs.getString("aadhar");
				s2[i][j++]=rs.getString("course");
				s2[i][j++]=rs.getString("emp_id");
				s2[i][j++]=rs.getString("dept");
				i++;
				j=0;
			}
			t=new JTable(s2,s1);
			t.addMouseListener(new MouseAdapter()
			{
		        public void mouseClicked(MouseEvent ev)
		        {
		        	int row=t.getSelectedRow();
		        	t1.setText(t.getModel().getValueAt(row, 11).toString());
		        }
			});
			
		}
		catch(Exception ee)
		{
			
		}
		
		JScrollPane sp=new JScrollPane(t);
		sp.setBounds(20,20,1170,330);
		add(sp);
		
		JLabel j4=new JLabel("Back to Home");
        j4.setBounds(490,485,170,20);
        j4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));

        add(j4);
        
		
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
		
	}
	
	public void actionPerformed(ActionEvent ee)
	{
		Conn cc=new Conn();

		if(ee.getSource()==b1)
		{
			
			try
			{
				JDialog.setDefaultLookAndFeelDecorated(true);
				int rs=JOptionPane.showConfirmDialog(null, "Do You Confirm?",
			             "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
	
	if(rs==JOptionPane.YES_OPTION)
	{
		String s4=t1.getText();
		String s5="delete from teacher where emp_id ='"+s4+"'";
		cc.s.executeUpdate(s5);
		JOptionPane.showMessageDialog(null,"Teacher Deleted Successfully");
		setVisible(false);
		new TeacherDetails().setVisible(true);
	}
				
			}
			catch(Exception ev) {
				ev.printStackTrace();
			}
		}
		else if(ee.getSource()==b2)
		{
			new AddTeacher().setVisible(true);
			this.setVisible(false);

		}
		else if(ee.getSource()==b3)
		{
			new UpdateTeacher().setVisible(true);
			this.setVisible(false);
		}

	}
	               

	public static void main(String[] args) {

		new TeacherDetails();
	}

}
