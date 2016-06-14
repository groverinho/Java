
import java.util.Scanner;


public class JotyAndChocolate {

	public static void main(String[] args) {
		//Joty and Chocolate
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		long a = in.nextLong();
		long b = in.nextLong();
		long p = in.nextLong();
		long q = in.nextLong();	
		long totalChoco = n/a*p + n/b*q - n/lcm(a,b)*Math.min(p, q);
		System.out.println(totalChoco);
	}
		static long gcd(long a, long b) 
		{ 
			return b == 0 ? a : gcd(b, a%b);
		}
		static long lcm(long a, long b) 
		{ 
			return a*b/gcd(a,b);
		}
}
