import java.util.Arrays;
import java.util.Scanner;


public class PythagoreanNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in );
		int [] v  = new int [3];
		while (true) {
			
		
				v[0]=in.nextInt();
		if (v[0]==0)
		{
			break;	
		}

		v[1]=in.nextInt();
		v[2]=in.nextInt();
		Arrays.sort(v);
		System.out.println(Math.pow(v[0], 2)+Math.pow(v[1], 2)== Math.pow(v[2], 2)?"right":"wrong");
		}
	}

}
