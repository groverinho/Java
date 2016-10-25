	import java.util.Arrays;
	import java.util.Scanner;
	
	
	/**
	 * @author Grover Irusta
	 *
	 */
	public class Warms {
	
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int  n = in.nextInt();
			int vec1 [] = new int [n];
			int vec2[] = new int [n];
			for (int i = 0; i < vec1.length; i++) {
				vec1[i]=in.nextInt();
			}
			for (int i = 0; i < vec2.length; i++) {
				vec2[i]=in.nextInt();
			}
			Arrays.sort(vec1);
			Arrays.sort(vec2);
			int c=0;
			int aux =n-1;
			for (int i = n-1; i >=0; i--) 
			{
	//			for (int j = aux; j >=0;) {
					if (vec2[aux]>vec1[i])
					{
						c++;
						aux--;
	//					break;
	//				}
	//				else
	//					break;
					}
			}
			System.out.println(c);
			// totalvotos es 100
			// canditatos es x
		}
	
	}
