import java.math.BigInteger;
import java.util.Scanner;


public class Powersoftwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		BigInteger a = BigInteger.valueOf(2).pow(n);
		System.out.println(a);

	}

}
