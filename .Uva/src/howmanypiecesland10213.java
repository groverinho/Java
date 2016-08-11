import java.math.BigInteger;
import java.util.Scanner;
//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 11-08-16

public class howmanypiecesland10213 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		while (m-->0)
		{
			int n  = in.nextInt();
			//1+(N^4-6*N^3+23*N^2-18*N)/24
		    BigInteger a = new BigInteger(n +"").pow(4).subtract(new BigInteger(n +"").pow(3).multiply(new BigInteger(6+""))).add(new BigInteger(23+"").multiply(new BigInteger(n +"").pow(2) ).subtract(new BigInteger(18+"").multiply(new BigInteger(n +"")))).divide(new BigInteger(24+"")).add(new BigInteger(1+""));  
			System.out.println(a);
		}

	}

}
