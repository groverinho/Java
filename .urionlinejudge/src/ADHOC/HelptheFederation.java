package ADHOC;
import java.util.Scanner;


public class HelptheFederation 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		int casos = entrada.nextInt();
		for (int i = 0; i < casos; i++)
		{
			int equipos = entrada.nextInt();
			int partidos = entrada.nextInt();
			String []equip = new String[equipos];
			int puntos[] = new int [equipos];
			for (int j = 0; j < equipos; j++) 
			{
				equip[j]=entrada.next();
			}
			String[][]part = new String[partidos][4];
			for (int j = 0; j < partidos; j++)
			{
				String cadena= entrada2.nextLine();
				part[j] = cadena.split(" ");
				if(Integer.parseInt(part[j][0])>Integer.parseInt(part[j][2]))
				{
					for (int j2 = 0; j2 < equip.length; j2++)
					{
						if(part[j][1].equals(equip[j2]))
							puntos [j2]+=3;
					}
				}
				else if(Integer.parseInt(part[j][0])<Integer.parseInt(part[j][2]))
				{
					for (int j2 = 0; j2 < equip.length; j2++)
					{
						if(part[j][3].equals(equip[j2]))
							puntos [j2]+=3;
					}
				}
				else
				{
					for (int j2 = 0; j2 < equip.length; j2++)
					{
						if(part[j][1].equals(equip[j2]))
							puntos [j2]+=1;
						else if(part[j][3].equals(equip[j2]))
							puntos [j2]+=1;
					}
				}
			}
			
			
			for (int j = 0; j < part.length; j++) {
				for (int j2 = 0; j2 < part[1].length; j2++) {
					System.out.println("matriz "+j+" "+j2+"= "+part[j][j2]);
				}
			}
			
			for (int j = 0; j < puntos.length; j++)
			{
				System.out.println(equip[j]+" = "+puntos[j]);
			}
		}

	}

}
