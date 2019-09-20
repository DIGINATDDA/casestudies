package Sample1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sam1
{
	public static  void main(String[] args) throws IOException
	{
	
	BufferedReader di=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your Name");
	String name=di.readLine();
	System.out.println("Enter your age");
	String age=di.readLine();
	System.out.println("Enter your degree");
	String degree=di.readLine();
	System.out.println("Enter your branch");
	String branch=di.readLine();
	System.out.println("Enter your contactnumer");
	String contactnumber=di.readLine();
	
	System.out.println("Name   :"+name);
	System.out.println("Age   :"+age);
	System.out.println("Degree   :"+degree);
	System.out.println("Branch   :"+branch);
	System.out.println("Contactnumber   :"+contactnumber);
	
	
	
	

}
	
	
}