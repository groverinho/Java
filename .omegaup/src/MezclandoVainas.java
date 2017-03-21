import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class MezclandoVainas {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		leer1 in = new leer1(System.in);
		 OutputWriter3 out = new OutputWriter3(System.out);
		int m = in.nextInt();
		int n = in.nextInt();
		ArrayList<Integer> orden = new ArrayList<Integer>();
		for (int i = 0; i <m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				orden.add(in.nextInt());
			}
		}
			Collections.sort(orden);
			for (int i = 0; i < orden.size(); i++) 
			{
				if (i!=orden.size()-1)
					//System.out.print(orden.get(i)+" ");
				out.print(orden.get(i)+" ");	
				else
					out.print(orden.get(i)+"");
				
			}
			out.close();
	

	}

}

class leer1{
  public BufferedReader reader;
  public StringTokenizer st;

  public leer1(InputStream stream){
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

class OutputWriter3{
  BufferedWriter writer;

  public OutputWriter3(OutputStream stream){
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