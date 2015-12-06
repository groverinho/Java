import java.util.Scanner;


public class OperadoresRelacionales {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		for (int i = 0; i < casos; i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			if (a<b)
				System.out.println("<");
			else if(a>b)
				System.out.println(">");
			else
				System.out.println("=");
		}

	}

}
