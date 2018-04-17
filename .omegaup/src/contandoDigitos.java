import java.io.EOFException;
import java.util.Scanner;


public class contandoDigitos {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int con0=0;int con1=0;int con2=0;int con3=0;int con4=0;int con5=0;int con6=0;int con8=0;int con7=0;int con9=0;
		String n ;
		 try {
		while ((n=in.next())!=null) 
		{
		
		
		
			for (int i = 0; i < n.length(); i++)
			{
				if (n.charAt(i) == '1')
					con1++;
				else if (n.charAt(i)=='2')
					con2++;
				else if (n.charAt(i)=='3')
					con3++;
				else if (n.charAt(i)=='4')
					con4++;
				else if (n.charAt(i)=='5') 
					con5++;
				else if (n.charAt(i)=='6')
					con6++;
				else if (n.charAt(i)=='7')
					con7++;
				else if (n.charAt(i)=='8')
					con8++;
				else if (n.charAt(i)=='9')
					con9++;
			}	
			}
		 
	}catch (Exception e) {	
	}System.out.println(con0+"-0s");
		System.out.println(con1+"-1s");
		System.out.println(con2+"-2s");
		System.out.println(con3+"-3s");
		System.out.println(con4+"-4s");
		System.out.println(con5+"-5s");
		System.out.println(con6+"-6s");
		System.out.println(con7+"-7s");
		System.out.println(con8+"-8s");
		System.out.println(con9+"-9s");
		
		}
		
}
