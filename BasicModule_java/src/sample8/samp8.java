package sample8;

import java.io.IOException;
import java.util.Scanner;


public class samp8 {
	public static  void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=in.nextInt();
		int f1=0,f2=1,f3;
		System.out.println("The fibonacci series is ");
		System.out.println(""+f1);
		System.out.println(""+f2);
			for(int i=2;i<number;i++)
			{
				 f3=f1+f2;
				System.out.println(""+f3);
				f1=f2;
				f2=f3;
				
			}
			

}
}
