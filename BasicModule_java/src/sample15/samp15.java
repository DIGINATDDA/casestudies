package sample15;

import java.io.IOException;
import java.util.Scanner;

public class samp15 {
	public static  void main(String[] args) throws IOException
	{

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=in.nextInt();
		int a[]=new int[number];
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
		
		{
			a[i]=in.nextInt();
		}
		}
		
			System.out.println("The divisors of the number are");
			for(int i=1;i<=number;i++)
		}
		


