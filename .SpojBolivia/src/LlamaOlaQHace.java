
import java.util.Scanner;

public class LlamaOlaQHace {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int cantidad;
		int ax,ay,bx,by,cx,cy;
		int consulx,consuly;
		String resul;
		String cadena = "";
		do
		{
			ax=entrada.nextInt();
			ay=entrada.nextInt();
			bx=entrada.nextInt();
			by=entrada.nextInt();
			cx=entrada.nextInt();
			cy=entrada.nextInt();
			if(ax==0&&ay==0&&bx==0&&by==0&&cx==0&&cy==0)
				break;
			cantidad=entrada.nextInt();
			for (int i = 0; i < cantidad; i++)
			{
				consulx = entrada.nextInt();
				consuly = entrada.nextInt();
				resul=calcular(ax, ay, bx, by, cx, cy, consulx, consuly);
				cadena += resul;
			}
			
			
		}while(ax!=0&&ay!=0&&bx!=0&&by!=0&&cx!=0&&cy!=0);
		System.out.print(cadena);

	}
	
	public static String calcular(int ax,int ay,int bx,int by,int cx,int cy,int x,int y)
	{
		boolean[] regla = new boolean[226];
		boolean[] reglaA = new boolean[226];
		boolean[] reglaB = new boolean[226];
		boolean[] reglaC = new boolean[226];
		for (int i = ax; i < regla.length; i=i+ay) 
		{
			regla[i]=true;
			reglaA[i]=true;
		}
		for (int j = bx; j < regla.length; j=j+by) 
		{
			regla[j]=true;
			reglaB[j]=true;
		}
		for (int k = cx; k < regla.length; k=k+cy) 
		{
			regla[k]=true;
			reglaC[k]=true;
		}
		if(regla[x]==true&&regla[y]==true)
		{
			if(reglaA[x]==true&&reglaA[y]==true)
			{
				return "ola k ase\n";
			}
			else if(reglaB[x]==true&&reglaB[y]==true)
			{
				return "ola k ase\n";
			}
			else if(reglaC[x]==true&&reglaC[y]==true)
			{
				return "ola k ase\n";
			}
			else if(reglaA[x]==true)
			{
				if(reglaB[y]==true)
				{
					for (int i = ax; i < regla.length; i=i+ay) 
					{
						if(reglaB[i]==true)
							return "ola k ase\n";
					}
					for (int j = ax; j < regla.length; j+=ay) 
					{
						if(reglaC[j]==true)
						{
							for (int k = cx; k < regla.length; k=k+cy) 
							{
								if(reglaB[k]==true)
									return "ola k ase\n";
							}
						}
					}
				}
				else if(reglaC[y]==true)
				{
						for (int i = ax; i < regla.length; i=i+ay) 
						{
							if(reglaC[i]==true)
								return "ola k ase\n";
						}
						for (int j = ax; j < regla.length; j+=ay) 
						{
							if(reglaB[j]==true)
							{
								for (int k = bx; k < regla.length; k=k+by) 
								{
									if(reglaC[k]==true)
										return "ola k ase\n";
								}
							}
						}
				}
			}
			else if (reglaB[x]==true)
			{
					if(reglaC[y]==true)
					{
						for (int i = bx; i < regla.length; i+=by) 
						{
							if(reglaC[i]==true)
								return "ola k ase\n";
						}
						for (int j = bx; j < regla.length; j+=by) 
						{
							if(reglaA[j]==true)
							{
								for (int k = ax; k < regla.length; k+=ay) 
								{
									if(reglaC[k]==true)
										return "ola k ase\n";
								}
							}
						}
					}
					else if(reglaA[y]==true)
					{
							for (int i = bx; i < regla.length; i=i+by) 
							{
								if(reglaA[i]==true)
									return "ola k ase\n";
							}
							for (int j = bx; j < regla.length; j+=by) 
							{
								if(reglaC[j]==true)
								{
									for (int k = cx; k < regla.length; k=k+cy) 
									{
										if(reglaA[k]==true)
											return "ola k ase\n";
									}
								}
							}
					}
				}
					else if(reglaC[x]==true)
					{
						if(reglaA[y]==true)
						{
							for (int i = cx; i < regla.length; i+=cy) 
							{
								if(reglaA[i]==true)
									return "ola k ase\n";
							}
							for (int j = cx; j < regla.length; j+=cy) 
							{
								if(reglaB[j]==true)
								{
									for (int k = bx; k < regla.length; k+=by) 
									{
										if(reglaA[k]==true)
											return "ola k ase\n";
									}
								}
							}
						}
						else if(reglaB[y]==true)
						{
								for (int i = cx; i < regla.length; i+=cy) 
								{
									if(reglaB[i]==true)
										return "ola k ase\n";
								}
								for (int j = cx; j < regla.length; j+=cy) 
								{
									if(reglaA[j]==true)
									{
										for (int k = ax; k < regla.length; k+=ay) 
										{
											if(reglaB[k]==true)
												return "ola k ase\n";
										}
									}
								}
						}
					}
			return "no\n";
		}
		else
			return "no\n";
	}
}
