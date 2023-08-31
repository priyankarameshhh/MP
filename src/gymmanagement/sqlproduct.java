package gymmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class sqlproduct {
	
	void addproduct(product P) throws Exception
	{
	String url="jdbc:mysql://localhost:3306/AF";
	String username="root";
	String password="root";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection(url, username, password);
		{
		
			
			String sql= "INSERT INTO product (productname, stock ) VALUES (?,?);";
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1,P.productname );
			st.setInt(2, P.stock);
			
			boolean result;
		    result= st.execute();
				
		    System.out.println("done");
			System.out.println(result);		
		}
		con.close();
	}
	
	
	
	

}
