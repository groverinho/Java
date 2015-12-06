import java.util.Scanner;


public class Comparacion {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b  = in.nextInt();
		if (a>b)
		{
			System.out.println("mayor");
		}
		else if (b>a) 
		{
			System.out.println("menor");
		}
		else
		{
			System.out.println("iguales");
		}
	}

}
