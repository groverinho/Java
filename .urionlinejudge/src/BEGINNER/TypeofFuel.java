package BEGINNER;
import java.util.Scanner;


public class TypeofFuel 
{
	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		int alcohol=0, gasolina = 0, diesel=0;
		int n = in.nextInt();
		
		while(n!=4)
		{
			if(n==1)
				alcohol++;
			else if(n==2)
				gasolina++;
			else if(n==3)
				diesel++;
			n=in.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcohol);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
	}
}
/*
 MUITO OBRIGADO
Alcool: 1
Gasolina: 2
Diesel: 0 
 * */
 