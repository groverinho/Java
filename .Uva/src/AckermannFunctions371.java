// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 22-08-16
import java.io.*;
import java.util.Scanner;

public class AckermannFunctions371 {
	
	static int funcion(long x) {
		int c = 0;
		while (true) {
			if (x % 2 == 0)
				x /= 2;
			else
				x = 3 * x + 1;
			c++;
			if (x == 1)
				break;
		}
		return c;
	}
	
	public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
		while(true){
			int l = in.nextInt();
			int h =in.nextInt();
			if (l == 0 && h == 0)
				break;
			int max = Math.max(l, h);
			int min = Math.min(l, h);
			long V = Integer.MIN_VALUE;
			int S = Integer.MIN_VALUE 	;
			for (long i = min; i <= max; ++i)
			{
				int tmp = funcion(i);
				if (tmp > S) {
					V = i;
					S = tmp;
				}
			}
			System.out.println("Between " + min + " and " + max + ", " + V + " generates the longest sequence of " + S + " values.");
		}
	}
}
