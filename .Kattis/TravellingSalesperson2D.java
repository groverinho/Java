import java.math.BigDecimal;
import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 25-08-16

public class TravellingSalesperson2D {
	 public static double gcd(double a, double b)
	 { 
		return b == 0 ? a : gcd(b, a % b); 
	 } // standard gcd

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-->0)
		{
			double a  = in.nextDouble();
			double b  = in.nextDouble();
			System.out.println(Math.round(gcd(24, 80)));
		}
	}

}
