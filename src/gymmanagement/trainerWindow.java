package gymmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class trainerWindow {

	JTextField textField;
	JTextField textField1;
	JTextField textField2;
	JTextField textField3;
	JTextField textField4;
	JPasswordField passfield;
	
//	JLabel label2= new JLabel("Welcome");
	trainerWindow()
	{
	
		JFrame frame= new JFrame(); 
		frame.getContentPane().setBackground(Color.black);
		frame.setSize(450,525);
		frame.setTitle("Staff");
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		
		JButton sbutton= new JButton("Supervisor");
		sbutton.setBounds(130, 130, 190, 25);
		sbutton.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				
				frame.setVisible(false);
		
				
				
				JTextField staffID= new JTextField(5);
				JPasswordField pass= new JPasswordField(5);
				
				Object[] message= {
						"Staff ID:",staffID,
						"Password:", pass
				};
				
					int option = JOptionPane.showConfirmDialog(null, message,"Login", JOptionPane.OK_CANCEL_OPTION);
					 if(option == JOptionPane.OK_OPTION)
					 {
						 sqltrainer st= new sqltrainer();
						 int id= Integer.parseInt(staffID.getText());
						 
						 try {
							 Trainer n = st.viewTrainer(id);
							
							 String tid= String.valueOf(id);
							 String password= n.tpassword;

							 
							 if(staffID.getText().equals(tid) && pass.getText().equals(password))
							 {
								 JFrame emp= new JFrame();
									emp.getContentPane().setBackground(Color.white);
									emp.setSize(450,525);
									emp.setTitle("Supervisor Operations");
									emp.setLayout(null);
									emp.setLocationRelativeTo(null);
									
									
									ImageIcon background1=new ImageIcon("black.png");
								    Image img1=background1.getImage();
								    Image temp1=img1.getScaledInstance(1000,900,Image.SCALE_SMOOTH);
								    background1=new ImageIcon(temp1);
								    JLabel back1=new JLabel(background1);
								    back1.setLayout(null);
								    back1.setBounds(0,0,500,540);
								    emp.add(back1);
								    
								    JButton button1= new JButton("Attendance");
									
									button1.setBounds(130, 130, 200, 25);
									button1.addActionListener(new ActionListener() 
									{	
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub	
											
										}		
									});
									
									
									 JButton button3= new JButton("View Schedule");
										
										button3.setBounds(130, 170, 200, 25);
										button3.addActionListener(new ActionListener() 
										{	
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub	
												
											}		
										});
									
									
									JButton button2= new JButton("Customer Diet Chart");
									button2.setBounds(130, 210, 200, 25);
									button2.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											
											sqlcustomer sc= new sqlcustomer();
											try {
										
												ArrayList<customer> n=new ArrayList<customer>();
												n= sc.viewCustomer();
												
												JFrame frame1 = new JFrame();
												
												//if((boolean)n.get(0).get(12)== false)
												{
													
													frame1.setSize(350, 450);
													frame1.setTitle("Diet Chart");
													frame1.setLayout(null);
													frame1.setLocationRelativeTo(null);
													frame1.getContentPane().setBackground(Color.white);
													
													frame1.setVisible(true);
																									
													int x= 65;
													int y= 31;
													int x1=105;
													int x2= 145;
													
													for(int i=0; i< n.size(); i++ )
													{
														customer temp=n.get(i);
													
														
														if(temp.dietchart==false) {
															
														
															JLabel lblid= new JLabel(temp.cid+"");
															lblid.setBounds(x, y, 46, 14);
															frame1.getContentPane().add(lblid);
															
															JLabel lblname= new JLabel(temp.cname+"");
															lblname.setBounds(x1, y, 46, 14);
															frame1.getContentPane().add(lblname);
															
															
															
															JLabel lblchart= new JLabel(temp.dietchart+"");
															lblchart.setBounds(x2, y, 46, 14);
															frame1.getContentPane().add(lblchart);
															System.out.println("here "+y);
														
														    y=y+30;
														    
														    frame1.setVisible(true);
													    
														}
													    
													
				
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
									
									JButton button5= new JButton("Customer Training");
									button5.setBounds(130, 250, 200, 25);
									button5.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											emp.dispose();
											frame.setVisible(true);
//											Main1.getInstance().getFrameInstance().setVisible(true);
											
											sqlcustomer sc= new sqlcustomer();
											try {
										
												ArrayList<customer> n=new ArrayList<customer>();
												n= sc.viewCustomer();
												
												JFrame frame1 = new JFrame();
												
												//if((boolean)n.get(0).get(12)== false)
												{
													
													frame1.setSize(350, 450);
													frame1.setTitle("Diet Chart");
													frame1.setLayout(null);
													frame1.setLocationRelativeTo(null);
													frame1.getContentPane().setBackground(Color.white);
													
													frame1.setVisible(true);
																									
													int x= 65;
													int y= 31;
													int x1=105;
													int x2= 145;
													int x3= 185;
													
													for(int i=0; i< n.size(); i++ )
													{
														customer temp=n.get(i);
													
														
														if(temp.exercise == false) {
															
														
															JLabel lblid= new JLabel(temp.cid+"");
															lblid.setBounds(x, y, 46, 14);
															frame1.getContentPane().add(lblid);
															
															JLabel lblname= new JLabel(temp.cname+"");
															lblname.setBounds(x1, y, 46, 14);
															frame1.getContentPane().add(lblname);
															
															
															
															JLabel lblchart= new JLabel(temp.exercise+"");
															lblchart.setBounds(x2, y, 46, 14);
															frame1.getContentPane().add(lblchart);
															System.out.println("here "+y);
															
															JLabel lbltraining= new JLabel(temp.training+"");
															lbltraining.setBounds(x3, y, 46, 14);
															frame1.getContentPane().add(lbltraining);
															System.out.println("here "+y);
														
														    y=y+30;
														    
														    frame1.setVisible(true);
													    
														}
													    
													
				
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
									
									JButton button4= new JButton("Equipment Status");
									button4.setBounds(130, 290, 200, 25);
									button4.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											
										}		
									});
									
									JButton button7= new JButton("Room Status");
									button7.setBounds(130, 330, 200, 25);
									button7.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											
										}		
									});
									
									
									JButton button6= new JButton("Go back");
									button6.setBounds(130, 370, 200, 25);
									button6.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											emp.dispose();
											frame.setVisible(true);
//											Main1.getInstance().getFrameInstance().setVisible(true);
										}		
									});
									

									button1.setFocusable(false);
									button2.setFocusable(false);
									button3.setFocusable(false);
									button4.setFocusable(false);
									button5.setFocusable(false);
									button6.setFocusable(false);
									button7.setFocusable(false);
									
									button1.setFont(new Font("Garamond", Font.BOLD,12));
									button2.setFont(new Font("Garamond", Font.BOLD,12));
									button3.setFont(new Font("Garamond", Font.BOLD,12));
									button4.setFont(new Font("Garamond", Font.BOLD,12));
									button5.setFont(new Font("Garamond", Font.BOLD,12));
									button6.setFont(new Font("Garamond", Font.BOLD,12));
									button7.setFont(new Font("Garamond", Font.BOLD,12));
									
									back1.add(button1);
									back1.add(button2);
									back1.add(button3);
									back1.add(button4);
									back1.add(button5);
									back1.add(button6);
									back1.add(button7);
									
									button1.setBackground(Color.white);
									button2.setBackground(Color.white);
									button3.setBackground(Color.white);
									button4.setBackground(Color.white);
									button5.setBackground(Color.white);
									button6.setBackground(Color.white);
									button7.setBackground(Color.white);
									
									emp.setVisible(true);
								 
							 }
							 
							 else
							 {
								
								 JOptionPane.showMessageDialog(null,"Wrong Password","Incorrect Creditials",JOptionPane.WARNING_MESSAGE);
							     frame.setVisible(true); 
							 }
							
							
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						 
						 
						 
					
					
					
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(null,"No entry","Login cancelled",JOptionPane.WARNING_MESSAGE);
						 
						  frame.setVisible(true);
					 }
				  }
					
						
						
		
					
					
				
		
			});
		
		JButton tbutton= new JButton("Trainer");
		tbutton.setBounds(130, 170, 190, 25);
		tbutton.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				
				frame.setVisible(false);
		
				
				
				JTextField staffID= new JTextField(5);
				JPasswordField pass= new JPasswordField(5);
				
				Object[] message= {
						"Staff ID:",staffID,
						"Password:", pass
				};
				
					int option = JOptionPane.showConfirmDialog(null, message,"Login", JOptionPane.OK_CANCEL_OPTION);
					 if(option == JOptionPane.OK_OPTION)
					 {
						 sqltrainer st= new sqltrainer();
						 int id= Integer.parseInt(staffID.getText());
						 
						 try {
							 Trainer n = st.viewTrainer(id);
							
							 String tid= String.valueOf(id);
							 String password= n.tpassword;

							 
							 if(staffID.getText().equals(tid) && pass.getText().equals(password))
							 {
								 JFrame emp= new JFrame();
									emp.getContentPane().setBackground(Color.white);
									emp.setSize(450,525);
									emp.setTitle("Trainer Operations");
									emp.setLayout(null);
									emp.setLocationRelativeTo(null);
									
									
									ImageIcon background1=new ImageIcon("black.png");
								    Image img1=background1.getImage();
								    Image temp1=img1.getScaledInstance(1000,900,Image.SCALE_SMOOTH);
								    background1=new ImageIcon(temp1);
								    JLabel back1=new JLabel(background1);
								    back1.setLayout(null);
								    back1.setBounds(0,0,500,540);
								    emp.add(back1);
								    
								    JButton button1= new JButton("Attendance");
									
									button1.setBounds(130, 160, 200, 25);
									button1.addActionListener(new ActionListener() 
									{	
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub	
										}		
									});
									
									
									 JButton button3= new JButton("Add Exercise Routine");
										
										button3.setBounds(130, 200, 200, 25);
										button3.addActionListener(new ActionListener() 
										{	
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												
												sqlcustomer sc= new sqlcustomer();
												ArrayList<customer> n=new ArrayList<customer>();
												
												try {
													n= sc.viewCustomer();
													
													emp.setVisible(false);
													JFrame frame1 = new JFrame();
													frame1.setSize(620, 300);
													frame1.setTitle("Exercise Routine");
													frame1.setLayout(null);
													frame1.setLocationRelativeTo(null);
													frame1.getContentPane().setBackground(Color.white);
													
													frame1.setVisible(true);
													
//													
													int x= 175;
													int y= 61;
													int x1=261;
													int x2= 347;
													
													
													for(int i=0; i< n.size(); i++ )
													{
														
														customer temp= n.get(i);
													
										
														
														if( temp.exercise== false)
														{
															 JLabel label7 = new JLabel("Unassigned Customers");
														     label7.setBounds(235, 31, 200, 20);
															 frame1.getContentPane().add(label7);
															
															Border blackline = BorderFactory.createLineBorder(Color.black);
															String spaces = "  ";
														    JLabel label = new JLabel(spaces + temp.cid + spaces);
														    label.setBorder(blackline);
															label.setBounds(x, y, 86, 20);
															
															frame1.getContentPane().add(label);
															
															 JLabel label1 = new JLabel(spaces + temp.cname + spaces);
															 label1.setBorder(blackline);
														     label1.setBounds(x1, y, 86, 20);
															 frame1.getContentPane().add(label1);
															
															JLabel label2= new JLabel(spaces + temp.training+ spaces);
															label2.setBorder(blackline);
															label2.setBounds(x2, y, 86, 20);
															frame1.getContentPane().add(label2);
															
															
			
					
														    y=y+20;
														}
														

													    JButton button = new JButton("Add exercise routine");
														button.setBounds(230, 230, 170, 15);
														button.setBackground(Color.lightGray);
														frame1.add(button);
														button.setFocusable(false);
														
														button.setFocusable(false);
														button.addActionListener(new ActionListener() 
														{
															@Override
															public void actionPerformed(ActionEvent e) {
																// TODO Auto-generated method stub
																
																String addexid= JOptionPane.showInputDialog("Enter Customer ID");
																
																int id= Integer.parseInt(addexid);
																sqlcustomer sc= new sqlcustomer();
																try {
																	customer n= sc.viewCustomer(id);
																	JFrame frame2= new JFrame();
																	frame2.getContentPane().setBackground(Color.white);
																	frame2.setSize(630,400);
																	frame2.setTitle("Adding Exercise Routine");
																	frame2.setLayout(null);
																	frame2.setLocationRelativeTo(null);
																	
																	
																		JLabel day= new JLabel("Day");
																		day.setBounds(65, 31, 100, 15);
																		frame2.getContentPane().add(day);
																		
																		JComboBox<String> comboBoxday = new JComboBox<String>();
																		comboBoxday.addItem("Select");
																		
																		comboBoxday.addItem("Day 1");comboBoxday.addItem("Day 2");
																		comboBoxday.addItem("Day 3");comboBoxday.addItem("Day 4");
																		comboBoxday.addItem("Day 5");comboBoxday.addItem("Day 6");
																		comboBoxday.addItem("Day 7");
																	
																		comboBoxday.setBounds(180, 31, 91, 20);
																		frame2.getContentPane().add(comboBoxday);
																		
																		JLabel ex1= new JLabel("Exercise 1");
																		ex1.setBounds(65, 61, 140, 20);
																		frame2.getContentPane().add(ex1);
																		
																		JTextField textField= new JTextField();
																		textField.setBounds(180, 61, 140, 20);
																		frame2.getContentPane().add(textField);
																		textField.setColumns(10);
																		
																		
																		JLabel ex2= new JLabel("Exercise 2");
																		ex2.setBounds(65, 91, 140, 20);
																		frame2.getContentPane().add(ex2);
																		
																		JTextField textField1= new JTextField();
																		textField1.setBounds(180, 91, 140, 20);
																		frame2.getContentPane().add(textField1);
																		textField1.setColumns(10);
																		
																	
																		JLabel ex3= new JLabel("Exercise 3");
																		ex3.setBounds(65, 121, 140, 20);
																		frame2.getContentPane().add(ex3);
																		
																		JTextField textField2= new JTextField();
																		textField2.setBounds(180, 121, 140, 20);
																		frame2.getContentPane().add(textField2);
																		textField2.setColumns(10);
																		
																		
																		JLabel ex4= new JLabel("Exercise 4");
																		ex4.setBounds(65, 151, 140, 20);
																		frame2.getContentPane().add(ex4);
																		
																		JTextField textField3= new JTextField();
																		textField3.setBounds(180, 151, 140, 20);
																		frame2.getContentPane().add(textField3);
																		textField3.setColumns(10);
																		
																		JButton submit= new JButton("Submit");
																		submit.setBounds(65, 301, 86, 15);
																		frame2.getContentPane().add(submit);
																		
																		JButton clear= new JButton("Clear");
																		clear.setBounds(165, 301, 86, 15);
																		frame2.getContentPane().add(clear);
																		
																		JButton done= new JButton("Done");
																		done.setBounds(265, 301, 86, 15);
																		frame2.getContentPane().add(done);
																		
																		submit.addActionListener(new ActionListener() 
																		{	
																			@Override
																			public void actionPerformed(ActionEvent e) {
																				// TODO Auto-generated method stub	
																				if( textField.getText().isEmpty()|| textField1.getText().isEmpty() || textField2.getText().isEmpty()|| textField3.getText().isEmpty()|| comboBoxday.getSelectedItem().equals("Select"))
																				{
																					JOptionPane.showMessageDialog(null, "Data Missing");
																				}
																				else
																				{
																					JOptionPane.showMessageDialog(null, "Data Submitted");
//																					breakfast.setText(null);
//																					midbreakfast.setText(null);
//																					lunch.setText(null);
//																					afterlunch.setText(null);
//																					evening.setText(null);
//																					dinner.setText(null);
//																					comboBoxday.setSelectedItem("Select");
																					
																					String day=null;
																					if(comboBoxday.getSelectedItem().equals("Day 1"))
																					{
																						day="Day 1";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 2"))
																					{
																						day="Day 2";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 3"))
																					{
																						day="Day 3";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 4"))
																					{
																						day="Day 4";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 5"))
																					{
																						day="Day 5";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 6"))
																					{
																						day="Day 6";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 7"))
																					{
																						day="Day 7";
																					}
																					
																					Date date1= new Date();
																					SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
																					String datenow= format.format(date1);
																					
																					java.util.Date date = null;
																					try {
																						date = format.parse(datenow);
																					} catch (ParseException e1) {
																						// TODO Auto-generated catch block
																						e1.printStackTrace();
																					}
																					java.sql.Date sqldate= new java.sql.Date(date.getTime());
																					
																					String ex1= textField.getText();
																					String ex2= textField1.getText();
																					String ex3= textField2.getText();
																					String ex4= textField3.getText();
																					
																					
																					exercise e1= new exercise(day, id, ex1, ex2, ex3, ex4, sqldate);
																					sqlexercise sqle= new sqlexercise();
																					
																					try {
																						sqle.addexercise(e1);
																					} catch (Exception e2) {
																						// TODO Auto-generated catch block
																						e2.printStackTrace();
																					}
																					
																					
																					
																					
																				}
																				
																				
																			}		
																		});
																		
																		clear.addActionListener(new ActionListener() 
																		{
																			@Override
																			public void actionPerformed(ActionEvent e) {
																				// TODO Auto-generated method stub
																				textField.setText(null);
																				textField1.setText(null);
																				textField2.setText(null);
																				textField3.setText(null);
																	
																				
																				comboBoxday.setSelectedItem("Select");
																			}		
																		});
																		
																		done.addActionListener(new ActionListener() 
																		{
																			@Override
																			public void actionPerformed(ActionEvent e) {
																				// TODO Auto-generated method stub
																				JOptionPane.showMessageDialog(null,"Exercise Routine Created","Data Submitted",JOptionPane.INFORMATION_MESSAGE);
																				textField.setText(null);
																				textField1.setText(null);
																				textField2.setText(null);
																				textField3.setText(null);
																				comboBoxday.setSelectedItem("Select");
																				sqlexercise se= new sqlexercise();
																				try {
																					se.updateexercise(id);
																				} catch (Exception e1) {
																					// TODO Auto-generated catch block
																					e1.printStackTrace();
																				}
																			}		
																		});
																		
																
																		frame2.setVisible(true);
																		
																			
															
																	
																	
																} catch (SQLException e1) {
																	// TODO Auto-generated catch block
																	e1.printStackTrace();
																} catch (Exception e1) {
																	// TODO Auto-generated catch block
																	e1.printStackTrace();
																}
																
														
															}
													
														});
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
									
									
									JButton button5= new JButton("Go back");
									button5.setBounds(130, 240, 200, 25);
									frame.add(button5);
									button5.setFocusable(false);
									button5.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											emp.dispose();
											frame.setVisible(true);
//											Main1.getInstance().getFrameInstance().setVisible(true);
										}		
									});
									

									button1.setFocusable(false);
									button3.setFocusable(false);
									button5.setFocusable(false);
									
									button1.setFont(new Font("Garamond", Font.BOLD,12));
									button3.setFont(new Font("Garamond", Font.BOLD,12));
									button5.setFont(new Font("Garamond", Font.BOLD,12));
									
									back1.add(button1);
									back1.add(button3);
									back1.add(button5);
									
									button1.setBackground(Color.white);
									button3.setBackground(Color.white);
									button5.setBackground(Color.white);
									
									emp.setVisible(true);
								 
							 }
							 
							 else
							 {
								
								 JOptionPane.showMessageDialog(null,"Wrong Password","Incorrect Creditials",JOptionPane.WARNING_MESSAGE);
							     frame.setVisible(true); 
							 }
							
							
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						 
						 
						 
					
					
					
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(null,"No entry","Login cancelled",JOptionPane.WARNING_MESSAGE);
						 
						  frame.setVisible(true);
					 }
				  }
					
						
						
		
					
					
				
		
			});
		JButton ncbutton= new JButton("Nutrition Consultant");
		ncbutton.setBounds(130, 210, 190, 25);
		ncbutton.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				
				frame.setVisible(false);
		
				
				
				JTextField staffID= new JTextField(5);
				JPasswordField pass= new JPasswordField(5);
				
				Object[] message= {
						"Staff ID:",staffID,
						"Password:", pass
				};
				
					int option = JOptionPane.showConfirmDialog(null, message,"Login", JOptionPane.OK_CANCEL_OPTION);
					 if(option == JOptionPane.OK_OPTION)
					 {
						 sqltrainer st= new sqltrainer();
						 int id= Integer.parseInt(staffID.getText());
						 
						 try {
							 Trainer n = st.viewTrainer(id);
							
							 String tid= String.valueOf(id);
							 String password= n.tpassword;

							 
							 if(staffID.getText().equals(tid) && pass.getText().equals(password))
							 {
								 JFrame emp= new JFrame();
									emp.getContentPane().setBackground(Color.white);
									emp.setSize(450,525);
									emp.setTitle("Nutrition Consultant Operations");
									emp.setLayout(null);
									emp.setLocationRelativeTo(null);
									
									
									ImageIcon background1=new ImageIcon("black.png");
								    Image img1=background1.getImage();
								    Image temp1=img1.getScaledInstance(1000,900,Image.SCALE_SMOOTH);
								    background1=new ImageIcon(temp1);
								    JLabel back1=new JLabel(background1);
								    back1.setLayout(null);
								    back1.setBounds(0,0,500,540);
								    emp.add(back1);
								    
								    JButton button1= new JButton("Attendance");
									
									button1.setBounds(130, 160, 200, 25);
									button1.addActionListener(new ActionListener() 
									{	
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub	
										}		
									});
									
									
									 JButton button3= new JButton("Diet Chart");
										
										button3.setBounds(130, 200, 200, 25);
										button3.addActionListener(new ActionListener() 
										{	
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub	
												

												sqlcustomer sc= new sqlcustomer();
												try {
													
													ArrayList<customer> n=new ArrayList<customer>();
													
													n= sc.viewCustomer();
//													
//													if(c2.dietchart== false)
													{
														emp.setVisible(false);
														JFrame frame1 = new JFrame();
														frame1.setSize(630, 400);
														frame1.setTitle("Diet Chart");
														frame1.setLayout(null);
														frame1.setLocationRelativeTo(null);
														frame1.getContentPane().setBackground(Color.white);
														
														frame1.setVisible(true);
														
//														
														int x= 65;
														int y= 31;
														int x1=105;
														int x2= 145;
														
														for(int i=0; i< n.size(); i++ )
														{
															
															customer temp= n.get(i);
														
											
															
															if( (boolean)temp.dietchart== false)
															{
															JLabel lblid= new JLabel(temp.cid+"");
															lblid.setBounds(x, y, 46, 14);
															frame1.getContentPane().add(lblid);
															
															JLabel lblname= new JLabel(temp.cname+"");
															lblname.setBounds(x1, y, 46, 14);
															frame1.getContentPane().add(lblname);
															
															JLabel lblfood= new JLabel(temp.preference+"");
															lblfood.setBounds(x2, y, 46, 14);
															frame1.getContentPane().add(lblfood);
			
					
														    y=y+30;
															}
														    
														    
														}
														
														
														    JButton button = new JButton("Add diet Chart");
															button.setBounds(65, 330, 100, 15);
															
															button.setFocusable(false);
															button.addActionListener(new ActionListener() 
															{
																@Override
																public void actionPerformed(ActionEvent e) {
																	// TODO Auto-generated method stub
																	
																	String adddietid= JOptionPane.showInputDialog("Enter Customer ID");
																	
																	int id= Integer.parseInt(adddietid);
																	sqlcustomer sc= new sqlcustomer();
																	try {
																		customer c3= sc.viewCustomer(id);
																
																		JFrame frame2= new JFrame();
																		frame2.getContentPane().setBackground(Color.white);
																		frame2.setSize(630,400);
																		frame2.setTitle("Adding Diet Chart");
																		frame2.setLayout(null);
																		frame2.setLocationRelativeTo(null);
																		
																		JLabel day= new JLabel("Day");
																		day.setBounds(65, 31, 100, 15);
																		frame2.getContentPane().add(day);
																		
																		JComboBox<String> comboBoxday = new JComboBox<String>();
																		comboBoxday.addItem("Select");
																		
																		comboBoxday.addItem("Day 1");comboBoxday.addItem("Day 2");
																		comboBoxday.addItem("Day 3");comboBoxday.addItem("Day 4");
																		comboBoxday.addItem("Day 5");comboBoxday.addItem("Day 6");
																		comboBoxday.addItem("Day 7");
																		
																		
																		comboBoxday.setBounds(180, 31, 91, 20);
																		frame2.getContentPane().add(comboBoxday);
																		
																		JLabel bf= new JLabel("Breakfast");
																		bf.setBounds(65, 61, 100, 15);
																		frame2.getContentPane().add(bf);
																		
																		JTextField textField= new JTextField();
																		textField.setBounds(180, 61, 100, 15);
																		frame2.getContentPane().add(textField);
																		textField.setColumns(10);
																		
																		
																		JLabel mbf= new JLabel("Mid Breakfast");
																		mbf.setBounds(65, 91, 100, 15);
																		frame2.getContentPane().add(mbf);
																		
																		JTextField textField1= new JTextField();
																		textField1.setBounds(180, 91, 100, 15);
																		frame2.getContentPane().add(textField1);
																		textField1.setColumns(10);
																		
																		JLabel lun= new JLabel("Lunch");
																		lun.setBounds(65, 121, 100, 15);
																		frame2.getContentPane().add(lun);
																		
																		JTextField textField2= new JTextField();
																		textField2.setBounds(180, 121, 100, 15);
																		frame2.getContentPane().add(textField2);
																		textField2.setColumns(10);
																		
																		JLabel afterlun= new JLabel("After Lunch");
																		afterlun.setBounds(65, 151, 100, 15);
																		frame2.getContentPane().add(afterlun);
																		
																		JTextField textField3= new JTextField();
																		textField3.setBounds(180, 151, 100, 15);
																		frame2.getContentPane().add(textField3);
																		textField3.setColumns(10);
																		
																		JLabel eve= new JLabel("Evening");
																		eve.setBounds(65, 181, 100, 15);
																		frame2.getContentPane().add(eve);
																		
																		JTextField textField4= new JTextField();
																		textField4.setBounds(180, 181, 100, 15);
																		frame2.getContentPane().add(textField4);
																		textField4.setColumns(10);
																		
																		JLabel din= new JLabel("Dinner");
																		din.setBounds(65, 211, 100, 15);
																		frame2.getContentPane().add(din);
																		
																		JTextField textField5= new JTextField();
																		textField5.setBounds(180, 211, 100, 15);
																		frame2.getContentPane().add(textField5);
																		textField5.setColumns(10);
																		
																		JButton submit= new JButton("Submit");
																		submit.setBounds(65, 301, 100, 15);
																		frame2.getContentPane().add(submit);
																		
																		JButton clear= new JButton("Clear");
																		clear.setBounds(165, 301, 100, 15);
																		frame2.getContentPane().add(clear);
																		
																		JButton done= new JButton("Done");
																		done.setBounds(265, 301, 100, 15);
																		frame2.getContentPane().add(done);
																		
																		submit.addActionListener(new ActionListener() 
																		{	
																			@Override
																			public void actionPerformed(ActionEvent e) {
																				// TODO Auto-generated method stub	
																				if( textField.getText().isEmpty()|| textField1.getText().isEmpty() || textField2.getText().isEmpty()|| textField3.getText().isEmpty()|| textField4.getText().isEmpty()|| textField5.getText().isEmpty()|| comboBoxday.getSelectedItem().equals("Select"))
																				{
																					JOptionPane.showMessageDialog(null, "Data Missing");
																				}
																				else
																				{
																					JOptionPane.showMessageDialog(null, "Data Submitted");
//																					breakfast.setText(null);
//																					midbreakfast.setText(null);
//																					lunch.setText(null);
//																					afterlunch.setText(null);
//																					evening.setText(null);
//																					dinner.setText(null);
//																					comboBoxday.setSelectedItem("Select");
																					
																					String day=null;
																					if(comboBoxday.getSelectedItem().equals("Day 1"))
																					{
																						day="Day 1";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 2"))
																					{
																						day="Day 2";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 3"))
																					{
																						day="Day 3";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 4"))
																					{
																						day="Day 4";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 5"))
																					{
																						day="Day 5";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 6"))
																					{
																						day="Day 6";
																					}
																					else if(comboBoxday.getSelectedItem().equals("Day 7"))
																					{
																						day="Day 7";
																					}
																					
																					Date date1= new Date();
																					SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
																					String datenow= format.format(date1);
																					
																					java.util.Date date = null;
																					try {
																						date = format.parse(datenow);
																					} catch (ParseException e1) {
																						// TODO Auto-generated catch block
																						e1.printStackTrace();
																					}
																					java.sql.Date sqldate= new java.sql.Date(date.getTime());
																					
																					String breakf= textField.getText();
																					String midbreak= textField1.getText();
																					String lun= textField2.getText();
																					String afterlun= textField3.getText();
																					String eve= textField4.getText();
																					String din= textField5.getText();
																					
																					diet d= new diet(day, id, breakf, midbreak, lun, afterlun, eve, din, sqldate);
																					sqldiet dc= new sqldiet();
																					try {
																						dc.adddiet(d);
																					} catch (Exception e1) {
																						// TODO Auto-generated catch block
																						e1.printStackTrace();
																					}
																				}
																				
																				
																			}		
																		});
																		
																		clear.addActionListener(new ActionListener() 
																		{
																			@Override
																			public void actionPerformed(ActionEvent e) {
																				// TODO Auto-generated method stub
																				textField.setText(null);
																				textField1.setText(null);
																				textField2.setText(null);
																				textField3.setText(null);
																				textField4.setText(null);
																				textField5.setText(null);
																				comboBoxday.setSelectedItem("Select");
																			}		
																		});
																		done.addActionListener(new ActionListener() 
																		{
																			@Override
																			public void actionPerformed(ActionEvent e) {
																				// TODO Auto-generated method stub
																				JOptionPane.showMessageDialog(null,"Diet chart created","Data Submitted",JOptionPane.INFORMATION_MESSAGE);
																				textField.setText(null);
																				textField1.setText(null);
																				textField2.setText(null);
																				textField3.setText(null);
																				textField4.setText(null);
																				textField5.setText(null);
																				comboBoxday.setSelectedItem("Select");
																				sqldiet sd= new sqldiet();
																				try {
																					sd.updatediet(id);
																				} catch (Exception e1) {
																					// TODO Auto-generated catch block
																					e1.printStackTrace();
																				}
																			}		
																		});
																		
																
																		frame2.setVisible(true);
																		
																		
																	} catch (SQLException e1) {
																		// TODO Auto-generated catch block
																		e1.printStackTrace();
																	} catch (Exception e1) {
																		// TODO Auto-generated catch block
																		e1.printStackTrace();
																	}
																	
														
																}		
															});
															
													   JButton back = new JButton("go back");
													   back.setBounds(165, 330, 89, 15);
													   
													   back.addActionListener(new ActionListener() 
														{	
															@Override
															public void actionPerformed(ActionEvent e) {
																// TODO Auto-generated method stub	
															
																emp.setVisible(true);
																frame1.dispose();
															}		
														});
														
														frame1.add(button);
														frame1.add(back);
													
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
										
												
												
							
									
									

									
									JButton button5= new JButton("Go back");
									button5.setBounds(130, 240, 200, 25);
									button5.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											emp.dispose();
											frame.setVisible(true);
//											Main1.getInstance().getFrameInstance().setVisible(true);
										}		
									});
									

									button1.setFocusable(false);
									button3.setFocusable(false);
									button5.setFocusable(false);
									
									button1.setFont(new Font("Garamond", Font.BOLD,12));
									button3.setFont(new Font("Garamond", Font.BOLD,12));
									button5.setFont(new Font("Garamond", Font.BOLD,12));
									
									back1.add(button1);
									back1.add(button3);
									back1.add(button5);
									
									button1.setBackground(Color.white);
									button3.setBackground(Color.white);
									button5.setBackground(Color.white);
									
									emp.setVisible(true);
								 
							 }
							 
							 else
							 {
								
								 JOptionPane.showMessageDialog(null,"Wrong Password","Incorrect Creditials",JOptionPane.WARNING_MESSAGE);
							     frame.setVisible(true); 
							 }
							
							
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(null,"No entry","Login cancelled",JOptionPane.WARNING_MESSAGE);
						 
						  frame.setVisible(true);
					 }
				  }
	
		
			});
		JButton techbutton= new JButton("Technician");
		techbutton.setBounds(130, 250, 190, 25);
		techbutton.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				
				frame.setVisible(false);
		
				
				
				JTextField staffID= new JTextField(5);
				JPasswordField pass= new JPasswordField(5);
				
				Object[] message= {
						"Staff ID:",staffID,
						"Password:", pass
				};
				
					int option = JOptionPane.showConfirmDialog(null, message,"Login", JOptionPane.OK_CANCEL_OPTION);
					 if(option == JOptionPane.OK_OPTION)
					 {
						 sqltrainer st= new sqltrainer();
						 int id= Integer.parseInt(staffID.getText());
						 
						 try {
							 Trainer n = st.viewTrainer(id);
							
							 String tid= String.valueOf(id);
							 String password= n.tpassword;

							 
							 if(staffID.getText().equals(tid) && pass.getText().equals(password))
							 {
								 JFrame emp= new JFrame();
									emp.getContentPane().setBackground(Color.white);
									emp.setSize(450,525);
									emp.setTitle("Technician Operations");
									emp.setLayout(null);
									emp.setLocationRelativeTo(null);
									
									
									ImageIcon background1=new ImageIcon("black.png");
								    Image img1=background1.getImage();
								    Image temp1=img1.getScaledInstance(1000,900,Image.SCALE_SMOOTH);
								    background1=new ImageIcon(temp1);
								    JLabel back1=new JLabel(background1);
								    back1.setLayout(null);
								    back1.setBounds(0,0,500,540);
								    emp.add(back1);
								    
								    JButton button1= new JButton("Attendance");
									
									button1.setBounds(130, 160, 200, 25);
									button1.addActionListener(new ActionListener() 
									{	
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub	
										}		
									});
									
									
					
									JButton button4= new JButton("Equipment");
									button4.setBounds(130, 200, 200, 25);
									button4.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											
										}		
									});
									
									JButton button5= new JButton("Go back");
									button5.setBounds(130, 240, 200, 25);
									button5.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											emp.dispose();
											frame.setVisible(true);
//											Main1.getInstance().getFrameInstance().setVisible(true);
										}		
									});
									

									button1.setFocusable(false);
									button4.setFocusable(false);
									button5.setFocusable(false);
									
									button1.setFont(new Font("Garamond", Font.BOLD,12));
									button4.setFont(new Font("Garamond", Font.BOLD,12));
									button5.setFont(new Font("Garamond", Font.BOLD,12));
									
									back1.add(button1);
									back1.add(button4);
									back1.add(button5);
									
									button1.setBackground(Color.white);
									button4.setBackground(Color.white);
									button5.setBackground(Color.white);
									
									emp.setVisible(true);
								 
							 }
							 
							 else
							 {
								
								 JOptionPane.showMessageDialog(null,"Wrong Password","Incorrect Creditials",JOptionPane.WARNING_MESSAGE);
							     frame.setVisible(true); 
							 }
							
							
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						 
			
					
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(null,"No entry","Login cancelled",JOptionPane.WARNING_MESSAGE);
						 
						  frame.setVisible(true);
					 }
				  }
					
						
			});
		JButton cbutton= new JButton("Cleaner");
		cbutton.setBounds(130, 290, 190, 25);
		cbutton.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				
				frame.setVisible(false);
		
				
				
				JTextField staffID= new JTextField(5);
				JPasswordField pass= new JPasswordField(5);
				
				Object[] message= {
						"Staff ID:",staffID,
						"Password:", pass
				};
				
					int option = JOptionPane.showConfirmDialog(null, message,"Login", JOptionPane.OK_CANCEL_OPTION);
					 if(option == JOptionPane.OK_OPTION)
					 {
						 sqltrainer st= new sqltrainer();
						 int id= Integer.parseInt(staffID.getText());
						 
						 try {
							 Trainer n = st.viewTrainer(id);
							
							 String tid= String.valueOf(id);
							 String password= n.tpassword;

							 
							 if(staffID.getText().equals(tid) && pass.getText().equals(password))
							 {
								 JFrame emp= new JFrame();
									emp.getContentPane().setBackground(Color.white);
									emp.setSize(450,525);
									emp.setTitle("Cleaner Operations");
									emp.setLayout(null);
									emp.setLocationRelativeTo(null);
									
									
									ImageIcon background1=new ImageIcon("black.png");
								    Image img1=background1.getImage();
								    Image temp1=img1.getScaledInstance(1000,900,Image.SCALE_SMOOTH);
								    background1=new ImageIcon(temp1);
								    JLabel back1=new JLabel(background1);
								    back1.setLayout(null);
								    back1.setBounds(0,0,500,540);
								    emp.add(back1);
								    
								    JButton button1= new JButton("Attendance");
									
									button1.setBounds(130, 160, 200, 25);
									button1.addActionListener(new ActionListener() 
									{	
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub	
										}		
									});
									
									JButton button2= new JButton("Rooms");
									button2.setBounds(130, 200, 200, 25);
									button2.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											
										}		
									});
								
									
									JButton button5= new JButton("Go back");
									button5.setBounds(130, 240, 200, 25);
									button5.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											emp.dispose();
											frame.setVisible(true);
