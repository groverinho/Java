

import java.util.*;
import java.io.*;

public class Alaska11850
{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true)
		{
			int n = Integer.parseInt(in.readLine());
			if (n == 0)
				break;
			
			int[] localizacion = new int[n];
			for (int i = 0; i < n; ++i)
				localizacion[i] = Integer.parseInt(in.readLine());
			Arrays.sort(localizacion);
			
			boolean bandera = true;
			for (int i = 1; i < n; ++i)
				if (localizacion[i] - localizacion[i - 1] > 200) 
				{
					bandera = false;
					break;
				}
			if (2 * (1422 - localizacion[n - 1]) > 200)
				bandera = false;
			System.out.println(bandera ? "POSSIBLE" : "IMPOSSIBLE");
		}
	}
}
