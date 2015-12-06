import java.util.Arrays;
import java.util.Scanner;


public class sumaDeDados {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[]=  new int[n];
		
		for(int i=0; i<n; ++i)
			A[i]= in.nextInt();
		
		Arrays.sort(A);
		System.out.println((A[0]+A[1]) );
		System.out.println((A[n-1]+A[n-2]) );
		
	}

}
