import java.util.HashMap;
import java.util.Scanner;

// Author: Grover Irusta M
// University: Universidad Privada Domingo Savio - Tarija
// Date: 03-10-16

public class acmcontestscoring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();
		
		int cantidadProblemas=0;
		int resumen=0;
		while (true) {
			int tiempo = in.nextInt();
			if (tiempo==-1) {
				break;
			}
			char problema = in.next().charAt(0);
			String juzgamiento = in.next();
			int actual = mapa.containsKey(problema) ? mapa.get(problema) : 0;
			if ("right".equals(juzgamiento))
			{
				resumen += tiempo + actual;
				cantidadProblemas++;
			}
			else
			{
				mapa.put(problema, actual + 20);
			}
			
		}
		System.out.println(cantidadProblemas+" "+resumen);
		
		

	}

}
