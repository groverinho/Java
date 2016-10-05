import java.math.BigInteger;
import java.util.Scanner;

// Author: Grover Irusta M
// University: Universidad Privada Domingo Savio - Tarija
// Date: 04-10-16

public class IntegerInquiry424 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger sum=BigInteger.ZERO;
		while (true) {
			String cad = in.next();
			if (cad.equals("0"))
			{
				break;
			}
			sum = sum.add(new BigInteger(cad));
		}
		System.out.println(sum);

	}

}
