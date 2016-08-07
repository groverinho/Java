
import java.util.*;

	public class Palindromes401 {
	
	    public static String reverse(String s) {
	        String rev = "";
	        int n = s.length();
	
	        for (int i = n - 1; i >= 0; --i)
	           rev += s.charAt(i);
	        return rev;
	    }
	
    public static void main(String[] args) {
    	
            Scanner in = new Scanner(System.in);

            String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
            String espejo  = "A   3  HIL JM O   2TUVWXY51SE Z  8 ";

            while (in.hasNextLine()) {
                String cadena = in.nextLine().trim();
                boolean isPal = false;
                boolean isMir = false;

                if (cadena.equals(reverse(cadena))) isPal = true;

                String mir = "";
                for (int i = 0; i < cadena.length(); ++i)
                    for (int j = 0; j < espejo.length(); ++j)
                        if (cadena.charAt(i) == letras.charAt(j)) {
                            mir += espejo.charAt(j);
                            break;
                        }

                if (cadena.equals(reverse(mir))) isMir = true;

                System.out.print(cadena);
                if (!isPal && !isMir) System.out.println(" -- is not a palindrome.");
                if (isPal && !isMir) System.out.println(" -- is a regular palindrome.");
                if (!isPal && isMir) System.out.println(" -- is a mirrored string.");
                if (isPal && isMir)  System.out.println(" -- is a mirrored palindrome.");
                System.out.println();
            }
        
    }
    
    
}