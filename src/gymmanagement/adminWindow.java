package gymmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.awt.*;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.*;

public class adminWindow {

	JFrame frame1= new JFrame();
	JTextField textField;
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	JTextField textField_4;
	JTextField textField_5;
	
	
	
	
	adminWindow()
	{
	
		frame1.getContentPane().setBackground(Color.white);
		frame1.setSize(450,525);
		frame1.setTitle("Admin Login");
		frame1.setLayout(null);
		frame1.setLocationRelativeTo(null);
		 ImageIcon background=new ImageIcon("lake.png");
		    Image img=background.getImage();
		    Image temp=img.getScaledInstance(1000,900,Image.SCALE_SMOOTH);
		    background=new ImageIcon(temp);
		    JLabel back=new JLabel(background);
		    back.setLayout(null);
		    back.setBounds(0,0,500,540);
		    frame1.add(back);
		
		String pass="123";
		
		String password= JOptionPane.showInputDialog("Enter Admin password");
		
		if(password.contentEquals(pass))
		{
			Main1.getInstance().getFrameInstance().setVisible(false);
			JFrame admin= new JFrame();
			admin.getContentPane().setBackground(Color.white);
			admin.setSize(450,525);
			admin.setTitle("Admin Operation");
			admin.setLayout(null);
			admin.setLocationRelativeTo(null);
			
			 ImageIcon background1=new ImageIcon("art.png");
			    Image img1=background1.getImage();
			    Image temp1=img1.getScaledInstance(1000,900,Image.SCALE_SMOOTH);
			    background1=new ImageIcon(temp1);
			    JLabel back1=new JLabel(background1);
			    back1.setLayout(null);
			    back1.setBounds(0,0,500,540);
			    admin.add(back1);
			
			JButton button1= new JButton("Add new Customer");
			button1.setBounds(130, 50, 200, 25);
			button1.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()== button1)
					{
						admin.dispose();
						JFrame frame2= new JFrame();
						
						frame2.setBounds(100, 100, 730, 489);
						frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame2.setTitle("Registeration Form");
						frame2.setLayout(null);
						frame2.setLocationRelativeTo(null);
						frame2.getContentPane().setBackground(Color.white);
						
					    
						 
						
						textField = new JTextField();
						textField.setBounds(128, 28, 86, 20);
						frame2.getContentPane().add(textField);
						textField.setColumns(10);
						
						JLabel lblName = new JLabel("Name");
						lblName.setBounds(65, 31, 46, 14);
						frame2.getContentPane().add(lblName);
						
						JLabel lblPhone = new JLabel("Phone");
						lblPhone.setBounds(65, 68, 46, 14);
						frame2.getContentPane().add(lblPhone);
						
						textField_1 = new JTextField();
						textField_1.setBounds(128, 65, 86, 20);
						frame2.getContentPane().add(textField_1);
						textField_1.setColumns(10);
						
						JLabel lblWeight = new JLabel("Weight");
						lblWeight.setBounds(65, 103, 46, 14);
						frame2.getContentPane().add(lblWeight);
						
						textField_2 = new JTextField();
						textField_2.setBounds(128, 103, 47, 17);
						frame2.getContentPane().add(textField_2);
						textField_2.setColumns(10);
						
						JLabel lblHeight = new JLabel("Height");
						lblHeight.setBounds(65, 138, 46, 14);
						frame2.getContentPane().add(lblHeight);
								
						textField_3 = new JTextField();
						textField_3.setBounds(128, 138, 47, 17);
						frame2.getContentPane().add(textField_3);
						textField_3.setColumns(10);
						
						
						
						JButton btnClear = new JButton("clear");
						
						JButton btngoBack = new JButton("go back");
						btngoBack.setBounds(270, 387, 89, 23);
						frame2.getContentPane().add(btngoBack);
						btngoBack.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								frame2.dispose();
								admin.setVisible(true);
								
											
							}						
							});
						JButton btnnext = new JButton("next");
						btnnext.setBounds(370, 387, 89, 23);
						frame2.getContentPane().add(btnnext);
						btnnext.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								

								JFrame frame4= new JFrame();
								frame4.getContentPane().setBackground(Color.white);
								frame4.setSize(320,150);
								frame4.setTitle("Mode of Payment");
								frame4.setLayout(null);
								frame4.setLocationRelativeTo(null);
								
								JRadioButton cash= new JRadioButton("cash");
								JRadioButton card= new JRadioButton("card");
								JRadioButton upi= new JRadioButton("upi");
								
								cash.setBounds(50,23,19,20);
								frame4.getContentPane().add(cash);
								
								JLabel lblcash= new JLabel("cash");
								lblcash.setBounds(75,21,40,20);
								frame4.getContentPane().add(lblcash);
								cash.setBackground(Color.white);
								card.setBackground(Color.white);
								upi.setBackground(Color.white);
								
								card.setBounds(125,23,19,20);
								frame4.getContentPane().add(card);
								
								JLabel lblcard= new JLabel("card");
								lblcard.setBounds(150,21,40,20);
								frame4.getContentPane().add(lblcard);
								
								upi.setBounds(200,23,19,20);
								frame4.getContentPane().add(upi);
								
								JLabel lblupi= new JLabel("upi");
								lblupi.setBounds(225,21,40,20);
								frame4.getContentPane().add(lblupi);
								
								ButtonGroup BG1= new ButtonGroup();
								BG1.add(cash);
								BG1.add(card);
								BG1.add(upi);
								
								
								JButton ok= new JButton("submit");
								ok.setBounds(70, 70, 80,15);
								frame4.getContentPane().add(ok);
								frame4.setVisible(true);
								
				
									ok.addActionListener(new ActionListener() 
									{
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											
											
											if(card.isSelected()== true)
											{
												frame2.dispose();
												frame4.dispose();
												JFrame frame3= new JFrame();
												frame3.getContentPane().setBackground(Color.white);
												frame3.setSize(450,300);
												frame3.setTitle("Card Payment");
												frame3.setLayout(null);
												frame3.setLocationRelativeTo(null);
												
												JLabel cardno = new JLabel("Card Number");
												cardno.setBounds(65, 31, 120, 14);
												frame3.getContentPane().add(cardno);
									
												JTextField card = new JTextField();
												card.setBounds(158, 31, 66, 20);
												frame3.getContentPane().add(card);
												card.setColumns(10);
											
												JLabel lblmonth = new JLabel("Expiry date");
												lblmonth.setBounds(65, 71, 86, 14);
												frame3.getContentPane().add(lblmonth);
												
												
												JComboBox<String> comboBoxM = new JComboBox<String>();
												comboBoxM.addItem("MM");
												comboBoxM.addItem("1");comboBoxM.addItem("2");comboBoxM.addItem("3");comboBoxM.addItem("4");comboBoxM.addItem("5");
												comboBoxM.addItem("6");comboBoxM.addItem("7");comboBoxM.addItem("8");comboBoxM.addItem("9");comboBoxM.addItem("10");
												comboBoxM.addItem("11");comboBoxM.addItem("12");
												
												comboBoxM.setBackground(Color.white);
												comboBoxM.setBounds(158, 71, 56, 20);
												frame3.getContentPane().add(comboBoxM);
												
												JComboBox<String> comboBoxY = new JComboBox<String>();
												comboBoxY.addItem("YY");
												comboBoxY.addItem("23");comboBoxY.addItem("24");comboBoxY.addItem("25");comboBoxY.addItem("26");comboBoxY.addItem("27");
												comboBoxY.addItem("28");
												
												comboBoxY.setBackground(Color.white);
												comboBoxY.setBounds(260, 71, 56, 20);
												frame3.getContentPane().add(comboBoxY);
												
												
												JLabel lblcvv = new JLabel("CVV");
												lblcvv.setBounds(65, 121, 46, 14);
												frame3.getContentPane().add(lblcvv);
												
												JTextField cvv = new JTextField();
												cvv.setBounds(158, 121, 47, 17);
												frame3.getContentPane().add(cvv);
												cvv.setColumns(10);
												
									
												
												JButton sub= new JButton("Submit");
												sub.setBounds(150, 180, 80, 15);
												frame3.getContentPane().add(sub);
												
												sub.addActionListener(new ActionListener() 
												{
													@Override
													public void actionPerformed(ActionEvent e) {
														// TODO Auto-generated method stub
														
														 JOptionPane.showMessageDialog(null,"Payment Successful","",JOptionPane.INFORMATION_MESSAGE);
														 
													}
												});
												
												
												
												frame3.setVisible(true);
												
								
											}
								
								
								
										}
									});
											
							}						
							});
									
						btnClear.setBounds(170, 387, 89, 23);
						frame2.getContentPane().add(btnClear);
						
						
						JLabel lblSex = new JLabel("Sex");
						lblSex.setBounds(65, 170, 46, 23);
						frame2.getContentPane().add(lblSex);
						
						JLabel lblMale = new JLabel("Male");
						lblMale.setBounds(337, 174, 46, 14);
						frame2.getContentPane().add(lblMale);
						
						
						
						JLabel lblFemale = new JLabel("Female");
						lblFemale.setBounds(162, 174, 46, 14);
						frame2.getContentPane().add(lblFemale);
						
					
						
						JRadioButton radioButton = new JRadioButton("");
						radioButton.setBounds(128, 170, 17, 23);
						
						frame2.getContentPane().add(radioButton);
		
						
						radioButton.setBackground(Color.white);
