import java.io.*;
public class MusicalLoop11496 {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) 
		{
			int N = Integer.parseInt(in.readLine());
			if (N == 0)
				break;
			
			int[] vector = new int[N];
			
			String[] partes = in.readLine().split("[ ]+");
			for (int i = 0; i < N; ++i)
				vector[i] = Integer.parseInt(partes[i]);
			
			int cnt = 0;
			if ((vector[0] < vector[N - 1] && vector[0] < vector[1]) ||
				(vector[0] > vector[N - 1] && vector[0] > vector[1]))
					++cnt;
			for (int i = 1; i < N; ++i)
				if ((vector[i] < vector[i - 1] && vector[i] < vector[(i + 1) % N]) ||
					(vector[i] > vector[i - 1] && vector[i] > vector[(i + 1) % N]))
					++cnt;
			System.out.println(cnt);
		}
	}
}