package oopsconcepts;
class Person
    {
	int id;
	String name,address;
public Person(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
void display()
   {
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Address:"+address);
   }

   }
class StudentsDetails extends Person
   {
         float marks;
public StudentsDetails(int id,String name,String address,float marks)
   {
	super(id,name,address);
	this.marks=marks;
   }

void getData()
   {
	super.display();
	System.out.println("Marks:"+marks);
    }
	
    }
public class SingleInheritanceDemo {
public static void main(String[] args) {
 StudentsDetails obj=new StudentsDetails(101,"suryakanta","bhubaneswar",85.0f);
 obj.getData();
	}
}
