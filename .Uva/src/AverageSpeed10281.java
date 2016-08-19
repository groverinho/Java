

import java.util.*;
//============================================================================
//Name        : AverageSpeed10281
//Author      : Grover Irusta
//University  : Universidad Privada Domingo Savio - Tarija
//Date 		  : 18-08-16
//============================================================================

public class AverageSpeed10281 {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
	    double velocidad = 0.0, distancia = 0.0,tCambio = 0.0,cambio2 = 0.0;
	    while (in.hasNextLine()) {
	        String[] vect = in.nextLine().split("[ ]");
	        String[] vect2 = vect[0].split("[:]");
	        double time = Double.parseDouble(vect2[0]) + Double.parseDouble(vect2[1]) / 60.0 +Double.parseDouble(vect2[2]) / 3600.0;     
	        if (vect.length == 2)
	        {
	            cambio2 += velocidad * (time - tCambio);
	            velocidad = Double.parseDouble(vect[1]);
	            tCambio = time;
	        }
	        else 
	        {
	            distancia = cambio2 + velocidad * (time - tCambio);
	            System.out.printf("%s %.2f km%n", vect[0], distancia);
	        }
	    }
    }
}