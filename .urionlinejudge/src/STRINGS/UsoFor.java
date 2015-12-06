package STRINGS;

import java.io.IOException;
import java.util.Scanner;

public class UsoFor
{
	public static void main(String[] args) throws IOException 
	{
		Scanner entrada = new Scanner(System.in);
	    StringBuilder aux;
		StringBuilder palabra = new StringBuilder("");
		palabra.append(entrada.next());
		aux = palabra.reverse();
		System.out.println(aux);
	
	}

}
