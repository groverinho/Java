import java.util.Scanner;
import java.io.*;
// Date: 06/11/18
public class opticalReader1129 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
		
			for (int j = 0; j < n; j++) {

				int count = 0;

				int temp = 0;
				for (int i = 1; i <= 5; i++) {
					int t = in.nextInt();
					if (t <= 127) {
						temp = i;
						count++;
					}

				}
				if (count > 1 || count == 0) {
					System.out.println("*");
				} else {
					if (temp == 1) {
						System.out.println("A");
					} else if (temp == 2) {
						System.out.println("B");
					} else if (temp == 3) {
						System.out.println("C");
					} else if (temp == 4) {
						System.out.println("D");
					} else {
						System.out.println("E");
					}
				}
			}
		}

	}
}
