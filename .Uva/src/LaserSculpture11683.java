import java.util.Scanner;


public class LaserSculpture11683 {

	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		
		 int h= in.nextInt(), w= in.nextInt(), height;

		    while (true) 
		    {
		        if (h == 0 && w == 0)
		            break;

		        int result = 0;
		        int prev = h;

		        while (w-->0)
		        {
		             height = in.nextInt();

		            if (height < prev)
		                result += (prev - height);

		            prev = height;
		        }

		        System.out.println(result);
		        h= in.nextInt();
		        w= in.nextInt();
		    }


	}

}
