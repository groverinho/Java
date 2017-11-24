import java.util.Arrays;
import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - Mojix
Date 11/23/2017
 */
public class BeautifulDivisors {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []beauty=new int[10];
        
        for (int i = 1; i <=9; i++) {
			beauty[i]=(int) ((Math.pow(2, i)-1)*(Math.pow(2, (i-1))));
		}
        /*for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
        int max=0;
        for (int i = 1; i <=9; i++) {
			if(n%beauty[i]==0){
				max=beauty[i];
			}
		}
        System.out.println(max);
		
	}

}
