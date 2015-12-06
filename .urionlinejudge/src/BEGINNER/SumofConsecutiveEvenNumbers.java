package BEGINNER;
import java.util.Scanner;


public class SumofConsecutiveEvenNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n!=0)
		{
			if (n%2==0) 
			{
				int suma1,suma2,suma3, suma4;
				suma1=n+2;
				suma2=suma1+2;
				suma3=suma2+2;
				suma4=suma3+2;
				 System.out.println(suma4+suma3+suma2+suma1+n);
			} 
			else 
			{
				int suma1,suma2,suma3, suma4;
				n=n+1;
				suma1=n+2;
				suma2=suma1+2;
				suma3=suma2+2;
				suma4=suma3+2;
				System.out.println(suma4+suma3+suma2+suma1+n);
			}	
			 n = in.nextInt();
		}
	}

}
