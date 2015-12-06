import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CtrlCPLUSCtrlVAC {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(entrada.readLine());
		String[]cadena = new String[n];
		for (int i = 0; i < cadena.length; i++) {
			cadena[i]= entrada.readLine();
			String cadena1 = cadena[i];
			if (cadena1.contains("//") ||cadena1.contains("/*")|| cadena1.contains("*/"))				
				System.out.println();
			else
				System.out.println(cadena[i]);
		}

	}

}
