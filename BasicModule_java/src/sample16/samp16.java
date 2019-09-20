package sample16;

import java.io.IOException;
import java.util.Scanner;

public class samp16 {
	public static  void main(String[] args) throws IOException
	{

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of vehicles");
		int number=in.nextInt();
		int a[]=new int[number];
		System.out.println("Enter the for collected for each vehicles");
		for(int i=0;i<number;i++)
			
		{
			a[i]=in.nextInt();	
		}
		
		int ch=0,cl=0;
		for(int i=0;i<number;i++)
		{
		if(a[i]>50)
			
		{
		ch++;	
		}
		else if(a[i]<50 && a[i]>0 )
		{
			cl++;
		}
			

}
		
	System.out.println("the number of heavy vehicles"+ch+ "numbber of light vehicle"+cl);
	
	
}
}
