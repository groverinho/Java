import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 3/6/2020
 * @company Mojix/Xtime
 */

public class hardChoice2702 {

	/**
	
	 */
	public static int evaluate(int v1, int v2){
		return v1>=v2 ?0:v2-v1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c1 = in.nextInt();
		int b1 = in.nextInt();
		int p1 = in.nextInt();

		int c2 = in.nextInt();
		int b2 = in.nextInt();
		int p2 = in.nextInt();
		System.out.println(evaluate(c1, c2)+evaluate(b1, b2)+evaluate(p1, p2));
		
	}

}
