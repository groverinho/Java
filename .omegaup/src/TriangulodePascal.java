// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 02-10-16

import java.util.Scanner;
public class TriangulodePascal {

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0) 
		{
			 int m =in.nextInt();
			 int n =in.nextInt();
			 
			 long r = (long) (Math.pow(2, n+1)- Math.pow(2, m)) ;
			 System.out.println(r);
		}
	
	}
	
}