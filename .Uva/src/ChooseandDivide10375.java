import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class ChooseandDivide10375 {

	public static BigDecimal fact (int n)
	{
		BigDecimal res = BigDecimal.ONE;
		
		for (int i = 2; i <= n; ++i)
			res = res.multiply(BigDecimal.valueOf(i));
		return res;
	}
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			
		
		int p= in.nextInt();
		int q= in.nextInt();
		int r= in.nextInt();
		int s= in.nextInt();
		BigDecimal resp1 = BigDecimal.ZERO;
		BigDecimal resp2 = BigDecimal.ZERO;

		resp1 = fact(p).divide((fact(p-q).multiply(fact(q))));
		resp2 = fact(r).divide((fact(r-s).multiply(fact(s))));
		BigDecimal resp3 = resp1.divide(resp2,1000, BigDecimal.ROUND_HALF_UP);
		System.out.println(resp3.setScale(5, BigDecimal.ROUND_HALF_UP));
		}
	}

}
/*
 import java.math.BigDecimal;
import java.util.Scanner;
 
public class ChooseandDivide10375 {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    BigDecimal fac[] = new BigDecimal[10001];
    fac[0] = BigDecimal.valueOf(1);
    for (int i = 1; i <= 10000; i++)
      fac[i] = fac[i - 1].multiply(BigDecimal.valueOf(i));
    while (cin.hasNext()) {
      int p = cin.nextInt(), q = cin.nextInt(), r = cin.nextInt(), s = cin.nextInt();
      BigDecimal ans = BigDecimal.ONE;
      ans = ans.multiply(fac[p]);
      ans = ans.divide(fac[q], 1000, BigDecimal.ROUND_HALF_UP);
      ans = ans.multiply(fac[s]);
      ans = ans.divide(fac[p - q], 1000, BigDecimal.ROUND_HALF_UP);
      ans = ans.multiply(fac[r - s]);
      ans = ans.divide(fac[r], 1000, BigDecimal.ROUND_HALF_UP);
      System.out.println(ans.setScale(5, BigDecimal.ROUND_HALF_UP));
    }
  }
}
*/