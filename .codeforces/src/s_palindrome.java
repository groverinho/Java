import java.util.*;
public class s_palindrome
{
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		HashMap mapa = new HashMap<Character,Character>();
		mapa.put('A','A');
		mapa.put('b', 'd');
		mapa.put('d', 'b');
		mapa.put('H', 'H');
		mapa.put('I', 'I');
		mapa.put('M', 'M');
		mapa.put('O', 'O');
		mapa.put('o', 'o');
		mapa.put('p', 'q');
		mapa.put('q', 'p');
		mapa.put('T', 'T');
		mapa.put('U', 'U');
		mapa.put('v', 'v');mapa.put('V', 'V');
		mapa.put('W', 'W');mapa.put('w', 'w');
		mapa.put('x', 'x');mapa.put('X', 'X');
		mapa.put('Y', 'Y');
		String s = in.next();
		for(int i = 0;i<s.length()/2+1;i++)
		{
			if(mapa.get(s.charAt(i))==null) 
			{
				System.out.println("NIE");
				return;
			}
			char c1 =  (Character) mapa.get(s.charAt(i));
			char c2 = s.charAt(s.length()-i-1);
			if(c1!=c2){
				System.out.println("NIE");
				return;
			}		
		}
		System.out.println("TAK");
	}
}