import java.util.Scanner;


public class ProbandoelExamen 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		double acumulado = 0;
		int cont = 1;
		for (int i = 0; i < n-1; i++) 
		{
			double aux = entrada.nextDouble();
			if(aux>=6)
			{
				acumulado +=aux;
				cont++;
			}
		}
		double me = entrada.nextDouble();
		double result = (me*cont)-acumulado;
		if(n==1)
			System.out.printf("%.0f\n", result);
		else
			System.out.printf("%.2f\n", result);
		
	}
}
