import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Grover Irusta Miranda
 * @date 16/5/2020
 * @company ---
 */

public class PomekonCollection2174 {

	public static int pokemonAvailable = 151;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		Set<String> pomekonList = new HashSet<String>();
		for (int i = 0; i < cases; i++) {
			String pomekon = in.next();
			pomekonList.add(pomekon);
		}
		System.out.println("Falta(m) " + (pokemonAvailable - pomekonList.size()) + " pomekon(s).");
	}

}
