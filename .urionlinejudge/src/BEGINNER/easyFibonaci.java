package BEGINNER;

import java.util.Scanner;

public class easyFibonaci {

public static	void fibonacci (int n) {
		  if (n <= 0)
		    return;
		  if (n == 1) {
		  System.out.println(0);
		  } 

		  int a, b;
		  a = 0;
		  b = 1;
		  System.out.print( "0 1");
		  for (int i = 2; i < n; i++) {
		    int t = b;
		    b = a + b;
		    a = t;
		    System.out.print(" "+ b);
		  }

		 System.out.println();
		}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int n = in.nextInt();

		  fibonacci(n);
	}

}
