import java.util.Arrays;
import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - Mojix
Date /2017
 */
public class ACMICPC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in );
		int [] n = new int[6];
		int acu = 0;
		for (int i = 0; i < 6; i++){
		    n[i] = in.nextInt();
		    acu += n[i];
		}
		for (int i = 0; i < 6; i++){
		    for (int j = 0; j < 6; j++){
		        for (int k = 0; k < 6; k++){
		            if (i == j|| i == k || k == j) 
		            	continue;
		       /*     else{
		            	System.out.println("NO");
		            	return;
		            }*/
		            int s = n[i] + n[j] + n[k];
		            if (s == acu - s){
		                System.out.println("YES");
		                return;
		            }
		        }
		    }
		}
		System.out.println("NO");
	}
}
