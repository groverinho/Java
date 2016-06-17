import java.util.Arrays;
import java.util.Scanner;


public class ElMayorImpar {

	public static void main(String[] args) {
		Scanner
		in = new Scanner(System.in);
		int vect []= new int [5];
		for (int i = 0; i < vect.length; i++) {
			vect[i] = in.nextInt();
		}
		Arrays.sort(vect);
		boolean bandera = true;
		int r = 0;
		for (int i =  vect.length-1; i>=0; i--) {
			if (vect[i]%2==1)
			{
				r = vect[i];
				bandera = false;
			}
			if (!bandera) {
				System.out.println(r);
				break;
			}
			
		}

	}

}
