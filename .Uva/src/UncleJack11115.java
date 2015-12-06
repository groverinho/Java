import java.util.*;
import java.math.*;
public class UncleJack11115 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, d ;
		while (true)
		{
			 n = in.nextInt(); d = in.nextInt();
			if (n == 0 && d == 0) 
				break;
			System.out.println(BigInteger.valueOf(n).pow(d));
		}
	}
}	