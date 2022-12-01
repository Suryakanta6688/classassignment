package arrayexamples;

import java.util.Scanner;

public class InsertInSpecificPosition {

	public static void main(String[] args) {
  int size,pos, i, num;
  Scanner sc=new Scanner(System.in);
  int arr[]=new int[10];
  System.out.println("Enter how many elements you want in an array ");
  size=sc.nextInt();
  
  System.out.println("Enter "+size+" elements in array ");
  for (i=0;i<size;i++)
  {
	  arr[i]=sc.nextInt();
   }
  System.out.println("Enter position");
  pos=sc.nextInt();
  if (pos>size|| pos<0 || pos==size)
  {
	  System.out.println("chose position according to size");
  }
  else 
  {
  System.out.println("Enter the value to insert");
  num=sc.nextInt();
  for (i=size;i>pos;i--)
  {
	  arr[i]=arr[i-1];
  }
  arr[pos-1]= num;
  size++;
  System.out.println("After adding new value ,new arry will be");
  for(i=0;i<size;i++)
  {
	  System.out.print(arr[i]+" ");
       }
	 }
   }
}