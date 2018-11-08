import java.util.Scanner;
import java.io.*;
//Date: 07/11/18
public class RightArea1190 {
	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		  double N[][] = new double[12][12];
		    char p= in.next().charAt(0);
		    double soma = 0.0;
		    
		    
		    
		    for(int i = 0; i < 12; i++){
		            for(int j = 0; j < 12; j++){
		                   N[i][j]= in.nextDouble();
		            if(j > (11 - i) && j > i){
		                 soma += N[i][j];
		            }
		            }
		   }
		    
		    if(p == 'S')
		         System.out.printf("%.1f\n", soma);
		    else
		    	System.out.printf("%.1f\n", soma/30.0);
	}
}