//											Main1.getInstance().getFrameInstance().setVisible(true);
										}		
									});
									

									button1.setFocusable(false);
									button2.setFocusable(false);	
									button5.setFocusable(false);
									
									
									button1.setFont(new Font("Garamond", Font.BOLD,12));
									button2.setFont(new Font("Garamond", Font.BOLD,12));
									button5.setFont(new Font("Garamond", Font.BOLD,12));
									
									
									back1.add(button1);
									back1.add(button2);
									back1.add(button5);
									
									button1.setBackground(Color.white);
									button2.setBackground(Color.white);
									button5.setBackground(Color.white);
									
									emp.setVisible(true);
								 
							 }
							 
							 else
							 {
								
								 JOptionPane.showMessageDialog(null,"Wrong Password","Incorrect Creditials",JOptionPane.WARNING_MESSAGE);
							     frame.setVisible(true); 
							 }
							
							
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						 
						 
				
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(null,"No entry","Login cancelled",JOptionPane.WARNING_MESSAGE);
						 
						  frame.setVisible(true);
					 }
				  }
						
					
				
		
			});
		JButton sgbutton= new JButton("Front desktop associate");
		sgbutton.setBounds(130, 330, 190, 25);
		sgbutton.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				
				frame.setVisible(false);
		
				
				
				JTextField staffID= new JTextField(5);
				JPasswordField pass= new JPasswordField(5);
				
				Object[] message= {
						"Staff ID:",staffID,
						"Password:", pass
				};
				
					int option = JOptionPane.showConfirmDialog(null, message,"Login", JOptionPane.OK_CANCEL_OPTION);
					 if(option == JOptionPane.OK_OPTION)
					 {
						 sqltrainer st= new sqltrainer();
						 int id= Integer.parseInt(staffID.getText());
						 
						 try {
							 Trainer n = st.viewTrainer(id);
							
							 String tid= String.valueOf(id);
							 String password= n.tpassword;

							 
							 if(staffID.getText().equals(tid) && pass.getText().equals(password))
							 {
								 JFrame emp= new JFrame();
									emp.getContentPane().setBackground(Color.white);
									emp.setSize(450,525);
									emp.setTitle("Front desk associate Operations");
									emp.setLayout(null);
									emp.setLocationRelativeTo(null);
									
									
									ImageIcon background1=new ImageIcon("black.png");
								    Image img1=background1.getImage();
								    Image temp1=img1.getScaledInstance(1000,900,Image.SCALE_SMOOTH);
								    background1=new ImageIcon(temp1);
								    JLabel back1=new JLabel(background1);
								    back1.setLayout(null);
								    back1.setBounds(0,0,500,540);
								    emp.add(back1);
								    
								    JButton button1= new JButton("Attendance");
									
									button1.setBounds(130, 130, 200, 25);
									button1.addActionListener(new ActionListener() 
									{	
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub	
										}		
									});
									
									JButton button2= new JButton("Inventory");
									button2.setBounds(130, 170, 200, 25);
									button2.addActionListener(new ActionListener() 
									{	
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub	
										}		
									});
									JButton button3= new JButton("Remove products");
									button3.setBounds(130, 210, 200, 25);
									button3.addActionListener(new ActionListener() 
									{	
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub	
									
										}		
									});
									
									JButton button5= new JButton("Go back");
									button5.setBounds(130, 250, 200, 25);
									button5.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											emp.dispose();
											frame.setVisible(true);
