import java.util.Scanner;
import java.util.TreeSet;


public class Hoaxorwhat11136 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);

		
		while (true) {
			TreeSet<Integer>billetes = new TreeSet<Integer>();
			int[] vector = new int [1000000];
			int dias = in.nextInt();
			if (dias==0) {
				break;
			}
			int total=0;
			while (dias-->0)
			{
				int cant_billetes = in.nextInt();
				for (int i = 0; i < cant_billetes; i++) {
					int billete = in.nextInt();
					billetes.add(billete);
					vector[billete]++;
				}
				int max = billetes.last();
				int min = billetes.first();
				
				total+= max-min;
				vector[max]--;
				vector[min]--;
				if (vector[max]==0) {
					billetes.remove(max);
					
				}
				if (vector[min]==0) {
					billetes.remove(min);
				}
			}
			System.out.println(total);
		}

	}

}
