package ADHOC;

import java.util.Scanner;

public class ReadingBooks {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int q ;

    while((q=in.nextInt())!=0)
    {
		int d = in.nextInt();
		int p = in.nextInt();

		int paginas = ((p*q)*(-d))/(q-p);

        System.out.print(paginas+ " pagina");
        if (paginas > 1)
        	System.out.println("s");
        else
        	System.out.println();
        


	}
	
	}

}
