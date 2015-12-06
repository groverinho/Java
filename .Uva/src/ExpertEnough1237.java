
import java.io.*;

public class ExpertEnough1237 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int casos = Integer.parseInt(in.readLine());
		boolean bandera = true;
		while (casos-- > 0) 
		{
			int D = Integer.parseInt(in.readLine());
			String[] nombres = new String[D];
			int[] L = new int[D];
			int[] H = new int[D];
			
			for (int i = 0; i < D; ++i) 
			{
				String[] parts = in.readLine().split("[ ]+");
				nombres[i] = parts[0];
				L[i] = Integer.parseInt(parts[1]);
				H[i] = Integer.parseInt(parts[2]);
			}
			if (bandera)
				bandera = false;
			else
				System.out.println();
			
			int Q = Integer.parseInt(in.readLine());
			
			for (int i = 0; i < Q; ++i) 
			{
				int cont = 0;
				String marca = "";
				int consultas = Integer.parseInt(in.readLine());
				
				for (int j = 0; j < D; ++j)
					if (consultas >= L[j] && consultas <= H[j]) 
					{
						cont++;
						marca = nombres[j];
					}
				
				if (cont == 1)
					System.out.println(marca);
				else
					System.out.println("UNDETERMINED");
			}
		}
	}
}