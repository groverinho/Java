import java.util.Arrays;
import java.util.Scanner;


public class Mediana {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		double acu =0;
		int v []=  new int [casos];
		for (int i = 0; i < v.length; i++) {
			v[i]=in.nextInt();
			
		}
		Arrays.sort(v);
		if (v.length%2==1)
		{
			System.out.printf("%.1f",(double)v[v.length/2]);
		}
		else
		{
			int index = (v.length/2)-1;
			System.out.printf("%.1f",(double)(v[index]+v[index+1])/2);
		}
	//	System.out.printf("%.1f",(acu/casos));

	}

}
