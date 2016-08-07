package ContestFinalCamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PowerString10298 {
	static int tam=0;
	static String cadena ="";
public static boolean verifica(int n)
{
    n = tam / n;

    for (int i = 0; i < n; i++) {
        for (int j = i + n; j < tam; j += n) {
            if (cadena.charAt(j) != cadena.charAt(i))
            	return false;
        }
    }
    return true;
}
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			 cadena = in.readLine();
			 tam = cadena.length();
			if (cadena.equals(".")) {
				break;
			}

	        int n = tam + 1;
	        while (n-- > 2) 
	        {
	            if (tam % n==1) 
	            	continue;

	            if (verifica(n)) 
	            	break;
	        }
	        
	       
	        System.out.println(n);	
		}
		 

	}

}
