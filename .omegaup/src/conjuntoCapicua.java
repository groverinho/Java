import java.util.ArrayList;
import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class conjuntoCapicua {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer>lista = new ArrayList<Integer>(); 
		for (int i = 0; i < n; i++) {
			lista.add(in.nextInt());
		}
		int j =lista.size()-1;
		boolean bandera = false;
	for (int i = 0; i < lista.size(); i++) {
		if (lista.get(i)!=lista.get(j)) {
			bandera = true;
			break;
		}
		j--;
	}
		System.out.println(!bandera?"SI":"NO");

	}

}
