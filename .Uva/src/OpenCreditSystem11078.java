import java.util.Scanner;


public class OpenCreditSystem11078 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int casos, n, a;
		  int result;

		 casos= in.nextInt();

		  while (casos-->0) {
		    int max = -1000000000;
		    result = -1000000000;

		    n = in.nextInt();

		    while (n-->0) {
		      a = in.nextInt();

		      if (max - a > result)
		        result = max - a;

		      if (a > max)
		        max = a;
		    }

		  	System.out.println(result);
		  }


	}

}
