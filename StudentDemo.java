package oopsconcepts;

class Student {
int id;
String name,address,course;
float fees;
void setData(int i,String n,String add, String c,float f )
{
	id=i;
	name=n;
	address=add;
	course=c;
	fees=f;
}
void displayData()
{
System.out.println("Id:"+id);
System.out.println("Name:"+name);
System.out.println("Adress:"+address);
System.out.println("Course:"+course);
System.out.println("Fees:"+fees);
}

}
public class StudentDemo {
public static void main(String[] args) {
	Student Surya=new Student();
	Surya.setData(101,"Surya","BBSR","java full stack",2000.0f);
	
	Surya.displayData();
	System.out.println("******************");
	
	Student Mukesh=new Student();
	Mukesh.setData(111,"Mukesh","BBSR","Java",3000.0f);
	Mukesh.displayData();
}

}
