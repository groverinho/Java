package STRINGS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Combiner {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner in = new Scanner(System.in);
		int casos  =in.nextInt();
		while (casos-->0)
		{
			String cadena1 = in.next();
			String cadena2 = in.next();
			String nuevaCad = "";
			if (cadena1.length()>cadena2.length())
			{
				int indexAux=0;
				for (int i = 0; i < cadena2.length(); i++)
				{
					nuevaCad+= cadena1.charAt(i)+""+cadena2.charAt(i);
					indexAux = i;
				}
				for (int i = indexAux+1; i < cadena1.length(); i++) {
					nuevaCad += cadena1.charAt(i);
				}
			}
			else
			{
				int indexAux=0;
				for (int i = 0; i < cadena1.length(); i++)
				{
					nuevaCad+= cadena1.charAt(i)+""+cadena2.charAt(i);
					indexAux = i;
				}
				for (int i = indexAux+1; i < cadena2.length(); i++) {
					nuevaCad += cadena2.charAt(i);
				}
			}
			System.out.println(nuevaCad);
		}
	}

}
