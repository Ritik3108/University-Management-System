package mypack;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class StudentFeeForm extends JFrame implements ActionListener{
	
	JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	
	Choice ch;
	JPanel p;
	JButton b1,b2;
	
	StudentFeeForm()
	{
		super("Student Fee Form");
		setSize(500,600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		p=new JPanel();
		setContentPane(p);
		p.setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setBorder(new TitledBorder(new LineBorder(new Color(102,205,170),2,true),"Fee-Form",
				           TitledBorder.LEADING, TitledBorder.TOP,null,new Color(30,144,255)));
		p1.setBackground(new Color(211,211,211));
		p1.setBounds(10,50,378,448);
		
		p.setBackground(Color.WHITE);
		p1.setBackground(Color.WHITE);
		p.add(p1);
		
		p1.setLayout(null);
		
		
		j1=new JLabel("Select Roll No.");
		j1.setBounds(13,13,150,30);
		j1.setFont(new Font("Tahoma",Font.BOLD,16));
		j1.setForeground(new Color(25,25,112));
		p1.add(j1);
		
		j2=new JLabel("Name");
		j2.setBounds(13,53,200,30);
		j2.setFont(new Font("Tahoma",Font.BOLD,16));
		j2.setForeground(new Color(25,25,112));

		p1.add(j2);
		
		j3=new JLabel("Father's Name");
		j3.setBounds(13,93,200,30);
		j3.setFont(new Font("Tahoma",Font.BOLD,16));
		j3.setForeground(new Color(25,25,112));

		p1.add(j3);
		
		j4=new JLabel("Course");
		j4.setBounds(13,133,200,30);
		j4.setFont(new Font("Tahoma",Font.BOLD,16));
		j4.setForeground(new Color(25,25,112));

		p1.add(j4);
		
		j5=new JLabel("Branch");
		j5.setBounds(13,173,200,30);
		j5.setFont(new Font("Tahoma",Font.BOLD,16));
		j5.setForeground(new Color(25,25,112));

		p1.add(j5);
		
		j6=new JLabel("Mobile No.");
		j6.setBounds(13,213,200,30);
		j6.setFont(new Font("Tahoma",Font.BOLD,16));
		j6.setForeground(new Color(25,25,112));

		p1.add(j6);
		
		j7=new JLabel("Total Amount");
		j7.setBounds(13,253,200,30);
		j7.setFont(new Font("Tahoma",Font.BOLD,16));
		j7.setForeground(new Color(25,25,112));

		p1.add(j7);
		
		j8=new JLabel("Pay");
		j8.setBounds(13,293,200,30);
		j8.setFont(new Font("Tahoma",Font.BOLD,16));
		j8.setForeground(new Color(25,25,112));

		p1.add(j8);
		
		j9=new JLabel("Balanced Amount");
		j9.setBounds(13,333,200,30);
		j9.setFont(new Font("Tahoma",Font.BOLD,16));
		j9.setForeground(new Color(25,25,112));

		p1.add(j9);
		
		ch=new Choice();
		ch.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		ch.setForeground(new Color(47,79,79));
		
		try
		{
			Conn cc=new Conn();
			String st="select * from student";
			ResultSet rs=cc.s.executeQuery(st);
			while(rs.next())
			{
				ch.add(rs.getString("rollno"));
			}
			
		}
		catch(Exception ee) {}
		ch.setBounds(170,15,150,30);
		p1.add(ch);
		
		
		t1=new JTextField();
		t1.setBounds(170,57,150,20);
		t1.setFont(new Font("Monospaced",Font.BOLD,16));
		p1.add(t1);
		
		
		t2=new JTextField();
		t2.setBounds(170,97,150,20);
		t2.setFont(new Font("Monospaced",Font.BOLD,16));
	    p1.add(t2);
		
		
		t4=new JTextField();
		t4.setBounds(170,137,150,20);
		p1.add(t4);
		
		t5=new JTextField();
		t5.setBounds(170,177,150,20);
		p1.add(t5);
		
		t6=new JTextField();
		t6.setBounds(170,217,150,20);
		p1.add(t6);
		
		
		t3=new JTextField();
		t3.setBounds(170,257,150,20);
		t3.setFont(new Font("Monospaced",Font.BOLD,16));
		p1.add(t3);
		
		t7=new JTextField();
		t7.setBounds(170,297,150,20);
		t7.setFont(new Font("Monospaced",Font.BOLD,16));
		p1.add(t7);
		
		t8=new JTextField();
		t8.setBounds(170,337,150,20);
		t8.setFont(new Font("Monospaced",Font.BOLD,16));
		p1.add(t8);
		
		
		b1=new JButton("PAY");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(40,393,130,30);
		p1.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("BACK");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(180,393,130,30);
		p1.add(b2);
		b2.addActionListener(this);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("mypack/icons/tick.png"));
        Image i5 = i4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JButton l2 = new JButton(i6);
        l2.setBounds(330,17,20,20);
        p1.add(l2);
        
        l2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae)
            {
              try
              {
            	Conn ct=new Conn();
            	String sq="select * from student where rollno = '"+ch.getSelectedItem()+"'";
            	ResultSet rs=ct.s.executeQuery(sq);
            	if(rs.next())
            	{
            		t1.setText(rs.getString("name"));
            		t2.setText(rs.getString("fathers_name"));
            		t4.setText(rs.getString("course"));
            		t5.setText(rs.getString("branch"));
            		t6.setText(rs.getString("phone"));
            		
            	}
            	if(t4.getText()=="B.TECH")
        		{
        			t3.setText("13000");
        		}
              }
              catch(Exception er)
              {
            	  er.printStackTrace();
              }
            }
        });
        
        
        
        ImageIcon iii4 = new ImageIcon(ClassLoader.getSystemResource("mypack/icons/right-arrow.png"));
        Image iii5 = iii4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ImageIcon iii6 = new ImageIcon(iii5);
        JButton lll2 = new JButton(iii6);
        lll2.setBounds(330,337,20,20);
        p1.add(lll2);
        
        lll2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae)
            {
              try
              {
            	  int a=Integer.parseInt(t3.getText().toString());
            	  int b=Integer.parseInt(t7.getText().toString());
            	  
            	  String c=Integer.toString(a-b);
            	  
            	  t8.setText(c);
              }
            	
            	catch(Exception er)
              {
            	  er.printStackTrace();
              }
            }
        });
//	
				
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ee)
	{
		Conn cc=new Conn();
		try
		{
			if(ee.getSource()==b1)
			{
				try
				{
					String str="insert into fee(rollno,name,fathers_name,course,branch,phone,total_am,pay,balance) values(?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps=cc.c.prepareStatement(str);
					
					ps.setString(1, ch.getSelectedItem());
					ps.setString(2, t1.getText());
					ps.setString(3, t2.getText());
					ps.setString(4, t4.getText());
					ps.setString(5, t5.getText());
					ps.setString(6, t6.getText());
					ps.setString(7, t3.getText());
					ps.setString(8, t7.getText());
					ps.setString(9, t8.getText());
					
					int i=ps.executeUpdate();
					
					if(i>0)
					{
						JOptionPane.showMessageDialog(null, "Successfully Paid");
						this.setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Error");
					}
				}
				catch(Exception ee1)
					{
						ee1.printStackTrace();
					}
							       
				}
			else if(ee.getSource()==b2)
			{
				this.setVisible(false);
				new Project().setVisible(true);

			}
		}
		catch(Exception ee2)
		{
			
		}
		
	}
    
	public static void main(String[] args) {
		
		new StudentFeeForm();

	}

}
