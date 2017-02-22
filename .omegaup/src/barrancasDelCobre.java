import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class barrancasDelCobre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int v []= new int[50100];
	
		Scanner in = new Scanner(System.in);
			int n,r=-50100,uso=0,uso2,j,i,k;
			n= in.nextInt();
			k=in.nextInt();
			for(i=1;i<=n;i++){
				v[i]=in.nextInt();
			}
			for(j=1;j<=(n-k)+1;j++)
			{
				if(j==1)
				{
					for(i=1;i<k;i++)
						uso+=v[i+1]-v[i];
					if(uso>r)
						r=uso;
				}
			else 
			{
				uso+=v[j+k-1]-v[j+k-2];
				if(uso>r){
					r=uso;
				}
			}
				uso-=v[j+1]-v[j];
			}
			System.out.println(r);
		}
}
