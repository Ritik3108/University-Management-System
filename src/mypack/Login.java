package mypack;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	
	JLabel l1,l2,l3,l4,l5;
	Choice t1;
	JPasswordField pf;
	JButton b1,b2,b3;
	JPanel p1;
	
	Login()
	{
		super("Login");
		//setBackground(new Color(169, 169, 169));	

		setSize(500,350);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
				
		p1=new JPanel();
		p1.setBounds(0,0,500,450);
        setContentPane(p1);
        p1.setLayout(null);
        
        
		l1=new JLabel("Username:");
		l1.setBounds(100,90,100,30);
		add(l1);
		
		t1=new Choice();
		t1.setBounds(200,95,200,20);
		add(t1);
		
		try
		{
			Conn cc = new Conn();
			String sql="select * from account";
			ResultSet rs=cc.s.executeQuery(sql);
			
			while(rs.next())
			{
				t1.add(rs.getString("username"));
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		l2=new JLabel("Password:");
		l2.setBounds(100,140,100,30);
		add(l2);
		
		l4=new JLabel("Sign In");
		l4.setBounds(200,35,100,30);
		l4.setFont(new Font("Serif",Font.BOLD,20));
		add(l4);
		
		l5=new JLabel("Don't have an account?");
		l5.setBounds(320,165,250,30);
		l5.setFont(new Font("Serif",Font.ITALIC,16));
		add(l5);
		
		l5.addMouseListener(new MouseAdapter()
		{
	      public void mouseClicked(MouseEvent er)
	      {
	    	  setVisible(false);
	    	  new SignUp().setVisible(true);
	      }
		});
		
		ImageIcon if4 = new ImageIcon(ClassLoader.getSystemResource("mypack/icons/down-arrow.png"));
        Image if5 = if4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ImageIcon if6 = new ImageIcon(if5);
        JButton lf2 = new JButton(if6);
        lf2.setBounds(275,40,20,20);
        p1.add(lf2);
		
	    pf=new JPasswordField();
		pf.setBounds(200,145,200,20);
		add(pf);
		
//		b1=new JButton("SignIn");
//		b1.setBounds(120,210,100,30);
//		add(b1);
//		b1.addActionListener(this);
		
//		b2=new JButton("SignUp");
//		b2.setBounds(190,210,100,30);
//		add(b2);
//		b2.addActionListener(this);

		
		l3=new JLabel("Trouble in Login?");
		l3.setBounds(80,200,100,30);
		l3.setForeground(Color.RED);
		add(l3);
		
		l3.addMouseListener(new MouseAdapter()
				{
			      public void mouseClicked(MouseEvent er)
			      {
			    	  setVisible(false);
			    	  new Forgot_Password().setVisible(true);
			      }
				});
		
		b3=new JButton("Forgot Password");
		b3.setBounds(200,200,200,30);
		add(b3);
		b3.addActionListener(this);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("mypack/icons/tick.png"));
        Image i5 = i4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JButton l2 = new JButton(i6);
        l2.setBounds(405,145,20,20);
        p1.add(l2);
        
        l2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae)
            {
            	Conn cc=new Conn();
              try
              {    
            	   String r="select * from account where username=? and password=?";
      				
      				PreparedStatement ps=cc.c.prepareStatement(r);
      				
      				ps.setString(1, t1.getSelectedItem());
      				ps.setString(2, pf.getText());

      				
      				ResultSet rs=ps.executeQuery();
      				if(rs.next())
      				{
      					setVisible(false);
      					new Project().setVisible(true);
      				}
      				else
      				{
      					JOptionPane.showMessageDialog(null, "Invalid Login!");
      				}
      				
      			}
              catch(Exception er)
              {
            	  er.printStackTrace();
              }
            }
        });

		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ev)
	{
		Conn cc=new Conn();
		try
		{	
			if(ev.getSource()==b3)
			{
				this.setVisible(false);
				new Forgot_Password().setVisible(true);
			}
			
		}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		}

	public static void main(String[] args) {
		
		

		new Login();
	}

}
