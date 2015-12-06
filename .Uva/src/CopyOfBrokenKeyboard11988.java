import java.util.*;
import java.io.*;

public class CopyOfBrokenKeyboard11988{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) 
		{
			String cadena = in.readLine();
			char[] caracter = cadena.toCharArray();
			boolean inicio = false;
			Deque<Character> deque = new ArrayDeque<Character>();
			
			for (int i = 0; i < caracter.length; i++)
			{
				if (caracter[i]=='[') 
				{
					deque.offerFirst(caracter[i]);
				}
			}
		}
	}
}
