// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 2015-11-09
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Collection;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Scanner;
	import java.util.Set;

	public class QuickBrownFox {

	    public static void main(String[] args) throws NumberFormatException, IOException {

	        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	        
	        int casos = Integer.parseInt(entrada.readLine());
	        String s;

	        while(casos>0)
	        {
	            HashSet<String>  sett = new HashSet<String>() ;
	            s = entrada.readLine();
	            s = s.toLowerCase();
	            for(int i = 0; i < s.length(); i++)
	            {
	                if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))//||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) 
	                {
	                    String c = s.charAt(i)+"";
	                //  System.out.println(s.charAt(i));
	                    sett.add(s.charAt(i)+"");
	                }
	            }
	            //System.out.println(sett.size());
	            if(sett.size() == 26)
	                System.out.println("pangram");
	            else
	            {
	                String aux="";
	                for (char i = 'a'; i <='z'; i++) 
	                {
	                    if (!s.contains(i+""))
	                        aux += i+"";
	                }
	                System.out.println("missing "+aux);
	            }
	            casos--;
	        }}
	}