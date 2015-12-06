import java.util.Scanner;


public class digitalRoot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		String s;
		  while(!(s = in.next()).equals("0"))
		  {
		    int digitRoot = 0;
		    for(int i = 0; i < s.length(); i++)
		    {
		      digitRoot += (s.charAt(i) - '0');
		      if(digitRoot > 9)
		      {
		        digitRoot = digitRoot%10 + digitRoot/10;
		      }
		    }
		    System.out.println(digitRoot);
		  }
	}

}
