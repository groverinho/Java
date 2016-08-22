import java.util.ArrayList;
import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 21-08-16

public class Perfection382 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("PERFECTION OUTPUT");
		while (n!=0)
		{
		
			int suma = 0;
			boolean bandera = false;
			for (int i = 1; i < n; i++) {
				if (n % i == 0)
					suma += i;
				if (suma > n) 
				{
					bandera = true;
					break;
				}
			}

			System.out.printf("%5d  ", n);
			if (suma==n)
			{
				System.out.println("PERFECT");
			}
			else if(bandera)
				System.out.println("ABUNDANT");
			else
				System.out.println("DEFICIENT");
			n =in.nextInt();
		}
		System.out.println("END OF OUTPUT");
	}

}
