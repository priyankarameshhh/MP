package gymmanagement;

class Equip
{
	int eid;
	int quantity;
	String type;
	double weight;
	
	Equip(String type,int quantity)
	{
		this.type= type;
		this.quantity=quantity;
	}
	
	Equip(String type,double weight,int quantity)
	{
		this.type= type;
		this.quantity=quantity;
		this.weight=weight;
		
	}
}