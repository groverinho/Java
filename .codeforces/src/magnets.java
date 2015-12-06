/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class magnets {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(entrada.readLine());
		String s = "";
		while (n>0) {
			
		
			String  t = entrada.readLine();
			s += t;
			n--;
		}
		int f = 1;
		for (int i = 0; i < s.length() - 1; i++)
			if (s.charAt(i) == s.charAt(i+1)) 
				f++;
		System.out.println(f);

	}

}
*/
