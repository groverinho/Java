import java.util.Scanner;



public class NewYearCandles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  int a=in.nextInt(), b=in.nextInt(), div, mod;
		    
		    int sum = a;
		    while(a>=b)
		    {
		        div = (a/b);
		        sum = sum + div;
		        mod = (a%b);
		        a= (div+mod);
		    }
		  System.out.println(sum);

	}

}
