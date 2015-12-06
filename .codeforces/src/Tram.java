	import java.util.Scanner;
	
	
	public class Tram {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n, a, b;
		    n = in.nextInt();
		    int c=0, m=0;
		    while (n>0)
		    {
		        a = in.nextInt();
		        b = in.nextInt();
		        c -= a;
		        c += b;
		        if (c > m)
		        {
		            m = c;
		        }
		        n--;
		    }
	
		    System.out.println(m);
		}
	
	}
