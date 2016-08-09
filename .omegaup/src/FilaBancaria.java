import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class FilaBancaria {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		Queue<Character> cola = new LinkedList<Character>();
	//	Queue<Character> colaAux = new LinkedList<Character>();
		Queue<Character> colaAux2 = new LinkedList<Character>();
		while (n-->0) 
		{
			char c = in.next().charAt(0);
			cola.add(c);
			colaAux2.add(c);
		}
		int index=0;
		while (!colaAux2.isEmpty()) 
		{

			if(colaAux2.peek()=='N')
			{
			
				while (cola.peek()!='N')
				{
					index++;
					cola.poll();
					
				}
				cola.poll();
				if (index<4) System.out.println("espera");
				else System.out.println("no espera");
				
			}
			else if(colaAux2.peek()=='F')
			{

				cola.poll();
				index--;
			}
			colaAux2.poll();
		}

	}

}
