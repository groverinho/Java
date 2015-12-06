
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class  HowManyNodes10223 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
		int N = 20;
		long[] catalan = new long[N+1];
		catalan[0] = 1;
		for(int i=1;i<=N;i++)
			catalan[i] = (2*(2*i-1)*catalan[i-1])/(i+1);

		String cad = "";
		while(( cad = in.readLine()) != null)
		{
			long arbol = Long.parseLong(cad);
            int res = Arrays.binarySearch(catalan, arbol);
            System.out.println(res>=0?res:-res-1);
		}
	}
}

	