//						radioButton.setSelected(true);
						
						JRadioButton radioButton_1 = new JRadioButton("");
						radioButton_1.setBounds(292, 170, 17, 23);
//						radioButton_1.setText("Male");
						frame2.getContentPane().add(radioButton_1);
						radioButton_1.setBackground(Color.white);
						

						JLabel lblfood = new JLabel("Food Preference");
						lblfood.setBounds(65, 190, 56, 43);
						frame2.getContentPane().add(lblfood);
						
						JLabel lblVeg = new JLabel("Veg");
						lblVeg.setBounds(337, 194, 46, 14);
						frame2.getContentPane().add(lblVeg);
						

						JLabel lblNonveg = new JLabel("Non Veg");
						lblNonveg.setBounds(162, 194, 46, 14);
						frame2.getContentPane().add(lblNonveg);
						
						JRadioButton radioButton1 = new JRadioButton("");
						radioButton1.setBounds(128, 190, 17, 23);
						frame2.getContentPane().add(radioButton1);
						radioButton1.setBackground(Color.white);
//						radioButton.setSelected(true);
						
						JRadioButton radioButton2 = new JRadioButton("");
						radioButton2.setBounds(292, 190, 17, 23);
						frame2.getContentPane().add(radioButton2);
						radioButton2.setBackground(Color.white);
						
						
						
						JLabel lblPremium = new JLabel("Package");
						lblPremium.setBounds(65, 230, 56, 43);
						frame2.getContentPane().add(lblPremium);
						
						
						JComboBox<String> comboBoxplan = new JComboBox<String>();
						comboBoxplan.addItem("Select");
						comboBoxplan.addItem("3 months");comboBoxplan.addItem("6 months");
						comboBoxplan.addItem("12 months");
						
						
						comboBoxplan.setBounds(200, 201, 91, 20);
						frame2.getContentPane().add(comboBoxplan);
						
						
						
						ButtonGroup G1 = new ButtonGroup();
						
						G1.add(radioButton);
						G1.add(radioButton_1);
						
						ButtonGroup G2= new ButtonGroup();
						G2.add(radioButton1);
						G2.add(radioButton2);
						
					
						
						
						
						JLabel lblPassword = new JLabel("New Password");
						lblPassword.setBounds(65, 271, 109, 44);
						frame2.getContentPane().add(lblPassword);
						
						textField_4 = new JTextField();
						textField_4.setBounds(190, 246, 107, 17);
						frame2.getContentPane().add(textField_4);
						textField_4.setColumns(10);
						
						JLabel lblconfirmPassword = new JLabel("Confirm Password");
						lblconfirmPassword.setBounds(65, 305, 109, 44);
						frame2.getContentPane().add(lblconfirmPassword);
						
						textField_5 = new JTextField();
						textField_5.setBounds(190, 278, 107, 17);
						frame2.getContentPane().add(textField_5);
						textField_5.setColumns(10);
						
						
						
						
						
						JLabel lbldob = new JLabel("Date of Joining ");
						lbldob.setBounds(65, 332, 167, 14);
						frame2.getContentPane().add(lbldob);
						
						JComboBox<String> comboBox = new JComboBox<String>();
						comboBox.addItem("Select");
						comboBox.addItem("1");comboBox.addItem("2");comboBox.addItem("3");comboBox.addItem("4");comboBox.addItem("5");
						comboBox.addItem("6");comboBox.addItem("7");comboBox.addItem("8");comboBox.addItem("9");comboBox.addItem("10");
						comboBox.addItem("11");comboBox.addItem("12");comboBox.addItem("13");comboBox.addItem("14");comboBox.addItem("15");
						comboBox.addItem("16");comboBox.addItem("17");comboBox.addItem("18");comboBox.addItem("19");comboBox.addItem("20");
						comboBox.addItem("21");comboBox.addItem("22");comboBox.addItem("23");comboBox.addItem("24");comboBox.addItem("25");
						comboBox.addItem("26");comboBox.addItem("27");comboBox.addItem("28");comboBox.addItem("29");comboBox.addItem("30");
						comboBox.addItem("31");
						
						
						
						comboBox.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
							}
						});
						comboBox.setBounds(170, 330, 91, 20);
						frame2.getContentPane().add(comboBox);
						
						JComboBox<String> comboBox1 = new JComboBox<String>();
						comboBox1.addItem("Select");
						comboBox1.addItem("January");comboBox1.addItem("February");comboBox1.addItem("March");comboBox1.addItem("April");comboBox1.addItem("May");
						comboBox1.addItem("June");comboBox1.addItem("July");comboBox1.addItem("August");comboBox1.addItem("September");comboBox1.addItem("October");
						comboBox1.addItem("November");comboBox1.addItem("December");
						
						comboBox1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
							}
						});
						
						comboBox1.setBounds(290, 330, 91, 20);
						frame2.getContentPane().add(comboBox1);
						
						

						JComboBox<String> comboBox2 = new JComboBox<String>();
						comboBox2.addItem("Select");
						comboBox2.addItem("2023");comboBox2.addItem("2022");comboBox2.addItem("2021");comboBox2.addItem("2020");comboBox2.addItem("2019");
				
						
						
						
						comboBox2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
								
							}
						});
						comboBox2.setBounds(410, 330, 91, 20);
						frame2.getContentPane().add(comboBox2);
						
						
						comboBox.setBackground(Color.white);
						comboBox1.setBackground(Color.white);
						comboBox2.setBackground(Color.white);
						comboBoxplan.setBackground(Color.white);
						

						
						
						JButton btnSubmit = new JButton("submit");
						
