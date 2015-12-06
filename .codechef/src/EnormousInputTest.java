import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;


public class EnormousInputTest {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] vector = new String[2];
		String cadena = in.readLine();
		vector = cadena.split(" ");
		int casos =Integer.parseInt( vector[0]);
		int n = Integer.parseInt(vector[1]);
		int c=0;
		while (casos>0) {
		
			int num =Integer.parseInt(in.readLine());
			if (num % n==0)
			{
				c++;	
			}
			casos--;
		}
		System.out.println(c);
	}

}
