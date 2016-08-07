
import java.util.*;

public class Sleuth {
//Sleuth
	 static boolean isvowel(char ch) { 
		    String vowel = "aeiouAEIOUyY";
		    for (int j = 0; j < vowel.length(); j++)
		      if (vowel.charAt(j) == ch)
		        return true;
		    return false;
		  }

    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        String cadena = in.nextLine();
        String aux = "";
        for (int i = 0; i <cadena.length(); i++) 
        {
        	if (cadena.charAt(i)!=' ' && cadena.charAt(i)!='?') 
        	{
        		aux+=cadena.charAt(i);
			}
		}
      //  System.out.println(aux);
       char c = aux.charAt(aux.length()-1);
      // System.out.println(c);
        System.out.println(isvowel(c)?"YES":"NO");
        
    }
}