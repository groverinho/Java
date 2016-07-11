import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class HallarDuplicados {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			int n = in.nextInt();
			Set<Integer> lista = new HashSet<Integer>();
			int []vector = new int [9999999];
			for (int i = 0; i < n; i++) 
			{
				int m = in.nextInt();
				vector[m]++;
				if (vector[m]>1)
				{
					lista.add(m);
				}
			}
			int c=0;
			for (int j : lista)
			{
				if (c==lista.size()-1) 
				{
					System.out.print(j);
				}
				else
					System.out.print(j+ " ");
				c++;
			}
			System.out.println();
		}
	}

}
