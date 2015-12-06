package STRINGS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dancingsentences{
	  public static void main(String[] args) throws IOException 
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int casos = Integer.parseInt(br.readLine());
	        while (casos>0) 
	        {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        int length;
	        boolean up;
	            up = true;
	            length = line.length();
	            for(int i = 0; i < length; i++)
	            {
	                char c = line.charAt(i);
	                if(Character.isLetter(c))
	                {
	                    c = up ? Character.toUpperCase(c) : Character.toLowerCase(c);
	                    up = !up;
	                }
	                sb.append(c);
	            }
	            sb.append("\n");
	            System.out.print(sb);
	            casos--;
	        }
	     
	    }
	}