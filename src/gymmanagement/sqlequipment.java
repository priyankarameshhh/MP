package gymmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class sqlequipment {
	
	void addequipment(Equip E) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/AF";
		String username="root";
		String password="root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(url, username, password);
		boolean result;
		System.out.println("CS");
		if(E.weight==0) {
			String sql= "INSERT INTO equipment (quantity, type) VALUES (?,?);";
			PreparedStatement st= con.prepareStatement(sql);
			st.setInt(1, E.quantity);
			st.setString(2,E.type);
			result = st.execute();
		}
		
		else {
			String sql= "INSERT INTO equipment (quantity, type, weight) VALUES (?,?,?);";
			PreparedStatement st= con.prepareStatement(sql);
			st.setInt(1, E.quantity);
			st.setString(2,E.type);
			st.setDouble(3,E.weight);
			result = st.execute();
		}
		
		System.out.println(result);
		con.close();
	}
	

}