//						btnSubmit.setBackground(Color.white);
//						btnSubmit.setForeground(Color.white);
						btnSubmit.setBounds(65, 387, 89, 23);
						frame2.getContentPane().add(btnSubmit);
						
						btnSubmit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(textField.getText().isEmpty()||(textField_1.getText().isEmpty())||(textField_2.getText().isEmpty())||(textField_4.getText().isEmpty())||(textField_5.getText().isEmpty())||(textField_3.getText().isEmpty())||((radioButton_1.isSelected())&&(radioButton1.isSelected())&&(radioButton2.isSelected())&&(radioButton.isSelected())||(comboBoxplan.getSelectedItem().equals("Select")||(comboBox.getSelectedItem().equals("Select")||(comboBox1.getSelectedItem().equals("Select")||(comboBox2.getSelectedItem().equals("Select")))))))
									JOptionPane.showMessageDialog(null, "Data Missing");
								else if(!textField_4.getText().equals(textField_5.getText()))
									JOptionPane.showMessageDialog(null, "Passwords do not match");
									
								else
								{
								JOptionPane.showMessageDialog(null, "Data Submitted");
								
								String cname = textField.getText();
								String cgender = null;
								String gympackage=null;
								String preference = null;
								
								
								
								if(radioButton.isSelected())
								{
									cgender= "Female";
								}
								else if(radioButton_1.isSelected())
								{
									cgender="Male";
								}
								
								if(radioButton1.isSelected())
								{
									preference= "Non Veg";
								}
								
								else if(radioButton2.isSelected())
								{
									preference= "Veg";
								}
								
								String phone= textField_1.getText();
								Double cweight= Double.parseDouble(textField_2.getText());
								Double cheight= Double.parseDouble(textField_3.getText());
								
								String password= textField_5.getText();
								
								if(comboBoxplan.getSelectedItem().equals("3 months"))
								{
									gympackage="3 months";
								}
								
								else if(comboBoxplan.getSelectedItem().equals("6 months"))
								{
									gympackage="6 months";
								}
								else if(comboBoxplan.getSelectedItem().equals("12 months"))
								{
									gympackage="12 months";
								}
								
								

								int day=0;
								
								if(comboBox.getSelectedItem().equals("1"))
								{day=1;
									}
								else if(comboBox.getSelectedItem().equals("2"))
								{day =2;
								}
								else if(comboBox.getSelectedItem().equals("3"))
								{day =3;
								}
								else if(comboBox.getSelectedItem().equals("4"))
								{day =4;
								}
								else if(comboBox.getSelectedItem().equals("5"))
								{day =5;
								}
								else if(comboBox.getSelectedItem().equals("6"))
								{day =6;
								}
								else if(comboBox.getSelectedItem().equals("7"))
								{day =7;
								}
								else if(comboBox.getSelectedItem().equals("8"))
								{day =8;
								}
								
								else if(comboBox.getSelectedItem().equals("9"))
								{day =9;
								}
								else if(comboBox.getSelectedItem().equals("10"))
								{day =10;
								}
								else if(comboBox.getSelectedItem().equals("11"))
								{day =11;
								}
								else if(comboBox.getSelectedItem().equals("12"))
								{day =12;
								}
								else if(comboBox.getSelectedItem().equals("13"))
								{day =13;
								}
								else if(comboBox.getSelectedItem().equals("14"))
								{day =14;
								}
								else if(comboBox.getSelectedItem().equals("15"))
								{day =15;
								}
								else if(comboBox.getSelectedItem().equals("16"))
								{day =16;
								}
								else if(comboBox.getSelectedItem().equals("17"))
								{day =17;
								}
								else if(comboBox.getSelectedItem().equals("18"))
								{day =18;
								}
								else if(comboBox.getSelectedItem().equals("19"))
								{day =19;
								}
								else if(comboBox.getSelectedItem().equals("20"))
								{day =20;
								}
								else if(comboBox.getSelectedItem().equals("21"))
								{day =21;
								}
								else if(comboBox.getSelectedItem().equals("22"))
								{day =22;
								}
								else if(comboBox.getSelectedItem().equals("23"))
								{day =23;
								}
								else if(comboBox.getSelectedItem().equals("24"))
								{day =24;
								}
								else if(comboBox.getSelectedItem().equals("25"))
								{day =25;
								}
								else if(comboBox.getSelectedItem().equals("26"))
								{day =26;
								}
								else if(comboBox.getSelectedItem().equals("27"))
								{day =27;
								}
								else if(comboBox.getSelectedItem().equals("28"))
								{day =28;
								}
								else if(comboBox.getSelectedItem().equals("29"))
								{day =29;
								}
								else if(comboBox.getSelectedItem().equals("30"))
								{day =30;
								}
								else if(comboBox.getSelectedItem().equals("31"))
								{day =31;
								}
								
								int month=0;
								
								if(comboBox1.getSelectedItem().equals("January"))
								{ 
									month=1;
									}
								else if(comboBox1.getSelectedItem().equals("February"))
								{
									month=2;
								}
								else if(comboBox1.getSelectedItem().equals("March"))
								{
									month=3;
								}
								else if(comboBox1.getSelectedItem().equals("April"))
								{
									month=4;
								}
								else if(comboBox1.getSelectedItem().equals("May"))
								{
									month=5;
								}
								else if(comboBox1.getSelectedItem().equals("June"))
								{
									month=6;
								}
								else if(comboBox1.getSelectedItem().equals("July"))
								{
									month=7;
								}
								else if(comboBox1.getSelectedItem().equals("August"))
								{
									month=8;
								}
								else if(comboBox1.getSelectedItem().equals("September"))
								{
									month=9;
								}
								else if(comboBox1.getSelectedItem().equals("October"))
								{
									month=10;
								}
								else if(comboBox1.getSelectedItem().equals("November"))
								{
									month=11;
								}
								else if(comboBox1.getSelectedItem().equals("December"))
								{
									month=12;
								}
								
								
								int year = 0;
								
								if(comboBox2.getSelectedItem().equals("2023"))
								{ 
									year=2023;
									}
								else if(comboBox2.getSelectedItem().equals("2022"))
								{
									year=2022;
								}
								else if(comboBox2.getSelectedItem().equals("2021"))
								{
									year=2021;
								}
								else if(comboBox2.getSelectedItem().equals("2020"))
								{
									year=2020;
								}
								else if(comboBox2.getSelectedItem().equals("2019"))
								{
									year=2019;
								}
								
								String da= day+"-"+ month +"-"+year;
								SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

								java.util.Date date = null;
								try {
									date = format.parse(da);
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								java.sql.Date sqldate= new java.sql.Date(date.getTime());
								
								
							
								customer c;
								sqlcustomer sc = new sqlcustomer();
							
									c= new customer(cname, cgender ,cweight, cheight, password, gympackage, phone, sqldate, preference);
									
									try {
										sc.addcustomer(c);
									} catch (Exception e1) {
										e1.printStackTrace();
									}
								
	
								
								
								
								}
							}
						});
						
						btnClear.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								textField_1.setText(null);
								textField_2.setText(null);
								textField.setText(null);
								textField_3.setText(null);
								textField_4.setText(null);
								textField_5.setText(null);
								
								radioButton.setSelected(false);
								radioButton1.setSelected(false);
								radioButton2.setSelected(false);
								
								radioButton_1.setSelected(false);
								comboBoxplan.setSelectedItem("Select");
								
								comboBox.setSelectedItem("Select");
								comboBox1.setSelectedItem("Select");
								comboBox2.setSelectedItem("Select");
								
								
								
							}
						});
						
						
						frame2.setVisible(true);
					}	
						}
			
			});
			
			JButton button2= new JButton("Add new Staff");
			button2.setBounds(130, 90, 200, 25);
			button2.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()== button2)
					{

						
						JFrame frame2= new JFrame();
						
						frame2.setBounds(100, 100, 730, 489);
						frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame2.setTitle("Staff Registeration Form");
						frame2.setLayout(null);
						frame2.setLocationRelativeTo(null);
						frame2.getContentPane().setBackground(Color.white);
						
						textField = new JTextField();
						textField.setBounds(128, 28, 86, 20);
						frame2.getContentPane().add(textField);
						textField.setColumns(10);
						
						JLabel lblName = new JLabel("Name");
						lblName.setBounds(65, 31, 46, 14);
						frame2.getContentPane().add(lblName);
						
						JLabel lblPhone = new JLabel("Phone");
						lblPhone.setBounds(65, 68, 46, 14);
						frame2.getContentPane().add(lblPhone);
						
						textField_1 = new JTextField();
						textField_1.setBounds(128, 65, 86, 20);
						frame2.getContentPane().add(textField_1);
						textField_1.setColumns(10);
					
						
						
						JLabel lblSex = new JLabel("Sex");
						lblSex.setBounds(65, 110, 46, 23);
						frame2.getContentPane().add(lblSex);
						
						JLabel lblMale = new JLabel("Male");
						lblMale.setBounds(128, 113, 46, 14);
						frame2.getContentPane().add(lblMale);
						
						JLabel lblFemale = new JLabel("Female");
						lblFemale.setBounds(292, 113, 46, 14);
						frame2.getContentPane().add(lblFemale);
						
						JRadioButton radioButton = new JRadioButton("");
						radioButton.setBounds(337, 113, 17, 23);
						frame2.getContentPane().add(radioButton);
						radioButton.setBackground(Color.white);
						
						JRadioButton radioButton_1 = new JRadioButton("");
						radioButton_1.setBounds(162, 113, 17, 23);
						frame2.getContentPane().add(radioButton_1);
						radioButton_1.setBackground(Color.white);
						
						JButton btnClear = new JButton("clear");
						btnClear.setBounds(170, 387, 89, 23);
						frame2.getContentPane().add(btnClear);
						
						JButton btngoBack = new JButton("go back");
						btngoBack.setBounds(270, 387, 89, 23);
						frame2.getContentPane().add(btngoBack);
						
						btngoBack.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								frame2.dispose();
								admin.setVisible(true);
								
							
												
							}						
							});
						
						JLabel lbldes = new JLabel("Designation");
						lbldes.setBounds(65, 148, 86, 34);
						frame2.getContentPane().add(lbldes);
						
						JComboBox<String> comboBoxdes = new JComboBox<String>();
						comboBoxdes.addItem("Select");
						
						comboBoxdes.addItem("Supervisor");comboBoxdes.addItem("Trainer");comboBoxdes.addItem("Nutrition Consultant");comboBoxdes.addItem("On-call Technician");comboBoxdes.addItem("Cleaner");
						comboBoxdes.addItem("Security Guard");
						comboBoxdes.setBounds(150, 148, 140, 20);
						frame2.getContentPane().add(comboBoxdes);
						
						
						
						JLabel lblExp = new JLabel("Experience");
						lblExp.setBounds(65, 178, 86, 34);
						frame2.getContentPane().add(lblExp);
						
						JComboBox<String> comboBox1 = new JComboBox<String>();
						comboBox1.addItem("Select");
						
						comboBox1.addItem("Fresher");comboBox1.addItem("Less than 2 years");comboBox1.addItem("Less than 5 years");comboBox1.addItem("More than 5 years");
						comboBox1.addItem("More than 10 years");
						
						comboBox1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
							}
						});
						comboBox1.setBounds(150, 178, 140, 20);
						frame2.getContentPane().add(comboBox1);
						
						JLabel lblPassword = new JLabel("New Password");
						lblPassword.setBounds(65, 251, 109, 44);
						frame2.getContentPane().add(lblPassword);
						
						textField_4 = new JTextField();
						textField_4.setBounds(190, 251, 107, 17);
						frame2.getContentPane().add(textField_4);
						textField_4.setColumns(10);
						
						JLabel lblconfirmPassword = new JLabel("Confirm Password");
						lblconfirmPassword.setBounds(65, 275, 109, 44);
						frame2.getContentPane().add(lblconfirmPassword);
						
						textField_5 = new JTextField();
						textField_5.setBounds(190, 275, 107, 17);
						frame2.getContentPane().add(textField_5);
						textField_5.setColumns(10);
			
						
						
				
						
						JLabel lbldob = new JLabel("Date of Joining");
						lbldob.setBounds(65, 205, 167, 14);
						frame2.getContentPane().add(lbldob);
						
						JComboBox<String> comboBox = new JComboBox<String>();
						comboBox.addItem("Select");
						comboBox.addItem("1");comboBox.addItem("2");comboBox.addItem("3");comboBox.addItem("4");comboBox.addItem("5");
						comboBox.addItem("6");comboBox.addItem("7");comboBox.addItem("8");comboBox.addItem("9");comboBox.addItem("10");
						comboBox.addItem("11");comboBox.addItem("12");comboBox.addItem("13");comboBox.addItem("14");comboBox.addItem("15");
						comboBox.addItem("16");comboBox.addItem("17");comboBox.addItem("18");comboBox.addItem("19");comboBox.addItem("20");
						comboBox.addItem("21");comboBox.addItem("22");comboBox.addItem("23");comboBox.addItem("24");comboBox.addItem("25");
						comboBox.addItem("26");comboBox.addItem("27");comboBox.addItem("28");comboBox.addItem("29");comboBox.addItem("30");
						comboBox.addItem("31");
						
						
						
						comboBox.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
							}
						});
						comboBox.setBounds(170, 205, 91, 20);
						frame2.getContentPane().add(comboBox);
						
						JComboBox<String> comboBox3 = new JComboBox<String>();
						comboBox3.addItem("Select");
						comboBox3.addItem("January");comboBox3.addItem("February");comboBox3.addItem("March");comboBox3.addItem("April");comboBox3.addItem("May");
						comboBox3.addItem("June");comboBox3.addItem("July");comboBox3.addItem("August");comboBox3.addItem("September");comboBox3.addItem("October");
						comboBox3.addItem("November");comboBox3.addItem("December");
						
						comboBox3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
							}
						});
						
						comboBox3.setBounds(290, 205, 91, 20);
						frame2.getContentPane().add(comboBox3);
						
						

						JComboBox<String> comboBox2 = new JComboBox<String>();
						comboBox2.addItem("Select");
						comboBox2.addItem("2023");comboBox2.addItem("2022");comboBox2.addItem("2021");comboBox2.addItem("2020");comboBox2.addItem("2019");
						
						
						
						
						comboBox2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
							}
						});
						comboBox2.setBounds(410, 205, 91, 20);
						frame2.getContentPane().add(comboBox2);
						
						comboBox2.setBackground(Color.white);
						comboBox3.setBackground(Color.white);
						comboBox1.setBackground(Color.white);
						comboBox.setBackground(Color.white);
						comboBoxdes.setBackground(Color.white);
						
						JButton btnSubmit = new JButton("submit");
						
