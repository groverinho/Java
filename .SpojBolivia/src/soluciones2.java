import java.util.Scanner;

class Solucion {
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		int mezclas;
		while(casos!=0)
		{
			mezclas=entrada.nextInt();
			int [] vector = new int[mezclas];
			for (int i = 0; i < mezclas; i++) 
				vector[i]= entrada.nextInt();
			metodo(vector);
			casos--;
		}
	}
	public static void metodo (int[] vector)
	{
		int min=0;
		int aux=9999999;
parar:			for (int i = 0; i < vector.length-1; i++)
			{
				for (int j = i+1; j < vector.length; j++) 
				{
					if(i!=j)
					{
						if(vector[i]+vector[j]==0)
						{
							aux=0;
							min=0;
							break parar;							
						}
						else if(Math.abs(vector[i]+vector[j])<=aux)
						{
							if((vector[i]+vector[j])>min && Math.abs(vector[i]+vector[j])==aux)
								continue;
							min=(vector[i]+vector[j]);
							aux =Math.abs(vector[i]+vector[j]);
						}
					}
				}
		}
		System.out.println(min);
	}
	}