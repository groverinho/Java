import java.util.Scanner;


public class FinancialManagement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in );
		double [] v  = new double [12];
		double sum = 0;
		for (int i = 0; i < v.length; i++) {
			v[i]=in.nextDouble();
			sum+= v[i];
		}
		double redondeado = Math.round((sum/12)*100.0)/100.0;

		System.out.println("$" + redondeado);

	}

}
