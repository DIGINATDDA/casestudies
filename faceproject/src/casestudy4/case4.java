package casestudy4;


import java.io.*;

public class case4 {
	
	 static int id [] =new int[10];
	static String name[]=new String[10];
	static String address[]=new String[10];
	static String contact[]=new String[10];
	static String branch[]=new  String[10];
	static String mail[]=new  String[10];
	static String pt[]=new  String[10];
	static String pid[]=new  String[10];
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			public static void main(String[] args) throws IOException
	{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				int i=0;
				for(int i1=0;i1<25;i1++)
				{
					id[i1]=0;
							
				}
			int count=0;
			String pro;
			
	do
	{
		count++;
	
		
		System.out.println("Enter your Name");
		System.out.println("Enter your name ");
		name[i]=br.readLine();
		name[i]=br.readLine();
		System.out.println("Enter your Address");
		address[i]=br.readLine();
		System.out.println("Enter your ContactNumber");
		    contact[i]=br.readLine();
		System.out.println("Enter your Branch");
		branch[i]=br.readLine();
		System.out.println("Enter your Email-Id");
		mail[i]=br.readLine();
		System.out.println("Enter your ProofType");
		pt[i]=br.readLine();
		System.out.println("Enter your ProofId");
		pid[i]=br.readLine();
		int flag=0;
		
			for(int i1=0;i1<25;i1++)
			{
			if(id[i1]==0)
			{
				id[i1]=i1+1;
				flag=1;
				break;
			}
		}
			
if(flag==1)
				{
					
				System.out.println("Thankyou for your registring your id"+id[i]);
				}
				System.out.println("Do you want to continue registration (y/n)");
				 pro=br.readLine();
	}
					while(pro.equalsIgnoreCase("yes"));
	case4 ob=new case4();
	ob.ViewCustomers(count);
	}
	
private void ViewCustomers(int count) {
	System.out.println("Customer list\n The registered customer are:");
	
	
	System.out.println("Customer Id  :  customer Name")	;
	for(int s=0;s<count;s++)
	{
		System.out.println(+id[s]+"         " +name[s]);
	}
	System.out.println("thankyou");
}
				
	


}
