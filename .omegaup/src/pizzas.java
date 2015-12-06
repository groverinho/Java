import java.util.Scanner;


public class pizzas {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
		int puebla = in.nextInt();
		int chigua = in.nextInt();
		int huanaj = in.nextInt();
		double total = (puebla*(0.25))+(chigua*(0.5))+(huanaj*(0.75));
		System.out.printf("%.0f\n",Math.ceil(total));
		}
	}

}
