import java.util.Scanner;
class gusanoEscalando{
   public static void main(String args[]){
   int tiempo = 0;
   //Se crea el objeto de la clase lectora
   Scanner lector = new Scanner(System.in);
   //Creamos variables
 
   //Leemos la profundidad del pozo
   int h = lector.nextInt();
   //Cuanto sube el Gusano metros/minuto
   int ascenso = lector.nextInt();
   //Cuanto desciende por minuto
   int ralentizacion = lector.nextInt();
   while (h !=0 && ascenso!=0 && ralentizacion!=0)
   {
	   int minutos = 0;
	   int metros = 0;
	   boolean descanzo = false;
	   //mientras la altura sea menor a lo que avanza
	   while(h>metros)
	   {
	   //Si el gusano no esta descansando
	      if(descanzo == false)
	      {
		      metros+=ascenso;
		      descanzo = true;
		      minutos++;
	      //Si, esta descansando
	      }else
	      {
		      metros-=ralentizacion;
		      descanzo = false;
		      minutos++;
	      }
     
	   }
   System.out.println(minutos);
   h = lector.nextInt();
   ascenso =lector.nextInt();
   ralentizacion = lector.nextInt();
   //Desplegamos a gusto
   }
  
   }
}