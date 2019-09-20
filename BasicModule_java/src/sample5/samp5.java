package sample5;

import java.io.IOException;
import java.util.Scanner;

public class samp5 {
	public static  void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number=in.nextInt();
		int a[]=new int[number];
		System.out.println("Enter the number of mark");
		for (int i=0;i<number;i++)
		{
			a[i]=in.nextInt();
		}
		int sum=0;
		for (int i=0;i<number;i++)
		{
			sum+=a[i];
				
			}
		float avg=sum/number;
		
		
			System.out.println("Average   :"+avg);
	
	
}
}




