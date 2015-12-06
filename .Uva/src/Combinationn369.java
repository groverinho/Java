

import java.math.BigInteger;
import java.util.*;

public class Combinationn369 {

    static BigInteger factorial(int N) 
    {
        if (N == 0) 
        	return BigInteger.ONE;
        return BigInteger.valueOf(N).multiply(factorial(N - 1));
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            while (true)
            {
                int N = in.nextInt();
                int M = in.nextInt();

                if (N == 0 && M == 0) 
                	break;
                BigInteger res = factorial(N).divide(factorial(N - M).multiply(factorial(M)));

                System.out.println(N + " things taken " + M + " at a time is " + res + " exactly.");
            }
    }
}
