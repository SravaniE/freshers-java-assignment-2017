import java.util.Scanner;

interface restaurant			//creating interface
{
	public int receiving();
}

interface cooking extends restaurant		//interface inheritance
{
	public void cook();
	
}


class Chef extends Thread implements cooking 			//interface implementation
{
public void cook() {
	System.out.println();
	try{
		Thread.sleep(1500);						//sleep for 1500ms
	}
	catch(Exception e)

	{

		e.printStackTrace();

	}
	
	System.out.println("manager gives the order to chef for preparing the dishes");
	
}

public int receiving() {
	// TODO Auto-generated method stub
	return 0;
}

}
class LineCook extends Chef				//implementing inheritance
{
	public void cook()					//overriding
	{
		super.cook();					// usage of super keyword
		System.out.println("linecook receives orders from main chef");
		
	}
}

public  class CustomerReceive implements restaurant  //implementation of parent interface
	{

	public int receiving() {
		
		System.out.println("Welcome to ABC Restaurant Sir");
		System.out.println();
		System.out.println("Enter number of family members sir: ");
		Scanner sc=new Scanner(System.in);
		int mem=sc.nextInt();
	//	System.out.println("mem: "+mem);
		return mem;
	}
	public void reserve(int num)
	{
		System.out.println("press 1 if you have Reserved any table");
		System.out.println("	1.Yes");
		System.out.println("	2.No");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if(y==1)
		{
			System.out.println("Enter your table no: ");
			int no=sc.nextInt();
			System.out.println("Table "+no+" is towards right corner Sir. So, please go and have a seat sir.");
		}
		else if(y==2)
		{
			System.out.println("We have alloted table no 6 for "+num+" members.");
		}
		else if(y>2)
		{
			System.out.println("press valid number");
			reserve(num);
			
		}
	}//method exit
	
}//class exit
