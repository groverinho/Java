import java.util.Scanner;


public class Aburrido {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	//int n = in.nextInt();
		int vector []= new int [100];
		int vector2 []= new int [100];
		vector[0]=3;

		int aux = 3;
		for (int i = 1; i < vector.length; i++) 
		{
			aux = 2 +vector[i-1];
			vector[i] =  +aux;
			
			System.out.println(vector[i]);
		}

	}

}
