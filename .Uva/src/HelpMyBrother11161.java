
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
 
public class HelpMyBrother11161{
 
    /**
     * @param args
     */
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        int cases = 0;
         
        BigInteger vector [] = new BigInteger [1500 + 10];
        vector [1] = BigInteger.ZERO;
        vector [2] = BigInteger.ONE;
         
        for ( int i = 3; i <= 1505; i++ ) 
        {
        	vector [i] = vector [i - 1].add(vector [i - 2]).add(BigInteger.ONE);
        	//System.out.println(lineStartWith[i]);
        }
            
         
        int n = input.nextInt();
         
        while ( n != 0 )
        {
            BigInteger median = vector [n].add(vector [n + 1]).subtract(BigInteger.ONE).divide(BigInteger.valueOf(2));
            System.out.printf("Set %d:\n", ++cases);
            System.out.println(median);
            n = input.nextInt();
        }
    }
}