//						btnSubmit.setBackground(Color.white);
//						btnSubmit.setForeground(Color.white);
						btnSubmit.setBounds(65, 387, 89, 23);
						frame2.getContentPane().add(btnSubmit);
						
						btnSubmit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(textField.getText().isEmpty()||(textField_1.getText().isEmpty())||((radioButton_1.isSelected())&&(radioButton.isSelected())||(comboBox.getSelectedItem().equals("Select")||(comboBoxdes.getSelectedItem().equals("Select")||(comboBox1.getSelectedItem().equals("Select")||(comboBox2.getSelectedItem().equals("Select"))||(comboBox3.getSelectedItem().equals("Select")))))))
									JOptionPane.showMessageDialog(null, "Data Missing");
								else if(!textField_4.getText().equals(textField_5.getText()))
									JOptionPane.showMessageDialog(null, "Passwords do not match");
									
								else
								{
								JOptionPane.showMessageDialog(null, "Data Submitted");
								String name= textField.getText();
								String exp = null;
								String phone= textField_1.getText();
								String designation= null;
								
								if(comboBoxdes.getSelectedItem().equals("Supervisor"))
								{ 
									designation="Supervisor";
								}
								else if(comboBoxdes.getSelectedItem().equals("Trainer"))
								{
									designation="Trainer";
								}
								else if(comboBoxdes.getSelectedItem().equals("Nutrition Consultant"))
								{
									designation="Nutrition Consultant";
								}
								else if(comboBoxdes.getSelectedItem().equals("On-call Technician"))
								{
									designation="On-call Technician";
								}
								else if(comboBoxdes.getSelectedItem().equals("Cleaner"))
								{
									designation="Cleaner";
								}
								else if(comboBoxdes.getSelectedItem().equals("Front desktop associate"))
								{
									designation="Front desktop associate";
								}
								
								
								int day=0;
								
								if(comboBox.getSelectedItem().equals("1"))
								{day=1;
									}
								else if(comboBox.getSelectedItem().equals("2"))
								{day =2;
								}
								else if(comboBox.getSelectedItem().equals("3"))
								{day =3;
								}
								else if(comboBox.getSelectedItem().equals("4"))
								{day =4;
								}
								else if(comboBox.getSelectedItem().equals("5"))
								{day =5;
								}
								else if(comboBox.getSelectedItem().equals("6"))
								{day =6;
								}
								else if(comboBox.getSelectedItem().equals("7"))
								{day =7;
								}
								else if(comboBox.getSelectedItem().equals("8"))
								{day =8;
								}
								
								else if(comboBox.getSelectedItem().equals("9"))
								{day =9;
								}
								else if(comboBox.getSelectedItem().equals("10"))
								{day =10;
								}
								else if(comboBox.getSelectedItem().equals("11"))
								{day =11;
								}
								else if(comboBox.getSelectedItem().equals("12"))
								{day =12;
								}
								else if(comboBox.getSelectedItem().equals("13"))
								{day =13;
								}
								else if(comboBox.getSelectedItem().equals("14"))
								{day =14;
								}
								else if(comboBox.getSelectedItem().equals("15"))
								{day =15;
								}
								else if(comboBox.getSelectedItem().equals("16"))
								{day =16;
								}
								else if(comboBox.getSelectedItem().equals("17"))
								{day =17;
								}
								else if(comboBox.getSelectedItem().equals("18"))
								{day =18;
								}
								else if(comboBox.getSelectedItem().equals("19"))
								{day =19;
								}
								else if(comboBox.getSelectedItem().equals("20"))
								{day =20;
								}
								else if(comboBox.getSelectedItem().equals("21"))
								{day =21;
								}
								else if(comboBox.getSelectedItem().equals("22"))
								{day =22;
								}
								else if(comboBox.getSelectedItem().equals("23"))
								{day =23;
								}
								else if(comboBox.getSelectedItem().equals("24"))
								{day =24;
								}
								else if(comboBox.getSelectedItem().equals("25"))
								{day =25;
								}
								else if(comboBox.getSelectedItem().equals("26"))
								{day =26;
								}
								else if(comboBox.getSelectedItem().equals("27"))
								{day =27;
								}
								else if(comboBox.getSelectedItem().equals("28"))
								{day =28;
								}
								else if(comboBox.getSelectedItem().equals("29"))
								{day =29;
								}
								else if(comboBox.getSelectedItem().equals("30"))
								{day =30;
								}
								else if(comboBox.getSelectedItem().equals("31"))
								{day =31;
								}
								
								int month=0;
								
								if(comboBox3.getSelectedItem().equals("January"))
								{ 
									month=1;
									}
								else if(comboBox3.getSelectedItem().equals("February"))
								{
									month=2;
								}
								else if(comboBox3.getSelectedItem().equals("March"))
								{
									month=3;
								}
								else if(comboBox3.getSelectedItem().equals("April"))
								{
									month=4;
								}
								else if(comboBox3.getSelectedItem().equals("May"))
								{
									month=5;
								}
								else if(comboBox3.getSelectedItem().equals("June"))
								{
									month=6;
								}
								else if(comboBox3.getSelectedItem().equals("July"))
								{
									month=7;
								}
								else if(comboBox3.getSelectedItem().equals("August"))
								{
									month=8;
								}
								else if(comboBox3.getSelectedItem().equals("September"))
								{
									month=9;
								}
								else if(comboBox3.getSelectedItem().equals("October"))
								{
									month=10;
								}
								else if(comboBox3.getSelectedItem().equals("November"))
								{
									month=11;
								}
								else if(comboBox3.getSelectedItem().equals("December"))
								{
									month=12;
								}
								
								
								int year = 0;
								
								if(comboBox2.getSelectedItem().equals("2023"))
								{ 
									year=2023;
									}
								else if(comboBox2.getSelectedItem().equals("2022"))
								{
									year=2022;
								}
								else if(comboBox2.getSelectedItem().equals("2021"))
								{
									year=2021;
								}
								else if(comboBox2.getSelectedItem().equals("2020"))
								{
									year=2020;
								}
								else if(comboBox2.getSelectedItem().equals("2019"))
								{
									year=2019;
								}
								
								String da= day+"-"+ month +"-"+year;
								SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

								java.util.Date date = null;
								try {
									date = format.parse(da);
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								java.sql.Date sqldate= new java.sql.Date(date.getTime());
								
								
								
								
							
								
								
								if(comboBox1.getSelectedItem().equals("Fresher"))
								{ 
									exp="Fresher";
									}
								else if(comboBox1.getSelectedItem().equals("Less than 2 years"))
								{
									exp="Less than 2 years";
								}
								else if(comboBox1.getSelectedItem().equals("Less than 5 years"))
								{
									exp= "Less than 5 years";
									}
								else if(comboBox1.getSelectedItem().equals("More than 5 years"))
								{exp="More than 5 years";}
								else if(comboBox1.getSelectedItem().equals("More than 10 years"))
								{exp="More than 10 years";}
								
								String gender = null;
								if(radioButton.isSelected())
								{gender= "Female";
								}
								else if(radioButton_1.isSelected())
								{gender="Male";
								}
								
								String password= textField_5.getText();
								
								
								Trainer t;
								sqltrainer st = new sqltrainer();
								
								t= new Trainer(name, exp, phone, password, designation, gender, sqldate);
								
								try {
									st.addtrainer(t);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								}
							
							}
						});
						
						btnClear.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								textField_1.setText(null);
								textField_4.setText(null);
								textField_5.setText(null);
								textField.setText(null);
								radioButton.setSelected(false);
								radioButton_1.setSelected(false);
								comboBox.setSelectedItem("Select");
								comboBox1.setSelectedItem("Select");
								comboBox2.setSelectedItem("Select");
								comboBox3.setSelectedItem("Select");				
							}						});
						frame2.setVisible(true);
					}
				}		
			});
			JButton button3= new JButton("Add new Equipment");
			button3.setBounds(130, 130, 200, 25);
			button3.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					


					admin.dispose();
					JFrame frame2= new JFrame();
					
					frame2.setBounds(100, 100, 730, 489);
					frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame2.setTitle("Equipment Registeration Form");
					frame2.setLayout(null);
					frame2.setLocationRelativeTo(null);
					frame2.getContentPane().setBackground(Color.white);
		
					

					JButton btnClear = new JButton("clear");
					btnClear.setBounds(170, 387, 89, 23);
					frame2.getContentPane().add(btnClear);
					
					JButton btngoBack = new JButton("go back");
					btngoBack.setBounds(270, 387, 89, 23);
					frame2.getContentPane().add(btngoBack);
					
					
					btngoBack.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							frame2.dispose();
							admin.setVisible(true);
							
						
											
						}						
						});
					
					
					JLabel lblExp = new JLabel("Machine Type");
					lblExp.setBounds(65, 31, 86, 44);
					frame2.getContentPane().add(lblExp);
					
					JComboBox<String> comboBox1 = new JComboBox<String>();
					comboBox1.addItem("Select");
					
					comboBox1.addItem("Treadmill");comboBox1.addItem("Elliptical");comboBox1.addItem("Stationary Bicycle");comboBox1.addItem("Rowing Machine");comboBox1.addItem("Bench Press");comboBox1.addItem("Barbell");comboBox1.addItem("Leg Press Machine");comboBox1.addItem("Pullup Bar");
					comboBox1.addItem("Smith Machine");comboBox1.addItem("T-Bar");comboBox1.addItem("Chest Press Machine");comboBox1.addItem("Cable Tower");comboBox1.addItem("Lat pull-down Machine");comboBox1.addItem("Squat Rack");
					comboBox1.addItem("Yoga mat");comboBox1.addItem("Exercise ball");
					comboBox1.addItem("Dumbbell");comboBox1.addItem("Weighted Plate");
					
					JComboBox<String> comboBoxweight1 = new JComboBox<String>();
					comboBoxweight1.addItem("Select");
					JComboBox<String> comboBoxweight2 = new JComboBox<String>();
					comboBoxweight2.addItem("Select");
					JComboBox<String> comboBoxweight3 = new JComboBox<String>();
					comboBoxweight3.addItem("Select");
					comboBox1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if(comboBox1.getSelectedItem().equals("Dumbbell"))
							{
								
								comboBoxweight1.setVisible(true);
								comboBoxweight1.setBounds(350, 45, 140, 20);
								comboBoxweight1.addItem("2.5 Kg");comboBoxweight1.addItem("5.0 Kg");comboBoxweight1.addItem("7.5 Kg");comboBoxweight1.addItem("10.0 Kg");comboBoxweight1.addItem("12.5 Kg");comboBoxweight1.addItem("15.0 Kg");
								frame2.getContentPane().add(comboBoxweight1);
								comboBoxweight1.setBackground(Color.white);
							}
							else if(comboBox1.getSelectedItem().equals("Weighted Plate"))
							{
								
								comboBoxweight2.setVisible(true);
								comboBoxweight2.setBounds(350, 45, 140, 20);
								comboBoxweight2.addItem("2.5 Kg");comboBoxweight2.addItem("5.0 Kg");comboBoxweight2.addItem("7.5 Kg");comboBoxweight2.addItem("10.0 Kg");comboBoxweight2.addItem("12.5 Kg");comboBoxweight2.addItem("15.0 Kg");
								comboBoxweight2.addItem("20.0 Kg");comboBoxweight2.addItem("25.0 Kg");comboBoxweight2.addItem("50.0 Kg");comboBoxweight2.addItem("100.0 Kg");
								frame2.getContentPane().add(comboBoxweight2);
								comboBoxweight2.setBackground(Color.white);
							}
							else if(comboBox1.getSelectedItem().equals("Barbell"))
							{
								comboBoxweight3.setVisible(true);
								comboBoxweight3.setBounds(350, 45, 140, 20);
								comboBoxweight3.addItem("10.0 Kg");comboBoxweight3.addItem("20.0 Kg");comboBoxweight3.addItem("30.0 Kg");comboBoxweight3.addItem("40.0 Kg");comboBoxweight3.addItem("50.0 Kg");
								frame2.getContentPane().add(comboBoxweight3);
								comboBoxweight3.setBackground(Color.white);
							}
							else
							{
								comboBoxweight1.setVisible(false);
							    comboBoxweight2.setVisible(false);
							    comboBoxweight3.setVisible(false);
							}
							
						}
					});
					comboBox1.setBounds(158, 45, 140, 20);
					frame2.getContentPane().add(comboBox1);
			
					comboBox1.setBackground(Color.white);
					
					
					JLabel lblquantity = new JLabel("Quantity");
					lblquantity.setBounds(65, 68, 86, 44);
					frame2.getContentPane().add(lblquantity);
					
					textField_1 = new JTextField();
					textField_1.setBounds(148, 80, 86, 20);
					frame2.getContentPane().add(textField_1);
					textField_1.setColumns(10);
					
					JButton btnSubmit = new JButton("submit");
					
