import java.util.Scanner;


public class stringTask {

	public static boolean is_vowel(char c)
	{
	    return (c == 'a' || c == 'A' || 
	            c == 'e' || c == 'E' ||
	            c == 'i' || c == 'I' ||
	            c == 'o' || c == 'O' ||
	            c == 'u' || c == 'U' ||
	            c == 'y' || c == 'Y'
	            );
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = in.next();
	    
		String salida = "";
	    for (int i = 0; i < cad.length(); i++) {
	        if (!is_vowel(cad.charAt(i))) 
	        {
	        	salida += '.';
	            String aux = cad.charAt(i)+"";
	            salida += aux.toLowerCase(); 
	        }
	    }
	    System.out.println(salida);

	}

}
