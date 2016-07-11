import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
/*
0
1
6
256
0
1
 */

public class Potencias {

	static  long m ;
	static long temp;
	public static long power ( long x, long y){
	    if  ( y == 0 )
		       return  1 ;
		    temp = power ( x ,   ( y / 2 )); 
		    if  ( y % 2  ==  0 )
		        return  ((( temp % m )* temp )% m ); 
		    else 
		       return  (((( x * temp )% m )* temp )% m );
	}
	//(a%m * b%m)%m)
	public static void main(String[] args) throws IOException {


	    Scanner2 sc = new Scanner2(System.in);
	    OutputWriter out = new OutputWriter(System.out);

		int casos  = sc.nextInt();
		BigInteger a = BigInteger.ZERO;
		BigInteger b =  BigInteger.ZERO;
		BigInteger m =  BigInteger.ZERO;
		
//		long a = sc.nextLong();
//		 long b = sc.nextLong();
//		m = sc.nextLong();
//long r=0;
		while (casos-->0)
		{
			 a = sc.nextBigInteger();
			 b = sc.nextBigInteger();
			 m = sc.nextBigInteger();
			 a = a.modPow(b, m);
		    out.print( a+ "\n");
		   temp=0;
		}
	     out.close();
	}
	}
class Scanner2{
	  public BufferedReader reader;
	  public StringTokenizer st;

	  public Scanner2(InputStream stream){
	    reader = new BufferedReader(new InputStreamReader(stream));
	    st = null;
	  }

	  public String next(){
	    while(st == null || !st.hasMoreTokens()){
	      try{
	        String line  = reader.readLine();
	        if(line == null) return null;
	        st =  new StringTokenizer(line);
	      }catch (Exception e){
	        throw (new RuntimeException());
	      }
	    }
	    return st.nextToken();
	  }

	  public int nextInt(){
	    return Integer.parseInt(next());
	  }
	  public long nextLong(){
	    return Long.parseLong(next());
	  }
	  public double nextDouble(){
	    return Double.parseDouble(next());
	  }
	  public BigInteger nextBigInteger(){
		    return  new BigInteger(next()); //Double.parseDouble(next());
		  }
	}

	class OutputWriter{
	  BufferedWriter writer;

	  public OutputWriter(OutputStream stream){
	    writer = new BufferedWriter(new OutputStreamWriter(stream));
	  }

	  public void print(int i) throws IOException {
	    writer.write(i);
	  }

	  public void print(String s) throws IOException {
	    writer.write(s);
	  }

	  public void print(char []c) throws IOException {
	    writer.write(c);
	  }
	  public  void close() throws IOException {
	    writer.close();
	  }
}
/*
6
3 2 3  
2 8 5  
2 4 10  
4 4 1000  
1 1 1  
10 10 9

0
1
6
256
0
1
*/