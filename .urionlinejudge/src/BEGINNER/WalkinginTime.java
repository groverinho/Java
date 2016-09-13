// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 13-09-16
package BEGINNER;

import java.util.Scanner;

public class WalkinginTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			int b= in.nextInt();
			int c= in.nextInt();
//			int v [] = new int [3];
//			for (int i = 0; i < v.length; i++) {
//				v[i] = in.nextInt();
//			}
//			Arrays.sort(v);
			if (a+b==c || b+c==a|| a+c==b|| a==b || b==c || a==c)
			{
				System.out.println("S");
			}
			else{
					System.out.println("N");
			}
		}

	}

}
