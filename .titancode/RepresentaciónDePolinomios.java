import java.util.Scanner;



public class RepresentaciónDePolinomios {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String casos  = in.nextLine();
	int casos1 = Integer.parseInt(casos);
	while (casos1 -->0)
	{
		String num = in.nextLine();
		String aux = "";
		if (num.charAt(0)=='0')
		{
			for (int i = 1; i < num.length(); i++)
			{
				if (num.charAt(i)!= ' ' &&num.charAt(i)!= '0' ) 
				{
					aux = num.substring(i,num.length());
					break;
				}	
			}
		}
		else
			aux = num;
	//	System.out.println(aux);
		String [] numeros = aux.split(" ");
		String polinomio = "";
		int j = numeros.length-1;
		for (int i = 0; i < numeros.length ; i++) 
		{
			if (numeros[i].equals("0")) 
			{
				j--;
				continue;
			}
			else if( i==0 && Integer.parseInt(numeros[i])<0)
			{
				
				if (Integer.parseInt(numeros[i])==-1)
				{
					polinomio+="-x^"+(j);
				}
				else
				{
					polinomio+= numeros[i]+ "x^"+(j);
				}
			}
			else if( i==0 && Integer.parseInt(numeros[i])>0)
			{
				if (Integer.parseInt(numeros[i])==1)
				{
					polinomio+="x^"+(j);
				}
				else
				{
					polinomio+= numeros[i]+ "x^"+(j);
				}
			}
			else if ( i==numeros.length-1 && Integer.parseInt(numeros[i])!=0)
			{
				if (Integer.parseInt(numeros[i])>0) 
				{
					polinomio += " + "+numeros[i];
				}
				else
				{
					polinomio += " - "+Math.abs(Integer.parseInt(numeros[i]));
				}
			}
			else if(Integer.parseInt(numeros[i])==1)
			{
				polinomio += " + ";
				polinomio+="x^"+(j);
			}
			else if(Integer.parseInt(numeros[i])==-1)
			{
				polinomio += " - ";
				polinomio+="x^"+(j);
			}
			else if( Integer.parseInt(numeros[i])>1)
			{
				polinomio += " + ";
				polinomio+= numeros[i]+ "x^"+(j);
			}
			else
			{
				polinomio += " - ";
				polinomio+= Math.abs(Integer.parseInt(numeros[i]))+ "x^"+(j);
			}
			j--;
		}
		polinomio = polinomio.replace("^1", "");
		polinomio = polinomio.replace("^0", "");
//		if (polinomio.charAt(polinomio.length()-1)=='x')
//		{
//			polinomio
//		}
		System.out.println(polinomio);
	}

	}

}
