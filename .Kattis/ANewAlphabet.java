import java.util.HashMap;
import java.util.Scanner;

// Author: Grover Irusta M
// University: Universidad Privada Domingo Savio - Tarija
// Date: 27-09-16

public class ANewAlphabet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			
			HashMap<String, String>mapa = new HashMap<String, String>();
//			String cc= "\\";
//			System.out.println(cc);
			mapa.put("a", "@");
			mapa.put("b", "8");
			mapa.put("c", "(");
			mapa.put("d", "|)");
			mapa.put("e", "3");
			mapa.put("f", "#");
			mapa.put("g", "6");
			mapa.put("h", "[-]");
			mapa.put("i", "|");
			mapa.put("j", "_|");
			mapa.put("k", "|<");
			mapa.put("l", "1");
			mapa.put("m", "[]\\/[]");
			mapa.put("n", "[]\\[]");
			mapa.put("o", "0");
			mapa.put("p", "|D");
			mapa.put("q", "(,)");
			mapa.put("r", "|Z");
			mapa.put("s", "$");
			mapa.put("t", "']['");
			mapa.put("u", "|_|");
			mapa.put("v", "\\/");
			mapa.put("w", "\\/\\/");
			mapa.put("x", "}{");
			mapa.put("y", "`/");
			mapa.put("z", "2");
			String cadena = in.nextLine();
			cadena = cadena.toLowerCase();
			for (int i = 0; i < cadena.length(); i++) {
				if (mapa.containsKey(cadena.charAt(i)+"")) {
					System.out.print(mapa.get(cadena.charAt(i)+""));
					}
				else
					System.out.print(cadena.charAt(i));
			}
			System.out.println();
			
		}

	}

}
