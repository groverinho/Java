import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 31-10-16
 */

public class allinall10340 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);
	while (in.hasNext()) {
		
	
	        String str1 = in.next();
	        String str2 = in.next();
	        int j = 0, c = 0;
	        //printf("%s + %s", str1.c_str(), str2.c_str());
	        for(int i = 0; i < str1.length() && j < str2.length(); i++){
	            while(j < str2.length()){
	                if(str2.charAt(j) == str1.charAt(i)){
	                    c++;
	                    j++;
	                    break;
	                }
	                j++;
	            }
	        }
	        if(c == str1.length()){
	            System.out.print("Yes\n");
	        }else
	        	System.out.print("No\n");
	}
	}}
