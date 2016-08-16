import java.util.Arrays;
import java.util.Scanner;

//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 16-08-16
public class IncreasingOrderWord1485 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = in.next();
		char v []= cad.toCharArray();
		Arrays.sort(v);
		for (int i = 0; i < v.length; i++) {
				System.out.print(v[i]);

		}
		System.out.println();
	}

}
