package MATHEMATICS;
import java.util.Scanner;


public class FactorialSum 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
		long m = in.nextInt(), n = in.nextInt();
		long rm=1, rn=1;
		
		for (long i = 1; i <= m; i++) {
			rm =rm *i;
		}
		for (long j = 1; j <=n; j++) {
			rn = rn*j;
		}
		System.out.println(rm+rn);
		}
	}

}
