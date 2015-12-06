import java.util.GregorianCalendar;
import java.util.Scanner;


public class jollyJumpers10038 {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNextInt())
        {
            int n = in.nextInt();
            int[] vector = new int[n];
            for (int i = 0; i < n; i++) 	
            	vector[i] = in.nextInt();
            
            
            boolean[] vectorBoleano = new boolean[n];
            for (int i = 1; i < n; i++) 
            {
                try 
                {
                	vectorBoleano[Math.abs(vector[i] - vector[i - 1])] = true;
                } 
                catch (Exception e) {}
            }
            boolean bandera = false;
            for (int i = 1; i < vectorBoleano.length; i++) 
            {
                if (!vectorBoleano[i])
                {
                	bandera = true;
                    break;
                }
            }
            if (!bandera) 
                System.out.println("Jolly");
            else 
                System.out.println("Not jolly");         
        }
    
	}
}
