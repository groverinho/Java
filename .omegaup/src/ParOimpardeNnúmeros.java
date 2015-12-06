import java.util.Scanner;


public class ParOimpardeNnúmeros {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0) 
		{
			int n = in.nextInt();
			if (n==0)
			{
				System.out.println("cero");
			}
			else
			{
				if (n%2==0)
				{
					if (n>0)
						System.out.println("par positivo");
					else
						System.out.println("par negativo");
				}
				else
				{
					if (n>0)
						System.out.println("impar positivo");
					else
						System.out.println("impar negativo");
				}
			}
			casos--;
		}
	}

}
