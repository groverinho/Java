import java.util.*;
import java.math.*;
 
public class CatalanSquare{
   public static BigInteger[] vector = new BigInteger[6000];    
   public static void coeficienteBinomial(){ 
           
	   	vector[0]=BigInteger.ONE; 
        vector[1]=BigInteger.ONE; 
           
        for(int i=2; i<=5100 ;i++) 
        { 
            BigInteger numerador=BigInteger.valueOf(2*i*(2*i-1)); 
            BigInteger denominador=BigInteger.valueOf(i*(i+1)); 
            vector[i]=vector[i-1].multiply(numerador).divide(denominador); 
        } 
    } 
       
    public static void main(String[] args) { 
    	Scanner in = new Scanner(System.in); 
        int n=in.nextInt(); 
        coeficienteBinomial(); 
        System.out.println(vector[n+1]); 
    } 
}