import java.util.*;

public class AbstractNames11713 {
	
	static boolean letras(char c)
	{
		return Character.isLetter(c) && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int casos = in.nextInt();
		while (casos-- > 0) {
			String cad1 = in.next();
			String cad2 = in.next();
			boolean bandera = cad1.length() == cad2.length();
			
			for (int i = 0; i < cad1.length() && bandera; ++i) 
			{
				if (letras( cad1.charAt(i)) &&  cad1.charAt(i) != cad2.charAt(i))
					bandera = false;
			}
			System.out.println(bandera ? "Yes" : "No");
		}
	}
}