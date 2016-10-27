import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 26-10-16
 */

public class SqrtLogSin1035 {
	public static int []x  = new int [1000002];
	public static void calcula()
	{
	    int i;
	    double d;
//mod =1000000
	    x[0] = 1;
	    for(i = 1; i <= 1000000; i++){
	        d = i;
	        x[i] = (x[(int)(d-Math.sqrt(d))]%1000000 + x[(int)Math.log(d)]%1000000 + x[(int)(d*Math.sin(d)*Math.sin(d))]%1000000)%1000000;
	    }
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		calcula();
		while (true) {
			int n = in.nextInt();
			if (n==-1) {
				break;
			}
				
			System.out.println(x[n]);
		}

	}

}
