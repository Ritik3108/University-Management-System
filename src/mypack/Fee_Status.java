
package mypack;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Fee_Status extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblJob;
	private JLabel lblName;
	private JLabel lblDepartment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					new Fee_Status().setVisible(true);
				} 
				
	
	public void close()
	{
		this.dispose();
	}
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Fee_Status() {
		//conn = Javaconnect.getDBConnection();
		super("ManagerInfo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1300, 600);
		 setLocationRelativeTo(null);
			setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 34, 1280, 450);
		contentPane.add(table);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
                                    Conn c = new Conn();
				String displayCustomersql = "select * from fee";
				ResultSet rs = c.s.executeQuery(displayCustomersql);
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
			
		});
		btnLoadData.setBounds(550, 500, 120, 30);
                btnLoadData.setBackground(Color.BLACK);
                btnLoadData.setForeground(Color.WHITE);
		contentPane.add(btnLoadData);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Project().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(710, 500, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
		
		lblNewLabel = new JLabel("Roll No.");
		lblNewLabel.setBounds(51, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblJob = new JLabel("Name");
		lblJob.setBounds(180, 11, 46, 14);
		contentPane.add(lblJob);
		
		lblName = new JLabel("Father's Name");
		lblName.setBounds(303, 11, 86, 14);
		contentPane.add(lblName);
		
		lblDepartment = new JLabel("Course");
		lblDepartment.setBounds(466, 11, 86, 14);
		contentPane.add(lblDepartment);
                
                JLabel l1 = new JLabel("Branch");
		l1.setBounds(586, 11, 86, 14);
		contentPane.add(l1);
                
                JLabel l2 = new JLabel("Phone");
		l2.setBounds(736, 11, 86, 14);
		contentPane.add(l2);
                
                JLabel l3 = new JLabel("Total Amount");
		l3.setBounds(876, 11, 86, 14);
		contentPane.add(l3);
                
                JLabel l4 = new JLabel("Amount Paid");
		l4.setBounds(1011, 11, 86, 14);
		contentPane.add(l4);
		
		 JLabel l5 = new JLabel("Balance");
			l5.setBounds(1186, 11, 86, 14);
			contentPane.add(l5);
                
                getContentPane().setBackground(Color.WHITE);
	}
}