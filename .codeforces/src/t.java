import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//http://codeforces.com/problemset/problem/166/E

/*	Linear Recurrence Matrices
	
 *  f(n) = 2*f(n-1) + 3*f(n-2)
 *  
 *  f(1) = 0
 *  f(2) = 3 (Go down and come back)
 *  f(3) = 6 (Go down go to other vertex then come back)
 *  
 *  |  f(3)    |     | 2   3 |   |  f(2)  |
 *  |  f(2)    |  =  | 1   0 | * |  f(1)  |
 *  
 *  Generalization:
 *  
 *  |  f(n+k)  |    | 2   3 |^k     |  f(2)  |
 *  | f(n+k-1) | =  | 1   0 |    *  |  f(1)  |
 *  
 *  Answer is f(n+k), k = n-2
 */
public class t 
{
	private static long[][] modularMatricesMultiplication(long[][] first, long[][] second,long mod)
	{
		// ( rows1 x cols1 ) * (rows2 x cols2) = (rows1 x cols2) , cols1=rows2
		// nxm * mxk = nxk 
		long result[][] = new long[first.length][second[0].length];
		for (int row = 0; row < first.length; row++) 
		{
			for (int col = 0; col < second[0].length; col++) 
			{
				for (int item = 0; item < second.length; item++) 
				{
					result[row][col]= (result[row][col]%mod+(first[row][item]%mod * second[item][col]%mod)%mod)%mod;
				}
			}
		}
		return result;
	}
	
	//fast exponentiation
	private static long[][] modularMatrixExponetiation(long[][] matrix,long power,long mod)
	{
		long result[][] = new long[matrix.length][matrix[0].length];
		boolean firstTime = true;
		while(power!=0)
		{
			//odd
			if((power&1)==1)
			{
				/*
				 * For even and odd powers you will square (satisfied in line 41)
				 * But in case of odd power, you need to multiply by the matrix again
				 * ex. a^3 = a^2 * a 
				 * so we use result here to do this multiplication
				 * Also, in the first time we only need to make result = matrix, but for the next
				 * times we need to multiply it.
				 */
				if(firstTime)
				{
					result = matrix;
					firstTime=false;
				}
				else	result = modularMatricesMultiplication(matrix,result,mod);
			}
			power/=2;
			matrix = modularMatricesMultiplication(matrix,matrix,mod);
		}
		return result;
	}
	
	
		public static void main(String[] args) 
		{
			BufferedTokenizer io = new BufferedTokenizer(System.in);
			int n = io.nextInt();
			
			if(n==1) io.println("0");
			else if(n==2) io.println("3");
			else
			{
				long transformationMatrix[][] = new long[2][2];
				transformationMatrix[0][0] = 2;
				transformationMatrix[0][1] = 3;
				transformationMatrix[1][0] = 1;
				transformationMatrix[1][1] = 0;
				
				transformationMatrix = modularMatrixExponetiation(transformationMatrix,n-2,1000000007);
				long f[] = {3,0};
				
				long result=0;
				for (int item = 0; item < 2; item++) 
				{
					result+= (transformationMatrix[0][item]%1000000007 * f[item]%1000000007)%1000000007;
				}
				io.println((result%1000000007)+"");
				
			}
		}
		
		 public static class BufferedTokenizer 
		 {
		        private BufferedReader reader;
		        private StringTokenizer tokenizer;
		        private PrintWriter writer;
		 
		        public BufferedTokenizer(InputStream stream) 
		        {
		            reader = new BufferedReader(new InputStreamReader(stream));
		            writer = new PrintWriter(System.out);
		            tokenizer = null;
		        }
		 
		        public String next() 
		        {
		            while (tokenizer == null || !tokenizer.hasMoreTokens()) 
		            {
		                try 
		                {
		                    tokenizer = new StringTokenizer(reader.readLine());
		                } 
		                catch (IOException e) 
		                {	throw new RuntimeException(e);	}
		            }
		            return tokenizer.nextToken();
		        }
		 
		        public int nextInt() 
		        {
		            return Integer.parseInt(next());
		        }
		        public void println(String x)
		        {
		        	writer.println(x);
		        	writer.flush();
		        }
		    }
}