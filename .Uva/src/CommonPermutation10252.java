

import java.util.*;

public class CommonPermutation10252 {
//10252 Common Permutation
    public static void main(String[] args) throws Exception {
        			Scanner in = new Scanner(System.in);      			
        			while (in.hasNext()) {
        				String cad1 = in.nextLine().trim();
        				String cad2 = in.nextLine().trim();
        				if (cad1.isEmpty() || cad2.isEmpty()) {
        					System.out.println();
        					continue;
        				}
        				char[] a = cad1.toCharArray();
        				char[] b = cad2.toCharArray();
        				Arrays.sort(a);
        				Arrays.sort(b);
        				int cont = 0;
        				String aux = "";
        				for (int i = 0; i < a.length;i++) 
        				{
        					while (cont < b.length && a[i] > b[cont])
        						cont++;
        					if (cont < b.length && a[i] == b[cont])
        					{
        						aux += a[i];
        						cont++;
        					}
        				}
        				if (aux.isEmpty())
        					System.out.println();
        				else 
        				{
        					char[] vectorAux = aux.toCharArray();
        					Arrays.sort(vectorAux);
        					aux = String.valueOf(vectorAux);
        					System.out.println(aux);
        				}
        			}    
//        			while (in.hasNext()) {
//						
//					
//        String cad1 = in.nextLine().trim();
//        String cad2 = in.nextLine().trim();
//        Set<Character> set1 = new HashSet<Character>();
//        Set<Character> set2= new HashSet<Character>();
//        for (int i = 0; i < cad1.length(); i++) {
//			set1.add(cad1.charAt(i));
//		}
//        for (int i = 0; i < cad2.length(); i++) {
//        	set2.add(cad2.charAt(i));
//		}
//        String s = "";
//        for (Character character : set1)
//        {
//        	if (set2.contains(character))
//        	{
//        		s+= character+"";
//			}
//		}
//        char[] vector = s.toCharArray();
//        Arrays.sort(vector);
//        for (int i = 0; i < vector.length; i++) {
//        	System.out.print(vector[i]);
//		}
//        System.out.println();
//        
//    }
        			}
    
}