import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 22-08-16

public class DigitCounting1225 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int casos  = in.nextInt();
	
	while (casos -->0)
		{
		int v []= new int [10];
			int n = in.nextInt();
			String numeros = "";
			for (int i = 1; i <= n; i++)
			{
				numeros += i+"";
			}
			//System.out.println(numeros);
			for (int i = 0; i <= 9; i++)
			{
				for (int j = 0; j < numeros.length(); j++)
				{
					if (Integer.parseInt(numeros.charAt(j)+"")== i )
					{
						v[i]++;
					}
				}
			}
			for (int i = 0; i < v.length; i++) {
				if (i==v.length-1) {
					System.out.print(v[i]);
				}
				else
					System.out.print(v[i]+" " );
			}
			System.out.println();
	}

	}

}
