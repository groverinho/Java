import java.math.BigInteger;
import java.util.Scanner;

//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 11-08-16
public class Annesgame10843 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		for (int i = 1; i <= casos; i++) {
			
		
			BigInteger n = BigInteger.ZERO;
			int num = in.nextInt();
			n = BigInteger.valueOf(num);
			n = n.pow(Math.abs(num-2));
			System.out.println("Case #"+i+": "+(n.mod(BigInteger.valueOf(2000000011))));
		}

	}

}
