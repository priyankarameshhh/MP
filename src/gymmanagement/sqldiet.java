package gymmanagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class sqldiet {
	
	void adddiet(diet D) throws Exception
	{
	String url="jdbc:mysql://localhost:3306/AF";
	String username="root";
	String password="root";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection(url, username, password);
		{
		
			
			String sql= "INSERT INTO dietchart (day, cid, breakfast , midbreakfast, lunch , afterlunch, evening , dinner, DOA ) VALUES (?,?,?,?,?,?,?,?,?);";
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1,D.day );
			st.setInt(2, D.cid);
			st.setString(3,D.breakfast);
			st.setString(4, D.midbreakfast);
			st.setString(5, D.lunch);
			st.setString(6, D.afterlunch);
			st.setString(7, D.evening);
			st.setString(8, D.dinner);
			st.setDate(9, D.doa);
			
			boolean result;
		    result= st.execute();
				
		    System.out.println("done");
			System.out.println(result);		
		}
		con.close();
	}
	
	
	
	
	ArrayList<diet> adddiet(int id) throws Exception
	{
		
		ArrayList<diet> dd=new ArrayList<diet>();
		String url="jdbc:mysql://localhost:3306/AF";
		String username="root";
		String password="root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection(url, username, password);
		
		String sql= "select * from dietchart WHERE cid="+id ;
		PreparedStatement st= con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		
		diet d1 = null ;
			
			while(rs.next())
	
	        {
			String day = rs.getString(1);
	        int cid= rs.getInt(2);
	        String  breakfast= rs.getString(3);
	        String  midbreakfast= rs.getString(4);
	        String  lunch= rs.getString(5);
	        String  afterlunch= rs.getString(6);
	        String  evening= rs.getString(7);
	        String  dinner= rs.getString(8);
	        Date date= rs.getDate(9);
	        
	        d1= new diet(day, cid, breakfast, midbreakfast, lunch, afterlunch, evening, dinner, date);
	       
	        dd.add(d1);
	        
	        }
			con.close();
			
		return dd;	
	
	
	
}
	void updatediet(int id) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/AF";
		String username="root";
		String password="root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection(url, username, password);
		
		String sql= "UPDATE customer SET dietchart= TRUE WHERE cid="+id;
		PreparedStatement st= con.prepareStatement(sql);
		boolean result;
	    result= st.execute();
			
	    System.out.println("done");
		System.out.println(result);	
		
		con.close();
			
	}
	static void updatedietafteraweek(int id) throws Exception
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
		
		String sql= "update customer join dietchart on customer.cid=dietchart.cid set customer.dietchart=false where customer.cid=dietchart.cid and ? = dietchart.DOA+7 " ;
		PreparedStatement st= con.prepareStatement(sql);
		st.setDate(1, sqldate);
		
		con.close();
			
	}
	
	
}