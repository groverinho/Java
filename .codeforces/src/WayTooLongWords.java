import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         int n = in.nextInt();

        for (int i = 0; i < n; i++) 
        {
             String palabra = in.next();
             int tam = palabra.length();

            if (tam > 10)
            {
                System.out.println
                (
	        		palabra.substring(0, 1) 
	                + (tam - 2) 
	                + palabra.substring(tam - 1, tam)
                ); 
            }
            else 
                System.out.println(palabra);
        }
    }
}
