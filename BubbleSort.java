package arrayexamples;

import java.util.Scanner;

public class BubbleSort {

public static void main(String[] args) {
	int arr[]=new int[10],i,j,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 10 element in array");
	for (i=0;i<10;i++)
 
{
	arr[i]=sc.nextInt();
}
System.out.println(" Before sorting values are:");
    for(i=0;i<10;i++)
{
System.out.print(arr[i]+" ");
}
//now from here we create shorting
	for (i=0;i<10;i++)
	//for placing arr[i] elements to it's current position
{
	for(j=i+1;j<10;j++)
{
			//swap if currently selected element is not at its current position 
	if(arr[i]>arr[j])
{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
     }
  }
}//use for external for loop
	
System.out.println("\n After sorting in ascending order, values are:" );
	 for(i=0;i<10;i++)
{
System.out.print(arr[i]+ " ");
     }	 
   }
}
	


