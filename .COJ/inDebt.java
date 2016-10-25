/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 17-10-16
 */

	import java.util.Scanner;

	public class inDebt {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			while (true) {
				int n = in.nextInt();
				if (n ==-1) {
					break;
				}
				int acu =0;
				int c =0;
				for (int i = 0; i < n; i++) {
					int x = in.nextInt();
					acu+=x;
					if (acu%100==0)
					{
						c++;
						acu=0;
					}
				}
				System.out.println(c);
			}
			

		}

	}