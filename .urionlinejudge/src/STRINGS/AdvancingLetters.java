package STRINGS;

import java.util.HashMap;
import java.util.Scanner;


public class AdvancingLetters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			String cad1 =in.next();
			String cad2 =in.next();
			String cadMax = "", cadMin = "";
			if (cad1.length()>= cad2.length())
			{
				cadMax = cad1;
				cadMin = cad2;
			}
			else
			{
				cadMax = cad2;
				cadMin = cad1;
			}
			int acu = 0;
			int aux = 0;
			HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();
			int index =1;
			for (char a = 'a'; a<='z'; a++)
			{
				mapa.put(a, index);
				index++;
			}
			
			for (int i = 0; i <cadMin.length() ; i++)
			{
				if (cad1.charAt(i)<=cad2.charAt(i))
				{
					aux = mapa.get(cad2.charAt(i))-  mapa.get(cad1.charAt(i));	
				}
				else
				{
					aux =Math.abs((mapa.get(cad1.charAt(i))-26)- mapa.get(cad2.charAt(i)));
				}
				
				acu+= aux;
			}
			System.out.println(acu);
		}

	}

}
