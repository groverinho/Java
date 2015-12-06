import java.util.Arrays;
import java.util.Scanner;


public class CostCutting11727 {

	public static void main(String[] args) 
	{
		Scanner in  =new Scanner(System.in);
		int casos = in.nextInt();
		int caso = 1;
		while (casos>0)
		{
			int [ ]vector = new int [3];
			for (int i = 0; i < vector.length; i++) {
				vector[i]= in.nextInt();
				
			}
			Arrays.sort(vector);
			System.out.println("Case "+caso+": "+vector[1]);
			caso++;
			casos--;
			
		}
	}

}
