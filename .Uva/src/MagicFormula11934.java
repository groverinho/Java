import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 20-08-16

public class MagicFormula11934 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) 
		{
			
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int l = in.nextInt();
			if (a==0&&b==0&&c==0&&d==0&&l==0) {
				break;
			}
			int r = 0;

		    for (int i = 0; i <= l; i++) {
		      if ((a * i * i + b * i + c) % d == 0) {
		        r++;
		      }
		    }

			System.out.println(r);
		}
		

	}

}
