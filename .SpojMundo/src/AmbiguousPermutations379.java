

import java.util.Scanner;

public class AmbiguousPermutations379 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);	
		int n= in.nextInt();
		int [] a = new int [n+1];	
		while(n!=0)
		{
			for(int i=0; i<n; i++) 
				a[i]=in.nextInt();
			int cont=0;
			for(int i=0; i<n; i++)
				if(a[a[i]-1]==i+1)
					cont++;
			if(cont==n)
				System.out.println("ambiguous");
			else 
				System.out.println("not ambiguous");
			n= in.nextInt();
		}
	}

}
