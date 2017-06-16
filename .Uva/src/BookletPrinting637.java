import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class BookletPrinting637 {
	public static int findMultiple(int n ){
		int c=0;
		while (n%4!=0) {
			c++;
			n++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int  m  = in.nextInt();
		while (m!=0) {
			System.out.println("Printing order for "+m+" pages:");
			int aux =findMultiple(m);
			//System.out.println(aux);
			int num=1;
			
			int totalBook = (int) Math.ceil(m/4.0);
			if (m==1) {
				
					
				System.out.println("Sheet 1, front: Blank, 1");
					
			}
			else{
				for (int i = 0; i < totalBook; i++) {
					String blankOrNot = "";
					if (aux>0) {
						 blankOrNot="Blank";
					}
					else{
						blankOrNot = m+"";
					}
				
					System.out.println("Sheet "+(i+1)+", front: "+blankOrNot+", "+num);
					aux--;
					num++;
					if (aux>0) {
						 blankOrNot="Blank";
					}
					else{
						blankOrNot = m+"";
					}
					if (aux<0) {
						m--;
						blankOrNot = m+"";
					}
					
					System.out.println("Sheet "+(i+1)+", back : "+num+", "+blankOrNot);
					aux--;
					num++;
					if (aux<0) {
						m--;
						blankOrNot = m+"";
					}
				}
			}
			
			m  = in.nextInt();
		}

	}

}
