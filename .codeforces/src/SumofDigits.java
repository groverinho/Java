import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 03-11-16
 */

public class SumofDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    String s=in.next();
	    int sum=0,c=0;
	    while(s.length()!=1)
	    {
	        sum=0;
		    for(int i=0;i<s.length();i++)
		        sum+=Integer.parseInt(s.charAt(i)+"");
		    s=Integer.toString(sum);
		    c++;
	    }
	    System.out.println(c);

	}

}
