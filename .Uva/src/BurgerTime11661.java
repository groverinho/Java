package ContestFinalCamp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class BurgerTime11661 {

	public static void main(String[] args) throws IOException {
			
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
			String tem = in.readLine();
			int n=Integer.parseInt(tem);
			
			while(n > 0){
				String cadena = in.readLine();
				int bandera =0; // 1 es R 	0 es no empezo y 2 es D  
				int dist=0;
				int minDist = 2000030;
				int indexIni =0;
				for (int i = 0; i < cadena.length(); i++) 
				{
					if (cadena.charAt(i)=='Z') {
						minDist = 0;
						break;
					}
					else
					{
						if (cadena.charAt(i)=='R') 
						{
							if (bandera==0)
							{
							}
							else if(bandera==1)
							{
								
							}
							else{
								dist = i - indexIni;
								if(dist < minDist){
									minDist = dist;
								}
								
							}
							bandera = 1;
							indexIni = i;
						}
						else if(cadena.charAt(i) == 'D'){
							if (bandera==0)
							{
							}
							else if(bandera==2)
							{
								
							}
							else{
								dist = i - indexIni;
								if(dist < minDist){
									minDist = dist;
								}
								
							}
							bandera = 2;
							indexIni = i;
						}
					}
				}
				System.out.println(minDist);
				
				tem = in.readLine();
				n=Integer.parseInt(tem);
				
			}
			
			}
		}
		
	


