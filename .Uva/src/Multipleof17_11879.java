import java.math.BigInteger;
import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 23-08-16


public class Multipleof17_11879 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true)
		{
			BigInteger n = in.nextBigInteger();
			if (n.compareTo(BigInteger.ZERO)==0)
			{
				break;
			}
			System.out.println(n.mod(BigInteger.valueOf(17)).compareTo(BigInteger.ZERO)==0?"1":"0");
		}

	}

}
