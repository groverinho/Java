
import java.util.Scanner;
public class The3nmas1problem100 {

	public static void main(String[] args) 
	{
		Scanner in  =new Scanner(System.in);
		while (in.hasNextInt())
		{
			int valor = in.nextInt();
			int n = in.nextInt();
			int maximo = 0;
			if (valor<=n)
			{
				for (int i =valor; i <= n;i ++)
				{
					int ii=i;
					int c=1;
						while (ii!=1)
						{
							if (ii%2!=0)
							{
								ii = (3*ii)+1;
								c++;
							}
							else
							{
								ii =ii/2;
								c++;
							}
						
						}
					maximo = Math.max(maximo, c);
				}
			}
			else
			{
				for (int i =n; i <= valor;i ++)
				{
					int ii=i;
					int c=1;
						while (ii!=1)
						{
							if (ii%2!=0)
							{
								ii = (3*ii)+1;
								c++;
							}
							else
							{
								ii =ii/2;
								c++;
							}
						
						}
					maximo = Math.max(maximo, c);
				}
			}
			System.out.println(valor +" "+n+" "+ maximo);
		}

	}
}
