import java.util.Scanner;


public class JaminaLaJirafaCuriosa {

	public static int binary_search(int x, long[] array) {
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
		int mid = (low + high) / 2;
		if (array[mid] < x)
		    low = mid + 1;
		else
		    high = mid;
		}
		if (low == high && array[low] == x)
		return low;
		return -1;
		}
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		long[] vector = new long [31];
		int j = 1;
		vector[0]=2;
		for (int i = 1; i < 30; i++)
		{
			vector[i]= vector[i-1]+j;
			j*=3;
		}
		while (in.hasNext())
		{
			int n =in.nextInt();
			int buscando = binary_search(n, vector);
			System.out.println(vector[buscando+1]);
		}
		
		
	}

}
