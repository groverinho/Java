
import java.util.Scanner;
public class PrimaryArithmetic10035 {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        while (true)
	        {
	            int n1 = in.nextInt();
	            int n2 = in.nextInt();
	            if (n1 == 0 && n2 == 0) break;

	            int c = 0;
	            int carry = 0;
	            while (n1 != 0 || n2 != 0) 
	            {
	                int sum = carry + n1 % 10 + n2 % 10;
	                if (sum >= 10) ++c;
	                carry = sum / 10;
	                n1 /= 10;
	                n2 /= 10;
	            }
	            if (c == 0)
	                System.out.println("No carry operation.");
	            else if (c == 1)
	                System.out.println("1 carry operation.");
	            else
	                System.out.println(c + " carry operations.");
	        }
	    }
}

