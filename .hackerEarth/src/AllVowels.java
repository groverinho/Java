import java.util.Scanner;


public class AllVowels {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();

			String cad = in.next();
			if (cad.contains("a") &&cad.contains("e")&& cad.contains("i")&&cad.contains("o")&&cad.contains("u")) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		

	}

}
