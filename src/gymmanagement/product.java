package gymmanagement;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class product {
	
	int stock;
	String productname;
	Date dom;
	Date doe;
	
	
	
	product( String productname, int stock)
	{
		this.productname= productname;
		this.stock=stock;
	}
	
	product( String productname, int stock, Date dom, Date doe)
	{
		this.productname= productname;
		this.stock=stock;
		
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
		
		 LocalDate localDate = sqldate.toLocalDate();

	     LocalDate newDate = localDate.minusDays(30);
	     LocalDate expDate = localDate.plusDays(60);
		
		this.dom= Date.valueOf(newDate);
		this.doe=Date.valueOf(expDate);
		
		
	}

}
