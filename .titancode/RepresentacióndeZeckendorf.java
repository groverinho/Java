import java.util.Scanner;


public class RepresentacióndeZeckendorf {

	public static void fibo(int[] fib)
	{
		    fib[0] = 0;
	        fib[1] = 1;
	        for (int i = 2; i <= 31; i++) 
	        {
	            fib[i] = fib[i - 1] +fib[i - 2];
	        }

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] fib = new int[32];
        fibo(fib);
        int n = in.nextInt();
        int acu=0;
        int index=0;;
        String cad = "";
        for (int i = fib.length-1; i>=0; i--)
		{
			if (n>=fib[i])
			{
				acu= fib[i];
				index = i;
				cad = fib[i]+"";
				break;
			}
		}
        index--;
        while (n!=acu)
        {
			if (acu+fib[index]<=n)
			{
				cad+= " "+fib[index];
				acu += fib[index];
				index--;
			}
			else
				index--;
		}
        System.out.println(cad);
       
       
	}

}
