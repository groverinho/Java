package BEGINNER;
	import java.util.Scanner;
	public class bankNote 
	{
		public static void Metodo(int x, int billete)
		{
	        int resultado = x / billete;
	        float bn = billete;
	         System.out.print(resultado);
	         System.out.printf(" nota(s) de R$ %.2f\n", bn);
		}
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
		     int billete = 100;
		     System.out.println(n);
		          while (billete != 0)
		           {
		                if (billete == 25)
		                      billete = 20;
		              Metodo(n, billete);
		              n = n % billete;
		              billete = billete / 2;
		          }
		}
	
	}
