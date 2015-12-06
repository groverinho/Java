import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class ZerosandOnes10324 {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cont=1;
		String cad ;
		while ((cad = in.readLine()) != null && !cad.isEmpty()) {

				
			int casos = Integer.parseInt(in.readLine());
			System.out.print("Case "+cont+":\n");
			while (casos-->0)
			{
				String aux = in.readLine();
				String vector []= aux.split(" ");
				int i = Integer.parseInt(vector[0]);
				int j = Integer.parseInt(vector[1]);
				int auxMax = Math.max(i, j);
				int auxMin = Math.min(i, j);
				boolean bandera= true;
				char c = cad.charAt(auxMax);
				for (int k = auxMin+1; k <=auxMax; ++k) 
				{
					if (cad.charAt(k) != c) {
						bandera = false;
						break;
					}
				}
					
				if (bandera)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
			cont++;
		}

	}
}
