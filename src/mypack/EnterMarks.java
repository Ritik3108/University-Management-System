package mypack;

import java.awt.Choice;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EnterMarks extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JButton b1;
	Choice ch;
	
	EnterMarks(){
		
		super("Enter Marks");
		setLayout(null);
		
		setSize(600,600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		getContentPane().setBackground(Color.WHITE);
		
		l1=new JLabel("Enter Marks of Student");
		l1.setFont(new Font("Serif",Font.ITALIC,20));
		l1.setBounds(180,3,200,60);
		add(l1);
		
		l2=new JLabel("Select Roll No :-");
		l2.setBounds(30,70,150,30);
		l2.setFont(new Font("Serif",Font.BOLD,16));
		add(l2);
		
		ch=new Choice();
		ch.setBounds(190,74,180,30);
		add(ch);
		
		try
		{
			Conn cc = new Conn();
			String sql="select * from student";
			ResultSet rs=cc.s.executeQuery(sql);
			
			while(rs.next())
			{
				ch.add(rs.getString("rollno"));
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		
		
		l3=new JLabel("Enter Subject");
		l3.setFont(new Font("Serif",Font.PLAIN,20));
		l3.setBounds(90,170,190,20);
		add(l3);
		
		l4=new JLabel("Enter Marks");
		l4.setFont(new Font("Serif",Font.PLAIN,20));
		l4.setBounds(320,170,190,20);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(90,220,180,20);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(90,245,180,20);
		add(t3);
		
		t4=new JTextField();
		t4.setBounds(90,270,180,20);
		add(t4);
		
		t5=new JTextField();
		t5.setBounds(90,295,180,20);
		add(t5);
		
		t6=new JTextField();
		t6.setBounds(90,320,180,20);
		add(t6);
		
		t7=new JTextField();
		t7.setBounds(275,220,180,20);
		add(t7);
		
		t8=new JTextField();
		t8.setBounds(275,245,180,20);
		add(t8);
		
		t9=new JTextField();
		t9.setBounds(275,270,180,20);
		add(t9);
		
		t10=new JTextField();
		t10.setBounds(275,295,180,20);
		add(t10);
		
		t11=new JTextField();
		t11.setBounds(275,320,180,20);
		add(t11);
		
		b1=new JButton("SUBMIT");
		b1.setBounds(230,380,100,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		add(b1);
		
		b1.addActionListener(this);
		
		JLabel j4=new JLabel("Back");
        j4.setBounds(245,480,170,20);
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
		
		
		
		
		setVisible(true);}
	
	public void actionPerformed(ActionEvent e)
	{
		String a=ch.getSelectedItem();
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
		
		if(e.getSource()==b1)
		{
			try
			{
				Conn cc=new Conn();
				String q="insert into subject values('"+a+"','"+b+"','"+c+"','"+d+"','"+E+"','"+f+"')";
				String q2="insert into marks values('"+a+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
				cc.s.executeUpdate(q);
				cc.s.executeUpdate(q2);
				JOptionPane.showMessageDialog(null, "Stuents Marks Inserted Successfully");
				setVisible(false);
			}
			catch(Exception eq)
			{
				eq.printStackTrace();
			}
			
		}
	}
	
	
	

	public static void main(String[] args) {
     EnterMarks obj=new EnterMarks();
	}

}
