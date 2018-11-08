import java.util.Scanner;
import java.io.*;
//Date: 07/11/18
public class Aki362 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		StringBuilder cad = new StringBuilder(n);
		cad = cad.reverse();

		System.out
				.println(n.toLowerCase().equals(cad.toString().toLowerCase()) ? "Palindrome"
						: "Not Palindrome");
	}
}
