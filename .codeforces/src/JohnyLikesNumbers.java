import java.util.Scanner;


public class JohnyLikesNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//System.out.println(1000000000%100000000);
		long n = in.nextInt();
	
		long k = in.nextInt();
		long aux  = n%k;
		 long aux2 = Math.abs(k-aux);
		 System.out.println(n+aux2);
//		boolean bandera = true;
//		long aux = k;
//		aux += k;
//
//			while (true)
//			{
//				n++;
//				if (n%k==0 )
//				{
//				bandera =false;
//				}
//				
//				if (!bandera) {
//					System.out.println(n);
//					break;
//				}
//				
//			}


	
	}

}
