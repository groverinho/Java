import java.util.Scanner;


public class MatrizEspiral {

	public static void llenarmatrizcaracol(int mat[][],int n,int m)
    {
        int fil,col,cont,k; 
        cont=1;               
        for(k=0;k<m;k++)
        {
        col=k;
                for(fil=k;fil<=(m-1-k);fil++)
                {
                mat[fil][col]=cont;
                cont++;
                }
        fil=m-1-k;
                for(col=k+1;col<=n-1-k;col++) 
                {
                mat[fil][col]=cont;
                cont++;
                }
        col=n-1-k;
                for(fil=m-2-k;fil>=k;fil--)
                {
                mat[fil][col]=cont;
                cont++;
                }
        fil=k;
                for(col=n-2-k;col>=k+1;col--)
                {
                mat[fil][col]=cont;
                cont++;
                }
        }
        return;
    }
	public static void mostrarmatriz(int mat[][],int n,int m)
    {             
        for(int fil=0;fil<m;fil++)
        {
         
            for(int col=0;col<n;col++)
            {
            System.out.print(mat[col][fil]+" ");
            }
            System.out.println("");
        }        
        return;
    }  
	public static void main(String args[])
	{
		Scanner  in = new Scanner(System.in);
	        int n = in.nextInt(),m = in.nextInt();
	        int mat[][]=new int[n][m];    
	        llenarmatrizcaracol(mat,n,m);  
	        mostrarmatriz(mat,n,m);  
	}

}
