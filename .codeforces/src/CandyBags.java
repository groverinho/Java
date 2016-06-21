import java.util.Scanner;


public class CandyBags {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		int j = n*n;
		int i=1;
		for (int r=0 ; r< n; r++) {
		    
		    for (int k=0; k<n/2; k++)
		    {
		        if(k==0) 
		        	 System.out.print( i + " " + j);
		        else 
		        	System.out.print(  " "  +i+ " "+j);
		        i++;
		        j--;
		    }
		    System.out.println();
	}
	}
}