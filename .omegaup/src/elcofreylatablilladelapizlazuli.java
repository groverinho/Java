import java.util.Scanner;


public class elcofreylatablilladelapizlazuli {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		System.out.println((a*b*c)<=(x*y*z)?"1":"0");
	}

}