//					btnSubmit.setBackground(Color.white);
//					btnSubmit.setForeground(Color.white);
					btnSubmit.setBounds(65, 387, 89, 23);
					frame2.getContentPane().add(btnSubmit);
					
					btnSubmit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if(((comboBox1.getSelectedItem().equals("Select")|| textField_1.getText().isEmpty())))
								JOptionPane.showMessageDialog(null, "Data Missing");
							else if(comboBox1.getSelectedItem().equals("Barbell") && comboBoxweight3.getSelectedItem().equals("Select"))
							{
								JOptionPane.showMessageDialog(null, "Data Missing");
							}
							else if(comboBox1.getSelectedItem().equals("Dumbbell") && comboBoxweight1.getSelectedItem().equals("Select"))
							{
								JOptionPane.showMessageDialog(null, "Data Missing");
							}
							else if(comboBox1.getSelectedItem().equals("Weighted Plate") && comboBoxweight2.getSelectedItem().equals("Select"))
							{
								JOptionPane.showMessageDialog(null, "Data Missing");
							}
							else
							{
							JOptionPane.showMessageDialog(null, "Data Submitted");
							
							String type = null;
							double weight = 0.0;
							int quantity= Integer.parseInt(textField_1.getText());
							if(comboBox1.getSelectedItem().equals("Treadmill"))
							{
								type ="Treadmill";
							}
							else if(comboBox1.getSelectedItem().equals("Elliptical"))
							{
								type ="Elliptical";
							}
							else if(comboBox1.getSelectedItem().equals("Stationary Bicycle"))
							{
								type ="Stationary Bicycle";
							}
							else if(comboBox1.getSelectedItem().equals("Rowing Machine"))
							{
								type ="Rowing Machine";
							}
							else if(comboBox1.getSelectedItem().equals("Bench Press"))
							{
								type ="Bench Press";
							}
							else if(comboBox1.getSelectedItem().equals("Barbell"))
							{
								type="Barbell";
								if(comboBoxweight3.getSelectedItem().equals("10.0 Kg"))
								{
									weight=10.0;
								}
								else if(comboBoxweight3.getSelectedItem().equals("20.0 Kg"))
								{
									weight=20.0;
								}
								else if(comboBoxweight3.getSelectedItem().equals("30.0 Kg"))
								{
									weight=30.0;
								}
								else if(comboBoxweight3.getSelectedItem().equals("40.0 Kg"))
								{
									weight=40.0;
								}
								else if(comboBoxweight3.getSelectedItem().equals("50.0 Kg"))
								{
									weight= 50.0;
								}
								
							}
							
							else if(comboBox1.getSelectedItem().equals("Leg Press Machine"))
							{
								type="Leg Press Machine";
							}
							else if(comboBox1.getSelectedItem().equals("Pullup Bar"))
							{
								type="Pullup Bar";
							}
							else if(comboBox1.getSelectedItem().equals("Smith Machine"))
							{
								type="Smith Machine";
							}
							else if(comboBox1.getSelectedItem().equals("T-Bar"))
							{
								type="T-Bar";
							}
							else if(comboBox1.getSelectedItem().equals("Chest Press Machine"))
							{
								type="Chest Press Machine";
							}
							else if(comboBox1.getSelectedItem().equals("Cable Tower"))
							{
								type="Cable Tower";
							}
							else if(comboBox1.getSelectedItem().equals("Lat pull-down Machine"))
							{
								type="Lat pull-down Machine";
							}
							else if(comboBox1.getSelectedItem().equals("Squat Rack"))
							{
								type="Squat Rack";
							}
							else if(comboBox1.getSelectedItem().equals("Yoga mat"))
							{
								type="Yoga mat";
							}
							else if(comboBox1.getSelectedItem().equals("Exercise ball"))
							{
								type="Exercise ball";
							}
							else if(comboBox1.getSelectedItem().equals("Dumbbell"))
							{
								type="Dumbbell";
								if(comboBoxweight1.getSelectedItem().equals("2.5 Kg"))
								{
									weight=2.5;
								}
								else if(comboBoxweight1.getSelectedItem().equals("5.0 Kg"))
								{
									weight=5.0;
								}
								else if(comboBoxweight1.getSelectedItem().equals("7.5 Kg"))
								{
									weight=7.5;
								}
								else if(comboBoxweight1.getSelectedItem().equals("10.0 Kg"))
								{
									weight=10.0;
								}
								else if(comboBoxweight1.getSelectedItem().equals("12.5 Kg"))
								{
									weight=12.5;
								}
								else if(comboBoxweight1.getSelectedItem().equals("15.0 Kg"))
								{
									weight= 15.0;
								}
							}
							else if(comboBox1.getSelectedItem().equals("Weighted Plate"))
							{
								type="Weighted Plate";
								if(comboBoxweight2.getSelectedItem().equals("2.5 Kg"))
								{
									weight=2.5;
								}
								else if(comboBoxweight2.getSelectedItem().equals("5.0 Kg"))
								{
									weight=5.0;
								}
								else if(comboBoxweight2.getSelectedItem().equals("7.5 Kg"))
								{
									weight=7.5;
								}
								else if(comboBoxweight2.getSelectedItem().equals("10.0 Kg"))
								{
									weight=10.0;
								}
								else if(comboBoxweight2.getSelectedItem().equals("12.5 Kg"))
								{
									weight=12.5;
								}
								else if(comboBoxweight2.getSelectedItem().equals("15.0 Kg"))
								{
									weight= 15.0;
								}
								else if(comboBoxweight2.getSelectedItem().equals("20.0 Kg"))
								{
									weight= 20.0;
								}
								else if(comboBoxweight2.getSelectedItem().equals("25.0 Kg"))
								{
									weight= 25.0;
								}
								else if(comboBoxweight2.getSelectedItem().equals("50.0 Kg"))
								{
									weight= 50.0;
								}
								else if(comboBoxweight2.getSelectedItem().equals("100.0 Kg"))
								{
									weight= 100.0;
								}
								
							}
							Equip e;
							sqlequipment s = new sqlequipment();
							if(weight == 0.0)
							{
								e= new Equip(type,quantity);
								
								try {
									s.addequipment(e);
								} catch (Exception e1) {
									e1.printStackTrace();
								}
							}
							else 
							{
								e= new Equip(type,weight,quantity);
								
								try {
									s.addequipment(e);
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								
							}
							
						}
						}
					});
					
					btnClear.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textField_1.setText(null);
							comboBox1.setSelectedItem("Select");
							comboBoxweight1.setSelectedItem("Select");
							comboBoxweight2.setSelectedItem("Select");
							comboBoxweight3.setSelectedItem("Select");
							
						
											
						}						
						});
					frame2.setVisible(true);
				
				}		
			});
			JButton button4= new JButton("Display Customer Information");
			button4.setBounds(130, 210, 200, 25);
			button4.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String customerID= JOptionPane.showInputDialog("Enter customer ID");
				
					int cid = Integer.parseInt(customerID);
					
					sqlcustomer sc = new sqlcustomer() ;
					customer n;
					try {
						n = sc.viewCustomer(cid);
						JFrame frame2= new JFrame();
						
						frame2.setBounds(100, 100, 730, 489);
						frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame2.setTitle("Customer Information");
						frame2.setLayout(null);
						frame2.setLocationRelativeTo(null);
   					    frame2.getContentPane().setBackground(Color.white);
						
						double cw= n.cweight;
			
						String weight= String.valueOf(cw);
						
						String fweight= weight+" kg";
						
						
						double ch= n.cheight;
						String height= String.valueOf(ch);
						
						String fheight= height +" cm";
						
						final DecimalFormat decfor= new DecimalFormat("0.00");
						double cbmi= n.bmi;
						String cusbmi= decfor.format(cbmi);
						
						String fcusbmi= cusbmi +" kg/m2";
						
						
						
						String id= String.valueOf(cid);
						
						double fees= n.fees;
						String fee= String.valueOf(fees);
						
//						ImageIcon background1=new ImageIcon("star.png");
//					    Image img1=background1.getImage();
//					    Image temp1=img1.getScaledInstance(1000,900,Image.SCALE_SMOOTH);
//					    background1=new ImageIcon(temp1);
//					    JLabel back1=new JLabel(background1);
//					    back1.setLayout(null);
//					    back1.setBounds(0,0,500,500);
					    
						
						
						JLabel lblid = new JLabel("Customer ID");
						lblid.setBounds(65, 30, 140, 15);
						lblid.setOpaque(true);
//						lblid.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblid);
						
						
						
						JLabel lblprintID = new JLabel(id);
						lblprintID.setBounds(230, 30, 86, 15);
						frame2.getContentPane().add(lblprintID);
						
						
						
						JLabel lblName = new JLabel("Cutsomer Name");
						lblName.setBounds(65,60 , 140, 15);
						lblName.setOpaque(true);
//						lblName.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblName);
					
						
						JLabel lblprintName = new JLabel(n.cname);
						lblprintName.setBounds(230, 60, 86, 15);
						frame2.getContentPane().add(lblprintName);
						

						JLabel lblgender = new JLabel("Customer Gender");
						lblgender.setBounds(65, 90, 140, 15);
						lblgender.setOpaque(true);
//						lblgender.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblgender);
						
						
						JLabel lblprintGender = new JLabel(n.cgender);
						lblprintGender.setBounds(230, 90, 86, 15);
						frame2.getContentPane().add(lblprintGender);
						
					
						
						JLabel lblWeight = new JLabel("Customer Weight");
						lblWeight.setBounds(65, 120, 140, 15);
						lblWeight.setOpaque(true);
//						lblWeight.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblWeight);
						
					
						JLabel lblprintWeight = new JLabel(fweight);
						lblprintWeight.setBounds(230, 120, 86, 15);
						frame2.getContentPane().add(lblprintWeight);
						
						
						JLabel lblHeight = new JLabel("Customer Height");
						lblHeight.setBounds(65, 150, 140, 15);
						lblHeight.setOpaque(true);
//						lblHeight.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblHeight);
						
						JLabel lblprintHeight = new JLabel(fheight);
						lblprintHeight.setBounds(230, 150, 86, 15);
						frame2.getContentPane().add(lblprintHeight);
						
						
							
						
						
						JLabel lblbmi = new JLabel("Customer BMI");
						lblbmi.setBounds(65, 180, 140, 15);
						lblbmi.setOpaque(true);
//						lblid.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblbmi );
						
						JLabel lblprintbmi  = new JLabel(fcusbmi);
						lblprintbmi.setBounds(230, 180, 86, 15);
						frame2.getContentPane().add(lblprintbmi);
						
					
						JLabel lbltype = new JLabel("Customer Body Type");
						lbltype.setBounds(65, 210, 140, 15);
						lbltype.setOpaque(true);
//						lblid.setBackground(Color.lightGray);
						frame2.getContentPane().add(lbltype);
					
						
						JLabel lblprintType = new JLabel(n.bodytype);
						lblprintType.setBounds(230, 210, 86, 15);
						frame2.getContentPane().add(lblprintType);
						
						
					
						
						JLabel lblPackage = new JLabel("Customer Pacakge");
						lblPackage.setBounds(65, 240, 140, 15);
						lblPackage.setOpaque(true);
//						lblPackage.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblPackage);
						
						
						JLabel lblprintPackage = new JLabel(n.gympackage);
						lblprintPackage.setBounds(230, 240, 86, 15);
						frame2.getContentPane().add(lblprintPackage);
						
						
						JLabel lblfees = new JLabel("Total Fees");
						lblfees.setBounds(65, 270, 140, 15);
						lblfees.setOpaque(true);
//						lblfees.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblfees);
						
						
						JLabel lblprintfees = new JLabel(fee);
						lblprintfees .setBounds(230, 270, 86, 15);
						frame2.getContentPane().add(lblprintfees );
						
				
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
			JButton button5= new JButton("Display Trainer Information");
			button5.setBounds(130, 250, 200, 25);
			button5.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String customerID= JOptionPane.showInputDialog("Enter customer ID");
					
					int tid = Integer.parseInt(customerID);
					
					sqltrainer st = new sqltrainer() ;
					try {
						Trainer n= st.viewTrainer(tid);
						
                        JFrame frame2= new JFrame();
                        
                        
                        String id= String.valueOf(tid);
						
						frame2.setBounds(100, 100, 730, 489);
						frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame2.setTitle("Customer Information");
						frame2.setLayout(null);
						frame2.setLocationRelativeTo(null);
   					    frame2.getContentPane().setBackground(Color.white);
   					    
   					    double salary= n.salary;
   					    String tsalary= String.valueOf(salary);
   					    
   					    String exp= n.texp;
   					    String texp= exp + " years";
   					    
   					 JLabel lblid = new JLabel("Trainer ID");
						lblid.setBounds(65, 30, 140, 15);
						lblid.setOpaque(true);
//						lblid.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblid);
						
						
						
						JLabel lblprintID = new JLabel(id);
						lblprintID.setBounds(230, 30, 86, 15);
						frame2.getContentPane().add(lblprintID);
						
						
						
						JLabel lblName = new JLabel("Trainer Name");
						lblName.setBounds(65,60 , 140, 15);
						lblName.setOpaque(true);
//						lblName.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblName);
					
						
						JLabel lblprintName = new JLabel(n.tname);
						lblprintName.setBounds(230, 60, 86, 15);
						frame2.getContentPane().add(lblprintName);
						

						JLabel lblgender = new JLabel("Trainer Gender");
						lblgender.setBounds(65, 90, 140, 15);
						lblgender.setOpaque(true);
//						lblgender.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblgender);
						
						
						JLabel lblprintGender = new JLabel(n.tgender);
						lblprintGender.setBounds(230, 90, 86, 15);
						frame2.getContentPane().add(lblprintGender);
						
						JLabel lblWeight = new JLabel("Trainer Experience");
						lblWeight.setBounds(65, 120, 140, 15);
						lblWeight.setOpaque(true);
//						lblWeight.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblWeight);
						
					
						JLabel lblprintWeight = new JLabel(texp);
						lblprintWeight.setBounds(230, 120, 86, 15);
						frame2.getContentPane().add(lblprintWeight);
						
						
						JLabel lblHeight = new JLabel("Trainer Salary");
						lblHeight.setBounds(65, 150, 140, 15);
						lblHeight.setOpaque(true);
//						lblHeight.setBackground(Color.lightGray);
						frame2.getContentPane().add(lblHeight);
						
						JLabel lblprintHeight = new JLabel(tsalary);
						lblprintHeight.setBounds(230, 150, 86, 15);
						frame2.getContentPane().add(lblprintHeight);
   					    
   					    
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
			JButton button6= new JButton("Display Equipment Information");
			button6.setBounds(130, 290, 200, 25);
			button6.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				}		
			});
			JButton button7= new JButton("Add new product");
			button7.setBounds(130, 170, 200, 25);
			button7.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					admin.dispose();
					JFrame frame2= new JFrame();
					
					frame2.setBounds(100, 100, 730, 489);
					frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame2.setTitle("Registeration Form");
					frame2.setLayout(null);
					frame2.setLocationRelativeTo(null);
					frame2.getContentPane().setBackground(Color.white);
					
					
					JButton btnClear = new JButton("clear");
					btnClear.setBounds(170, 387, 89, 23);
					frame2.getContentPane().add(btnClear);
					
					JButton btngoBack = new JButton("go back");
					btngoBack.setBounds(270, 387, 89, 23);
					frame2.getContentPane().add(btngoBack);
					
					
					btngoBack.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							frame2.dispose();
							admin.setVisible(true);							
						}						
						});
					
					
					JLabel lblExp = new JLabel("Product");
					lblExp.setBounds(65, 31, 86, 44);
					frame2.getContentPane().add(lblExp);
					
					JComboBox<String> comboBox1 = new JComboBox<String>();
					comboBox1.addItem("Select");
					comboBox1.addItem("Protein Powder");comboBox1.addItem("Supplements");comboBox1.addItem("Adjustable Handgrip");comboBox1.addItem("Wrist band");comboBox1.addItem("Resistance training band");
					comboBox1.addItem("Protein Shaker");comboBox1.addItem("Duffle bag");comboBox1.addItem("Towels");
					comboBox1.setBounds(158, 45, 140, 20);
					frame2.getContentPane().add(comboBox1);
			
					comboBox1.setBackground(Color.white);
					
					JLabel lblquantity = new JLabel("Quantity");
					lblquantity.setBounds(65, 68, 86, 44);
					frame2.getContentPane().add(lblquantity);
					
					textField_1 = new JTextField();
					textField_1.setBounds(148, 80, 86, 20);
					frame2.getContentPane().add(textField_1);
					textField_1.setColumns(10);
					
					JButton btnSubmit = new JButton("submit");
					
