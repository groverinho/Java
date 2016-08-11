import java.util.Scanner;
import java.util.Stack;
//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 11-08-16
/*
IN
3
([])
(([()])))
([()[]()])()
OUT
yes
no
yes
 */
public class ParenthesesBalance673 {

		 
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0)
        {
            String exp = in.nextLine();
            Stack<Character> pilita = new Stack<Character>();

            for (int i = 0; i < exp.length(); i++) 
            {
                char c = exp.charAt(i);
                if (!pilita.isEmpty() && pilita.peek() == '(' && c == ')')
                	pilita.pop();
                else if (!pilita.isEmpty() && pilita.peek() == '[' && c == ']')
                	pilita.pop();
                else 
                	pilita.push(c);
            }
            if (pilita.isEmpty()) 
            	System.out.println("Yes");
            else
            	System.out.println("No");

		

	}
	}
}
