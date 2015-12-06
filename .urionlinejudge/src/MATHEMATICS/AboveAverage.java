package MATHEMATICS;
import java.util.Scanner;


public class AboveAverage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		n= in.nextInt();
		  for (int i = 0; i < n; i++) 
		  {
			  m= in.nextInt();;
			  int []V=  new int [m];
			  int media = 0;
			  for (int ii = 0; ii < m; ii++) 
			  {
			    V[ii] = in.nextInt();
			    media += V[ii];
			  }
			  int c = 0;
			  for (int iii = 0; iii < m; iii++)
			  {
			    if (V[iii]*m > media)
			      c++;
			  }
				  System.out.printf("%.3f",(100.0*c)/m+"%\n");
				  //System.out.println("%");
		  }
		 
	}

}
