package oopsconcepts;
class Employeee{
	int id;
	String name,designation;
	double basicSalary;
	static String organisation="Anudip";
	
	public Employeee(int id, String name,String designation , double basicSalary)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicSalary=basicSalary;
	}
	public void display()
	{
		System.out.println("Id: "+this.id+" "+"Name:"+this.name +" Designation: "+this.designation+ " BasicSalary:"+this.basicSalary+"Organisation:"+organisation);
	}

	}
public class ConstroctorDemo {

	public static void main(String[] args) {
Employeee emp1=new Employeee(105,"Surya","Manager",50000);
Employeee emp2=new Employeee(108,"mr.suryakanta","Developer",40000);
emp1.display();
	
emp2.display();
}
}