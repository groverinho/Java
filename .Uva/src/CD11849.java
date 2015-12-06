

import java.util.*;
import java.io.*;

public class CD11849 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true)
		{
			StringTokenizer token = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(token.nextToken());
			int M = Integer.parseInt(token.nextToken());
			
			if (N == 0 && M == 0) 
				break;
			
			Set<Integer> jack = new HashSet<Integer>();
			for (int i = 0; i < N; ++i)
				jack.add(Integer.parseInt(in.readLine()));
			
			int cont = 0;
			for (int i = 0; i < M; ++i)
				if (jack.contains(Integer.parseInt(in.readLine())))
					cont++;
			System.out.println(cont);
		}
	}
}
