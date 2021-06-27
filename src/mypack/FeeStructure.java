package mypack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FeeStructure extends JFrame {
	
	JLabel j;
	JLabel j1,j2,j3,j4,j5,j6,j7;
	JLabel s1,s2,s3,s4,s5,s6,s7,s8;
	JLabel r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24;
	JLabel r25,r26,r27,r28,r29,r30,r31,r32,r33,r34;

	FeeStructure()
	{
		super("Fee Structure");
		setSize(1400,750);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		j=new JLabel("Fee Structure");
		j.setBounds(540,5,400,100);
		j.setFont(new Font("Serif",Font.ITALIC,56));
		add(j);
		
		j1=new JLabel("Course");
		j1.setBounds(60,100,100,50);
		j1.setFont(new Font("Serif",Font.BOLD,26));
		add(j1);
		
		j2=new JLabel("B.TECH");
		j2.setBounds(260,100,100,50);
		j2.setFont(new Font("Serif",Font.BOLD,26));
		add(j2);
		
		j3=new JLabel("BCA");
		j3.setBounds(475,100,100,50);
		j3.setFont(new Font("Serif",Font.BOLD,26));
		add(j3);
		
		j4=new JLabel("BBA");
		j4.setBounds(675,100,100,50);
		j4.setFont(new Font("Serif",Font.BOLD,26));
		add(j4);
		
		
		j5=new JLabel("Bsc");
		j5.setBounds(880,100,100,50);
		j5.setFont(new Font("Serif",Font.BOLD,26));
		add(j5);
		
		j6=new JLabel("MBA");
		j6.setBounds(1060,100,100,50);
		j6.setFont(new Font("Serif",Font.BOLD,26));
		add(j6);
		
		j7=new JLabel("MCA");
		j7.setBounds(1245,100,100,50);
		j7.setFont(new Font("Serif",Font.BOLD,26));
		add(j7);
		
		
		s1=new JLabel("SEMESTER 1");
		s1.setBounds(55,170,140,50);
		s1.setFont(new Font("Serif",Font.BOLD,20));
		add(s1);
		
		
		s2=new JLabel("SEMESTER 2");
		s2.setBounds(55,240,140,50);
		s2.setFont(new Font("Serif",Font.BOLD,20));
		add(s2);
		
		s3=new JLabel("SEMESTER 3");
		s3.setBounds(55,310,140,50);
		s3.setFont(new Font("Serif",Font.BOLD,20));
		add(s3);
		
		s4=new JLabel("SEMESTER 4");
		s4.setBounds(55,380,140,50);
		s4.setFont(new Font("Serif",Font.BOLD,20));
		add(s4);
		
		s5=new JLabel("SEMESTER 5");
		s5.setBounds(55,450,140,50);
		s5.setFont(new Font("Serif",Font.BOLD,20));
		add(s5);
		
		s6=new JLabel("SEMESTER 6");
		s6.setBounds(55,520,140,50);
		s6.setFont(new Font("Serif",Font.BOLD,20));
		add(s6);
		
		s7=new JLabel("SEMESTER 7");
		s7.setBounds(55,590,140,50);
		s7.setFont(new Font("Serif",Font.BOLD,20));
		add(s7);
		
		s8=new JLabel("SEMESTER 8");
		s8.setBounds(55,660,140,50);
		s8.setFont(new Font("Serif",Font.BOLD,20));
		add(s8);
		
		
		
		r1=new JLabel("RS 43000");
		r1.setBounds(260,170,140,50);
		r1.setFont(new Font("Serif",Font.PLAIN,24));
		add(r1);
		
		r2=new JLabel("RS 43000");
		r2.setBounds(260,240,140,50);
		r2.setFont(new Font("Serif",Font.PLAIN,24));
		add(r2);
		
		r3=new JLabel("RS 43000");
		r3.setBounds(260,310,140,50);
		r3.setFont(new Font("Serif",Font.PLAIN,24));
		add(r3);
		
		r4=new JLabel("RS 43000");
		r4.setBounds(260,380,140,50);
		r4.setFont(new Font("Serif",Font.PLAIN,24));
		add(r4);
		
		r5=new JLabel("RS 43000");
		r5.setBounds(260,450,140,50);
		r5.setFont(new Font("Serif",Font.PLAIN,24));
		add(r5);
		
		r6=new JLabel("RS 43000");
		r6.setBounds(260,520,140,50);
		r6.setFont(new Font("Serif",Font.PLAIN,24));
		add(r6);
		
		r7=new JLabel("RS 43000");
		r7.setBounds(260,590,140,50);
		r7.setFont(new Font("Serif",Font.PLAIN,24));
		add(r7);
		
		r8=new JLabel("RS 43000");
		r8.setBounds(260,660,140,50);
		r8.setFont(new Font("Serif",Font.PLAIN,24));
		add(r8);
		
		
		r9=new JLabel("RS 32000");
		r9.setBounds(460,170,140,50);
		r9.setFont(new Font("Serif",Font.PLAIN,24));
		add(r9);
		
		r10=new JLabel("RS 32000");
		r10.setBounds(460,240,140,50);
		r10.setFont(new Font("Serif",Font.PLAIN,24));
		add(r10);
		
		r11=new JLabel("RS 32000");
		r11.setBounds(460,310,140,50);
		r11.setFont(new Font("Serif",Font.PLAIN,24));
		add(r11);
		
		r12=new JLabel("RS 32000");
		r12.setBounds(460,380,140,50);
		r12.setFont(new Font("Serif",Font.PLAIN,24));
		add(r12);
		
		r13=new JLabel("RS 32000");
		r13.setBounds(460,450,140,50);
		r13.setFont(new Font("Serif",Font.PLAIN,24));
		add(r13);
		
		r14=new JLabel("RS 32000");
		r14.setBounds(460,520,140,50);
		r14.setFont(new Font("Serif",Font.PLAIN,24));
		add(r14);
		
		
		r15=new JLabel("RS 25000");
		r15.setBounds(660,170,140,50);
		r15.setFont(new Font("Serif",Font.PLAIN,24));
		add(r15);
		
		r16=new JLabel("RS 25000");
		r16.setBounds(660,240,140,50);
		r16.setFont(new Font("Serif",Font.PLAIN,24));
		add(r16);
		
		r17=new JLabel("RS 25000");
		r17.setBounds(660,310,140,50);
		r17.setFont(new Font("Serif",Font.PLAIN,24));
		add(r17);
		
		r18=new JLabel("RS 25000");
		r18.setBounds(660,380,140,50);
		r18.setFont(new Font("Serif",Font.PLAIN,24));
		add(r18);
		
		r15=new JLabel("RS 25000");
		r15.setBounds(660,450,140,50);
		r15.setFont(new Font("Serif",Font.PLAIN,24));
		add(r15);
		
		r19=new JLabel("RS 25000");
		r19.setBounds(660,520,140,50);
		r19.setFont(new Font("Serif",Font.PLAIN,24));
		add(r19);
		
		
		r20=new JLabel("RS 18000");
		r20.setBounds(860,170,140,50);
		r20.setFont(new Font("Serif",Font.PLAIN,24));
		add(r20);
		
		r21=new JLabel("RS 18000");
		r21.setBounds(860,240,140,50);
		r21.setFont(new Font("Serif",Font.PLAIN,24));
		add(r21);
		
		r22=new JLabel("RS 18000");
		r22.setBounds(860,310,140,50);
		r22.setFont(new Font("Serif",Font.PLAIN,24));
		add(r22);
		
		r23=new JLabel("RS 18000");
		r23.setBounds(860,380,140,50);
		r23.setFont(new Font("Serif",Font.PLAIN,24));
		add(r23);
		
		r24=new JLabel("RS 18000");
		r24.setBounds(860,450,140,50);
		r24.setFont(new Font("Serif",Font.PLAIN,24));
		add(r24);
		
		r25=new JLabel("RS 18000");
		r25.setBounds(860,520,140,50);
		r25.setFont(new Font("Serif",Font.PLAIN,24));
		add(r25);
		
		
		r26=new JLabel("RS 65000");
		r26.setBounds(1060,170,140,50);
		r26.setFont(new Font("Serif",Font.PLAIN,24));
		add(r26);
		
		r27=new JLabel("RS 65000");
		r27.setBounds(1060,240,140,50);
		r27.setFont(new Font("Serif",Font.PLAIN,24));
		add(r27);
		
		r28=new JLabel("RS 65000");
		r28.setBounds(1060,310,140,50);
		r28.setFont(new Font("Serif",Font.PLAIN,24));
		add(r28);
		
		r29=new JLabel("RS 65000");
		r29.setBounds(1060,380,140,50);
		r29.setFont(new Font("Serif",Font.PLAIN,24));
		add(r29);
		
		
		r30=new JLabel("RS 55000");
		r30.setBounds(1230,170,140,50);
		r30.setFont(new Font("Serif",Font.PLAIN,24));
		add(r30);
		
		r31=new JLabel("RS 55000");
		r31.setBounds(1230,240,140,50);
		r31.setFont(new Font("Serif",Font.PLAIN,24));
		add(r31);
		
		r32=new JLabel("RS 55000");
		r32.setBounds(1230,310,140,50);
		r32.setFont(new Font("Serif",Font.PLAIN,24));
		add(r32);
		
		r33=new JLabel("RS 55000");
		r33.setBounds(1230,380,140,50);
		r33.setFont(new Font("Serif",Font.PLAIN,24));
		add(r33);
		
		JLabel j41=new JLabel("Back");
        j41.setBounds(1050,655,170,20);
        j41.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));

         add(j41);
        
		
		ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/tenth.png"));
		Image im2=i11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ImageIcon i12=new ImageIcon(im2);
        j41.setIcon(i12);
        
        j41.addMouseListener(new MouseAdapter()
		{
	      public void mouseClicked(MouseEvent er)
	      {
	    	  setVisible(false);
	    	  new Project().setVisible(true);
	      }
		});
				
		setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new FeeStructure();

	}

}
