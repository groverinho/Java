import java.util.Scanner;


public class Bisiesto {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int a�o = in.nextInt();
			if ((a�o%4==0) && (a�o%100!=0))
			{
				  System.out.println("S");
			}
			else 
			{
				if ((a�o%400==0) && (a�o%100==0))
				{
					   System.out.println("S");	
				}
				else {
					   System.out.println("N");
				}
			}
 		         
		}
	}
}
