import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 class CanastaDeFrutas 
{
	public static void main(String[] args)/*throws IOException
	{ 
		
		BufferedReader entrada = new BufferedReader(
				new InputStreamReader(System.in));*/
	{
	Scanner in = new Scanner(System.in);
		int n = in.nextInt();//Integer.parseInt(entrada.readLine());
		int c=1;
		while(n!=0)
		{	
			int [] vector = new int[n];
			for (int i = 0; i < n; i++)
				vector[i]=in.nextInt();// Integer.parseInt(entrada.readLine());
			int t=0;
			int cantidad = 0;
			for (int i = 0; i < n; i++)
			{
				cantidad=0;
				for (int j = 0; j < n; j++) 
				{
					if(vector [j] >= vector [i])
					{
						cantidad=cantidad+vector[i] ;
					//	System.out.println("cantidad"+ cantidad);
						t = Math.max( cantidad , t ) ;
					}
				}	
			}
			System.out.println("Salida para el ejemplo "+ c);
			System.out.println(t);
			c++;
			n = in.nextInt();
		}
	}
}
/*
3
1 2 3
4
5 0 30 14
4
51 8 38 49
 */