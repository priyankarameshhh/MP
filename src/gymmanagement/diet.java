package gymmanagement;

import java.sql.Date;

public class diet {
	
	String day;
	int cid;
	String breakfast;
	String midbreakfast;
	String lunch;
	String afterlunch;
	String evening;
	String dinner;
	Date doa;
	
	diet(String day,int cid,String breakfast,String midbreakfast,String lunch, String afterlunch,String evening,String dinner, Date doa)
	{
		this.day= day;
		this.cid=cid;
		this.breakfast= breakfast;
		this.midbreakfast=midbreakfast;
		this.lunch= lunch;
		this.afterlunch= afterlunch;
		this.evening= evening;
		this.dinner= dinner;
		this.doa= doa;
	}

}
