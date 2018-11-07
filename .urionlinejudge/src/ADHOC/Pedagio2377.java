import java.util.Scanner;
import java.io.*;
//Date: 06/11/18

public class Pedagio2377 {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    while(in.hasNext()){
    	int l = in.nextInt();
        int d = in.nextInt();
        int k = in.nextInt();
        int p = in.nextInt();
        
          int result =l/d;
          result = result *p;
          result = (k*l)+result;
        System.out.println(result);	
    }
    
    }
}
