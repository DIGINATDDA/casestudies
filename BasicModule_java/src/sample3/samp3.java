package sample3;

import java.io.IOException;
import java.util.Scanner;

public class samp3 {
	public static  void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number=in.nextInt();
		float a[]=new float[number];
		System.out.println("Enter the number of height");
		for (int i=0;i<number;i++)
		{
			a[i]=in.nextFloat();
		}
		float temp;
		for (int i=0;i<number;i++)
		{
			for(int j=i+1;j<number;j++)
			{
				if (a[i]>a[j])
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
