import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 30/04/2020
 * @company ---
 */

public class Variations1632 {

	/**
	
	 */
	public static boolean isCharacterSpecial(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 's') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int count = 1;
			String password = in.next();
			for (int j = 0; j < password.length(); j++) {
				if (isCharacterSpecial(Character.toLowerCase(password.charAt(j)))) {
					count *= 3;
				} else {
					count *= 2;
				}
			}
			System.out.println(count);
		}
	}

}
