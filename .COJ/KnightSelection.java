import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class KnightSelection {

	public static boolean[] criba(int n)
	{
		 boolean primos[] = new boolean[n+1];
		 Arrays.fill(primos,true);
		 primos[0] = primos[1] = false;
		 for(int i=2;i<(int)Math.sqrt(n)+1;i++)
		  if(primos[i])
		   for(int j=i*i;j<primos.length;j+=i)
		    primos[j] = false;
		 return primos;
		}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean primos[] = criba(3000);
		ArrayList<Integer>lista = new ArrayList<Integer>();
		int n = in.nextInt();
		int c=0;
		for (int i = n; i>=2 ; i--)
		{
			c=0;
			if (!primos[i])
			{
				int m = i;
			hola:for (int j = 2; j <i; j++)
				{
					if (m%j==0)
					{
						m=m/j;
						if (primos[j]) 
						{
							c++;
						}
					}
					if (c>2)
					{
						break hola;
					}
				}
			}
			if (c==2)
			{
				lista.add(i);
			}
		}
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
		System.out.println(lista.size());
		
		
	}

}
