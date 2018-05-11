/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 11/05/2018
 */
package ADHOC;

import java.util.Scanner;

public class SumOfTwoSquares1558 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean sieve[] = new boolean [10010];
		  for (int i = 0; i * i < 10010; i++)
			    for (int j = 0; i * i + j * j < 10010; j++)
			      sieve[i * i + j * j] = true;

			  
			  while (in.hasNext()) {
				  int n= in.nextInt();
				  if (n < 0) System.out.println("NO");
				    else System.out.println(sieve[n] ? "YES" : "NO");  
			  }
			    
	}

}
