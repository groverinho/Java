package MATHEMATICS;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsGame {

	public static boolean[] criba()
	{
		 boolean primos[] = new boolean[1000+1];
		 Arrays.fill(primos,true);
		 primos[0] = primos[1] = false;
		 for(int i=2;i<(int)Math.sqrt(1000)+1;i++)
		  if(primos[i])
		   for(int j=i*i;j<primos.length;j+=i)
		    primos[j] = false;
		 return primos;
		}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		 boolean primos[] = criba();
		 
		int n = in.nextInt();
		int m = in.nextInt();
		int p1 = 0;int p2 = 0;
		for (int i = n; i >=0 ; i--)
		{
			if (primos[i])
			{
				p1 = i;
				break;
			}
		}
		for (int i = m; i >=0 ; i--)
		{
			if (primos[i])
			{
				p2 = i;
				break;
			}
		}
		System.out.println(p1*p2);
	}

}
