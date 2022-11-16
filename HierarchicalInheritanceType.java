package oopsconcepts;
class Banks
    {
	int rateOfIntrest()
	{
	return 5; 
	}
    }
class Sbi extends Banks
	{
	int rateOfIntrest()
	{
	   return 8;	
	}
    }
class Axis extends Banks
    {
	int rateOfIntrest() 
	{
		return 10;
	}
    }
class Boi extends Banks
    {
	int rateOfIntrest() 
	{
		return 7;
	}
    }


public class HierarchicalInheritanceType 
   {

public static void main(String[] args) 
  {
   Sbi sbi=new Sbi();
       System.out.println("Rate Of Inttrest SBI:"+sbi.rateOfIntrest()+"%");
   Axis axis=new Axis();
       System.out.println("Rate Of Inttrest AXIS:"+axis.rateOfIntrest()+"%");
   Boi boi=new Boi();
       System.out.println("Rate Of Inttrest BOI:"+boi.rateOfIntrest()+"%");
	}

}
