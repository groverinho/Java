package STRINGS;
import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - Mojix
Date 11/04/18
 */
public class PasswordsValidator2253 {

	public static boolean condition1(String c){
		return c.length()>5 && c.length()<33;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String c = in.nextLine();

			String s1 = "";
			 int u=0,sm=0;
			for (int i = 0; i < c.length(); i++) {

			
				 if(Character.isLowerCase(c.charAt(i)) || Character.isUpperCase(c.charAt(i)) ||Character.isDigit(c.charAt(i))){
	                    s1 += c.charAt(i);
	                    if(Character.isUpperCase(c.charAt(i)))u++;
	                    if(Character.isLowerCase(c.charAt(i)))sm++;
	                }else{
	                    break;
	                }
			}
			if(s1.length() == c.length() && u>0 && sm>0 && condition1(c)){
				System.out.println("Senha valida.");
			}
			else{
				System.out.println("Senha invalida.");
			}
			
		}
	}

}
