import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HangmanJudge489 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String cadena;
		while (true) 
		{
			cadena = in.readLine();
			int ronda = Integer.parseInt(cadena);
			if (ronda == -1)
				break;

			String solucion = in.readLine();
			String adivinar = in.readLine();
			boolean[] descubiertos = new boolean[256];
			
			int fallos = 0;
			Set<Character> letras = new HashSet<Character>();

			int resultado = 0; // 0: chickened out, 1: win, 2: lose
			
			for (char c : solucion.toCharArray())
				letras.add(c);
			
			int aux = letras.size();
			//System.out.println("tamano "+aux);
			for (char c : adivinar.toCharArray()) 
			{
				if (letras.contains(c)) 
				{
					if (!descubiertos[c])
					{
						--aux;
						descubiertos[c] = true;
					}
				} 
				else
					++fallos;
				
				if (fallos >= 7) 
				{
					resultado = 2;
					break;
				}
				if (aux <= 0) 
				{
					resultado = 1;
					break;
				}
			}
			System.out.println("Round " + ronda);
			switch (resultado) 
			{
				case 0: System.out.println("You chickened out."); break;
				case 1: System.out.println("You win."); break;
				case 2: System.out.println("You lose."); break;
			}
		}
	}
}