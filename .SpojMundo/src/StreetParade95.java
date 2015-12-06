
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
 class StreetParade95 
{
	 public static void main(String[] args) 
	 {
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 while(n!=0)
		 {
			 Stack<Integer> pila = new Stack<Integer>();
			 LinkedList<Integer> cola = new LinkedList<Integer>();
			 int cont =1;
			int aux=1;
			 for (int i = 0; i < n; i++)
				 cola.offer(in.nextInt());
			 
			
			 	while (cola.peek()!=null)
			 	{
			 		if (cola.peek()==cont)
			 		{
			 			cont++;
			 			cola.poll();
					} 
			 		else
			 		{
			 			pila.push(cola.peek());
			 			cola.poll();
			 			aux++;
			 		}
			 		
				}
			 	while (pila.empty()==false) 
			 	{
			 	
						if (pila.peek()>=cont)
						{
							pila.pop();
							cont++;
						}
						else
							break;
			 	}
			 
			 if (cont-1== n) 
				 System.out.println("yes");
			 else 
				 System.out.println("no");
			 n = in.nextInt();
		 }
	 }    
}