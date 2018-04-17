
import java.util.Scanner;

public class PowerString10298v2 {

	static char[] T, P; 
	  static int n, m;
	  static int [] b; 



	  static void kmpPreprocess() { 
	    int i = 0, j = -1; b[0] = -1;
	    while (i < m) { 
	      while (j >= 0 && P[i] != P[j]) j = b[j]; 
	      i++; j++; 
	      b[i] = j; 
	  } }       

	  static int kmpSearch() {
	    int i = 0, j = 0,cont=0; 
	    boolean bandera = true;
	    while (i < n) { 
	      while (j >= 0 && T[i] != P[j]) j = b[j]; 
	      i++; j++; 
	      if (j == m) { 
	        
	    	  if (bandera)
	    		  bandera = false;
				else
					return i - j;
	        j = b[j]; 
	      }
	      }
	    return -1;
	    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			String cad = in.next();
			if (cad.equals("."))
				break;
			
			m= cad.length();
			P  = cad.toCharArray();
			String cadaux = cad+cad;
			T = cadaux.toCharArray();
			n = 2 * m;
			
			b = new int[m + 1];

			kmpPreprocess();
			int ind = kmpSearch();
			System.out.println(m / ind);
		}
		 

	}

}
