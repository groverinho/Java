import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trainsorting11456{
	 public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int[] LIS;
		int[] LDS;
		int[] numeros;
		int total;
		while(n>0)
		{
			int m = Integer.parseInt(in.readLine());
			LIS = new int[m];
			LDS = new int[m];
			numeros = new int[m];
			total = 0;
			for(int i=0;i<m;i++)
				numeros[i] = Integer.parseInt(in.readLine());
				
			for(int i=m-1; i>=0;i--)
			{
				int maxI = 0;
				int maxD = 0;
				for(int j=m-1;j>i;j--)
				{	if(numeros[j]<numeros[i])
					maxI = Math.max(maxI, LIS[j]);
					if(numeros[j]>numeros[i])
					maxD = Math.max(maxD, LDS[j]);
				}
				LIS[i] = maxI+1;
				LDS[i] = maxD+1;
				total = Math.max(total, LIS[i]+LDS[i]-1);
			
			}
			n--;
			System.out.println(total);
		}
	}

}