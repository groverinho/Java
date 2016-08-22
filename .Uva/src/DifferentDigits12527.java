import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 20-08-16

public class DifferentDigits12527 {

	public static boolean evaluar(int n)
	{
		int vector []= new int[10];
		String numero = n+"";
		for (int i = 0; i < numero.length(); i++)
		{
			vector[Integer.parseInt(numero.charAt(i)+"")]++;
		}
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]>=2)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			int n = in.nextInt();
			int m = in.nextInt();
			int c = 0;
			for (int i = n; i <=m; i++) {
				if (evaluar(i))
				{
					//System.out.println(i);
					c++;
				}
			}
			System.out.println(c);
		}

	}

}
