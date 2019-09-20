package sample4;

import java.io.IOException;
import java.util.Scanner;

public class samp4 {
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
		int temp;
		for (int i=0;i<number;i++)
		{
			for(int j=i+1;j<number;j++)
			{
				if (a[i]<a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		for (int i=0;i<number;i++)
		{
			System.out.println(+a[i]);
	}
	
}
}



