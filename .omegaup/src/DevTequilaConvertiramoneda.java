import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class DevTequilaConvertiramoneda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] corte = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1,};
		int valor = in.nextInt();
		 int[] cantidad = new int[corte.length];

	        for(int i = 0; i < corte.length; i++)
	        {
	            cantidad[i] = (int) (valor / corte[i]);
	            valor -= cantidad[i] * corte[i];
	            if (cantidad[i]>0) {
	            	 if (corte[i]>10 ) {
	 					System.out.println(cantidad[i] + " billete(s) de "+corte[i]);
	 				}
	 	            else{
	 	            	System.out.println(cantidad[i] + " moneda(s) de "+corte[i]);
	 	            }
				}
	           
//System.out.printf("%d %s(s) \n", cantidad[i], (notesAndCoins[i] > 10) ? "nota" : "moeda",notesAndCoins[i]);
	        }
		
		
	}
}
