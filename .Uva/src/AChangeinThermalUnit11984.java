import java.util.Scanner;


public class AChangeinThermalUnit11984 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x,y,casos,i;
	    casos = in.nextInt();
	    for(i=0;i<casos;i++)
	    {
	       x = in.nextInt();
	       y = in.nextInt();
	        System.out.printf("Case %d: %.2f\n",i+1,x+5.0*y/9.0);

	    }
	}

}
