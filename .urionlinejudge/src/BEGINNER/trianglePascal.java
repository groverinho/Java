package BEGINNER;
/**
Name: Grover A. Irusta Miranda
University: Universidad Privada Domingo Savio - Tarija
Date:  29-09-16
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class trianglePascal{

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		OutputWriter out = new OutputWriter(System.out);
		int casos  = in.nextInt();
		 int n =0;
		 while (casos-->0) 
		 {
			 n =in.nextInt();
			 long r = (long)(Math.pow(2,n))-1;
			 out.print(r + "\n");
			  
		}out.close();
	}
	
}
class Scanner{
	  public BufferedReader reader;
	  public StringTokenizer st;

	  public Scanner(InputStream stream){
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
