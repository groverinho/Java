import java.util.Scanner;


public class QueueonBusStop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int total =1;
		int gente = 0;
		for (int i = 0; i < n; i++) {
			int grupo = in.nextInt();

			if (gente + grupo <= m) 
				gente += grupo;
			 else
			 {
				total++;
				gente = grupo;
			 }
		}
		System.out.println(total);
	}

}
