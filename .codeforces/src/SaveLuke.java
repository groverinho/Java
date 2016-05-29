		import java.util.Scanner;
		
		
		public class SaveLuke {
		
			public static void main(String[] args) {
				//double) (L-d)/(v1+v2))
				Scanner in  = new Scanner(System.in);
				int d=in.nextInt();
				int l=in.nextInt();
				int v1=in.nextInt();
				int v2=in.nextInt();
				
				System.out.printf("%.7f", (double)(l-d)/(v1+v2));
		
			}
		
		}
