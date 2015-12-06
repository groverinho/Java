import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Zapping12468 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) 
		{
			String[] parts = in.readLine().split("[ ]+");
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[1]);
			if (a == -1 && b == -1)
				break;
			
			System.out.println(Math.min(Math.abs(b - a), 100 - Math.abs(b - a)));
		}
	}
}
