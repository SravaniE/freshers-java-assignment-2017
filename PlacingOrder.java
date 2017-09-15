import java.util.Scanner;


public class PlacingOrder {

	int i=0,j=0,z=0,k=0,d=0;
	static int count=0;					 //usage of static keyword
	boolean done=true,set=true;
	String str[]=new String[10];
	String[] str1=new String[10];
	String s;
	Scanner sc=new Scanner(System.in);
	
	public int   method1()
	{
		set=true;
		System.out.println();
		System.out.println("hello Sir, here is ur menu card");
		while(set)
		{
		
		System.out.println("	1. Starters");
		System.out.println("	2. Main Courses");
		System.out.println("	3. Ice Creams");
		System.out.println("	4.exit");
		
		System.out.println(" Select any one of the above items");
		
		 j=sc.nextInt();
		//System.out.println(" selected item is"+j);	
		switch(j)
		{
			case 1:   System.out.println("Below is the starters memu: ");
						done=true;
						while(done)	
					{
						System.out.println("	1.tomato soup		80");
						System.out.println("	2.corn soup		85");
						System.out.println("	3.veg manchuria		90");
						System.out.println("	4.aloo tikka		95");
						System.out.println("	5.exit");
						System.out.println("enter any num from above menu: ");
						z=sc.nextInt();
						switch(z)
						{
							case 1: System.out.println("enter no of soups: ");	
									int n=sc.nextInt();
									int a1=80*n;
									str1[d]=n+" plate tomato soup";
									str[k]="tomato soup-"+80+" , "+n+" plate"+" = "+a1+" /-";
									k++;d++;
									count=count+80*n;
									//System.out.println("count value"+count);
									break;
							case 2: System.out.println("enter num of soups: ");
									int m=sc.nextInt();
									str1[d]=m+" plate corn soup";
									int a2=85*m;
									str[k]="corn soup-"+85+" , "+m+" plate"+" = "+a2+" /-";
									k++;
									d++;
									count=count+85;
									//System.out.println("count value:"+count);
									break;
							case 3: System.out.println("enter num of veg manchuria plates");
									int o=sc.nextInt();
									str1[d]=o+" plate veg manchuria";
									int a3=90*o;
									str[k]="veg manchuria-"+90+" , "+o+" plate"+" = "+a3+" /-";
									k++;d++;
									
									count=count+90*o;
									
									break;
							case 4: System.out.println("enter num of plates: ");
									int p=sc.nextInt();	
									str1[d]=p+" plate aloo tikka";
									int a4=95*p;
									str[k]="aloo tikka-"+95+" , "+p+" plate"+" = "+a4+" /-";
									k++; d++;
									
									count=count+95*p;
									
									break;
							case 5: exit(0);
									break;
									
						} 
						if(z==5)
						{ done=false;}
					}
					break;
				    	
			case 2: 	System.out.println("Below is main course memu: ");
						
						done=true;
			while(done)	
			{
				System.out.println("	1.Veg fried rice	125");
				System.out.println("	2.Veg Biryani		150");
				System.out.println("	3.paneer masala		100");
				System.out.println("	4.Mushrom cury		110");
				System.out.println("	5.exit");
				System.out.println("choose any number from the above menu ");
				z=sc.nextInt();
				switch(z)
				{
					case 1: System.out.println("enter no of veg fried rice plates: ");	
							int n=sc.nextInt();
							int b1=125*n;
							str1[d]=n+" plate Veg fried rice";
							str[k]="Veg Fried Rice-"+125+" , "+n+" plate"+" = "+b1+" /-";
							count=count+125*n;
							k++; d++;
					
							break;
					case 2: System.out.println("enter num of biryani plates: ");
							int m=sc.nextInt();
							str1[d]=m+" plate Veg Biryani";
							
							int b2=150*m;
							str[k]="Veg Biryani-"+150+" , "+m+" plate"+" = "+b2+" /-";
							count=count+150*m;
							k++; d++;
							
							break;
					case 3: System.out.println("enter num of paneer masala plates");
							int o=sc.nextInt();
							int b3=100*o;
							str1[d]=o+" plate Paneer masala";
							str[k]="paneer masala-"+100+" , "+o+" plate"+" = "+b3+" /-";
							count=count+100*o;
							k++;d++;
							
							break;
					case 4: System.out.println("enter num of cury plates: ");
							int p=sc.nextInt();	
							int b4=110*p;
							str1[d]=p+" plate Mushrom curry";
							str[k]="Mushrom Curry-"+110+" , "+p+" plate"+" = "+b4+" /-";
							count=count+110*p;
							k++; d++;
							
							break;
					case 5: exit(0);
							break;
							
				} 
				if(z==5)
				{ done=false;}
			}
			break;
				
			case 3: System.out.println("Below is the Ice creams menu: ");
					System.out.println("done value: "+done);
					done=true;
						while(done)	
						{
							System.out.println("	1.vanilla	80");
							System.out.println("	2.ButterScotch	100");
							System.out.println("	3.Strawberry	90");
							System.out.println("	4.Chocolate	110");
							System.out.println("	5.exit");
							System.out.println("Choose any num from above menu: ");
							z=sc.nextInt();
							switch(z)
							{
								case 1: System.out.println("enter no of vanilla: ");	
										int n=sc.nextInt();
										int c1=80*n;
										str1[d]=n+" cup Vanilla";
										str[k]="Vanilla-"+80+" , "+n+" cup"+" = "+c1+" /-";
										count=count+80*n;
										k++; d++;
										
										break;
								case 2: System.out.println("enter num of Butterscotch: ");
										int m=sc.nextInt();
										int c2=100*m;
										str1[d]=m+" cup Butter Scotoch";
										str[k]="Butter scotoch-"+100+" , "+m+" cup"+" = "+c2+" /-";
										count=count+100*m;
										k++; d++;
										
										break;
								case 3: System.out.println("enter num of Strawberry");
										int o=sc.nextInt();
										int c3=90*o;
										str1[d]=o+" cup Strawberry";
										str[k]="Strawberry-"+90+" , "+o+" plate"+" = "+c3+" /-";
										count=count+90*o;
										k++; d++;
										
										break;
								case 4: System.out.println("enter num of chocolate: ");
										int p=sc.nextInt();	
										int c4=110*p;
										str1[d]=p+" cup chocolate";
										str[k]="chocolate-"+110+" , "+p+" plate"+" = "+c4+" /-";
										count=count+110*p;
										k++; d++;
										
										break;
								case 5: exit(0);
										break;
										
							} //  switch exit
										if(z==5)
										{
												done=false;
										}
						}	//  while exit
			case 4: 		exit(0);
							break;
				
	}
						if(j==4)
						{ set=false; }
						
						
		}//while exit
		return count;
	}//method1 exit
	
	
	private void exit(int l) {
		// TODO Auto-generated method stub
		
	}//exit method
	public String[] PlacedOrder() {
	System.out.println();
	System.out.println("Below is ur placed order sir");
	System.out.println();
	System.out.println("-------------------------------------------------");
	for(i=0;str1[i]!=null;i++)
		{
			System.out.println(str1[i]);
		}
	System.out.println("-------------------------------------------------");
	return str;
	}

}  //class exit

