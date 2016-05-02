package STRINGS;

import java.io.IOException;
import java.util.Scanner;

public class ZeroMeansZero
{
	public static void main(String[] args) throws IOException 
	{
		Scanner entrada = new Scanner(System.in);
	    
	    int a, b;
	    a = entrada.nextInt();
	    b = entrada.nextInt();
		while (a!=0 && b!=0)
		{
			String aux2= (a+b)+"";
			aux2 = aux2.replaceAll("0","");
			System.out.println(aux2);
			   a = entrada.nextInt();
			    b = entrada.nextInt();
		}
	
	}

}
