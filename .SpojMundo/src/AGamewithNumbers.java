

import java.util.Scanner;

public class AGamewithNumbers {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
				 long aa= 1000000007;
		while (in.hasNextInt())
		{int n = in.nextInt();
			if (n%10!=0)
			{
				System.out.println("1");
				System.out.println(n%10);
			}
			else				
				System.out.println("2");
		
		}
	}

}
