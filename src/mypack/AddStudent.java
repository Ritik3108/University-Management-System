package mypack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddStudent extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JComboBox c1,c2;
	JButton b1,b2;
	
	Random ran=new Random();
	long n1=(ran.nextLong()%9000L)+1000L;
	long n=Math.abs(n1);
			
	AddStudent()
	{
		super("Add Student");
		setSize(1000,600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/fourth.jpg"));
		Image i=i1.getImage().getScaledInstance(1220,700,Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(i);
		JLabel j=new JLabel(i2);
		add(j);
		
		l8=new JLabel("New Student Details");
		l8.setBounds(370,10,300,40);
		l8.setFont(new Font("Serif",Font.ITALIC,25));
		j.add(l8);
		
		l1=new JLabel("Name");
		l1.setBounds(100,90,100,30);
		l1.setFont(new Font("serif",Font.BOLD,20));
		j.add(l1); 
		
		l2=new JLabel("Age");
		l2.setBounds(100,140,100,30);
		l2.setFont(new Font("serif",Font.BOLD,20));
		j.add(l2);
		
		l3=new JLabel("Address");
		l3.setBounds(100,190,100,30);
		l3.setFont(new Font("serif",Font.BOLD,20));
		j.add(l3);
		
		l4=new JLabel("Email ID");
		l4.setBounds(100,240,100,30);
		l4.setFont(new Font("serif",Font.BOLD,20));
		j.add(l4);
		
		l5=new JLabel("CLASS XII(%)");
		l5.setBounds(100,290,150,30);
		l5.setFont(new Font("serif",Font.BOLD,20));
		j.add(l5);
		
		l6=new JLabel("Roll No.");
		l6.setBounds(100,340,100,30);
		l6.setFont(new Font("serif",Font.BOLD,20));
		j.add(l6);
		
		l7=new JLabel("Branch");
		l7.setBounds(100,390,100,30);
		l7.setFont(new Font("serif",Font.BOLD,20));
		j.add(l7);
		
		t1=new JTextField();
		t1.setBounds(250,90,130,30);
		j.add(t1);
		
		t2=new JTextField();
		t2.setBounds(250,140,130,30);
		j.add(t2);
		
		t3=new JTextField();
		t3.setBounds(250,190,130,30);
		j.add(t3);
		
		t4=new JTextField();
		t4.setBounds(250,240,130,30);
		j.add(t4);
		
		t5=new JTextField();
		t5.setBounds(250,290,130,30);
		j.add(t5);
		
		t6=new JTextField("177831"+n);
		t6.setBounds(250,340,130,30);
		j.add(t6);
		
		String Arr[]= {"Computer Science","Mechanical","Electrical","Electronics","Civil"};
		c1=new JComboBox(Arr);
		c1.setBounds(250,390,130,30);
		j.add(c1);
		
		l9=new JLabel("Father's Name");
		l9.setBounds(430,90,160,30);
		l9.setFont(new Font("serif",Font.BOLD,20));
		j.add(l9);
		
		l10=new JLabel("DOB(dd/mm/yyyy)");
		l10.setBounds(430,140,160,30);
		l10.setFont(new Font("serif",Font.BOLD,20));
		j.add(l10);
		
		l11=new JLabel("Phone No.");
		l11.setBounds(430,190,160,30);
		l11.setFont(new Font("serif",Font.BOLD,20));
		j.add(l11);
		
		l12=new JLabel("CLASS X(%)");
		l12.setBounds(430,240,160,30);
		l12.setFont(new Font("serif",Font.BOLD,20));
		j.add(l12);
		
		l13=new JLabel("Aadhar No.");
		l13.setBounds(430,290,160,30);
		l13.setFont(new Font("serif",Font.BOLD,20));
		j.add(l13);
		
		l14=new JLabel("Course");
		l14.setBounds(430,340,160,30);
		l14.setFont(new Font("serif",Font.BOLD,20));
		j.add(l14);
		
		t7=new JTextField();
		t7.setBounds(630,90,130,30);
		j.add(t7);
		
		t8=new JTextField();
		t8.setBounds(630,140,130,30);
		j.add(t8);
		
		t9=new JTextField();
		t9.setBounds(630,190,130,30);
		j.add(t9);
		
		t10=new JTextField();
		t10.setBounds(630,240,130,30);
		j.add(t10);
		
		t11=new JTextField();
		t11.setBounds(630,290,130,30);
		j.add(t11);
		
		String Course[]= {"B.TECH","MBA","B.COM","BBA","BCA","MCA"};
		c2=new JComboBox(Course);
		c2.setBounds(630,340,130,30);
		j.add(c2);
		
		b1=new JButton("ADD");
		b1.setBounds(340,450,100,40);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		j.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Cancel");
		b2.setBounds(500,450,100,40);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		j.add(b2);
		b2.addActionListener(this);
		
		JLabel j4=new JLabel("Back");
        j4.setBounds(870,485,170,20);
        j4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));

        j.add(j4);
        
		
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
        
	}
	
	   
	
		
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
			
			String l=(String)c1.getSelectedItem();
			String m=(String)c2.getSelectedItem();
			
			if(e.getSource()==b1) {
			try
			{
				Conn cc=new Conn();
				String q="insert into student values('"+a+"','"+g+"','"+b+"','"+h+"','"+c+"','"+i+"','"+d+"','"+j+"','"+E+"','"+k+"','"+f+"','"+m+"','"+l+"')";
				cc.s.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"Student Added Successfully");
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
			
		
		
		
		}
		
		
		
		


	public static void main(String[] args) {

		new AddStudent().setVisible(true);
	}

}
