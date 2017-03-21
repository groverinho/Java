import java.math.BigInteger;
import java.util.Scanner;


/**
Name: Grover Irusta M.
Date: 2017
 */
public class CifradoAfín {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
		String cadena = in.next();
		String cadenaFinal = "";
		String p = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
		for (int i = 0; i < cadena.length(); i++) {
			String aux = cadena.charAt(i)+"";
			int aaa = p.indexOf(aux);
			BigInteger aux2=(((a.multiply(BigInteger.valueOf(aaa))).add(b)).mod(BigInteger.valueOf(26))).mod(BigInteger.valueOf(26));
			int formula =Integer.parseInt( aux2.toString());
			int ii=0;
			cadenaFinal += p.charAt(formula);
			//cadenaFinal += getKeyFromValue(abecedario, formula);
		}
	
		System.out.println(cadenaFinal);

	}

}
