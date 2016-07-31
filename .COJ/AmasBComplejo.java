import java.math.BigInteger;
import java.util.Scanner;


public class AmasBComplejo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
	//	long c = (A+B) + (A-B) + (B+A) + (B-A);
		BigInteger c = a.add(b).add(a.subtract(b)).add(b.add(a)).add(b.subtract(a));
		System.out.println(c);

	}

}
