import java.awt.SystemTray;
import java.util.Scanner;


public class Promediode5calificaciones {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int vector [] = new int [5];
		int aux =0;
		for (int i = 0; i < 5; i++)
		{
			vector[i] = in.nextInt();
			aux = aux + vector[i];
			
		}
		double total = aux / 5;
		System.out.printf("%.1f\n",total);

	}

}
