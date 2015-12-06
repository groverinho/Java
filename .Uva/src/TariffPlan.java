import java.util.Scanner;


public class TariffPlan {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		  for (int case_num = 0; case_num < casos; case_num++)
		  {
		    int n = in.nextInt();

		    int mile = 0, juice = 0;

		    while (n--> 0) 
		    {
		     	int d= in.nextInt();
		     	mile += ((d / 30) + 1) * 10;
		     	juice += ((d / 60) + 1) * 15;
		    }

		    System.out.print("Case " +( case_num + 1 )+": ");

		    if (mile < juice) 
		    	System.out.println( "Mile " +mile );
		     else if (juice < mile) 
		     	System.out.println( "Juice " + juice);
		     else 
		     	System.out.println( "Mile Juice "+ mile); 
		  }
	}
}
