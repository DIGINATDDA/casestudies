package sample11;

import java.io.IOException;
import java.util.Scanner;

public class samp11 {
	public static  void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of application");
		int number=in.nextInt();
		int a[]=new int[number];
		System.out.println("Enter the amount(in crores");
		for (int i=0;i<number;i++)
		{
			a[i]=in.nextInt();
		}
		int temp;
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
		
		
			System.out.println("The winning bid is "+a[number-1]+"crores");
	
	
}
}

