

/**
 * Name: Grover A. Irusta Miranda 
Company: CodeRoad - xTime 
Date /2018
 */
import java.util.*;
public class NewYearAndHurry750 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int resueltos = 0;
		int sum = 0;
		for (int i = 1; i <= n; ++i) {
			sum += 5*i;
			if (sum + k > 240) {
				break;
			}
			else {
				resueltos++;
			}
		}
		
		System.out.println(resueltos);
		
	}
}