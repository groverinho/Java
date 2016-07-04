import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;


public class LessPrime10852 {

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
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		 boolean primos[] = new boolean[10010];
		 primos = criba(10010);
		 int casos = in.nextInt();
		 int aux=0;
		 
		 while (casos-->0)
		 {
			 int n = in.nextInt();
			 for (int i = (n/2)+1; i < primos.length; i++) {
					if (primos[i]) {
						aux = i;
						break;
					}
				}
			 System.out.println(aux);
		}

	}

}
