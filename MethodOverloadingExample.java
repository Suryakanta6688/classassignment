package oopsconcepts;
class Calculator{
	int add(int a, int b)
	{
		return a+b;
    }
	int add(int a,int b ,int c)
	{
		return a+b+c;
	}
	double add (int a,double b)
    {
	return a+b;
	}
	double add(double a, int b)
	{
	return a+b;
	}
	}
public class MethodOverloadingExample {

	public static void main(String[] args) {
		Calculator Calc=new Calculator();
		System.out.println(Calc.add(34 ,99,67));

	}

}
