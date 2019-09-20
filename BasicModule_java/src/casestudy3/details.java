package casestudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class details
{
	public static  void main(String[] args) throws IOException
	{
	
	BufferedReader di=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your Name");
	String name=di.readLine();
	System.out.println("Enter your address ");
	String address=di.readLine();
	System.out.println("Enter your contactnumber");
	String contactnumber=di.readLine();
	System.out.println("Enter your email");
	String email=di.readLine();
	System.out.println("Enter your prooftype");
	String prooftype=di.readLine();
	System.out.println("Enter your proofid");
	String proofid=di.readLine();
	System.out.println("Do you want to proceed(y/no)"); 
	String proceed=di.readLine();
	int flag=0;
	int i;
	if(proceed.equalsIgnoreCase("yes"))
	{
		for(i=0;i<25;i++)
	}
	if(a[i]=0)
	{
		
	}
	

		System.out.println("update email");
		System.out.println("Enter your new email id");
		System.out.println("Enter your email id");
		email=di.readLine();
		System.out.println(" your email updated ");
		
	
	
	
	System.out.println("Name   :"+name);
	
	System.out.println("Address  :"+address);
	System.out.println("contactnumber   :"+contactnumber);
	System.out.println("Email   :"+email);
	System.out.println("Proofid   :"+prooftype);

	System.out.println("Proofid   :"+proofid);
	
	
	
	

}
	
	
}