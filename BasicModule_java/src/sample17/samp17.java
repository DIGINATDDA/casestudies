package sample17;

import java.io.IOException;
import java.util.Scanner;

public class samp17 {
	
	public static  void main(String[] args) throws IOException
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the gold weight");
	int number=in.nextInt();
	System.out.println("the num of idols");
	int s=number/5;
	int g=s+number;
	
	
	System.out.println(""+g);

}
}
