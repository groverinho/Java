import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Grover Irusta Miranda
 * @date day/month/2020
 * @company --
 */

public class InsideOut1235 {

	/**
	 * @throws IOException
	 * @throws NumberFormatException
	 * 
5
I ENIL SIHTHSIREBBIG S
LEVELKAYAK
H YPPAHSYADILO
ABCDEFGHIJKLMNOPQRSTUVWXYZ
VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			String cad = in.readLine();
			String aux = "";
			for (int j = (cad.length() / 2) - 1; j >= 0; j--) {
				aux = aux.concat(cad.charAt(j) + "");
			}
			for (int j = cad.length() - 1; j >= cad.length() / 2; j--) {
				aux = aux.concat(cad.charAt(j) + "");
			}
			// System.out.println(cad.length());
			// System.out.println(cad.length()/2);
			System.out.println(aux);
		}

	}

}
