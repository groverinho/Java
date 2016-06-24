import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





public class anagramas {

	
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(in.readLine());
	    int c=0;
	    String a="abcdefghijklmnopqrstuvwxyz";
		char []s=a.toCharArray();
	    while (n-->0) {
	    	String p1=in.readLine();
	    	String m1=in.readLine();
	    	String p ="";
	    	String m ="";
	    	for (int i = 0; i < p1.length(); i++) {
				if (p1.charAt(i)!=' ') {
					p+=p1.charAt(i);
				}
			}
	    	
	    	
	    	for (int i = 0; i < m1.length(); i++) {
				if (m1.charAt(i)!=' ') {
					m+=m1.charAt(i);
				}
			}
	    	if (m.length()==p.length()) {
	    		int []vp=new int[s.length];
		    	int []vm=new int[s.length];
		    	for (int i = 0; i < p.length(); i++) {
					for (int j = 0; j < s.length; j++) {
						if (p.charAt(i)==s[j]) {
							vp[j]++;
							break;
						}
					}
				}
		    	for (int i = 0; i < m.length(); i++) {
					for (int j = 0; j < s.length; j++) {
						if (m.charAt(i)==s[j]) {
							vm[j]++;
							break;
						}
					}
				}
		    	boolean flag=false;
		    	for (int i = 0; i < vm.length; i++) {
					if (vp[i]!=vm[i]) {
						flag=true;
						break;
					}
				}
		    	if (flag) {
					System.out.println("No");
				}
		    	else {
					System.out.println("Si");
				}
//		    	for (int i = 0; i < vm.length; i++) {
//					System.out.println(vm[i]+" "+vp[i]);
//				}
			}
	    	else {
				System.out.println("No");
			}
	    
	    	
	    	
		}
		
	}
}