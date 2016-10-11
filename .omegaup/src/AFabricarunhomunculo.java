import java.util.ArrayList;
import java.util.Scanner;


public class AFabricarunhomunculo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =  in.nextInt();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			lista.add(in.nextInt());
		}
		int queries = in.nextInt();
		for (int i = 0; i < queries; i++) {
			int q = in.nextInt();
			if (lista.contains(q)) {
				System.out.println("SI");
			}
			else System.out.println("NO");
		}
	}

}
