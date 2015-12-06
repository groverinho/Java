

import java.util.Scanner;

public class curioso {

	public static int CalcularFact(int n)
	{
	    int aux=1;
	    for (int i = 2; i <= n; i++)
	        aux = aux * i;	  
	    return aux;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
        int conver;
        String cadena="";
        for (int i = 0; i < casos; i++)
        {
            int resul = 0;
            String num = in.next();
            for (int j = 0; j < num.length(); j++)
            {
                conver = Character.getNumericValue(num.charAt(j));
                resul = resul + CalcularFact(conver);
            }
            if(Integer.parseInt(num) == resul)
                cadena = cadena + "Y" + "\n";
            else
                cadena = cadena + "N" + "\n";
        }
        System.out.println(cadena);
        
 
	}

}
