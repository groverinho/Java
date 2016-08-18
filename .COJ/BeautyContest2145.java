import java.util.Arrays;
import java.util.Scanner;
// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 13-08-16


public class BeautyContest2145 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int c=1;
		while (casos-->0)
		{
			int v [] = new int [10]; 
			int sum = 0;
			int men = Integer.MAX_VALUE;
			int may = Integer.MIN_VALUE;
			for (int i = 0; i < 10; i++) {
				v[i]= in.nextInt();
				sum+= v[i];
				if(v[i]<men) men = v[i];
				if(v[i]>may) may = v[i];
			
			}
			
			
			
			sum-=(men+may);
			System.out.println(c+" "+sum);
			c++;
		}

	}

}
