import java.util.Scanner;


public class FinancialManagement11945 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		    int N = in.nextInt();
		    for (int n = 1; n <= N; n++)
		    {
		      double s = 0.0;
		      for (int i = 0; i < 12; i++)
		        s += in.nextDouble();
		      System.out.printf("%d $%,.2f\n", n, s / 12.0);

		    }
	}
}
