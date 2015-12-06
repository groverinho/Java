import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumerosVacunos {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		String cad = entrada.readLine();
		String[] vec = new String[2];
		vec = cad.split(" ");
		int a = Integer.parseInt(vec[0]);
		int b = Integer.parseInt(vec[1]);
		System.out.println(Math.abs(a-b));
	}

}
