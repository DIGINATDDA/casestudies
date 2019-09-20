package sample7;

import java.io.IOException;
import java.util.Scanner;

public class samp7 {
	public static  void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number alphabets in your name");
		int number=in.nextInt();
		
		 int combination=1;
	
		for (int i=1;i<=number;i++)
		{
		combination*=i;
		
		}
		
		
		{
			System.out.println("The number of combination is "+combination);
			
	}
	
}
}



