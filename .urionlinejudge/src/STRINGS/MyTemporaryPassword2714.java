import java.util.Scanner;

/**
 @author Grover Irusta Miranda
 @date 6/7/2020
 @company Mojix/Xtime
 */

public class MyTemporaryPassword2714 {

	/**
7
RA000000000000000001
RA000000000000000100
RA000000000000012345
RA123456789012345678
ra000000000000000333
RA12345
12345678901234567890	
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c=0;
		while(n-->0){
			String password=in.next();
			if (password.startsWith("RA") && password.substring(2,password.length()).length()>=18) {
				String newPassword= password.substring(2,password.length());
				
				// System.out.println(newPassword);
				for (int i = 0; i < newPassword.length(); i++) {
					if(newPassword.charAt(i)!='0'){
						 newPassword= newPassword.substring(i,newPassword.length());
						 break;
				}
					
					
					 
				}
				//newPassword.replaceAll("0", "");
				System.out.println(newPassword);
			} else {
				System.out.println("INVALID DATA");
			}
			
			
		}
	}

}
