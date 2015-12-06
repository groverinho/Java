import java.util.Scanner;


public class Rango {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int n2 =in.nextInt();
		for (int i = n; i <=n2; i++) {
			if (i==n2) {
				System.out.print(i);	
			}
			else
				System.out.print(i+" ");
			
		}

	}

}
