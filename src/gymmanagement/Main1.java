package gymmanagement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;

public class Main1 {
	
	 public static Main1 mInstance;
	 private static JFrame frame;
	  
	 public static Main1 getInstance() {
	        if(mInstance == null) 
	            mInstance = new Main1();
	        return mInstance;
	 }
	 public JFrame getFrameInstance() {
	        return frame;
	 }

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

//		JLabel l= new JLabel();
//		l.setText("Welcome to Absolute Fitness");
		
//		URL url1= new URL("https://export-download.canva.com/_FpV8/DAFsbu_FpV8/22/0-6656721041975642399.gif?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJHKNGJLC2J7OGJ6Q%2F20230824%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230824T062937Z&X-Amz-Expires=83123&X-Amz-Signature=81c829e5573214adbe32e1a6a065b98673a8b7f24d261884da8bc77667a4e86d&X-Amz-SignedHeaders=host&response-content-disposition=attachment%3B%20filename%2A%3DUTF-8%27%27AFq.gif&response-expires=Fri%2C%2025%20Aug%202023%2005%3A35%3A00%20GMT");
//		JFrame gif1= new JFrame("Absolute fitness");
//		ImageIcon icon1= new ImageIcon(url1);
//		JLabel label1= new JLabel(icon1);
//		gif1.getContentPane().add(label1);
//		gif1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		gif1.pack();
//		gif1.setLocationRelativeTo(null);
//		gif1.setVisible(false);
		// https://export-download.canva.com/_FpV8/DAFsbu_FpV8/22/0-2798262060261062802.gif?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJHKNGJLC2J7OGJ6Q%2F20230824%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230824T052303Z&X-Amz-Expires=87672&X-Amz-Signature=9a8a24004768d67b1fee6eb89d7a4287f08ecba0477eded852a24c9768ac99f9&X-Amz-SignedHeaders=host&response-content-disposition=attachment%3B%20filename%2A%3DUTF-8%27%27AFq.gif&response-expires=Fri%2C%2025%20Aug%202023%2005%3A44%3A15%20GMT
		//URL url= new URL("https://export-download.canva.com/_FpV8/DAFsbu_FpV8/32/0-3722626396035258490.gif?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJHKNGJLC2J7OGJ6Q%2F20230829%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230829T200319Z&X-Amz-Expires=33898&X-Amz-Signature=997e93273c4e6a6768fd41d8f49f6a85c6a46eca97fc8a2fe2e7943a7336a134&X-Amz-SignedHeaders=host&response-content-disposition=attachment%3B%20filename%2A%3DUTF-8%27%27AFq.gif&response-expires=Wed%2C%2030%20Aug%202023%2005%3A28%3A17%20GMT");
		JFrame gif= new JFrame("Welcome");
		ImageIcon icon= new ImageIcon("C:\\Users\\priyanka.rd\\eclipse-workspace\\MP\\src\\AFq.gif");
		JLabel label= new JLabel(icon);
		gif.getContentPane().add(label);
		gif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gif.pack();
		gif.setLocationRelativeTo(null);
		gif.setVisible(true);
		
		
		
		frame= new JFrame();
		
		frame.setSize(630,400);
		
//		frame.setBounds(250, 270, 750, 700);
		frame.setTitle("Absolute Fitness");
//		frame.setResizable(false);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(false);
		
		JButton b1= new JButton(".");
		b1.setBounds(65, 260, 10, 10);
		b1.setFocusable(false);
		
		b1.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						gif.dispose();
						b1.setFocusable(false);
						
						frame.setVisible(true);
						
						JLabel lblName = new JLabel("W E L C O M E   T O");
						lblName.setBounds(65, 75, 270, 100);
						lblName.setForeground(Color.white);
						lblName.setFont(new Font("Serif", Font.BOLD,24));
						frame.getContentPane().add(lblName);
						JLabel lblName1 = new JLabel("A B S O L U T E ");
						lblName1.setBounds(65, 105, 270, 100);
						lblName1.setForeground(Color.white);
						lblName1.setFont(new Font("Serif", Font.BOLD,24));
						frame.getContentPane().add(lblName1);
						JLabel lblName2 = new JLabel("F I T N E S S   S T U D I O ");
						lblName2.setBounds(65, 135, 290, 100);
						lblName2.setForeground(Color.white);
						lblName2.setFont(new Font("Serif", Font.BOLD,24));
						frame.getContentPane().add(lblName2);
						
						JLabel lblName3 = new JLabel("G E T   F I T   |   D O N T   Q U I T");
						lblName3.setBounds(70, 185, 270, 100);
						lblName3.setForeground(Color.white);
						lblName3.setFont(new Font("Serif", Font.BOLD,12));
						frame.getContentPane().add(lblName3);
						
						JButton button= new JButton("Admin");
						button.setBounds(420, 110, 100, 20);
						
						
						button.addActionListener(new ActionListener() 
						{

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								if(e.getSource()== button)
								{
//									frame.dispose();
									adminWindow admin= new adminWindow();
								
								}	
//								button.setEnabled(false);
							}		
						});
						
						JButton button1= new JButton("Customer");
						button1.setBounds(420, 160, 100, 20);	
						button1.addActionListener(new ActionListener() 
						{
							

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								if(e.getSource()==button1)
								{
									frame.dispose();
									try {
										customerWindow c= new customerWindow();
									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}	
								}
								
							}			
						});
						JButton button2= new JButton("Staff");
						button2.setBounds(420, 210, 100, 20);
						button2.addActionListener(new ActionListener() 
						{
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								if(e.getSource()== button2)
								{
									frame.dispose();
									trainerWindow t= new trainerWindow();
								}	}
						});
						
						button.setFocusable(false);
						button1.setFocusable(false);
						button2.setFocusable(false);
						
						button.setFont(new Font("Garamond", Font.BOLD,14));
						button1.setFont(new Font("Garamond", Font.BOLD,14));
						button2.setFont(new Font("Garamond", Font.BOLD,14));
						
//						back.add(button);
//						back.add(button1);
//						back.add(button2);
						
//						b.setBackground(Color.black);
//						b1.setBackground(Color.white);
//						label.add(b);
//						label1.add(b1);
						frame.add(button);
						frame.add(button1);
						frame.add(button2);
//						frame.add(back);
						frame.getContentPane().setBackground(Color.black);
						button.setBackground(Color.white);
						button1.setBackground(Color.white);
						button2.setBackground(Color.white);
						
					
//						label.setBorder(border);
						
				
						
					}
			
				});
		
		
		
		b1.setBackground(Color.white);
		label.add(b1);
		

	}

}
