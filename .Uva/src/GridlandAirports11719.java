import java.math.BigInteger;
import java.util.Scanner;


public class GridlandAirports11719 {

	public static void main(String[] args) {
		BigInteger MOD_CONST = new BigInteger("10000000000000007");
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while(casos-- >0){
			long r = in.nextLong();
			long c = in.nextLong();
			long m = r*c/2;
			long n = r*c-m;
			BigInteger M = BigInteger.valueOf(m);
			BigInteger N = BigInteger.valueOf(n);
			BigInteger M1 = BigInteger.valueOf(m-1);
			BigInteger N1 = BigInteger.valueOf(n-1);
			BigInteger M2 = M.modPow(N1,MOD_CONST);
			BigInteger N2 = N.modPow(M1,MOD_CONST);
			BigInteger ans = M2.multiply(N2).mod(MOD_CONST);
			System.out.println(ans.toString());
		}

	}

}
