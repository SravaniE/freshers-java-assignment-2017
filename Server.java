import java.util.Scanner;


public class Server extends Thread	// implements inheritance
{
	public void serve(int a)
	{
		try{
			Thread.sleep(1500);
		}
		catch(Exception e)

		{

			e.printStackTrace();

		}

		System.out.println("bus boys cleans up the table and places a new table cloth");
		System.out.println();
		System.out.println("Sir select any one of the below  option: ");
		System.out.println("	1.general water");
		System.out.println("	2.mineral water");
	Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		if(k==1)
		{
			System.out.println("Server serves water with "+a+" glasses");
		}
		else if(k==2)
		{
			System.out.println("Enter num of water bottles do u need: ");
			int j=sc.nextInt();
			System.out.println("Server serves "+j+" water bottles for "+a+" members");
		}
	}	//method exit
}	//class exit
