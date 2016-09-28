// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 26-09-16
package BEGINNER;

import java.util.Scanner;

public class FastFibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		double r = (Math.pow(((1+Math.sqrt(5))/2), n)- Math.pow(((1-Math.sqrt(5))/2), n))/Math.sqrt(5);
		System.out.printf("%.1f\n",r);

	}

}
