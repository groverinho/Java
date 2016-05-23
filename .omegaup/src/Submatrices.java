import java.util.Scanner;


public class Submatrices {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ren,col,r,c,Isub,Jsub,cont=0,i,j,iAUX,Jaux;
		ren = in.nextInt();
		col = in.nextInt();
		int [] [] matriz = new int[ren][col];
		boolean matrizBool[][] = new  boolean[ren][col];
		for(i=0;i<ren;i++)
		{
			for(j=0;j<col;j++)
			{
				matriz[i][j] = in.nextInt();
				matrizBool[i][j]=false;
			}
		}
		r = in.nextInt();
		c = in.nextInt();
		int submatriz[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				submatriz[i][j] = in.nextInt();
			}
		}
		for(i=0;i<ren;i++){
			for(j=0;j<col;j++){
			//buscamos
			if((j+(c-1))<col&&(i+(r-1))<ren&&matriz[i][j]==submatriz[0][0])
			{
			iAUX=i;
			Jaux=j;
				for(Isub=0;Isub<r;Isub++)
				{
					Jaux=j;
					for(Jsub=0;Jsub<c;Jsub++)
					{
						if(matriz[iAUX][Jaux]==submatriz[Isub][Jsub])
							cont++;
						else 
							Jsub=c;
						Jaux++;
					}
					iAUX++;
				}
				if(cont==(r*c))
				{
					iAUX=i;
					Jaux=j;
				for(Isub=0;Isub<r;Isub++)
				{
					Jaux=j;
					for(Jsub=0;Jsub<c;Jsub++)
					{
						matrizBool[iAUX][Jaux]=true;
						Jaux++;
					}
					iAUX++;
				}	
				}
				cont=0;
			}
		}
		}
		for(i=0;i<ren;i++){
			for(j=0;j<col;j++)
			{
				if (matrizBool[i][j])
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		} 

	}

}
