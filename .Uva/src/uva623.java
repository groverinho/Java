import java.util.*;
import java.math.*;

public class uva623 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			int num = in.nextInt();
			BigInteger res = BigInteger.ONE;
			
			for (int i = 2; i <= num; ++i)
				res = res.multiply(BigInteger.valueOf(i));
			
			System.out.println(num + "!");
			System.out.println(res);
		}
	}
}