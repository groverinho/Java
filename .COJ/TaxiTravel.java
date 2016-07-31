import java.util.Scanner;


public class TaxiTravel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int casos = in.nextInt();
//		while (casos -->0)
//		{
			int n = in.nextInt();
			double acu = 0;
			for (int i = 0; i < n; i++) 
			{
				int m = in.nextInt();
				acu+= m;
			}
			//	System.out.println(acu);
			System.out.println(Math.round(Math.ceil(acu/4)));
	//	}
	}

}
