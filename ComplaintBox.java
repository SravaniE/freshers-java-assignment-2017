import java.util.Scanner;


public class ComplaintBox {
		public void complaint()
		{
			System.out.println("Are there any complaints Sir..?");
			System.out.println("		1.yes"	);
			System.out.println("		2.no"	);
			Scanner sc=new Scanner(System.in);
			int k=sc.nextInt();
			if(k==1)
			{
				System.out.println();
				System.out.println("Please enter ur complaint");
				String str3=sc.next();
				str3 += sc.nextLine();
				System.out.println("complaint: "+"/* "+str3+" */"+" is registered");
				System.out.println("we will surely try to overcome this complaint sir");
			}
			else if(k==2)
			{
				System.out.println();
				System.out.println("enter your compliments if any: ");
				String str4=sc.nextLine();
				str4 += sc.nextLine();
				System.out.println("compliment: "+"/* "+str4+" */"+ " is registered");
				System.out.println("Thanks for ur compliment sir");
				
			}
		}
}
