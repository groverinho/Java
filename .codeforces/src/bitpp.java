import java.util.Scanner;


public class bitpp {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	         int n = sc.nextInt();

	        int x = 0;
	        for (int i = 0; i < n; i++) 
	        {
	             String cad = sc.next();
	            if (cad.equals("++X") || cad.equals("X++"))
	                x++;
	            else
	                x--;
	        }
	        System.out.println(x);


	}

}
