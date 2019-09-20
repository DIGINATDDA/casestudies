package sample2;

import java.io.IOException;
import java.util.Scanner;

public class samp2 {
	
	
	public static  void main(String[] args) throws IOException
	{
		Scanner dig=new Scanner(System.in);
		System.out.println("Enter your Number");
		int number=dig.nextInt();
		int r,count=0;
		double sum=0;
		int temp=number;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
			
		}
		temp=number;
		while(temp!=0){
			r=temp%10;
			sum=sum+Math.pow(r,count);
			temp=temp/10;
		}
		if(number==sum)
			
		{
	System.out.println("The given number is amstrong");
	
	}
	else
	{
		System.out.println("The given number is not amstrong");
	}
		
	}
}
	

		