import java.util.Scanner;


public class GeorgeandAccommodation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    int habitacion = 0;
	    for (int i = 0; i < n; i++) {
	        int p = in.nextInt(), q = in.nextInt();
	        if (2 <= (q-p))
	        {
	        	habitacion++;
	        }
	    }
	    System.out.println(habitacion);

	}

}
