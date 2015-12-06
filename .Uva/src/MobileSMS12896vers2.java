
import java.util.Scanner;
 
public class MobileSMS12896vers2 
{
 static final String[] teclado = {" ",".,?\"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

   int casos = input.nextInt(); 
   while(casos--> 0)
   {
	    int digitos = input.nextInt();
	    int[] tecla = new int[digitos];
	     
	    for(int i = 0; i < tecla.length; ++i)
	    	tecla[i] = input.nextInt();
	    
	    int[] veces = new int[digitos];
	    for(int i = 0; i < veces.length; ++i)
	     veces[i] = input.nextInt();
	    
	    StringBuilder mensaje = new StringBuilder();   
	    for(int i = 0; i < digitos; ++i)
	    	mensaje.append(teclado[tecla[i]].charAt((veces[i] - 1) % teclado[tecla[i]].length()));  
	     
	    System.out.println(mensaje);
   }
 }
}