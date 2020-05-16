import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 16/5/2020
 * @company ---
 */

public class Abracadabra2484 {

	/**
ABRACADABRA
HELPME
DIS
HOLA
AB
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String string = in.next();
			int lengthString = string.length();
			for (int i = string.length(); i > 0; i--) {
				String auxString = "";
				for (int j = lengthString; j < string.length(); j++) {
					auxString += " ";
				}
				lengthString--;
				for (int j = 0; j < string.substring(0, i).length(); j++) {
					if (j + 1 != string.substring(0, i).length()) {
						auxString += string.charAt(j) + " ";
					} else {
						auxString += string.charAt(j);
					}
				}
				System.out.println(auxString);
			}
			 System.out.println();
		}
	}

}
