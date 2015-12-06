import java.util.Scanner;


public class WizardsAndDemostration {

	public static void main(String[] args)
	{
		Scanner in  =new Scanner(System.in);
		int n= in.nextInt(), x= in.nextInt(), y= in.nextInt();
	    
	    int clones = (n * y + 99) / 100 - x;
	    if (clones < 0)
	    {
	        clones = 0;
	    }
System.out.println(clones);

	}

}
