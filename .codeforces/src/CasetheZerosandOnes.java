import java.util.Scanner;


public class CasetheZerosandOnes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ceros=0, unos=0;
		char k;
		String cadena = in.next();
		for(int i = 0; i < n; i++){


			if (cadena.charAt(i)== '0')
				ceros++;
			else
				unos++;
		}

		System.out.println(Math.abs(ceros-unos));
	}

}