//					btnSubmit.setBackground(Color.white);
//					btnSubmit.setForeground(Color.white);
					btnSubmit.setBounds(65, 387, 89, 23);
					frame2.getContentPane().add(btnSubmit);
					
					btnSubmit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if(((comboBox1.getSelectedItem().equals("Select")|| textField_1.getText().isEmpty())))
								JOptionPane.showMessageDialog(null, "Data Missing");
							
							else
							{
							JOptionPane.showMessageDialog(null, "Data Submitted");
							
							String productname= null;
							if(comboBox1.getSelectedItem().equals("Protein Powder"))
							{
								productname ="Protein Powder";
							}
							else if(comboBox1.getSelectedItem().equals("Adjustable Handgrip"))
							{
								productname ="Adjustable Handgrip";
							}
							else if(comboBox1.getSelectedItem().equals("Wrist band"))
							{
								productname ="Wrist band";
							}
							else if(comboBox1.getSelectedItem().equals("Resistance training band"))
							{
								productname ="Resistance training band";
							}
							else if(comboBox1.getSelectedItem().equals("Supplements"))
							{
								productname ="Supplements";
							}
							else if(comboBox1.getSelectedItem().equals("Protein Shaker"))
							{
								productname ="Protein Shaker";
							}
							else if(comboBox1.getSelectedItem().equals("Duffle bag"))
							{
								productname ="Duffle bag";
							}
							else if(comboBox1.getSelectedItem().equals("Towels"))
							{
								productname ="Towels";
							}
							
							String q= textField_1.getText();
							int stock= Integer.parseInt(q);
							
							product p= new product(productname, stock);
							
							
							
							
							
							}
						}
					});
					btnClear.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textField_1.setText(null);
							
							comboBox1.setSelectedItem("Select");
							
						}
					});
					
					frame2.setVisible(true);
					
				}		
			});
			
			JButton button10= new JButton("Go back");
			button10.setBounds(130, 330, 200, 25);
			button10.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					admin.dispose();
					Main1.getInstance().getFrameInstance().setVisible(true);
				}		
			});
			
			
			
			button1.setFocusable(false);
			button2.setFocusable(false);
			button3.setFocusable(false);
			button4.setFocusable(false);
			button5.setFocusable(false);
			button6.setFocusable(false);
			button7.setFocusable(false);
		
			button10.setFocusable(false);
			
			
		
			button1.setFont(new Font("Garamond", Font.BOLD,12));
			button2.setFont(new Font("Garamond", Font.BOLD,12));
			button3.setFont(new Font("Garamond", Font.BOLD,12));
			button4.setFont(new Font("Garamond", Font.BOLD,12));
			button5.setFont(new Font("Garamond", Font.BOLD,12));
			button6.setFont(new Font("Garamond", Font.BOLD,12));
			button7.setFont(new Font("Garamond", Font.BOLD,12));
			
			button10.setFont(new Font("Garamond", Font.BOLD,12));

			
			
			
		back1.add(button1);
		back1.add(button2);
		back1.add(button3);
		back1.add(button4);
		back1.add(button5);
		back1.add(button6);
		back1.add(button7);
		back1.add(button10);


			
			button1.setBackground(Color.white);
			button2.setBackground(Color.white);
			button3.setBackground(Color.white);
			button4.setBackground(Color.white);
			button5.setBackground(Color.white);
			button6.setBackground(Color.white);
			button7.setBackground(Color.white);
	
			button10.setBackground(Color.white);
			
			admin.setVisible(true);

		}
		else
		{
		  JOptionPane.showMessageDialog(null,"Wrong Password","Incorrect Creditials",JOptionPane.WARNING_MESSAGE);
		  frame1.dispose();
		  Main1.getInstance().getFrameInstance().setVisible(true);
		}
		
		

		
		
	}

}
