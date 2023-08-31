package gymmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class customerWindow {


		// TODO Auto-generated method stub
		JFrame frame3= new JFrame();
		customerWindow() throws SQLException, Exception
		{
			
//			
//			frame3.getContentPane().setBackground(Color.white);
//			frame3.setSize(450,525);
//			frame3.setTitle("Customer Login");
//			frame3.setLayout(null);
			
			JTextField customerID= new JTextField(5);
			JPasswordField pass= new JPasswordField(5);
			
			Object[] message= {
					"Customer ID:",customerID,
					"Password:", pass
			};
			
		
			
			
			int option = JOptionPane.showConfirmDialog(null, message,"Login", JOptionPane.OK_CANCEL_OPTION);
			 if(option == JOptionPane.OK_OPTION)
			 {
				 sqlcustomer sqlc= new sqlcustomer();
				 int id= Integer.parseInt(customerID.getText());
				 
				 
				 customer n= sqlc.viewCustomer(id);
				 
				 String cid= String.valueOf(id);
				 String password= n.password;
				 if(customerID.getText().equals(cid) && pass.getText().equals(password))
				 {
//					 JOptionPane.showMessageDialog(null,"Welcome","Login successful",JOptionPane.PLAIN_MESSAGE);
					 JFrame user= new JFrame();
						user.getContentPane().setBackground(Color.white);
						user.setSize(450,525);
						user.setTitle("Customer Operations");
						user.setLayout(null);
						user.setLocationRelativeTo(null);
						
						
						ImageIcon background1=new ImageIcon("lake.png");
					    Image img1=background1.getImage();
					    Image temp1=img1.getScaledInstance(1000,900,Image.SCALE_SMOOTH);
					    background1=new ImageIcon(temp1);
					    JLabel back1=new JLabel(background1);
					    back1.setLayout(null);
					    back1.setBounds(0,0,500,540);
					    user.add(back1);
					  
					  
					 JButton button1= new JButton("View Plan");
						
						button1.setBounds(130, 130, 200, 25);
						button1.addActionListener(new ActionListener() 
						{	
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								
							}		
						});
                       JButton button6= new JButton("View Diet Chart");
						
						button6.setBounds(130, 170, 200, 25);
						button6.addActionListener(new ActionListener() 
						{	
							@Override
							public void actionPerformed(ActionEvent e) {
							
								// TODO Auto-generated method stub
//								JTable table;
								
								sqlcustomer sqlc = new sqlcustomer();
								try {
									customer n1= sqlc.viewCustomer(id);
									
									if(n1.dietchart== false)
									{
										JOptionPane.showMessageDialog(null,"Diet chart not created ","No Entry",JOptionPane.WARNING_MESSAGE);
									}
									else if(n1.dietchart== true) 
									{

										JFrame frame2= new JFrame();
										frame2.getContentPane().setBackground(Color.white);
										frame2.setSize(730,400);
										frame2.setTitle("Diet");
										frame2.setLayout(null);
										frame2.setLocationRelativeTo(null);
										
										sqldiet dc= new sqldiet();
										
										
										try {
											ArrayList<diet> n=new ArrayList<diet>();
											n= dc.adddiet(id);
											int x=65;int x1=150;int x2= 235;int x3=320;int x4=405;int x5=490;int x6=575;
											int y=61;int y1=61;int y2= 61;int y3=61;int y4=61;int y5=61;int y6=61;
											
											
											for(int i=0; i< n.size(); i++ )
											{
												
												diet temp=n.get(i);
												
												 JLabel label7 = new JLabel("Customised Diet Chart");
											     label7.setBounds(300, 31, 200, 20);
												 frame2.getContentPane().add(label7);
													
												Border blackline = BorderFactory.createLineBorder(Color.black);
												String spaces = "  ";
											    JLabel label = new JLabel(spaces + temp.day + spaces);
											    label.setBorder(blackline);
												label.setBounds(x, y, 86, 20);
												y= y+30;
												frame2.getContentPane().add(label);
												
												Border blackline1 = BorderFactory.createLineBorder(Color.black);
											    JLabel label1 = new JLabel(spaces + temp.breakfast + spaces);
											    label1.setBorder(blackline1);
												label1.setBounds(x1, y1, 86, 20);
												y1= y1+30;
												frame2.getContentPane().add(label1);
												
												
											    JLabel label2 = new JLabel(spaces + temp.midbreakfast + spaces);
											    label2.setBorder(blackline1);
												label2.setBounds(x2, y2, 86, 20);
												y2= y2+30;
												frame2.getContentPane().add(label2);
												
												 JLabel label3 = new JLabel(spaces + temp.lunch + spaces);
												 label3.setBorder(blackline1);
											     label3.setBounds(x3, y3, 86, 20);
												 y3= y3+30;
												 frame2.getContentPane().add(label3);
												 
												 JLabel label4 = new JLabel(spaces + temp.afterlunch + spaces);
												 label4.setBorder(blackline1);
											     label4.setBounds(x4, y4, 86, 20);
												 y4= y4+30;
												 frame2.getContentPane().add(label4);
												 
												 JLabel label5 = new JLabel(spaces + temp.evening + spaces);
												 label5.setBorder(blackline1);
											     label5.setBounds(x5, y5, 86, 20);
												 y5= y5+30;
												 frame2.getContentPane().add(label5);
												 
												 JLabel label6 = new JLabel(spaces + temp.dinner + spaces);
												 label6.setBorder(blackline1);
											     label6.setBounds(x6, y6, 86, 20);
												 y6= y6+30;
												 frame2.getContentPane().add(label6);
												
												frame2.setVisible(true);
											}
											
										} catch (Exception e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
									}
										
									
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								
							}
								
									
						});
						
						
						JButton button2= new JButton("View Training Routine");
						button2.setBounds(130, 210, 200, 25);
						button2.addActionListener(new ActionListener() 
						{
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								sqlcustomer sqlc = new sqlcustomer();
								try {
									customer n1= sqlc.viewCustomer(id);
									
									if(n1.exercise == false)
									{
										JOptionPane.showMessageDialog(null,"Exercise routine not created ","No Entry",JOptionPane.WARNING_MESSAGE);
									}
									else if(n1.exercise== true)
									{
										JFrame frame2= new JFrame();
										frame2.getContentPane().setBackground(Color.white);
										frame2.setSize(880,500);
										frame2.setTitle("Exercise");
										frame2.setLayout(null);
										frame2.setLocationRelativeTo(null);
									
										sqlexercise se= new sqlexercise();
										try {
											ArrayList<exercise> n2=new ArrayList<exercise>();
											n2= se.addexercise(id);
											int x=65;int x1=150;int x2= 320;int x3=490;int x4=660;
											int y=61;int y1=61;int y2= 61;int y3=61;int y4=61;
											
											
											for(int i1=0; i1< n2.size(); i1++ )
												{
													exercise temp1=n2.get(i1);
													
													JLabel label7 = new JLabel("Customised Exercise Routine");
												    label7.setBounds(350, 31, 200, 20);
													frame2.getContentPane().add(label7);
														
													Border blackline = BorderFactory.createLineBorder(Color.black);
													String spaces = "   ";
												    JLabel label = new JLabel(spaces + temp1.day + spaces);
												    label.setBorder(blackline);
													label.setBounds(x, y, 86, 20);
													y= y+30;
													frame2.getContentPane().add(label);
													
													Border blackline1 = BorderFactory.createLineBorder(Color.black);
												    JLabel label1 = new JLabel(spaces + temp1.ex1 + spaces);
												    label1.setBorder(blackline1);
													label1.setBounds(x1, y1, 170, 20);
													y1= y1+30;
													frame2.getContentPane().add(label1);
													
													
												    JLabel label2 = new JLabel(spaces + temp1.ex2 + spaces);
												    label2.setBorder(blackline1);
													label2.setBounds(x2, y2, 170, 20);
													y2= y2+30;
													frame2.getContentPane().add(label2);
													
													 JLabel label3 = new JLabel(spaces + temp1.ex3 + spaces);
													 label3.setBorder(blackline1);
												     label3.setBounds(x3, y3, 170, 20);
													 y3= y3+30;
													 frame2.getContentPane().add(label3);
													 
													 JLabel label4 = new JLabel(spaces + temp1.ex4 + spaces);
													 label4.setBorder(blackline1);
												     label4.setBounds(x4, y4, 170, 20);
													 y4= y4+30;
													 frame2.getContentPane().add(label4);
													 
								
													 JLabel set= new JLabel("1 set - 15 reps");
													 set.setBounds(395, 320, 120, 20);
													 frame2.getContentPane().add(set);
													 
													 
													 
													 JLabel label6= new JLabel("Day 1- Upper Body");
													 label6.setBounds(215, 340, 120, 20);
													 frame2.getContentPane().add(label6);
													 
													 JLabel label8= new JLabel("Day 2- Lower Body");
													 label8.setBounds(340, 340, 120, 20);
													 frame2.getContentPane().add(label8);
													 
													 JLabel label9= new JLabel("Day 3- Rest Day");
													 label9.setBounds(460, 340, 120, 20);
													 frame2.getContentPane().add(label9);
													 
													 
													 JLabel label10= new JLabel("Day 4- Ab Day");
													 label10.setBounds(570, 340, 120, 20);
													 frame2.getContentPane().add(label10);
													 
													 JLabel label11= new JLabel("Day 5- Core Day");
													 label11.setBounds(290, 360, 120, 20);
													 frame2.getContentPane().add(label11);
													 
													 JLabel label12= new JLabel("Day 6- Rest Day");
													 label12.setBounds(400, 360, 120, 20);
													 frame2.getContentPane().add(label12);
													 
													 JLabel label13= new JLabel("Day 7- Full Body");
													 label13.setBounds(510, 360, 120, 20);
													 frame2.getContentPane().add(label13);
													 
													 
													 
												
													
													frame2.setVisible(true);
												}
											
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									
									
									
								}
									
										
									
									
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								
								
								
								
											
									
//									}
//								} catch (SQLException e1) {
//									// TODO Auto-generated catch block
//									e1.printStackTrace();
//								} catch (Exception e1) {
//									// TODO Auto-generated catch block
//									e1.printStackTrace();
//								}
						
							
							}	
							
								
									
						});
						
								
							
						
						
						JButton button3= new JButton("Ratings");
						button3.setBounds(130, 250, 200, 25);
						button3.addActionListener(new ActionListener() 
						{
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
							}		
						});
						
						
						JButton button4= new JButton("Cancel Gym Membership");
						button4.setBounds(130, 290, 200, 25);
						button4.addActionListener(new ActionListener() 
						{
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
							}		
						});
						
						
						JButton button5= new JButton("Go back");
						button5.setBounds(130, 330, 200, 25);
						button5.addActionListener(new ActionListener() 
						{
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								user.dispose();
								Main1.getInstance().getFrameInstance().setVisible(true);
							}		
						});
						
						
				 
				 
						
						
						
						button1.setFocusable(false);
						button2.setFocusable(false);
						button3.setFocusable(false);
						button4.setFocusable(false);
						button5.setFocusable(false);
						button6.setFocusable(false);
						
						button1.setFont(new Font("Garamond", Font.BOLD,12));
						button2.setFont(new Font("Garamond", Font.BOLD,12));
						button3.setFont(new Font("Garamond", Font.BOLD,12));
						button4.setFont(new Font("Garamond", Font.BOLD,12));
						button5.setFont(new Font("Garamond", Font.BOLD,12));
						button6.setFont(new Font("Garamond", Font.BOLD,12));
						
						back1.add(button1);
						back1.add(button2);
						back1.add(button3);
						back1.add(button4);
						back1.add(button5);
						back1.add(button6);
						
						button1.setBackground(Color.white);
						button2.setBackground(Color.white);
						button3.setBackground(Color.white);
						button4.setBackground(Color.white);
						button5.setBackground(Color.white);
						button6.setBackground(Color.white);
						
						user.setVisible(true);
				 }
				 
				 
				 
				 
				 
				 else
				 {
					 JOptionPane.showMessageDialog(null,"Wrong entry","Login failed",JOptionPane.WARNING_MESSAGE);
					 frame3.dispose();
					 Main1.getInstance().getFrameInstance().setVisible(true);
				 }
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(null,"No entry","Login cancelled",JOptionPane.WARNING_MESSAGE);
				  frame3.dispose();
				  Main1.getInstance().getFrameInstance().setVisible(true);
			 }
//			frame3.setVisible(true);

	}

	

}
