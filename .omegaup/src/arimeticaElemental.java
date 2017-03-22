import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class arimeticaElemental {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	       
	            int n1 = in.nextInt();
	            int n2 = in.nextInt();
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
	 
	                System.out.println(c);
	  

	}

}
