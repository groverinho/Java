import java.util.Arrays;
import java.util.Scanner;


public class botas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in);
		int n = in.nextInt();
		int array[]= new int [n];
		int impares=0, i=0;
	    for(i=0;i<n;i++)
	        array[i] = in.nextInt();

	  Arrays.sort(array);

	    for(i=0;i<n;i+=2)
	    {
	    	if (i+1!=n) {
				
			
	        if(array[i]!=array[i+1])
	        {
	            impares++;
	            i--;
	        }
	        }
	    }
	    System.out.println(impares+1);
	}

}
