package BEGINNER;
import java.util.Scanner;


public class GameTime {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int inicio = in.nextInt(), fin = in.nextInt();
		int aux=0;
		if (inicio<=24 && inicio> fin)
		{
			aux = 24 - inicio;
			if (fin<=24)
				aux = aux + (Math.abs((fin-24)+24));
			else
				aux = aux + fin;
			System.out.println("O JOGO DUROU "+aux+" HORA(S)");	
		}
		else
		{
			aux = fin - inicio;
			System.out.println("O JOGO DUROU "+aux+" HORA(S)");
		}
		

	}

}
