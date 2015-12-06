import java.util.Scanner;


public class SumaDeVectores {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] vector1 = new int[n];
		int[] vector2 = new int[n];
		for (int i = 0; i < vector1.length; i++) {
			vector1[i]=in.nextInt();
		}
		for (int i = 0; i < vector2.length; i++) {
			vector2[i]=in.nextInt();
		}
		for (int i = 0; i < vector2.length; i++)
		{
			if (i+1== vector2.length) {
				System.out.print(vector1[i]+vector2[i]);
			}
			else
				System.out.print(vector1[i]+vector2[i]+" ");
		}
	}

}
