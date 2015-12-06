import java.util.*;
import java.io.*;

public class BrokenKeyboard11988{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (!in.ready()) 
		{
			String cadena= in.readLine();
			char[] vector = cadena.toCharArray();
			boolean inicioCorch = false;
			StringBuilder preCaden = new StringBuilder();
			ArrayDeque<String> total = new ArrayDeque<String>();

			for (int i = 0; i < vector.length; i++) 
			{
				if (vector[i] == '[') 
				{
					if (inicioCorch)
						total.offerFirst(preCaden.toString());
					else
						total.offerLast(preCaden.toString());
					preCaden = new StringBuilder();
					inicioCorch = true;
				} 
				else if (vector[i] == ']')
				{
					if (inicioCorch)
						total.offerFirst(preCaden.toString());
					else
						total.offerLast(preCaden.toString());
					preCaden = new StringBuilder();
					inicioCorch = false;
				} 
				else
				{
					preCaden.append(vector[i]);
				}
			}
			if (inicioCorch==true)
				total.offerFirst(preCaden.toString());
			else
				total.offerLast(preCaden.toString());
			
			StringBuilder respuesta = new StringBuilder();
			while (!total.isEmpty())
				respuesta.append(total.pollFirst());
			
			System.out.println(respuesta.toString());
		}
	}
}
