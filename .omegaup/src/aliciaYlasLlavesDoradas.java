import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - Mojix
Date 13/04/2018
 */
public class aliciaYlasLlavesDoradas {

	public static void main(String[] args) throws IOException {
		//only 90% of cases
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(in.readLine());
		String chapas[] = new String[m];
		String v1 = in.readLine();
		chapas = v1.split(" ");
		int n = Integer.parseInt(in.readLine());
		String llaves[]=new String[n];
		String v2 = in.readLine();
		llaves = v2.split(" ");
		for (int i = 0; i < llaves.length; i++) {
			
			int index = Arrays.binarySearch(chapas, llaves[i]);
			if(index < 0){
				System.out.println(0);
			}
			else{
				System.out.println(index+1);
			}
		}
		
	}

}
