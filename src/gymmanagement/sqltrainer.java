package gymmanagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class sqltrainer {
	
	void addtrainer(Trainer T) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/AF";
		String username="root";
		String password="root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(url, username, password);
		
		String sql= "INSERT INTO trainer (tname, tgender, texp,tpassword, LPA, Designation, Salary, Phone, DOJ) VALUES (?,?,?,?,?,?,?,?,?);";
		PreparedStatement st= con.prepareStatement(sql);
		st.setString(1, T.tname );
		st.setString(2, T.tgender);
		st.setString(3, T.texp);
		st.setString(4, T.tpassword);
		st.setDouble(5, T.lpa);
		st.setString(6, T.designation);
		st.setDouble(7, T.salary);
		st.setString(8, T.phone);
		st.setDate(9, T.doj);
		
	   boolean result;
	   result= st.execute();
		
		System.out.println("done");
		System.out.println(result);
		con.close();
	}
	
	 Trainer viewTrainer(int id) throws SQLException, Exception {
		String url="jdbc:mysql://localhost:3306/AF";
		String username="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection(url, username, password);
		
		String query = "select * from trainer where tid = "+id;
	    
	      PreparedStatement stmt = con.prepareStatement(query) ;
	      ResultSet rs = stmt.executeQuery(query);
	      
	      Trainer t1 = null ;
	      while (rs.next()) 
	      {
	        int tid = rs.getInt(1);
	        String name = rs.getString(2);
			String gender= rs.getString(3);
			String exp= rs.getString(4);
			String mypassword=rs.getString(5);
			double LPA= rs.getDouble(6);
			String Designation= rs.getString(7);
			double salary= rs.getDouble(8);
			String phone=rs.getString(9);
			Date doj= rs.getDate(10);
			
			System.out.println(doj);
			
	        //String tname, String texp, String phone, String tpassword, String tgender)
	        t1= new Trainer(name, exp, phone , mypassword, Designation, gender, doj);     
		
	        
	  }
	  con.close(); 
	return t1;
//		return name;
}}
//	List<Trainer> getTrainer() throws Exception{
//		String url="jdbc:mysql://localhost:3306/AF";
//		String username="root";
//		String password="root";
//		
//		List<Trainer> trainers = new ArrayList<Trainer>();
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con= DriverManager.getConnection(url, username, password);
//		
//		String sql = "Select * from trainer";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ResultSet rs = ps.executeQuery();
//		int count =0;
//		while(rs.next()) {
//			int tid = rs.getInt(1);
//			String tname= rs.getString(2);
//			String gender= rs.getString(3);
//			String texp= rs.getString(4);
//			double tsalary= rs.getDouble(5);
//			String tpassword= rs.getString(6);
//			boolean assigned = rs.getBoolean(7);
//			String phone= rs.getString(8);
//			//String tname, String texp, String phone, String tpassword, String tgender, boolean isAssigned
//			trainers.add(new Trainer(tname,texp,phone,tpassword,gender,assigned));
//			trainers.get(count++).setTid(tid); 
//		}
//		
//		return trainers;
//	}
	
	
//	Trainer gettrainerbyid(int id) throws Exception
//	{
//		String url="jdbc:mysql://localhost:3306/AF";
//		String username="root";
//		String password="root";
//		
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con= DriverManager.getConnection(url, username, password);
//		
//		String sql= "SELECT * from trainer WHERE tid = ?";
//		PreparedStatement st= con.prepareStatement(sql);
//		st.setInt(1, id);
//		
//		ResultSet rs = st.executeQuery();
//		Trainer t;
//		
//		while(rs.next())
//		{
//			
//		}
//		return null;
//	}


