import java.util.Scanner;


public class team {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		 int n, Petya, Vasya, Tonya;
		     n=in.nextInt();
		     int total = 0;
		    while (n-->0)
		    {
		        Petya = in.nextInt();  Vasya = in.nextInt();  Tonya = in.nextInt();
		        if (Petya + Vasya + Tonya >= 2)
		            total++;
		    }
		    System.out.println(total);
		   
	}

}
