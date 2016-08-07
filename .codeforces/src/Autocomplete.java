

import java.util.*;

public class Autocomplete {
//Autocomplete
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        String[]vector  = new String[n];
        for (int i = 0; i < n; i++) 
        {
        	vector[i]= in.next();
		}
        Arrays.sort(vector);
        
        for (int i = 0; i < vector.length; i++) {
        	if (s.length()<=vector[i].length()) {
        		if (vector[i].substring(0,s.length()).equals(s))
            	{
            		s = vector[i];
            		break;
    			}	
			}
        	
		}
        System.out.println(s);
    }
}