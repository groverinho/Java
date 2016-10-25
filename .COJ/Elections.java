import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Grover Irusta
 *
 */
public class Elections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int  n = in.nextInt();
		int candidatos [] = new int [n];
		int porcentajes[] = new int [n];
		int totales=0;
		for (int i = 0; i < candidatos.length; i++) {
			candidatos[i]= in.nextInt();
			totales+= candidatos[i];
		}
		for (int i = 0; i < porcentajes.length; i++) {
			porcentajes[i]= (candidatos[i]*100)/totales;
		}
		Arrays.sort(porcentajes);
		if (porcentajes[n-1]>=45 || (porcentajes[n-1]>=40 && porcentajes[n-1]-10 > porcentajes[n-2])) {
			System.out.println("1");
		}
		else
			System.out.println("2");
		// totalvotos es 100
		// canditatos es x
	}

}
