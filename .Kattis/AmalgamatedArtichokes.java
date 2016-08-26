// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 2015-06-14

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
//81.40757506248647
//38.219528322311376
//133.16690151630578
//141.983307301143
//54.94859672376071
//91.1647580043288
//37.12819682374881
//39.01902030703627
//149.15333957535404
//99.11023586679883
public class AmalgamatedArtichokes {
    public static double ecuacion(double p ,double a, double b, double c, double d , double n)
        {
                double precio = p * (Math.sin((a*n)+b)+ Math.cos((c*n)+d)+2); 
                return precio;
        }
        public static void main(String[] args) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String variables = "";
                String[] vector;
                double p, a , b , c ,d ,n;
                ArrayList<Double> lista ;
                double max;    
                while ( (variables = in.readLine())!=null)
                {
                 vector = variables.split(" ");
                 p =Double.parseDouble(vector[0]);
                 a = Double.parseDouble(vector[1]);
                 b = Double.parseDouble(vector[2]);
                 c =Double.parseDouble( vector[3]);
                 d = Double.parseDouble(vector[4]); 
                 n = Double.parseDouble(vector[5]);
                 lista = new ArrayList<Double>();
                for (double i = 1; i <= n; i++) 
                        lista.add(ecuacion(p, a, b, c, d, i));
//                for (int i = 0; i < lista.size(); i++) {
//                  System.out.println(lista.get(i));
//              }
                     max = 0;       
                     int j=0;
                    for (int i = 0 ; i < lista.size(); i++)
                    {
                    
                                    if (lista.get(j)>lista.get(i))
                                    {
                                            if (lista.get(j)- lista.get(i)> max) 
                                max = lista.get(j)- lista.get(i);  
                                       
                                    }
                                    else
                                            j=i;
                            
                                    
                    }
                System.out.printf("%.6f\n",max);
                }
        }
}