import java.math.BigInteger;
import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 23-08-16

public class VeryEasy10523 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{

			int n = in.nextInt();
			int a = in.nextInt();
			BigInteger resultado  = BigInteger.ZERO;
			for (int i = 1; i <= n; i++) 
			{
				BigInteger ii = BigInteger.valueOf(i);
				resultado = resultado.add(ii.multiply(BigInteger.valueOf(a).pow(i)));
						//BigInteger.valueOf((long) (i*Math.pow(a, i))));
			}
			System.out.println(resultado);

		}
	}

}
