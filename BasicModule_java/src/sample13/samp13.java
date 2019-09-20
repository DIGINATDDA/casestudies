package sample13;

import java.io.IOException;
import java.util.Scanner;

public class samp13 {
	public static  void main(String[] args) throws IOException
	{

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=in.nextInt();
		int sum=0;
		if(number<0)
		{
			System.out.println("Enter a number");
			number=in.nextInt();
		}
		
		for(int i=1;i<=number;i++)
		{
		sum+=i;	
		
		
		}
		System.out.println("The sum is"+sum);	
		
		
}
}
