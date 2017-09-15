import java.util.Scanner;


public class FinalBillPayment {

		public void paybill(String[] str,int a)
		{
			int i=0;
			System.out.println();
		//	System.out.println("final total: "+a);
			System.out.println("Here is ur Final Bill Sir: ");
			System.out.println();
			System.out.println("--------------------------------------------");
			for(i=0;str[i]!=null;i++)
			{
				System.out.println(str[i]);
			}
			System.out.println();
			System.out.println("Total amount is: "+a);
			System.out.println();
			System.out.println("--------------------------------------------");
			if(a>0)
			{
			System.out.println("select any one of the below payment mode: ");
			System.out.println("		1.cash");
			System.out.println("		2.card");
			Scanner sc=new Scanner(System.in);
			int j=sc.nextInt();
			if(j==1)
			{
				System.out.println("enter ur amount: ");
				int j1=sc.nextInt();
				if(j1<a)
				{
					System.out.println("invalid amount");
					System.out.println("please enter valid amount: ");
					int j4=sc.nextInt();
					System.out.println("enter tip amount: ");
					int j2=sc.nextInt();
					int j3=j4-(a+j2);
					System.out.println("Sir, here is ur balance: "+j3);
					
				}
				else{
				System.out.println("enter tip amount if any: ");
				int j2=sc.nextInt();
				int j3=j1-(a+j2);
				System.out.println("Sir, here is ur balance: "+j3);
					}
			}
			else if(j==2)
			{
				System.out.println("enter ur pin num: ");
				int no=sc.nextInt();
				System.out.println("Transaction done successfuly.");
			}	
			}
			}//method exit
			}	//class exit		
