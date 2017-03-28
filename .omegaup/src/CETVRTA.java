import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class CETVRTA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		   int x1 = in.nextInt();
		   int y1 = in.nextInt();
		   int x2 = in.nextInt();
		   int y2 = in.nextInt();
		   int x3 = in.nextInt();
		   int y3 = in.nextInt();

		   if( x1 == x2 ) System.out.println(x3 );
		   if( x1 == x3 ) System.out.println( x2 );
		   if( x2 == x3 ) System.out.println( x1 );

		   if( y1 == y2 ) System.out.println( y3 );
		   if( y1 == y3 )System.out.println( y2 );
		   if( y2 == y3 ) System.out.println( y1 );

	

	}

}
