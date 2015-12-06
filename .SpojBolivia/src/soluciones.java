import java.util.Scanner;
 class soluciones {

	/*
3
5
-99 -2 -1 4 98
4
-100 -2 -1 103
4
-8 -4 4 8*/
	public static int neg1=0;
	public static int neg2=0;
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int mezclas=0;

		while(casos>0)
		{
			 mezclas = in.nextInt();
			 int [] vector = new int [mezclas];
			for (int i = 0; i < mezclas; i++)
			{
				vector[i]= in.nextInt();
			}
		
			casos--;
			metodo(vector);	
			System.out.println(comparar());
		}

	}
	public static void metodo (int[] vector)
	{
		neg1=-10000000;
		neg2=10000000;
		 int min=0;	 
para:	for (int i = 0; i < vector.length -1; i++)
		{
			for (int j = i+1; j < vector.length; j++) 
			{
				min= vector[i]+vector[j];
				if (min==0)
				{
					neg1=0;neg2=0;
					comparar();
					break para;
				}
				else if(min<0)
				{
					if(min>neg1)
					neg1=min;
				}
				else
				{
					if(min<neg2)
					neg2= min;
				}
			//	System.out.println("neg 1 "+neg1);
			//	System.out.println("neg 2 "+neg2);
				comparar();
			}
		} 
	}
	public static int comparar()
	{
		 if (Math.abs(neg1)<neg2)
			return neg1;
		 else
			return neg2;	
	}
}
  