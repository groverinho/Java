package BEGINNER;
import java.util.Scanner;


public class FixedPassword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
parar:		while (in.hasNextInt()) 
		{
			
		
		int n = in.nextInt();
		if (n==2002)
		{
			System.out.println("Acesso Permitido");
			break parar;
		}
		else
			System.out.println("Senha Invalida");
		}
	}

}
