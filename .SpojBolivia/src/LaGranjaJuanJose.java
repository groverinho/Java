
import java.util.Scanner;

class LaGranjaJuanJose 
{
	public static void resolver( int cabezas, int patas ) 
	{
		int vacas=0;
		int gallinas=0;
		if(patas%2!=0) 
			System.out.print("-1\n");
		else
		{
			vacas = patas/2-cabezas;
			gallinas = cabezas-vacas;
			if(vacas<0 || gallinas<0)
				System.out.print("-1\n");
			else
				System.out.println(gallinas+" "+vacas);
				/*System.out.print(gallinas+" ");
				System.out.println(vacas);	*/
		}
	}
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int cabezas;
		int patas;
			while(entrada.hasNextInt())
			{
				cabezas= entrada.nextInt();
				patas= entrada.nextInt();
					resolver(cabezas, patas);
			}
	}

}

