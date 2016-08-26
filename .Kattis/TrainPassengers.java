
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;



public class TrainPassengers
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			
		
	    long C = in.nextLong();
	    int n = in.nextInt();
	    int tamano = 0;
	    boolean posible = true;
	    for (int x = 0; x < n; x++) 
	    {
	      long deja = in.nextLong();
	      long entra = in.nextLong();
	      long espera = in.nextLong();
	      
	      tamano -= deja;
	      if (tamano < 0) {
	        posible = false;
	      }
	      
	      tamano += entra;
	      if (tamano > C) {
	        posible = false;
	      }
	      
	      if ((tamano != C || x == n - 1) && espera > 0) {
	        posible = false;
	      }
	    }
	    
	    if (tamano != 0) {
	      posible = false;
	    }
	    if (posible) {
	      System.out.println("possible");
	    } else {
	      System.out.println("impossible");
	    }
	 
	}}
  }

  