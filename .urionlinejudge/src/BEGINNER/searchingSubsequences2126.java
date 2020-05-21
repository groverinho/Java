import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 21/5/2020
 * @company Mojix/Xtime
 */

public class searchingSubsequences2126 {

	/**
	 * 78954 7895478954789547895447895478954 464133 1331646546874694 12
	 * 1231321455123214565423112
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = 0;
		while (in.hasNext()) {
			String subString = in.next();
			String string = in.next();
			int subStringLength = subString.length();
			int stringLength = string.length();
			int c = 0;
			int indexLastSubs = 0;
			int j = 0;
			boolean isPossible = false;
			for (int i = 0; i < stringLength; i++) {
				if (subString.charAt(j) == string.charAt(i) && j < subStringLength) {
					j++;
					isPossible = true;
				} else {
					j = 0;
					if (isPossible) {
						i -= j + 1;
						isPossible = false;
					}
				}
				if (j == subStringLength) {
					indexLastSubs = i - subStringLength + 1;
					c++;
					j = 0;
				}

			}
			cases++;
			System.out.println(
					c > 0 ? "Caso #" + cases + ":\nQtd.Subsequencias: " + c + "\nPos: " + (indexLastSubs + 1) + "\n"
							: "Caso #" + cases + ":\nNao existe subsequencia\n");
		}
	}

}
