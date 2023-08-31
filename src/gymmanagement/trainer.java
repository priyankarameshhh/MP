package gymmanagement;

import java.sql.Date;
import java.text.DecimalFormat;
import java.util.Random;

class Trainer
{
	int tid;
	String tname;
	String texp;
	double salary;
	String designation;
	double lpa;
	String tgender;
	String tpassword;
	String phone;
	double tax;
	double mtax;
	Date doj;
	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}
	
	
	double callpa()
	{
		if(designation.equals("Supervisor") && texp.equals("Fresher"))
		{ lpa= 6.0;
		}
		else if(designation.contentEquals("Supervisor") && texp.contentEquals("Less than 2 years"))
		{ lpa=  7.0;
		}
		else if(designation.contentEquals("Supervisor") && texp.contentEquals("Less than 5 years"))
		{ lpa=  8.0;
		}
		else if(designation.contentEquals("Supervisor") && texp.contentEquals("More than 5 years"))
		{ lpa=  9.0;
		}
		else if(designation.contentEquals("Supervisor") && texp.contentEquals("More than 10 years"))
		{ lpa=  10.0;
		}
		
		
		else if(designation.contentEquals("Trainer") && texp.contentEquals("Fresher"))
		{ lpa= 4.0;
		}
		else if(designation.contentEquals("Trainer") && texp.contentEquals("Less than 2 years"))
		{ lpa=  4.5;
		}
		else if(designation.contentEquals("Trainer") && texp.contentEquals("Less than 5 years"))
		{ lpa=  5.5;
		}
		else if(designation.contentEquals("Trainer") && texp.contentEquals("More than 5 years"))
		{ lpa=  6.0;
		}
		else if(designation.contentEquals("Trainer") && texp.contentEquals("More than 10 years"))
		{ lpa=  7.5;
		}
		
		
		else if(designation.contentEquals("Nutrition Consultant") && texp.contentEquals("Fresher"))
		{ lpa= 4.5;
		}
		else if(designation.contentEquals("Nutrition Consultant") && texp.contentEquals("Less than 2 years"))
		{ lpa=  5.0;
		}
		else if(designation.contentEquals("Nutrition Consultant") && texp.contentEquals("Less than 5 years"))
		{ lpa=  6.0;
		}
		else if(designation.contentEquals("Nutrition Consultant") && texp.contentEquals("More than 5 years"))
		{ lpa=  7.0;
		}
		else if(designation.contentEquals("Nutrition Consultant") && texp.contentEquals("More than 10 years"))
		{ lpa=  8.0;
		}
		
		
		else if(designation.contentEquals("On-call Technician") && texp.contentEquals("Fresher"))
		{ lpa= 1.0;
		}
		else if(designation.contentEquals("On-call Technician") && texp.contentEquals("Less than 2 years"))
		{ lpa=  1.5;
		}
		else if(designation.contentEquals("On-call Technician") && texp.contentEquals("Less than 5 years"))
		{ lpa=  2.0;
		}
		else if(designation.contentEquals("On-call Technician") && texp.contentEquals("More than 5 years"))
		{ lpa=  2.5;
		}
		else if(designation.contentEquals("On-call Technician") && texp.contentEquals("More than 10 years"))
		{ lpa=  3.0;
		}
		
		
		else if(designation.contentEquals("Cleaner") && texp.contentEquals("Fresher"))
		{ lpa= 2.5;
		}
		else if(designation.contentEquals("Cleaner") && texp.contentEquals("Less than 2 years"))
		{ lpa=  3.0;
		}
		else if(designation.contentEquals("Cleaner") && texp.contentEquals("Less than 5 years"))
		{ lpa=  3.5;
		}
		else if(designation.contentEquals("Cleaner") && texp.contentEquals("More than 5 years"))
		{ lpa=  4.0;
		}
		else if(designation.contentEquals("Cleaner") && texp.contentEquals("More than 10 years"))
		{ lpa=  4.5;
		}
		
		
		else if(designation.contentEquals("Front desktop associate") && texp.contentEquals("Fresher"))
		{ lpa= 3.5;
		}
		else if(designation.contentEquals("Front desktop associate") && texp.contentEquals("Less than 2 years"))
		{ lpa=  4.0;
		}
		else if(designation.contentEquals("Front desktop associate") && texp.contentEquals("Less than 5 years"))
		{ lpa=  4.5;
		}
		else if(designation.contentEquals("Front desktop associate") && texp.contentEquals("More than 5 years"))
		{ lpa=  5.0;
		}
		else if(designation.contentEquals("Front desktop associate") && texp.contentEquals("More than 10 years"))
		{ lpa=  5.5;
		}
		
		return lpa;
		
	}

	double trainerSalary()
	{
		double tsalary = 0;
		
		double tlpa= lpa * 100000;
		if( tlpa <= 250000)
		{ tsalary= tlpa / 12;
			
		}
		else if( tlpa > 250000 && tlpa <= 500000)
		{    tax= 5/100 * tlpa ;
		     mtax= tax/12;
		     tsalary = (tlpa / 12) - mtax;     
		}
		else if(tlpa > 500000  && tlpa <= 750000)
		{  tax= 10/100 * tlpa;
		    mtax= tax/12;
		    tsalary= (tlpa  / 12) - mtax;	
		}
		else if(tlpa > 750000  && tlpa <= 1000000)
		{ tax= 20/100 * tlpa ;
			  mtax= tax/12;
		      tsalary= (tlpa / 12) - mtax;
		}
		else if(tlpa > 1000000  && tlpa <= 1250000)
		{ tax= 25/100 * tlpa ;
			  mtax= tax/12;
		      tsalary= (tlpa / 12) - mtax;
		}
		
		
		String tempsalary= String.format("%.2f",tsalary);
		salary= Double.parseDouble(tempsalary);
		
		
		
		return salary;
		
		
			
	}
	
	

	
	Trainer(String tname, String texp, String phone, String tpassword,String designation, String tgender, Date doj)
	{
		
		this.tname= tname;
		this.texp= texp;
		this.tpassword=tpassword;
		this.tgender=tgender;
		this.designation= designation;
		this.lpa=this.callpa();
		
//		this.mtax= mtax;
//		this.tax=tax;
		this.doj= doj;
		this.phone=phone;
		this.salary= this.trainerSalary();
	}
}



