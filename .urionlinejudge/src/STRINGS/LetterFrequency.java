/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 03-11-16
 */
package STRINGS;

import java.util.Scanner;

import BEGINNER.intervalo;

public class LetterFrequency {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String linea  = in.nextLine();
		int casos =  Integer.parseInt(linea);
		while (casos-->0)
		{
			String cadena = in.nextLine().toLowerCase();
			int vector []= new int [200];
			int max = 0;
			String mejores = "";
			for (char i : cadena.toCharArray())
				vector[i]++;
			for (char i = 'a'; i <='z'; i++)
				max = Math.max(max, vector[i]);
			for (char i = 'a'; i <='z'; i++)
				if (vector[i]==max)
					mejores+=i;
			System.out.println(mejores);
		}

	}

}
