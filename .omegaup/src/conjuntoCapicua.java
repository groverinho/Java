import java.util.Scanner;


public class conjuntoCapicua {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		String cad = in.nextLine();
		StringBuilder cad2 = new StringBuilder(cad);
		cad2 = cad2.reverse();
		String aux2 = cad2.toString();
		if (aux2.equals(cad))
		{
		System.out.println("SI");	
		}
		else
			System.out.println("NO");

	}

}
