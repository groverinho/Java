import java.util.Scanner;


public class billar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0,b = 0,s = 0,m = 0,n = 0;
		while (true) {
			a=in.nextInt();
			b =in.nextInt();
			s=in.nextInt();
			m=in.nextInt();
			n=in.nextInt();
			if (a ==0 && b ==0 && s ==0&& m ==0 && n==0) 
				break;
			double dx = m*a;
			double dy = n*b;
			double ang = Math.atan2(dy, dx) * 180 / Math.PI;
			double v = Math.sqrt(dx*dx + dy*dy) / s;
			System.out.printf("%.2f %.2f\n",ang,v);
		}
		
	}

}
