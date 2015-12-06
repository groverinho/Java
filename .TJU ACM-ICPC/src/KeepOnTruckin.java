import java.util.Scanner;


public class KeepOnTruckin {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int i,j,k;
		  int a[]= new int[3],bandera;
		   
		  for(i=0;i<3;i++)
			  a[i]= in.nextInt();
		   
		  bandera=0;
		  for(i=0;i<3;i++)
		  {
		    if(a[i]<168) 
		    {
		       System.out.println("CRASH "+a[i]); 
		       bandera=1;
		       break;
		    }
		    
		  }
		   
		    if(bandera==0) 
		    	System.out.println("NO CRASH\n");

	}

}
