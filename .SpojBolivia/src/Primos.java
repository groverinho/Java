
import java.util.Scanner;


public class Primos {

	public static void main(String[] args) {
		int num; //declaramos nuestras variables en este caso enteras
		int divisor=2;
		boolean bandera=false; // una boleana para usa bandera 

		Scanner in = new Scanner (System.in) ; //se declarra el escaner en ""in"" entrada 

		System.out.println("ingrese el numero: " ) ; // la impresion 
		num=in.nextInt(); // la lectura del numero capturado

		while(!bandera && divisor<num) //ponemos el while con su condicion en este caso si bandera 
		{ 
		if (num%divisor==0) // un if en el cual se pregunta si el residuo de la divicion es o 
		bandera=true; // si lo es no es primo osea que se sale 
		else
		divisor++; //igual si el divisor llego al numero q se capturo este sera primo 
		}
		if (bandera) //se pregunta afuera y listo 
		System.out.println("el numero no es primo" ) ; 
		else
		System.out.println("el numero si es primo" ) ;
	}

}
