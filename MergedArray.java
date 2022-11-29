package arrayexamples;

import java.util.Scanner;

public class MergedArray {

	public static void main(String[] args) {
	
     int first[],sec[],third[],size1,size2,i,k;//first[],sec[],third[]for array and size1,2for length of array.
        Scanner sc=new
        Scanner(System.in);
        //initializing 1st array
 System.out.println("Enter size of first array");
       
 size1=sc.nextInt();
         first=new int[size1];
 System.out.println("Enter "+ size1+" elements in first array");
   for (i=0;i<size1;i++)
{
  	first[i]=sc.nextInt();
}
   //initializing 2nd array
 System.out.println("Enter size of second array");
	     size2=sc.nextInt();
	     sec=new int[size2];
 System.out.println("Enter "+ size2+" elements in second array");
	for (i=0;i<size2;i++)
{
		sec[i]=sc.nextInt();
}
	//initializing third array
        third=new int[size1+size2];
        //assigning 1st array value to third array
	for (i=0;i<size1;i++)
{
		third[i]=first[i];
}
k=i;                   //assigning I value to k
//assigning 2nd array values to third array
    for(i=0;i<size2;i++)
{
	third[k++]=sec[i];
}
    //final print after merging array 1&2 into third array
  System.out.println("Out put after merging::");
	for(i=0;i<third.length;i++)

{
  System.out.println(third[i]+"");
    }
}
}
	


