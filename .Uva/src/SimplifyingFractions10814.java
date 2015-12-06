 import java.util.Scanner;
import java.math.BigInteger;

 class SimplifyingFractions10814 { 
	 public static BigInteger Euclides(BigInteger a, BigInteger b) 
		{
		 BigInteger r=b;
			while (b.compareTo(BigInteger.ZERO) > 0)
			{
				r=a.mod(b);
				a=b;
				b=r;
			}
			return (a);
		}
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
      
     int N = in.nextInt();
     while (N-- > 0) 
     { 
       BigInteger numerador = in.nextBigInteger();
       String div = in.next();//ignoramos
       BigInteger denominador = in.nextBigInteger();
       BigInteger gcd_result = numerador.gcd(denominador); 
       //System.out.println(numerador.divide(gcd_result) + " / " + denominador.divide(gcd_result));
       System.out.println(numerador.divide(Euclides(numerador, denominador))+" / "+denominador.divide(Euclides(numerador, denominador)));
     } 
    } 
  }
