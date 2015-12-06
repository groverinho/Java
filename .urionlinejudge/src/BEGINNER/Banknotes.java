package BEGINNER;
import java.util.Scanner;


public class Banknotes {

	public static void main(String[] args) {
		 	Scanner in  =new Scanner(System.in);
		 	int n = in.nextInt();
		 	
		 	
		    
		    System.out.println(n);
		    System.out.println(n/100+ " nota(s) de R$ 100,00");
		    n %= 100;
		    System.out.println( n/50+" nota(s) de R$ 50,00");
		    n %= 50;
		    System.out.println(n/20 +" nota(s) de R$ 20,00");
		    n %= 20;
		    System.out.println(n/10+" nota(s) de R$ 10,00");
		    n %= 10;
		    System.out.println(n/5+" nota(s) de R$ 5,00");
		    n %= 5;
		    System.out.println(n/2+" nota(s) de R$ 2,00");
		    n %= 2;
		    System.out.println(n+" nota(s) de R$ 1,00");
		    
		   
	}

}
