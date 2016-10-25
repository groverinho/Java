import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 21-10-16
 */

public class AGoodContest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		boolean bandera = false;
		while (casos-->0)
		{
			String participante = in.next();
			int puntaje1 = in.nextInt();
			int puntaje2 = in.nextInt();
			if (puntaje1>=2400&& puntaje2>puntaje1) {
				bandera =true;
			}
		}
		System.out.println(bandera?"YES":"NO");

	}

}
