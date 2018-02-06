import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - Mojix
Date 01/feb/2018
 */
public class WeirdAlgorithm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long aux = 0;
		long n = in.nextLong();
		System.out.print(n);
		if(n%2==0){
			aux = n / 2;
			System.out.print(" "+ aux);
		}
		else{
			aux = (n*3)+1;
			System.out.print(" "+ aux);
			aux= aux /2;
			System.out.print(" "+ aux);
		}
		while(aux > 1){
			if(aux%2==0){
				aux = aux / 2;
				System.out.print(" "+ aux);
			}
			else{
				aux = (aux*3)+1;
				System.out.print(" "+ aux);
				aux = aux / 2;
				System.out.print(" "+ aux);
			}
		}
	}

}
