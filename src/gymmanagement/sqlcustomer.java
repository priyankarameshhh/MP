package gymmanagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class sqlcustomer {
	
	
//	List<customer> cc = new ArrayList<customer>();
	//public static ArrayList<ArrayList<Object>> cc=new ArrayList<ArrayList<Object>>();
		
	
//	customer first = cc.get(0);
	
	void addcustomer(customer C) throws Exception
	{
	String url="jdbc:mysql://localhost:3306/AF";
	String username="root";
	String password="root";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection(url, username, password);
	{
	
		
		String sql= "INSERT INTO customer (cname , cgender, cweight, cheight, cbmi,password, phone, type, package, fees, DOJ, dietchart, preference, training, exercise) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement st= con.prepareStatement(sql);
		st.setString(1,C.cname );
		st.setString(2,C.cgender);
		st.setDouble(3, C.cweight);
		st.setDouble(4, C.cheight);
		st.setDouble(5, C.bmi);
		st.setString(6, C.password);
		st.setString(7, C.phone);
		st.setString(8, C.bodytype);
		st.setString(9, C.gympackage);
		st.setDouble(10, C.fees);
		st.setDate(11, C.doj);
		st.setBoolean(12, C.dietchart);
		st.setString(13, C.preference);
		st.setString(14, C.training);
		st.setBoolean(15, C.exercise);
		
		System.out.println("done");
		boolean result;
		result= st.execute();
		System.out.println(result);
		
		
		}
	con.close();
	}
	
	 customer viewCustomer(int id) throws SQLException, Exception {
		String url="jdbc:mysql://localhost:3306/AF";
		String username="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection(url, username, password);
//	    String query = "select cname from customer where cid = "+id;
//	    
//	      PreparedStatement stmt = con.prepareStatement(query) ;
//	      ResultSet rs = stmt.executeQuery(query);
//	      
//	     String name = null;
//	      while (rs.next()) 
//	      {
//	    	  name = rs.getString(1);  
//	    	  System.out.println(name);
//	    	  
//	      }
		
		
		String query = "select * from customer where cid = "+id;
	    
	      PreparedStatement stmt = con.prepareStatement(query) ;
	      ResultSet rs = stmt.executeQuery(query);
	      
	      customer c1 = null ;
	      while (rs.next()) 
	      {
	        int cid = rs.getInt(1);
	        String name = rs.getString(2);
			String gender= rs.getString(3);
			double weight= rs.getDouble(4);
			double height= rs.getDouble(5);
			double bmi= rs.getDouble(6);
			String mypassword=rs.getString(7);
			String phone=rs.getString(8);
			String type=rs.getString(9);
			String mypackage= rs.getString(10);
			double fees=rs.getDouble(11);
			Date doj=rs.getDate(12);
			boolean dietchart=rs.getBoolean(13);
			// perference, training, exercise
			String preference= rs.getString(14);
			String training= rs.getString(15);
			boolean exercise= rs.getBoolean(16);
			
	
			
			
	//int cid, String cname, String cgender, double cweight, double cheight, String password, String gympackage, String phone, Date doj,boolean dietchart,String preference
	       
	        c1= new customer(cid, name, gender, weight, height, mypassword, mypackage, phone, doj,dietchart,exercise, preference);     
		
	        
	  }
	con.close();
  	return c1;
//	
}
	 customer viewCustomer(String cusname) throws SQLException, Exception {
			String url="jdbc:mysql://localhost:3306/AF";
			String username="root";
			String password="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection(url, username, password);
//		    String query = "select cname from customer where cid = "+id;
//		    
//		      PreparedStatement stmt = con.prepareStatement(query) ;
//		      ResultSet rs = stmt.executeQuery(query);
//		      
//		     String name = null;
//		      while (rs.next()) 
//		      {
//		    	  name = rs.getString(1);  
//		    	  System.out.println(name);
//		    	  
//		      }
			
			
			String query = "select * from customer where cname = "+cusname+";";
			System.out.println(query);
		    
		      PreparedStatement stmt = con.prepareStatement(query) ;
		      ResultSet rs = stmt.executeQuery(query);
		      
		      customer c1 = null ;
		      while (rs.next()) 
		      {
		        int cid = rs.getInt(1);
		        String name = rs.getString(2);
				String gender= rs.getString(3);
				double weight= rs.getDouble(4);
				double height= rs.getDouble(5);
				double bmi= rs.getDouble(6);
				String mypassword=rs.getString(7);
				String phone=rs.getString(8);
				String type=rs.getString(9);
				String mypackage= rs.getString(10);
				double fees=rs.getDouble(11);
				Date doj=rs.getDate(12);
				boolean dietchart=rs.getBoolean(13);
				// perference, training, exercise
				String preference= rs.getString(14);
				String training= rs.getString(15);
				boolean exercise= rs.getBoolean(16);
				
		
				
				
		//int cid, String cname, String cgender, double cweight, double cheight, String password, String gympackage, String phone, Date doj,boolean dietchart,String preference
		       
		        c1= new customer(cid, name, gender, weight, height, mypassword, mypackage, phone, doj,dietchart,exercise, preference);     
			
		        
		  }
		con.close();
	  	return c1;
	//	
	}
	 ArrayList<customer> viewCustomer() throws SQLException, Exception {
		 	
		 
		 ArrayList<customer> ccc=new ArrayList<customer>();

		 
			String url="jdbc:mysql://localhost:3306/AF";
			String username="root";
			String password="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection(url, username, password);

			
			
			String query = "select * from customer";
		    
		      PreparedStatement stmt = con.prepareStatement(query) ;
		      ResultSet rs = stmt.executeQuery(query);
		      
		      customer c1 = null ;
		      while (rs.next()) 
		      {
		        int cid = rs.getInt(1);
		        String name = rs.getString(2);
				String gender= rs.getString(3);
				double weight= rs.getDouble(4);
				double height= rs.getDouble(5);
				double bmi= rs.getDouble(6);
				String mypassword=rs.getString(7);
				String phone=rs.getString(8);
				String type=rs.getString(9);
				String mypackage= rs.getString(10);
				double fees=rs.getDouble(11);
				Date doj=rs.getDate(12);
				boolean dietchart=rs.getBoolean(13);
				String preference= rs.getString(14);
				String training= rs.getString(15);
				boolean exercise= rs.getBoolean(16);
//				
				
			
				
				 c1= new customer(cid,name, gender, weight, height, mypassword, mypackage, phone,doj,dietchart,exercise, preference);
				 ccc.add(c1);
			
		        
		  }
		con.close();
	  	return ccc;
	//	
	}
//	 void addToList(customer viewCustomer) {
//			this.cc.add(viewCustomer);
//			
//		}
}
