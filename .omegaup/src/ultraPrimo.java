import java.util.Scanner;


public class ultraPrimo {
	static int converter(String number)
	{
	    int sum =0;
	    for(int i = 0; i < number.length(); i++)
	    {
	        char aux = number.charAt(i);
	        sum += aux-'0';
	    }
	    return sum;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		 int cases = in.nextInt();

		    while(cases>0)
		    {
		        String str = in.next();
		        int sum;
		        sum = converter(str);

		        int cnt = 0;
		        for(int i = 2; i < (sum/2)+1; i++)
		            if(sum%i == 0)
		                cnt++;

		        if(cnt > 0)
		            System.out.println("No UltraPrimo\n");
		        else
		        	System.out.println("UltraPrimo\n");
		        cases--;
		    }


	}

}
