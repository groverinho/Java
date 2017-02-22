import java.util.Arrays;
import java.util.Scanner;

public class cuantosPrimos {
	// Author: Grover Irusta
	// Date: 21-02-17
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
		boolean [] primos = criba(1000001);
		int casos = in.nextInt();
		while (casos-->0)
		{
			int c=0;
			int a = in.nextInt();
			int b = in.nextInt();
			for (int i = a; i <=b; i++) {
				if (primos[i]) {
					c++;
				}
			}
			System.out.println(c);
			
		}

	}

}
