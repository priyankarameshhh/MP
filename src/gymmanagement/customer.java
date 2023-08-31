package gymmanagement;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

class customer
{
	int cid;
	String cname;
	String cgender;
	double cweight;
	double cheight;
	double bmi;
	String gympackage;
	String password;
	String phone;
	String bodytype;
	double fees;
	double standardgst=0.18;
	double gst;
	Date doj;
	String training;
	boolean dietchart;
	String preference;
	boolean exercise;
	
	
	double calBMI()
	{
		double cbmi;
		cbmi= (cweight / ( cheight * cheight )) * 10000;
		String tempbmi= String.format("%.2f",cbmi);
		bmi= Double.parseDouble(tempbmi);
		
		return bmi;
	}
	
	String findbodytype()
	{
		if(bmi < 18.4)
			bodytype="Underweight";
		else if(bmi >= 18.5 && bmi <= 24.9)
			bodytype="Normal";
		else if(bmi >=25.0 && bmi <=39.9)
			bodytype="Overweight";
		else if(bmi > 40.0)
			bodytype="Obese";
		
		return bodytype;
			
	}
	
	String findTraining()
	{
		if(bodytype.equals("Underweight"))
		{
			training= "Muscle building";
		}
		else if(bodytype.equals("Normal"))
		{
			training="Toning";
		}
		else if(bodytype.equals("Overweight"))
		{
			training="Weight loss";
		}
		return training;
	}
	
	
	
	double calFees()
	{
		System.out.println("in class "+gympackage);
		if(gympackage.equals("3 months"))
		{
			gst= standardgst * 30000.0;
			fees=  gst + 30000.0;
		}
		else if(gympackage.equals("6 months"))
		{
			gst= standardgst * 60000.0;
			fees= gst + 60000.0;
		}
		else if(gympackage.equals("12 months"))
		{
			gst= standardgst * 100000.0;
			fees= gst + 100000.0;
		}
		return fees;
	}
	
	customer(String cname, String cgender, double cweight, double cheight, String password, String gympackage, String phone, Date doj, String preference)
	{
//		this.cid= cid;
		this.cname= cname;
		this.cgender= cgender;
		this.cweight= cweight;
		this.cheight=cheight;
		this.gympackage=gympackage;	
		this.phone=phone;
		this.bmi= this.calBMI();
		this.password= password;
		this.fees=this.calFees();
		this.bodytype=findbodytype();
		this.doj= doj;
		this.preference= preference;
		this.training= this.findTraining();
		
		
	}
	customer(int cid, String cname, String cgender, double cweight, double cheight, String password, String gympackage, String phone, Date doj,boolean dietchart,boolean exercise, String preference)
	{
		this.cid= cid;
		this.cname= cname;
		this.cgender= cgender;
		this.cweight= cweight;
		this.cheight=cheight;
		this.gympackage=gympackage;	
		this.phone=phone;
		this.bmi= this.calBMI();
		this.password= password;
		this.fees=this.calFees();
		this.bodytype=findbodytype();
		this.doj= doj;
		this.dietchart= dietchart;
		this.exercise= exercise;
		this.preference= preference;
		this.training= this.findTraining();
		
	}
	customer(int cid, String cname, String cgender, double cweight, double cheight, String password, String gympackage, String phone, boolean exercise, Date doj,String preference)
	{
		this.cid= cid;
		this.cname= cname;
		this.cgender= cgender;
		this.cweight= cweight;
		this.cheight=cheight;
		this.gympackage=gympackage;	
		this.phone=phone;
		this.bmi= this.calBMI();
		this.password= password;
		this.fees=this.calFees();
		this.bodytype=findbodytype();
		this.doj= doj;
		this.exercise= exercise;
		this.preference= preference;
		this.training= this.findTraining();
		
	}
	
	
	
	
//	customer(String cname, String cgender, double cweight, double cheight, boolean isPremium, String password,String phone,Trainer T)
//	{
//		
//		this.cname= cname;
//		this.cgender= cgender;
//		this.cweight= cweight;
//		this.cheight=cheight;
//		this.phone=phone;
//		this.bodytype=findbodytype();
//	
//		this.cbmi= this.calBMI();
//		this.password= password;
//		this.isPremium= isPremium;
//		this.t=T;
//	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
}