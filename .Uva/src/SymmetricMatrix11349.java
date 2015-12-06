import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SymmetricMatrix11349 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int casos = Integer.parseInt(in.readLine());
		for (int t = 1; t <= casos; ++t) 
		{
			String[] cad = in.readLine().split("[= ]+");
			int n = Integer.parseInt(cad[1].trim());
						
			long[][] matriz = new long[n][n];
			for (int i = 0; i < n; ++i) {
				cad = in.readLine().split("[ ]");
				
				for (int j = 0; j < n; ++j)
					matriz[i][j] = Long.parseLong(cad[j]);
			}
			
			boolean ok = true;
			for (int i = 0; i < n && ok; ++i)
				for (int j = 0; j < n && ok; ++j)
					if (matriz[i][j] < 0 || matriz[i][j] != matriz[n - i - 1][n - j - 1])
						ok = false;
			
			System.out.println("Test #" + t + ": " + (ok ? "Symmetric" : "Non-symmetric") + ".");
		}
		
		in.close();
		System.exit(0);
	}
}
