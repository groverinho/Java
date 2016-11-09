/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 08-11-16
 */
package MATHEMATICS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FactorialAgain {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Integer, Integer>mapa = new HashMap<Integer, Integer>();
		mapa.put(1, 1);
		mapa.put(2, 2);
		mapa.put(3, 6);
		mapa.put(4, 24);
		mapa.put(5, 120);
		while (true)
		{
			int n = in.nextInt();
			if (n==0)
			{
				break;
			}
			long r = 0;
			String cad = n+"";
			int j =cad.length();
			for (int i = 0; i < cad.length(); i++)
			{
				r += (Integer.parseInt(cad.charAt(i)+"")*mapa.get(j));
				j--;
			}
			System.out.println(r);
		}

	}

}
