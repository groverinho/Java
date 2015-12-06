

import java.io.*;
import java.util.*;

public class LunchinGridCity855 {
	
	public static void main(String[] args) throws IOException {
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		
		while (casos-- > 0) {
			int calle = in.nextInt();
			int avenida = in.nextInt();
			int amigos =  in.nextInt();
			
			int[] streets = new int[amigos];
			int[] avenues = new int[amigos];
			for (int i = 0; i < amigos; ++i)
			{
				streets[i] = in.nextInt();
				avenues[i] = in.nextInt();
			}
			
			Arrays.sort(streets);
			Arrays.sort(avenues);
			
			if (amigos % 2 == 0)
				System.out.println("(Street: " + streets[(amigos - 1) / 2] + ", Avenue: " + avenues[(amigos - 1) / 2] + ")");
			else
				System.out.println("(Street: " + streets[amigos / 2] + ", Avenue: " + avenues[amigos / 2] + ")");			
		}
		
	
	}
}
