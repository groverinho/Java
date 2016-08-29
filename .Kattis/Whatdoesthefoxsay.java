import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Whatdoesthefoxsay {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String casos =in.nextLine();
	int caso = Integer.parseInt(casos);
	while (caso-->0) {
		
	
	String cadena = in.nextLine();
	String [] vector2 = cadena.split(" ");
	ArrayList<String> treeset =  new ArrayList<String>();
	for (int i = 0; i < vector2.length; i++) 
	{
		treeset.add(vector2[i]);
	}
	String cad = in.nextLine();
	while (!cad.equals("what does the fox say?")) 
	{
		String [] vector = cad.split(" ");
		while (treeset.remove(vector[2]))
		{
			
		}
		cad = in.nextLine();
	}
String aux = "";
	for (String string : treeset) 
	{
		aux += string+ " ";
		
	}
	aux = aux.trim();
	System.out.println(aux);
	}
	}
}
