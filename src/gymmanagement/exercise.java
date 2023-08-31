package gymmanagement;

import java.sql.Date;

public class exercise {
	
	String day;
	int cid;
	String ex1;
	String ex2;
	String ex3;
	String ex4;
	Date doa;
	
	exercise(String day,int cid, String ex1, String ex2, String ex3, String ex4, Date doa )
	{
		this.day=day;
		this.cid=cid;
		this.ex1=ex1;
		this.ex2=ex2;
		this.ex3=ex3;
		this.ex4=ex4;
		this.doa=doa;
		
	}

}
