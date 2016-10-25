package STRINGS;


/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 18-10-16
 */
import java.io.IOException;
import java.util.Scanner;



public class CaesarCipher {

    public static void main(String[] args) throws IOException{

       Scanner in = new Scanner(System.in);
       
        int n =  in.nextInt();
        int cambio;
        String cadena;
        String cad2="";
        for(int i = 0; i < n; i++)
        {
            cadena = in.next();
            cambio = in.nextInt();
            for(int j = 0; j < cadena.length(); j++)
            {

                char c = cadena.charAt(j);

                if(c >= 'A' + cambio && c <= 'Z'){
                    c -= cambio;
                }else{
                    c += ('Z' - 'A' + 1) - cambio;
                }

               cad2+=c;

            }
           
            System.out.println(cad2);
            cad2="";
        }
    }

}
