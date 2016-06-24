

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class contandoPrimos{

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
Scanner in  = new Scanner(System.in);
int casos = in.nextInt();
while (casos-->0)
{
int a = in.nextInt();
int b = in.nextInt();

boolean primos[] = new boolean[(b-a)+1];
primos = criba(b);
int  c =0;
for (int i = a; i < primos.length; i++)
{
	if (primos[i]) {
		c++;
	}
}
System.out.println(c);
}

	}

}
