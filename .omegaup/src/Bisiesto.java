import java.util.Scanner;


public class Bisiesto {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int año = in.nextInt();
			if ((año%4==0) && (año%100!=0))
			{
				  System.out.println("S");
			}
			else 
			{
				if ((año%400==0) && (año%100==0))
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
