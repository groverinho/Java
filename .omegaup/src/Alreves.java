import java.util.Scanner;


public class Alreves {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		String n = in.nextLine();
		String cadena = "";
		for (int i = 0; i < n.length(); i++)
		{
			if (n.charAt(i)== '1')
			{
				cadena = cadena + '0';
			}
			else if (n.charAt(i)=='0')
			{
				cadena = cadena + '1';
			}
			else
				cadena = cadena + ' ';
		}
		System.out.println(cadena);

	}

}
