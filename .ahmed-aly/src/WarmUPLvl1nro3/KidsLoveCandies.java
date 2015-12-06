package WarmUPLvl1nro3;
import java.util.Scanner;


public class KidsLoveCandies {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int casos = in.nextInt();
		  while (casos>0) 
		  {
		    int n = in.nextInt(), k= in.nextInt(), s = 0;
		    for (int i = 0; i < n; ++i) 
		    {
		      int x = in.nextInt();
		      s += x / k;
		    }
		    System.out.println(s);
	//	    System.out.println("Hello World!");
		    casos--;
		  }
	}

}
