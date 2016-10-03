import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 02-10-16

public class ElIntervaloyeldivisor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c=0;
		for (int i = a; i <= b; i++) {
			if (i%d==0) {
				c++;
			}
		}
		System.out.println(c);
	}

}
