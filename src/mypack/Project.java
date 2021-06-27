package mypack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
	
	Project()
	{
	super("University Management System");
		
		setSize(1920,1000);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/third.jpg"));
		Image i=i1.getImage().getScaledInstance(1900,950,Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(i);
		JLabel j=new JLabel(i2);
		add(j);
		
		JMenuBar mb=new JMenuBar();
		JMenu me=new JMenu("ADD");
		JMenuItem m1=new JMenuItem("New Faculty");
		JMenuItem m2=new JMenuItem("New Student Admission");
		me.setForeground(Color.BLUE);
		
		m1.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon1.png"));
		Image im=icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m1.setIcon(new ImageIcon(im));
		m1.setMnemonic('A');
		m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
		m1.setBackground(Color.WHITE);
		
		m2.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon2.png"));
		Image im1=icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m2.setIcon(new ImageIcon(im1));
		m2.setMnemonic('B');
		m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
		m2.setBackground(Color.WHITE);
		
		m1.addActionListener(this);
		m2.addActionListener(this);
		
		
		JMenu me2=new JMenu("Details");
		JMenuItem m3=new JMenuItem("Student Details");
		JMenuItem m4=new JMenuItem("Teacher Details");
		me2.setForeground(Color.RED);
		
		m3.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon3.png"));
		Image im2=icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m3.setIcon(new ImageIcon(im2));
		m3.setMnemonic('C');
		m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		m3.setBackground(Color.WHITE);
		
		m4.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon4.jpg"));
		Image im3=icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m4.setIcon(new ImageIcon(im3));
		m4.setMnemonic('D');
		m4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		m4.setBackground(Color.WHITE);
		
		
		m3.addActionListener(this);
		m4.addActionListener(this);
		
		
		JMenu me3=new JMenu("Attendance");
		JMenuItem m5=new JMenuItem("Student Attendance");
		JMenuItem m6=new JMenuItem("Teacher Attendance");
		me3.setForeground(Color.BLUE);
		
		m5.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon14.jpg"));
		Image im4=icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m5.setIcon(new ImageIcon(im4));
		m5.setMnemonic('M');
		m5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		m5.setBackground(Color.WHITE);
		
		m6.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon15.png"));
		Image im5=icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m6.setIcon(new ImageIcon(im5));
		m6.setMnemonic('N');
		m6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		m6.setBackground(Color.WHITE);
		
		m5.addActionListener(this);
		m6.addActionListener(this);
		
		
		
		JMenu me4=new JMenu("Attendance Details");
		JMenuItem m7=new JMenuItem("Student Attendance Details");
		JMenuItem m8=new JMenuItem("Teacher Attendance Details");
		me4.setForeground(Color.RED);
		
		m7.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon15.png"));
		Image im6=icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m7.setIcon(new ImageIcon(im6));
		m7.setMnemonic('O');
		m7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		m7.setBackground(Color.WHITE);
		
		m8.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon14.jpg"));
		Image im7=icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m8.setIcon(new ImageIcon(im5));
		m8.setMnemonic('P');
		m8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
		m8.setBackground(Color.WHITE);
		
		m7.addActionListener(this);
		m8.addActionListener(this);
		
		
		
		JMenu me5=new JMenu("Examination");
		JMenuItem m9=new JMenuItem("Examination Details");
		JMenuItem m10=new JMenuItem("Enter Marks");
		me5.setForeground(Color.BLUE);
		
		m9.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon9=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon16.png"));
		Image im8=icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m9.setIcon(new ImageIcon(im8));
		m9.setMnemonic('Q');
		m9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
		m9.setBackground(Color.WHITE);
		
		m10.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon17.png"));
		Image im9=icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m10.setIcon(new ImageIcon(im9));
		m10.setMnemonic('P');
		m10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
		m10.setBackground(Color.WHITE);
		
		m9.addActionListener(this);
		m10.addActionListener(this);
		
		
		JMenu me6=new JMenu("Update Details");
		JMenuItem m11=new JMenuItem("Update Students");
		JMenuItem m12=new JMenuItem("Update Teachers");
		me6.setForeground(Color.RED);
		
		m11.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon11=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon5.png"));
		Image im10=icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m11.setIcon(new ImageIcon(im10));
		m11.setMnemonic('E');
		m11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
		m11.setBackground(Color.WHITE);
		
		m12.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon12=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon6.png"));
		Image im11=icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m12.setIcon(new ImageIcon(im11));
		m12.setMnemonic('F');
		m12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
		m12.setBackground(Color.WHITE);
		
		m11.addActionListener(this);
		m12.addActionListener(this);
		
		
		JMenu me7=new JMenu("Fee Details");
		JMenuItem m13=new JMenuItem("Fee Structure");
		JMenuItem m14=new JMenuItem("Student Fee Form");
		JMenuItem m29=new JMenuItem("Fee Status");
		me7.setForeground(Color.BLUE);
		
		m13.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon13=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon7.png"));
		Image im12=icon13.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m13.setIcon(new ImageIcon(im12));
		m13.setMnemonic('G');
		m13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
		m13.setBackground(Color.WHITE);
		
		m14.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon14=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon8.png"));
		Image im13=icon14.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m14.setIcon(new ImageIcon(im13));
		m14.setMnemonic('H');
		m14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
		m14.setBackground(Color.WHITE);
		
		m29.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon24=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/fee.png"));
		Image im23=icon24.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m29.setIcon(new ImageIcon(im23));
		m29.setMnemonic('H');
		m29.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
		m29.setBackground(Color.WHITE);
		
		m13.addActionListener(this);
		m14.addActionListener(this);
		m29.addActionListener(this);
		
		
		JMenu me8=new JMenu("Utility");
		JMenuItem m15=new JMenuItem("Notepad");
		JMenuItem m16=new JMenuItem("Calculator");
		JMenuItem m17=new JMenuItem("Web Browser");

		me8.setForeground(Color.RED);
		
		m15.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon15=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon9.png"));
		Image im14=icon15.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m15.setIcon(new ImageIcon(im14));
		m15.setMnemonic('I');
		m15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		m15.setBackground(Color.WHITE);
		
		m16.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon16=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon10.png"));
		Image im15=icon16.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m16.setIcon(new ImageIcon(im15));
		m16.setMnemonic('J');
		m16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		m16.setBackground(Color.WHITE);
		
		m17.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon17=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon11.png"));
		Image im16=icon17.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m17.setIcon(new ImageIcon(im16));
		m17.setMnemonic('K');
		m17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
		m17.setBackground(Color.WHITE);
		
		
		m15.addActionListener(this);
		m16.addActionListener(this);
		m17.addActionListener(this);
		
		
		
        JMenu me9=new JMenu("About Us");
		JMenuItem m18=new JMenuItem("About US");
		me9.setForeground(Color.BLUE);
		
		m18.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon18=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon13.jpg"));
		Image im17=icon18.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m18.setIcon(new ImageIcon(im17));
		m18.setMnemonic('L');
		m18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		m18.setBackground(Color.WHITE);
		
				
		m18.addActionListener(this);
		
		JMenu me11=new JMenu("Logout");
		JMenuItem m20=new JMenuItem("LOGOUT");
		me11.setForeground(Color.RED);
		
		m20.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon20=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/logout.png"));
		Image im19=icon20.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m20.setIcon(new ImageIcon(im19));
		m20.setMnemonic('L');
		m20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
		m20.setBackground(Color.WHITE);
		
				
		m20.addActionListener(this);
		
		
		JMenu me10=new JMenu("Exit");
		JMenuItem m19=new JMenuItem("Exit");
		me10.setForeground(Color.BLUE);
		
		m19.setFont(new Font("Monospaced",Font.BOLD,16));
		ImageIcon icon19=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/icon12.png"));
		Image im18=icon19.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m19.setIcon(new ImageIcon(im18));
		m19.setMnemonic('Z');
		m19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		m19.setBackground(Color.WHITE);
		
				
		m19.addActionListener(this);
		
		me.add(m1);
		me.add(m2);
		
		me2.add(m3);
		me2.add(m4);
		
		me3.add(m5);
		me3.add(m6);
		
		me4.add(m7);
		me4.add(m8);
		
		me5.add(m9);
		me5.add(m10);
		
		me6.add(m11);
		me6.add(m12);
		
		me7.add(m13);
		me7.add(m14);
		me7.add(m29);
		
		me8.add(m15);
		me8.add(m16);
		me8.add(m17);
		
		me9.add(m18);
		
		me10.add(m19);
		me11.add(m20);
		
		mb.add(me);
		mb.add(me2);
		mb.add(me3);
		mb.add(me4);
		mb.add(me5);
		mb.add(me6);
		mb.add(me7);
		mb.add(me8);
		mb.add(me9);
		mb.add(me11);
		mb.add(me10);
		
		
		setJMenuBar(mb);
		
		setFont(new Font("Senserif",Font.BOLD,16));
		setLayout(new FlowLayout());
		setVisible(false);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			String st=e.getActionCommand();
			if(st.equals("New Faculty"))
			{ this.setVisible(false);
				new AddTeacher().setVisible(true);}
			
			else if(st.equals("New Student Admission"))
			{ this.setVisible(false);
			new AddStudent().setVisible(true);}
				
			else if(st.equals("Student Details"))
			{ this.setVisible(false);
			new StudentDetails().setVisible(true);}
					
			else if(st.equals("Teacher Details"))
			{ this.setVisible(false);
			new TeacherDetails().setVisible(true);}	
						
			else if(st.equals("Student Attendance"))
			{ this.setVisible(false);
			new StudentAttendance().setVisible(true);}				
							
		    else if(st.equals("Teacher Attendance"))
			{ this.setVisible(false);
			new TeacherAttendance().setVisible(true);}
					
	        else if(st.equals("Student Attendance Details"))
	    	{
			new StudentAttendanceDetails().setVisible(true);}
			
		    else if(st.equals("Teacher Attendance Details"))
			{new TeacherAttendanceDetails().setVisible(true);}
						
			else if(st.equals("Examination Details"))
			{ this.setVisible(false);
			new ExaminationDetails().setVisible(true);}
				
		    else if(st.equals("Enter Marks"))
			{ this.setVisible(false);
			new EnterMarks().setVisible(true);}
							
			else if(st.equals("Update Students"))
			{ this.setVisible(false);
			new UpdateStudent().setVisible(true);}
				
			else if(st.equals("Update Teachers"))
			{ this.setVisible(false);
			new UpdateTeacher().setVisible(true);}
					
			else if(st.equals("Fee Structure"))
			{ this.setVisible(false);
			new FeeStructure().setVisible(true);}
						
			else if(st.equals("Student Fee Form"))
			{ this.setVisible(false);
			new StudentFeeForm().setVisible(true);}
			
			else if(st.equals("Fee Status"))
			{ this.setVisible(false);
			  new Fee_Status().setVisible(true);}
			
			else if(st.equals("Notepad"))
			{
				try
				{
					Runtime.getRuntime().exec("notepad.exe");
				}
				catch(Exception ea) {
				}
				
			}
			else if(st.equals("Calculator")) {
				try
			{
				Runtime.getRuntime().exec("calc.exe");
			}
			catch(Exception ea) {
			}
			}			
			else if(st.equals("Web Browser"))
			{
				try
				{
					Runtime.getRuntime().exec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");
				}
				catch(Exception ea) {
				}
			}		
			else if(st.equals("About US")) {
				this.setVisible(false);
				new AboutUs().setVisible(true);}
			
			else if(st.equals("LOGOUT")) {
				this.setVisible(false);
				new Login().setVisible(true);}
			
			else if(st.equals("Exit"))
				System.exit(0);
							
			}

	public static void main(String[] args) {

		Project obj=new Project();
		new Project().setVisible(true);
	}

}

