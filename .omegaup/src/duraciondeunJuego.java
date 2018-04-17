import java.util.Scanner;


public class duraciondeunJuego {

	public static void main(String[] args) {
		Scanner in = new 		Scanner(System.in);
		int a,b;
		a = in.nextInt();
		b = in.nextInt();
		if(a==b){
			System.out.println("24");
		}
		else if(a>b){
			System.out.println( (24-a)+b );
		} else {
			System.out.println (b-a) ;
		}

	}

}
