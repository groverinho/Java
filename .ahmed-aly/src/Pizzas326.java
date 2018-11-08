import java.util.Scanner;
import java.io.*;
//Date: 07/11/18
public class CopyOfMain {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   for (int j = 1; j <= n; j++) {
	

	int m = in.nextInt();
	int sum =0;
	for (int i = 0; i < m; i++) {
		int a = in.nextInt();
		sum +=a;
	}
	System.out.println("Case "+j+": "+sum);
}
   
    }
}
