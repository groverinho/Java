import java.util.Scanner;


public class Bisiesto {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int anio = in.nextInt();
			if ((anio%4==0) && (anio%100!=0))
			{
				  System.out.println("S");
			}
			else 
			{
				if ((anio%400==0) && (anio%100==0))
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
