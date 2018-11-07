import java.util.Scanner;
import java.io.*;
//Date: 06/11/18

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int c = in.nextInt();
    int p = in.nextInt();
    int f = in.nextInt();
    int result = 0;
	        result = c * f;
      
    System.out.println(result <= p ?"S":"N");
    }
}
