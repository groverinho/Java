import java.util.Scanner;


public class Aburrido {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	int n = in.nextInt();
		int vector []= new int [100000];
		
		vector[0]=3;
		int aux = 3;
		for (int i = 1; i < vector.length; i++) 
		{
			vector[i]= vector[i-1]+aux;
			aux+=2;
//			aux = 2 +vector[i-1];
//			vector[i] = +aux;
	//	System.out.println(vector[i]);
			
		}
		System.out.println(vector[n-1]);

	}

}
