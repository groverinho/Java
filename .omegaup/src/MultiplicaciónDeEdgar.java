import java.util.Scanner;


public class MultiplicaciónDeEdgar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		String m = in.nextLine();
		char[] vectorN =  n.toCharArray();
		char[] vectorM =  m.toCharArray();
		int cont = 0;
		int tamanoM = vectorM.length;
		int j =0;
		int acumulador = 0;
		int i=0;
		for (int ii = 0;  ii < vectorN.length*2;ii++) 
		{
			if (j >= tamanoM) 
				j=0;
			if (cont==2)
			{
				 i++;
				 cont=0;
			}
			cont++;
			
			acumulador+=  Integer.parseInt(vectorN[i]+"")* Integer.parseInt(vectorM[j]+"");
			j++;
			
		}
		System.out.println(acumulador);

	}

}
