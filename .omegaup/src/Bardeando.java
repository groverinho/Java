import java.util.Scanner;


public class Bardeando {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int n = in.nextInt();
		int []malla= new int [n];
		int suma = 0;
		for (int i = 0; i < n; i++)
		{
			malla[i]=in.nextInt();
			suma =suma + malla[i];
		}
		if (suma>p)
		{
			System.out.println(0);
		}
		else
			System.out.println(p-suma);
			
	}

}
