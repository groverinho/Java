import java.util.Scanner;


public class MineSweeper10279 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		  int n;
		  char bombs[][]= new char[8][8];
		  char clicked[][]= new char[8][8];
		  int result[][]= new int[8][8];
		  int t = in.nextInt();
		  

		  while (t-->0) 
		  {
		  	n= in.nextInt();

		    for (int i = 0; i < n; i++)
		      for (int j = 0; j < n; j++)
		         bombs[i][j] = in.next().charAt(0);

		    boolean ok = true;
		    for (int i = 0; i < n; i++)
		    {
		      for (int j = 0; j < n; j++) 
		      {
		    	  clicked[i][j] = in.next().charAt(0);

		        if (clicked[i][j] == 'x' && bombs[i][j] == '*')
		          ok = false;
		      }
		    }

		    for (int i = 0; i < n; i++)
		      for (int j = 0; j < n; j++)
		        result[i][j] = 0;

		    for (int i = 0; i < n; i++) 
		    {
		      for (int j = 0; j < n; j++) 
		      {
		        if (bombs[i][j] == '.')
		        	continue;

		        result[i][j+1]++;
		        result[i+2][j+1]++;
		        result[i+1][j]++;
		        result[i+1][j+2]++;
		        result[i][j]++;
		        result[i+2][j]++;
		        result[i][j+2]++;
		        result[i+2][j+2]++;
		      }
		    }

		    for (int i = 0; i < n; i++) 
		    {
		      for (int j = 0; j < n; j++) 
		      {
		        if (!ok && bombs[i][j] == '*') 
		        {
		          System.out.print('*');
		          continue;
		        }

		        if (clicked[i][j] == 'x') 
		        	System.out.print( result[i+1][j+1]); 
		        else 
		        	System.out.print( '.');
		      }
		      System.out.println();
		    }

		  }


	}

}
