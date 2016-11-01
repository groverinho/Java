import java.math.BigInteger;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 31-10-16
 */

public class FactoriaYouMustbeKiddin10323 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			
			long n = in.nextLong();
			BigInteger aux = BigInteger.ONE;
			//ArrayList<String> lista = new ArrayList<String>();
	//		lista.add("40320");
	//		lista.add("362880");
//			lista.add("3628800");
//			lista.add("39916800");
//			lista.add();
//			lista.add();
//			lista.add();
//			lista.add();
//			lista.add();
//			lista.add();6227020800)
//			for (int i = 1; i <=n; i++) {
//				aux = aux.multiply(BigInteger.valueOf(i));
//			}
//			System.out.println(aux);
			HashMap<Long, String> mapa = new HashMap<Long, String>();
			mapa.put((long) 8, "40320");
			mapa.put((long) 9, "362880");
			mapa.put((long) 10, "3628800");
			mapa.put((long) 11, "39916800");
			mapa.put((long) 12, "479001600");
			mapa.put((long) 13, "6227020800");
			if (n>=8 && n<=13) {
				System.out.println(mapa.get(n));
			}
			else if (n>13 || n<0 && -(n)%2==1) {
				System.out.println("Overflow!");
			}
			else if ((n >= 0 && n < 8) || (n < 0 && (-n) % 2 == 0))
			{
				System.out.println("Underflow!");
			}
//			if (n<=7)
//			{
//				System.out.println("Underflow!");
//			}
//			else if(n>13)
//			{
//				System.out.println("Overflow!");
//			}
//			else
//				System.out.println(mapa.get(n));
		}

	}

}
