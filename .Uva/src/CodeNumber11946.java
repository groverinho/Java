import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
Name: Grover Irusta Miranda
Company: Xtime
Date: 20-10-2018
 */

public class CodeNumber11946 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Character> mapa = new HashMap<Character, Character>();
		mapa.put('1', 'I');
		mapa.put('2', 'Z');
		mapa.put('3', 'E');
		mapa.put('4', 'A');
		mapa.put('5', 'S');
		mapa.put('6', 'G');
		mapa.put('7', 'T');
		mapa.put('8', 'B');
		mapa.put('9', 'P');
		mapa.put('0', 'O');
		
		int cases = Integer.parseInt(in.readLine());
		for (int i = 0; i < cases; i++) {
			String s ;
			while( (s=in.readLine())!=null ){
			for (int j = 0; j < s.length(); j++) {
				if(mapa.get(s.charAt(j))!=null){
					System.out.print(mapa.get(s.charAt(j)));	
				}
				else {
					System.out.print(s.charAt(j));
				}
				
			}
			System.out.println();
		}
		}

		
	}

}


