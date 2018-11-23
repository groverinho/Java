import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 23/11/2018
 */

public class Coins {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int s2=s;
		int counter=0;
		while (s2>0) {
			if(s2>=n) {
				s2-=n;
				counter++;
			}
			else {
				n--;
			}
		}
		System.out.println(counter);
}
}
