
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 16/10/2018
 */

public class encoderDecoder444 {

	public static StringBuilder encode(String cad) {
		StringBuilder encoded = new StringBuilder();
		for (int i = 0; i < cad.length(); i++) {
			encoded.append((int) cad.charAt(i));
		}
		return encoded.reverse();
	}

	public static StringBuilder decode(String cad) {
		StringBuilder decoded = new StringBuilder();
		String auxCad = decoded.append(cad).reverse().toString();
		decoded = new StringBuilder();
		for (int i = 0; i < auxCad.length();) {
			String ss = "";
			if (auxCad.charAt(i) == '1') {
				decoded.append((char) Integer.parseInt(auxCad.substring(i, i + 3)));
				i += 3;
			} else {
				decoded.append((char) Integer.parseInt(auxCad.substring(i, i + 2)));
				i += 2;
			}
		}
		return decoded;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cad;
		while ((cad = br.readLine()) != null) {
			try {
				if (Character.isDigit(cad.charAt(0))) {
					System.out.println(decode(cad));
				} else {
					System.out.println(encode(cad));
				}
			} catch (Exception e) {
				System.out.println();
			}
		}
	}
}
