import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 13-08-16


public class InOrderofSize2784 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int [] v = new int [n];
		
		for (int i = 0; i < n; i++) {
		v[i]=in.nextInt();	
		}
		Arrays.sort(v);
		System.out.print(v[v.length-1]+" ");
		for (int i = 0; i < v.length-1; i++) {
			if (i+2==v.length) {
				System.out.print(v[i]);	
			}
			else
			System.out.print(v[i]+" ");
		}

	}

}
