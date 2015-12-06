	import java.util.Scanner;
	
	
	public class JuegoDePares {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int []juan = new int [5];int []maria = new int [5];
			int contJ=0, contM=0;
			for (int i = 0; i < maria.length; i++) {
				juan[i]=in.nextInt();
				if (juan[i]%2==0)
				{
					contJ++;
				}
			}
			for (int i = 0; i < maria.length; i++) {
				maria[i]=in.nextInt();
				if (maria[i]%2==0)
				{
					contM++;
				}
			}
			System.out.println(contJ);
			System.out.println(contM);
			
	
		}
	
	}
