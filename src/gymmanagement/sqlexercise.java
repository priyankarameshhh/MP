package gymmanagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class sqlexercise {
	
	void addexercise(exercise E) throws Exception
	{
	String url="jdbc:mysql://localhost:3306/AF";
	String username="root";
	String password="root";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection(url, username, password);
	{
	
		
		String sql= "INSERT INTO exercise (cid , day , exercise1, exercise2, exercise3,exercise4, DOA) VALUES (?,?,?,?,?,?,?);";
		PreparedStatement st= con.prepareStatement(sql);
		st.setInt(1,E.cid );
		st.setString(2,E.day);
		st.setString(3, E.ex1);
		st.setString(4, E.ex2);
		st.setString(5, E.ex3);
		st.setString(6, E.ex4);
		st.setDate(7, E.doa);
		
		System.out.println("done");
		boolean result;
		result= st.execute();
		System.out.println(result);
		
		
		}
	con.close();
	}
	ArrayList<exercise> addexercise(int id) throws Exception
	{
		
		ArrayList<exercise> ee=new ArrayList<exercise>();
		String url="jdbc:mysql://localhost:3306/AF";
		String username="root";
		String password="root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection(url, username, password);
		
		String sql= "select * from exercise WHERE cid="+id ;
		PreparedStatement st= con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		
		exercise e1 = null ;
			
			while(rs.next())
	
	        {
			
	        int cid= rs.getInt(1);
	        String day = rs.getString(2);
	        String  ex1= rs.getString(3);
	        String  ex2= rs.getString(4);
	        String  ex3= rs.getString(5);
	        String  ex4= rs.getString(6);
	        Date doa= rs.getDate(7);
	  
	        
	        e1= new exercise(day, cid, ex1, ex2, ex3, ex4,doa);
	       
	        ee.add(e1);
	        
	        }
			con.close();
			
		return ee;	
	
}
	void updateexercise(int id) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/AF";
		String username="root";
		String password="root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection(url, username, password);
		
		String sql= "UPDATE customer SET exercise= TRUE WHERE cid="+id;
		PreparedStatement st= con.prepareStatement(sql);
		boolean result;
	    result= st.execute();
			
	    System.out.println("done");
		System.out.println(result);	
		
		
	}
	static void updateexerciseafteraweek(int id) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/AF";
		String username="root";
		String password="root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		

		Connection con=DriverManager.getConnection(url, username, password);
		
		java.util.Date date1= new java.util.Date();
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
		
		String sql= "update customer join exercise on customer.cid=exercise.cid set customer.exercise=false where customer.cid=exercise.cid and ? = exercise.DOA+7 " ;
		PreparedStatement st= con.prepareStatement(sql);
		st.setDate(1, sqldate);
		
		con.close();
			
	}
	
	

}
