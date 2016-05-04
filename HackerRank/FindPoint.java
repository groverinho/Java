import java.util.Scanner;


public class FindPoint {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int casos  = in.nextInt();
		while (casos-->0)
		{
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int x=0,y=0;
			x = (x2*2)-x1;
			y = (y2*2)-y1;
			System.out.println(x+" "+y);
		}
		
		
	}

}
