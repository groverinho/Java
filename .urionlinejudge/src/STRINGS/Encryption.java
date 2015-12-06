package STRINGS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encryption {

    public static void main(String[] args) throws IOException{

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(entrada.readLine());
        String cadena;
        int tamano; 
        for(int i = 0; i < n; i++)
        {
        	String encriptacion = "";
        	cadena = entrada.readLine();
            tamano = cadena.length();
            char c = 0;
            for(int j = tamano - 1; j >= 0; j--)
            {
                 c = cadena.charAt(j);
                if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')
                    c += 3;
                
                if(j <= Math.ceil(tamano/2.0) - 1)
                    c -= 1;
                encriptacion+= c;
            }

            System.out.println(encriptacion);
        }

        
        
    }

}
