package sample9;

import java.io.IOException;
import java.util.Scanner;

public class samp9 {
	public static  void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=in.nextInt();
		
			if(year%400==0)
			{
			System.out.println("It is a leap year");
			}
			else if (year%100==0)
			{
				System.out.println("It is  not a leap year");
			}
			else if (year%4==0)
			{
				System.out.println("It is a leap year");
			}
			else 
			{
				System.out.println("It is  not a leap year");
			}
	}
}



