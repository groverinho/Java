import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
Name: Grover Irusta Miranda
Company: Xtime
Date: 20-10-2018
 */

public class DigitalFortress11716 {
	public static String cipher(String s, int raiz){
		char matriz[][] = new char[raiz][raiz];
		int k =0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = s.charAt(k);
				k++;
			}
		}
		String newcipher="";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				newcipher+=matriz[j][i];
			}
			
		}
		return newcipher;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		while (cases-->0) {
			String s = in.readLine();
			double raiz=Math.sqrt(s.length()); 
			if (raiz - (Math.floor(raiz)) == 0) { 
				System.out.println(cipher(s,(int)raiz));
			}
			else {
				System.out.println("INVALID");
			}
		}
	}

}
