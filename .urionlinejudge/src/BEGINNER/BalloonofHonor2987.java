import java.util.Scanner;

/**
 @author Grover Irusta Miranda
 @date 6/5/2020
 @company ---
 */

public class BalloonofHonor2987 {

	/**
	
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char l = in.next().charAt(0);
		int c=1;
		for (char i = 'A'; i <='Z'; i++, c++) {
			if(l==i){
				System.out.println(c);
				break;
			}
		}
	}

}
