import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 22-8-16

public class codeRefactoring10879 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int casos  = in.nextInt();
	int caso=1;
		while (casos-->0)
		{
			int n = in.nextInt();
			int c = 0;
			System.out.print("Case #"+caso+": "+n);
		        for(int i = 2; c < 2; i++) 
		        {
		            if(n%i == 0) {
		            	System.out.print(" = "+i+" * "+ n/i);
		                c++;
		            }
		        }
		        System.out.println();
		        caso++;
		}
		  

	}

}
