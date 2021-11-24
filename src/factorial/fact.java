package factorial;

import java.util.Scanner;

public class fact
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int n,fact=1;
		// TODO Auto-generated method stub
		System.out.println("enter number:->");
		n=scan.nextInt();
		
		if(n<0)
		{
			System.out.println("Number Should be non negative");	
		}
		else 		
		for(int i=1;i<=n;i++)
			{
			fact=fact*i;
			}
		System.out.println(fact);
		
	}

}
