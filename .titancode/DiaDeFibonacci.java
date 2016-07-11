import java.math.BigInteger;
import java.util.Scanner;


public class DiaDeFibonacci {
	public static void fibo(BigInteger[] fib)
	{
		    fib[0] = BigInteger.ZERO;
	        fib[1] = BigInteger.ONE;
	        for (int i = 2; i <= 31; i++) 
	        {
	            fib[i] = fib[i - 1].add(fib[i - 2]);
	        }

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        BigInteger[] fib = new BigInteger[32];
        fibo(fib);
        while (in.hasNext()) {
			
		

        String fibos = "";
        for (int i = 1; i < fib.length-1; i++) {
		//	aux.out.println(i+" "+fib[i]);
        	fibos+=fib[i]+"";
		}

    //    System.out.println(fibos);
        String mes = in.next();
        String dia = in.next();
        String fecha = mes.concat(dia);
        if (fecha.length()<4)
        {
        	if (fibos.contains(fecha))
        		System.out.println("SI");
        	else
        		System.out.println("NO");
		}
        else
        {
        	//System.out.println("fechas "+ fecha);
        	String op1 = fecha.substring(0, 3);
        	String op2 = fecha.substring(1,4);
        	//System.out.println(op1);
        	//System.out.println(op2);
        	if (fibos.contains(op1) || fibos.contains(op2))
        		System.out.println("SI");
        	else
        		System.out.println("NO");
        }
        }
	}

}
