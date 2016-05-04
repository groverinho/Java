import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class pangram {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		Set<Character> lista= new HashSet<Character>();
		String cad = in.nextLine();
		cad = cad.toLowerCase();
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i)!=' ')
			{
				lista.add(cad.charAt(i));
			}
		}
		if (lista.size()==26)
		{
			System.out.println("pangram");
		}
		else
			System.out.println("not pangram");

	}

}
