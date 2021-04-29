import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cipher {

	public static String encryp(String text) {

		String r = "";

		for (int j = 0; j < text.length(); j++) {
			if (text.charAt(j) >= 'a' && text.charAt(j) <= 'z') {
				char c = text.charAt(j);
				if (j == text.length() - 1)
					r += c;
				else {
					if (c != text.charAt(j + 1)) {
						r += c;
					} else {
						int ocurr = 1;
						int count = j + 1;
						while (text.charAt(j) == text.charAt(count)) {
							ocurr++;
							count++;
							if (count == text.length())
								break;
						}
						if (ocurr > 2) 
							r += text.charAt(j);
						j = count - 1;

					}
				}
			}
		}

		return r;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
	while (n>0) {
		String ciph = in.readLine();
		String preEncrytp = encryp(ciph);
		String encript = encryp(preEncrytp);
		System.out.println(encript);
		n--;
	}

	}

}
