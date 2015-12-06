

import java.util.*;
import java.io.*;

public class GoogleisFeelingLucky12015 {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int casos = Integer.parseInt(in.readLine());
		for (int t = 1; t <= casos; ++t) 
		{
			String[] web = new String[10];
			int[] rank = new int[10];
			
			int max = 0;
			for (int i = 0; i < 10; ++i)
			{
				String linea = in.readLine();
				String vector []= linea.split(" ");
				web[i] = vector[0];
				rank[i] = Integer.parseInt(vector[1]);
				max = Math.max(max, rank[i]);
			}
			
			System.out.println("Case #" + t + ":");
			for (int i = 0; i < 10; ++i)
				if (rank[i] == max)
					System.out.println(web[i]);
		}	
	}
}
