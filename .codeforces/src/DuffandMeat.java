import java.util.Scanner;


public class DuffandMeat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
	    int n, x = 100, c, m;
	    n = in.nextInt();
	    for (int i = 0; i < n; i++)
	    {
	        m = in.nextInt();
	        c = in.nextInt();
	        if (c < x)
	            x = c;
	        sum += x*m;
	    }
	    System.out.println(sum);

	}

}
