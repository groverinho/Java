import java.util.Scanner;


public class basesNumericas {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		 int number, base;
		number = in.nextInt();
		base = in.nextInt();
		    do
		    {
		       System.out.print(number%base);
		        number = number/base;
		    }while(number >0);

	}

}
