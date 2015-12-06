import java.util.Scanner;


public class EOF {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		while(entrada.hasNextInt())
		{
			int num = entrada.nextInt();		
			System.out.println(num);
		}
	}

}
