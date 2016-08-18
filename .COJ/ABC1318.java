import java.util.Arrays;
import java.util.Scanner;
// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 13-08-16


public class abc {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n[]= new int [3];
	
		n[0] = in.nextInt();
		n[1] = in.nextInt();
		n[2] = in.nextInt();
		String s = in.next();
		Arrays.sort(n);
		
		
		System.out.println(n[s.charAt(0)-'A']+" "+ n[s.charAt(1)-'A']+" "+ n[s.charAt(2)-'A']);
	}

}
