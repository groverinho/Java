import java.util.Scanner;


public class FIFAWorldPlayer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double PA, PJ, G, A, TA , TR;
		int n =in.nextInt();
		String [] jugadores = new  String[n];
		double [] vec = new double [n];
		int aux = 0;
		double aux2=0;
		for (int i = 0; i < n; i++) 
		{
			jugadores[i]= in.next();
			PA = in.nextDouble();
			PJ = in.nextDouble();
			G = in.nextDouble();
			A = in.nextDouble();
			TA = in.nextDouble();
			TR = in.nextDouble();
			//double a= ;
			//vec[i] =a;
			
			if (aux2<(Math.log10(PA) + PJ + 2*G + A - (TA + 2*TR)))
			{
				 aux2 = Math.log10(PA) + PJ + 2*G + A - (TA + 2*TR);
				aux=i;
			}
			
		}
//		for (int i = 0; i < vec.length; i++) {
//			System.out.println(vec[i]);
//		}
		System.out.println(jugadores[aux]);

	}

}
