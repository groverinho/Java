import java.util.Scanner;


public class Sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = Math.abs(n);
		int acu=0;
		
			for (int i = 1; i <=m; i++) {
			acu+=i;
			}
		if (n>0) {
			System.out.println(acu);	
		}
		else
			System.out.println(-acu+1);
		
		

	}
}
