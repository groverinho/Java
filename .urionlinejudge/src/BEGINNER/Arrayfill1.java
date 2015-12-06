package BEGINNER;
import java.util.Scanner;


public class Arrayfill1 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int vector []= new int [10];
		int aux=n;
		for (int i = 0; i < vector.length; i++)
		{
			System.out.println("N["+i+"] = "+aux);
			int aux2 = aux;
			aux = aux+aux2;;
			
		}
	}

}
