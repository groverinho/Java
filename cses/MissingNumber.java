import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - Mojix
Date 01/feb/2018
 */
public class MissingNumber {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		long n = in.nextLong();
		long arr[]= new long[(int) n];
		for (int i = 0; i < n-1; i++) {
			arr[i]=in.nextInt();
		}
		long sum = 0, expectedSum = n* (n+1)/2;//triangular numbers
		for(long i = 0, len = n; i < len; i++){
		    sum += arr[(int) i];
		}
		  
		  System.out.println(expectedSum - sum);
	}

}
