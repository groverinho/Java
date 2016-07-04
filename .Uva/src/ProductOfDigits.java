import java.util.ArrayList;
import java.util.Scanner;


public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos= in.nextInt();
		ArrayList<Integer>lista;
		while( casos-->0 ){
			int n = in.nextInt();
			lista = new ArrayList<Integer>();
			if( n < 2 ) 
				lista.add(n);
			for( int i=9; i>1 && n > 1; --i )
			{
				while( n % i == 0 ){
					lista.add(i);
					n /= i;
				}
			}
			if(n>1) 
				System.out.println("-1");
			else{
				for (int i = lista.size()-1; i >=0; i--) {
					System.out.print(lista.get(i));
				}
				System.out.println();
			}
		}

	}

}
