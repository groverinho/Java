import java.util.Scanner;

/**
 * 
 */

/**
 * @author Grover Irusta
 * @company Coderoad - Mojix
 * @date 05-02-20
 */
public class FoodBuying1296 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int money = in.nextInt();
			int spend = 0;
			while (money >= 10) {
				int tmp = money % 10;
				spend += money - tmp;
				money = tmp + money / 10;
			}
			spend += money;
			System.out.println(spend);
		}

	}

}
