import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 18-10-16
 */

public class UniqwordsComparison2700 {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad1 = in.next();
		String cad2 = in.next();
		ArrayList<Character> r1 = new ArrayList<Character>();
		ArrayList<Character> r2 = new ArrayList<Character>();
		ArrayList<Character> r3 = new ArrayList<Character>();
		String aux = cad1;
		for (int i = 0; i < cad2.length(); i++)
		{
			if (	cad1.contains(cad2.charAt(i)+"")) 
				r3.add(cad2.charAt(i));	
			
		}
		
		for (int i = 0; i < cad2.length(); i++) {
			if (cad1.contains(cad2.charAt(i)+""))
			{
				cad1= cad1.replace(cad2.charAt(i)+"", "");
			}
		}
		for (int i = 0; i < aux.length(); i++) {
			if (cad2.contains(aux.charAt(i)+""))
			{
				cad2= cad2.replace(aux.charAt(i)+"", "");
			}
		}
		for (int i = 0; i < cad1.length(); i++) {
			r1.add(cad1.charAt(i));
		}
		for (int i = 0; i < cad2.length(); i++) {
			r2.add(cad2.charAt(i));
		}
//		for (int i = 0; i < cad1.length(); i++) {
//			if (!cad2.contains(cad1.charAt(i)+""))
//			{
//				r2.add(cad1.charAt(i));
//			}
//		}
		Collections.sort(r1);
		Collections.sort(r2);
		Collections.sort(r3);
		System.out.print("First:");
		for (int i = 0; i < r1.size(); i++) {
			System.out.print(r1.get(i));
		}
		System.out.println();
		
		System.out.print("Second:");
		for (int i = 0; i < r2.size(); i++) {
			System.out.print(r2.get(i));
		}
		System.out.println();
		
		System.out.print("First&Second:");
		for (int i = 0; i < r3.size(); i++) {
			System.out.print(r3.get(i));
		}
		System.out.println();
	}

}
