import java.util.Scanner;


public class CRAcontar2 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String cadena = in.nextLine();
		int aux = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)=='0'||cadena.charAt(i)=='1'||cadena.charAt(i)=='2'||
				cadena.charAt(i)=='3'||cadena.charAt(i)=='4'||cadena.charAt(i)=='5'||
				cadena.charAt(i)=='6'||cadena.charAt(i)=='7'||cadena.charAt(i)=='8'||cadena.charAt(i)=='9') 
			{
				aux = aux + Character.getNumericValue(cadena.charAt(i));
			}
		}
		System.out.println(aux);
	}

}
