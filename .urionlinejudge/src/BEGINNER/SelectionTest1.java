package BEGINNER;
import java.util.Scanner;


public class SelectionTest1 {
	/*si B es mayor que C y D es mayor que A,
	 *  y si la suma de C y D es mayor que la suma de A y B 
	 *  y si C y D eran valores positivos
	 *   y si A es par*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A,B,C,D;
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		D = in.nextInt();
		
		
			if(B > C && D > A && (C+D) > (A+B) &&  C > 0 && D > 0 && (A%2 == 0))
					System.out.println("Valores aceitos");
			else
				System.out.println("Valores nao aceitos");
	}

}
/*(B > C && D > A && (C+D) > (A+B) &&  C > 0 && D > 0 && (A%2 == 0)) ?
printf("Valores aceitos\n") :
printf("Valores nao aceitos\n");*/