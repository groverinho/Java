package BEGINNER;
import java.util.Scanner;


public class EvenOddPositiveandNegative {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int par=0, impar=0, positivo =0, negativo=0;
		for (int i = 0; i < 5; i++)
		{
			int n = in.nextInt();
			if (n==0) 
			{
				par++;
			}
			else if (n>0)
			{
				positivo++;
				if (n%2==0) 
				par++;
				else
				impar++;
			}
			else if(n<0)
			{
				negativo++;
				if (n%2==0) 
				par++;
				else
				impar++;
			}
		}
		System.out.println(par+" valor(es) par(es)");
		System.out.println(impar+" valor(es) impar(es)");
		System.out.println(positivo+" valor(es) positivo(s)");
		System.out.println(negativo+" valor(es) negativo(s)");
	}

}
