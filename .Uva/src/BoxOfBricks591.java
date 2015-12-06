import java.util.Scanner;


public class BoxOfBricks591 {

	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
        int c=1;
        while(true)
        {
            int pilas=in.nextInt();
            if(pilas==0)
            {
                break;
            }
            int sum=0;
            int vector[]=new int[pilas];
            for(int i=0;i<pilas;i++)
            {
                vector[i]=in.nextInt();
                sum=sum+vector[i];
            }
            int promedio=sum/pilas;
            int movimientos=0;
            for(int i=0;i<pilas;i++)
            {
                if(vector[i]>promedio)
                {
                	movimientos=movimientos+(vector[i]-promedio);
                }
            }
            System.out.println("Set #"+c+"\nThe minimum number of moves is "+movimientos+".\n");
            c++;

	}

}}
