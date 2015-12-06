

import java.util.Scanner;

 class CuandoVerPeliculas {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0) 
		{
			casos--;
			int dias = in.nextInt(), peliculas = in.nextInt();
			int res, aux;
			int[] d = new int[dias + 7];
			int[] p = new int[dias + 7];		
			p[0]=20;
			p[1]=20;
			p[2]=10;
			p[3]=20;
			p[4]=20;
			p[5]=30;
			p[6]=30;
			for (int i = 0; i < dias; i++)
			{
				d[i]=p[i%7];
				System.out.println("p "+p[i%7]);
			}
			for (int i = 0; i < dias -1; i++)
			{
				for (int j = i+1; j < dias; j++) 
				{
					if (d[i]>d[j])
					{
						aux =d[i];
						d[i] = d[j];
						d[j] = aux;
					}
				}
			}
			res=0;
			for (int i = 0; i < peliculas; i++)
				res = res + d[i];
			System.out.println(res);
		}
	}

}
