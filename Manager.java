import java.util.*;
public class Manager {

		public static void main(String args[])
		{
			int k1 = 0;
			
			CustomerReceive c=new CustomerReceive();
			int num=c.receiving();
			
			c.reserve(num);
			
			Server s=new Server();
			s.serve(num);
			
			Menu m=new Menu();
			m.CustomerOrder();
			PlacingOrder p=new PlacingOrder();
			int cost=p.method1();
			if(cost>0)
			{
			
			String str[]=p.PlacedOrder();
			
			LineCook l=new LineCook();
			l.cook();
			
			System.out.println();
			try{
				Thread.sleep(1500);
			}
			catch(Exception e)

			{

				e.printStackTrace();

			}
			
			System.out.println("server serves the food");
			System.out.println();
			try{
				Thread.sleep(1600);
			}
			catch(Exception e)

			{

				e.printStackTrace();

			}
			
			System.out.println("Would u like to have any more order sir");
			Scanner sc=new Scanner(System.in);
			System.out.println("	1.Yes");
			System.out.println("	2.No");
			int k=sc.nextInt();
			if(k==1)
			{
				 k1=p.method1();
				 cost=k1;
				 System.out.println("server serves the food.");
				//System.out.println("total bill: "+k1);
			}
			
			try{
				Thread.sleep(1600);
			}
			catch(Exception e)

			{

				e.printStackTrace();

			}
			
			System.out.println("Would u like to have final bill sir");
			System.out.println("	1.Yes");
			System.out.println("	2.No");
			int k2=sc.nextInt();
			
				FinalBillPayment f=new FinalBillPayment();
				f.paybill(str,cost);
			}
			ComplaintBox c1=new ComplaintBox();
			c1.complaint();
			
			System.out.println();
			System.out.println("Thank you and visit again..");
			System.out.println();
			
		}	//exit of main

	}//exit of class

		

