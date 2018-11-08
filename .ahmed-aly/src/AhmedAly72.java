import java.util.Scanner;
import java.io.*;

import javax.swing.InputMap;

public class AhmedAly72 {
    public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(in.readLine());
        for (int i = 1; i <=n; i++) {
            String cad = in.readLine();
            String v [] = cad.split(" ");
            System.out.print("Case "+i+": ");
            
            if(v[1].equals("+")){
                System.out.println( Integer.parseInt(v[0]) + Integer.parseInt(v[2])!=Integer.parseInt(v[4])?"NO":"YES");    
            }else if(v[1].equals("-")){
                System.out.println( Integer.parseInt(v[0]) - Integer.parseInt(v[2])!=Integer.parseInt(v[4])?"NO":"YES");
            }else if(v[1].equals("*")){
                System.out.println( Integer.parseInt(v[0]) * Integer.parseInt(v[2])!=Integer.parseInt(v[4])?"NO":"YES");
            }
            else if (v[1].equals("/")){
                System.out.println( Integer.parseInt(v[0]) / Integer.parseInt(v[2])!=Integer.parseInt(v[4])?"NO":"YES");
            }
            
        }
        

    
    }
}
