package mypack;

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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener{
	
	
	
	JLabel j1,j2,j3;
	JTextField t1;
	JTable table;
	JButton b1,b2;
	JPanel p1,p;
	
	public void Book() {
        try {
            Conn con = new Conn();
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {
        	e.printStackTrace();
        }

    }

	
	ExaminationDetails()
	{
		super("Examination Details");
		setSize(1000,600);
		setLocationRelativeTo(null);
		setResizable(false);
		p1=new JPanel();
		p1.setBackground(Color.WHITE);
		setContentPane(p1);
		p1.setLayout(null);
		
		JScrollPane sp=new JScrollPane();
		sp.setBounds(177,220,750,250);
		p1.add(sp);
		
		
		table=new JTable();
		table.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent ev)
			{
				int row=table.getSelectedRow();
				t1.setText(table.getModel().getValueAt(row, 10).toString());
			}
		    }
				
				);
		
		table.setBackground(new Color(240,248,255));
		table.setForeground(Color.DARK_GRAY);
		table.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		sp.setViewportView(table);
		
		b1=new JButton("Result");
		b1.setBounds(390,60,100,30);
		b1.setBorder(new LineBorder(new Color(255,20,147),2,true));
		b1.setForeground(new Color(199,21,133));
		b1.setFont(new Font("Trebuchet MS",Font.BOLD,18));
		b1.addActionListener(this);
		add(b1);
		
		
		j2=new JLabel("Check Result");
		j2.setBounds(280,10,200,30);
		j2.setForeground(new Color(199,21,133));
		j2.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,30));
		add(j2);
		
		
		t1=new JTextField();
		t1.setBounds(120,62,250,30);
		t1.setBackground(new Color(240,248,255));
		t1.setBorder(new LineBorder(new Color(255,20,147),2,true));
		t1.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,30));
		add(t1);
		t1.setColumns(10);
		
		
				
//		j3=new JLabel("Back");
//		j3.setBounds(80,62,90,30);
		JLabel j3=new JLabel("Back");
        j3.setBounds(45,62,140,30);
        j3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));

        add(j3);
        
		
		ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("mypack/icons/tenth.png"));
		Image im2=i11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ImageIcon i12=new ImageIcon(im2);
        j3.setIcon(i12);
        
        j3.addMouseListener(new MouseAdapter()
		{
	      public void mouseClicked(MouseEvent er)
	      {
	    	  setVisible(false);
	    	  new Project().setVisible(true);
	      }
		});
		
		p=new JPanel();
		p.setBorder(new TitledBorder(new LineBorder(new Color(0,128,128),3,true),"Book-Details",
				TitledBorder.LEADING,TitledBorder.TOP , null, new Color(0,128,0)));
		p.setBounds(150,140,800,368);
		add(p);
		p.setBackground(Color.WHITE);
		Book();
		
		
		
		
		
		
		
		
		
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ev)
	{
		try
		{
			Conn cc=new Conn();
			if(ev.getSource()==b1)
			{
				new Marks(t1.getText()).setVisible(true);
				this.setVisible(false);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		 new ExaminationDetails();
	}

}
