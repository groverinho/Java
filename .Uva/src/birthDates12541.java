import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;
import java.util.Map.Entry;


public class birthDates12541 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Integer,String> mapa = new HashMap<Integer,String>();
		int max = -1;
		int min = 999999999;
		int casos = in.nextInt();
		for (int i = 0; i < casos; i++)
		{
			String nombre = in.next();
	    	 int dia = in.nextInt();
	 	    int mes = in.nextInt() * 100;
	 	    int anio = in.nextInt()* 10000;
	 	   int resultado = dia+ mes+ anio;
	 	    min = Math.min(min, resultado);
	 	    max = Math.max(max, resultado);
	 	    mapa.put(resultado,nombre);
		}
		System.out.println(mapa.get(max));
		System.out.println(mapa.get(min));
	}

}
