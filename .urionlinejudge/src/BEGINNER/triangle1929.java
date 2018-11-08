import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
//Date: 07/11/18

public class triangle1929 {
	public static void main(String[] args) throws Exception {
	Scanner in = new Scanner(System.in);

	 int []a= new int[4];
			 int b,c,d,e,f, g;
	    for(b=0; b<4; b++)
	        a[b]= in.nextInt();
	    for(b=0;b<4;b++)
	    {
	        for(c=b+1; c<4; c++)
	        {
	            if(a[c]<a[b])
	            {
	                e=a[b];
	                a[b]=a[c];
	                a[c]=e;
	            }
	        }
	    }
	    g=a[1]+a[2];
	    f=a[0]+a[1];
	    if(a[3]<g || a[2]<f) System.out.println("S");
	    else System.out.println("N");
	}
}
