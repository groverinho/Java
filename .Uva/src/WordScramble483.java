


import java.util.*;

public class WordScramble483 {
//483 
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String cadena = in.nextLine();
            String[] palabras = cadena.split("[ ]");
            for (int i = 0; i < palabras.length; ++i) {
                int n = palabras[i].length();
                char[] tmp = new char[n];
                for (int j = 0; j < n; ++j)
                    tmp[j] = palabras[i].charAt(n - j - 1);
                System.out.print(String.valueOf(tmp));
                if (i < palabras.length - 1) 
                	System.out.print(" ");
            }
            System.out.println();
        }
    }
}