//											Main1.getInstance().getFrameInstance().setVisible(true);
										}		
									});
									

									button1.setFocusable(false);
									button5.setFocusable(false);
									button2.setFocusable(false);
									button3.setFocusable(false);
									
									button1.setFont(new Font("Garamond", Font.BOLD,12));
									button5.setFont(new Font("Garamond", Font.BOLD,12));
									button2.setFont(new Font("Garamond", Font.BOLD,12));
									button3.setFont(new Font("Garamond", Font.BOLD,12));
									
									back1.add(button1);
									back1.add(button5);
									back1.add(button2);
									back1.add(button3);
									
									button1.setBackground(Color.white);
									button5.setBackground(Color.white);
									button2.setBackground(Color.white);
									button3.setBackground(Color.white);
									
									emp.setVisible(true);
								 
							 }
							 
							 else
							 {
								
								 JOptionPane.showMessageDialog(null,"Wrong Password","Incorrect Creditials",JOptionPane.WARNING_MESSAGE);
							     frame.setVisible(true); 
							 }
							
							
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						 
						 
						 
					
					
					
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(null,"No entry","Login cancelled",JOptionPane.WARNING_MESSAGE);
						 
						  frame.setVisible(true);
					 }
				  }
					
						
						
		
					
					
				
		
			});
		
		
		
		
		
		sgbutton.setFocusable(false);
		cbutton.setFocusable(false);
		techbutton.setFocusable(false);
		ncbutton.setFocusable(false);
		tbutton.setFocusable(false);
		sbutton.setFocusable(false);
		
		
		sgbutton.setFont(new Font("Garamond", Font.BOLD,12));
		cbutton.setFont(new Font("Garamond", Font.BOLD,12));
		techbutton.setFont(new Font("Garamond", Font.BOLD,12));
		ncbutton.setFont(new Font("Garamond", Font.BOLD,12));
		tbutton.setFont(new Font("Garamond", Font.BOLD,12));
		sbutton.setFont(new Font("Garamond", Font.BOLD,12));
		
		
		sgbutton.setBackground(Color.white);
		cbutton.setBackground(Color.white);
		techbutton.setBackground(Color.white);
		ncbutton.setBackground(Color.white);
		tbutton.setBackground(Color.white);
		sbutton.setBackground(Color.white);
		
		frame.add(sgbutton);
		frame.add(cbutton);
		frame.add(techbutton);
		frame.add(ncbutton);
		frame.add(tbutton);
		frame.add(sbutton);
		
		
		frame.setVisible(true);
		

					
			 }
			 
			 
			 


}




		
		
		
		
	




