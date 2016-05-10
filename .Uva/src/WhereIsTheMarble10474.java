import java.util.Arrays;
import java.util.Scanner;


public class WhereIsTheMarble10474 {

	public static int binary_search(int x, int[] array) {
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
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c=1;
		while(true)
		{
			int n = in.nextInt();
			int casos = in.nextInt();
			if (n==0 && casos == 0) {
				break;
			}
			int []vectorN = new int[n];
			int []vectorCasos = new int[casos];
			for (int i = 0; i < vectorN.length; i++) {
				vectorN[i] = in.nextInt();
			}
			for (int i = 0; i < vectorCasos.length; i++) {
				vectorCasos[i] = in.nextInt();
			}
			Arrays.sort(vectorN);
			System.out.println("CASE# "+(c)+":");
			for (int i = 0; i < vectorCasos.length; i++) 
			{
				int pos = binary_search(vectorCasos[i], vectorN);
				if (pos < 0)
				     System.out.println("" + vectorCasos[i] + " not found");
				else
				     System.out.println("" + vectorCasos[i] + " found at " + (pos + 1));
				}
			c++;	
			}
			
				
		}
		

	}



/*
4 1
2 3 5 1
5
5 2
1
3
3
3
1
2
3
3
1
1 1 1
1
0 0
 * */
