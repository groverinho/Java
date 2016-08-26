// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 2015-06-20


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class EightQueens {

	    public static ArrayList<String> jugadas = new ArrayList<String>();
	    public static boolean isConsistent(int[] q, int n) 
	    {
	        for (int i = 0; i < n; i++) 
	        {
	            if (q[i] == q[n])             return false;   // same column
	            if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
	            if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
	        }
	        return true;
	    }

	    public static void printQueens(int[] q) 
	    {
	        int N = q.length;
	        String auxCad = "";
	        
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                if (q[i] == j) auxCad= auxCad+"*";// System.out.print("*");
	                else  auxCad=auxCad+".";//         System.out.print(".");
	            }
	        }  
	        jugadas.add(auxCad);
	    }

	    public static void enumerate(int N) 
	    {
	        int[] a = new int[N];
	        enumerate(a, 0);
	    }

	    public static void enumerate(int[] q, int n)
	    {
	        int N = q.length;
	        if (n == N) 
	            printQueens(q);
	        else 
	        {
	            for (int i = 0; i < N; i++) 
	            {
	                q[n] = i;
	                if (isConsistent(q, n)) 
	                    enumerate(q, n+1);
	            }
	        }
	    }  
	    public static void main(String[] args) throws IOException
	    {
	        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	        int a=8;
	        enumerate(a);

	            String aux2 = "";
	            for (int i = 0; i < 8; i++) 
	            {
	                String cad = entrada.readLine();
	                    aux2 = aux2 + cad;
	            }
	            boolean lol = true;
	            for (int i = 0; i < jugadas.size(); i++) 
	            {
	                if (jugadas.get(i).equals(aux2))
	                {
	                    lol = false;
	                    break;
	                }
	            }
	            if (lol==true)
	                System.out.println("invalid");
	            else
	                System.out.println("valid");
	        
	    }

	}