import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 05-11-16
 */

public class GoldbachsConjectureII686 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  while (true) {
			    int input = scan.nextInt();
			    if (input ==0) {
					break;
				}
			    int[] primes = generatePrimes(input);    
			   System.out.println( findPairs(input, primes));
			   
		}
	
		  }

		  private static int[] generatePrimes(int max)
		  {
		    boolean[] isComposite = new boolean[max + 1];
		    for (int i = 2; i * i <= max; i++)
		    {
		      if (!isComposite [i])
		      {
		        for (int j = i; i * j <= max; j++)
		        {
		          isComposite [i*j] = true;
		        }
		      }
		    }
		    int numPrimes = 0;
		    for (int i = 2; i <= max; i++)
		    {
		      if (!isComposite [i]) numPrimes++;
		    }
		    int [] primes = new int [numPrimes];
		    int index = 0;
		    for (int i = 2; i <= max; i++)
		    {
		      if (!isComposite [i]) primes [index++] = i;
		    }
		    return primes; 
		  }

		  private static int findPairs(int input, int[] primes)
		  {
		    int c = 0;
		    for(int i = 0; i < primes.length; i++)
		    {
		      for(int j = i; j < primes.length; j++)
		      {
		          int p = primes[i];
		          int q = primes[j];
		          if(p+q == input)
		          {
		        	  c++;
		              //primepairs += "\n" + q + " + " + p + " = " + input;
		          }
		      }
		    }
		    return c;
		    //System.out.println(primepairs);
		  }
		  }