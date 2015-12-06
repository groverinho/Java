	import java.util.Scanner; 
	import java.math.BigInteger; 
	
	class Krakovia10925 {
	  public static void main(String[] args) 
	  {
	    Scanner sc = new Scanner(System.in);
	    int caso = 1;
	    while (true) 
	    {
	      int n = sc.nextInt(), f = sc.nextInt();
	      if (n == 0 && f == 0)
	    	  break;
	      BigInteger sum = BigInteger.ZERO; 
	      for (int i = 0; i < n; i++)
	      { 
	        BigInteger v = sc.nextBigInteger();
	        sum = sum.add(v); 
	      }
	      System.out.println("Bill #" + (caso++) + " costs " +
	        sum + ": each friend should pay " + sum.divide(BigInteger.valueOf(f)));
	      System.out.println(); 
	    } 
	    } 
	  }                     
