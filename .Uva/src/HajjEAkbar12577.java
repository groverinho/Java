import java.util.Scanner;



public class HajjEAkbar12577 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String input = in.next();
	    int case_number = 0;

	    while (!input.equals("*")) {

	        case_number++;

	        if (input .equals( "Hajj")) 
	        {
	            System.out.println("Case " + case_number + ": Hajj-e-Akbar");
	        }
	        else
	        {
	        	 System.out.println("Case " + case_number + ": Hajj-e-Asghar");
	        }
	        input = in.next();
	    }

	}

}
