import java.util.Scanner;

public class LuckyTicket {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int n = in.nextInt();
	    String s = in.next();

	    boolean lucky = true;
	    int diferencia = 0;
	    n /= 2;
	    for (int i = 0; i < n; ++i)
	    {
	        if ((s.charAt(i) != '4' && s.charAt(i) != '7') || (s.charAt(n+i) != '4' && s.charAt(n+i) !='7'))
	        {
	            lucky = false;
	            break;
	        }
	        diferencia += (s.charAt(i) - s.charAt(n+i));
	    }
	    lucky = lucky && (diferencia == 0);
	    System.out.println(lucky ? "YES" : "NO");
	}

}
