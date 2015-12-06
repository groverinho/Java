import java.util.Scanner;
 
public class MobileSMS12896 
{
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
  	int casos = in.nextInt();
    char comilla = '"';
    while(casos-->0)
    {
        int n = in.nextInt();
        int posicion[]= new int [n];
        int veces[]=new int[n];
        for(int i=0;i<n;i++)
        	posicion[i] = in.nextInt();
        for(int k=0;k<n;k++)
        	veces[k] = in.nextInt();
        for(int j=0;j<n;j++)
        {
            if(posicion[j]==0)
            {
                if(veces[j]==1)
                 System.out.print(" ");
            }
            if(posicion[j]==1)
            {
                if(veces[j]==1)
                	System.out.print(".");
                else if(veces[j]==2)
                	System.out.print(",");
                else if(veces[j]==3)
                	System.out.print("?");
                else 
                	System.out.print(comilla);
            }
            if(posicion[j]==2)
            {
                if(veces[j]==1)
                	System.out.print("a");
                else if(veces[j]==2)
                	System.out.print("b");
                else if(veces[j]==3)
                	System.out.print("c");
            }
            if(posicion[j]==3)
            {
                if(veces[j]==1)
                	System.out.print("d");
                else if(veces[j]==2)
                	System.out.print("e");
                else if(veces[j]==3)
                	System.out.print("f");
            }
            if(posicion[j]==4)
            {
                if(veces[j]==1)
                	System.out.print("g");
                else if(veces[j]==2)
                	System.out.print("h");
                else if(veces[j]==3)
                	System.out.print("i");
            }
            if(posicion[j]==5)
            {
                if(veces[j]==1)
                	System.out.print("j");
                else if(veces[j]==2)
                	System.out.print("k");
                else if(veces[j]==3)
                	System.out.print("l");
            }
            if(posicion[j]==6)
            {
                if(veces[j]==1)
                	System.out.print("m");
                else if(veces[j]==2)
                	System.out.print("n");
                else if(veces[j]==3)
                	System.out.print("o");
            }
            if(posicion[j]==7)
            {
                if(veces[j]==1)
                	System.out.print("p");
                else if(veces[j]==2)
                	System.out.print("q");
                else if(veces[j]==3)
                	System.out.print("r");
                else 
                	System.out.print("s");
            }
            if(posicion[j]==8)
            {
                if(veces[j]==1)
                	System.out.print("t");
                else if(veces[j]==2)
                	System.out.print("u");
                else if(veces[j]==3)
                	System.out.print("v");
            }
            if(posicion[j]==9)
            {
                if(veces[j]==1)
                	System.out.print("w");
                else if(veces[j]==2)
                	System.out.print("x");
                else if(veces[j]==3)
                	System.out.print("y");
                else 
                	System.out.print("z");
            }

        }
        System.out.println();
    }
}
	 }