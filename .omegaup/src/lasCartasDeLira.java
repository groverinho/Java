import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class lasCartasDeLira {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String cadena = in.next();
		int c=0;
		if (cadena.charAt(0)=='W')
		{
			for (int i = 1; i < cadena.length(); i+=2) {
				if (cadena.charAt(i)!='B') {
					c++;
				}
			}	
		}
		else
		{
			for (int i = 1; i < cadena.length(); i+=2) {
				if (cadena.charAt(i)!='W') {
					c++;
				}
			}
		}
		System.out.println(c);
		

	}

}
