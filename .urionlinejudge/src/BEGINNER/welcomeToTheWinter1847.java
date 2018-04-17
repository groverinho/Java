package BEGINNER;
import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 17/04/2018
 */
public class welcomeToTheWinter1847 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		int m1 = b - a, m2 = c - b;
		if (m2 > m1)
			System.out.println(":)");
		else if (m2 < m1)
			System.out.println(":(");
		else {
			if (m1 <= 0)
				System.out.println(":(");
			else
				System.out.println(":)");
		}
	}
}
