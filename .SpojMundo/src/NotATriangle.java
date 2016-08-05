
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;



public class NotATriangle {


	public static int n ;
	public static int A[];
	
//	public static int busquedaBinaria(int x)
//	{
//	    int a=0 ,b=9;
//	    if (isValid(b))return b;
//	    while(b-a>1)
//	    {
//	        int mid = (b+a)/2;
//	        if(isValid(mid))
//	            a=mid;
//	        else
//	            b=mid;
//	    }
//	    return a;
//	}
//	public static boolean isValid(int mid) {
//		
//		return false;
//	}
//	
public static int binarySearchProximo(int inicio, int fin, int valor)
	{
		int mid, i;
		while(inicio <= fin)
		{
			if(A[inicio] > valor) 
				return inicio;
			if(A[fin] <= valor) 
				return fin+1;
				
			mid = (inicio + fin) / 2;
			if(A[mid] > valor) 
				fin = mid - 1;
			else if(A[mid] < valor)
				inicio = mid + 1;
			else if(A[mid] == valor)
			{
				for(i=mid+1; i<n; i++)
					if(valor != A[i])
						return i;
				return i;
			}
		}
		return n;
	}


	public static void main(String[] args) throws IOException {
		Scanner2 in = new Scanner2(System.in);
		OutputWriter out = new OutputWriter(System.out);
		while (true) {
			n =in.nextInt();
			if (n==0) {
				break;
			}
			A= new int[n];
			for (int i = 0; i < A.length; i++) {
				A[i]= in.nextInt();
			}
			Arrays.sort(A);
			//System.out.println(binarySearchProximo(0, A.length-1,35));
			
			int acu=0;
			for(int i=0; i<n; i++)
				for(int j=i+1; j<n; j++)
					acu += (n - binarySearchProximo(j, n-1, A[i]+A[j]));

		//	System.out.println(acu);
			
			    out.print(acu + "\n");
			 

		}   out.close();
		
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
