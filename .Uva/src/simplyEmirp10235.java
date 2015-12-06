import java.util.Scanner;
import java.math.BigInteger;

class simplyEmirp10235 { 
	  public static void main(String[] args)
	  {
	    Scanner in = new Scanner(System.in);
	    while (in.hasNext()) 
	    {
	      int N = in.nextInt();
	      BigInteger BN = BigInteger.valueOf(N);
	      String R = new StringBuffer(BN.toString()).reverse().toString();
	      int RN = Integer.parseInt(R);
	      BigInteger BRN = BigInteger.valueOf(RN);
	      System.out.printf("%d is ", N);
	      if (!BN.isProbablePrime(10)) // certainty 10 is enough for most cases
	        System.out.println("not prime.");
	      else if (N != RN && BRN.isProbablePrime(10))
	        System.out.println("emirp.");
	      else
	        System.out.println("prime.");
	      
	   
	    } 
	    } 
	  }