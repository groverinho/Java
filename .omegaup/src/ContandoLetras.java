import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ContandoLetras {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!entrada.ready()) {
		String inifin = entrada.readLine();
		String[] vector = new String[2];
		vector= inifin.split(" ");
		int ini =Integer.parseInt(vector[0]);
		int fin =  Integer.parseInt(vector[1]);
		String palabra =  entrada.readLine();
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		int g=0;
		int h=0;
		int ii=0;
		int j=0;
		int k=0;
		int l=0;
		int m=0;
		int n=0;
		int o=0;
		int p=0;
		int q=0;
		int r=0;
		int s=0;
		int t=0;
		int u=0;
		int v=0;
		int w=0;
		int x=0;
		int y=0;
		int z=0;
		for (int i = ini; i <= fin; i++)
		{
			if (palabra.charAt(i)=='a') {
				a++;
			}
			else if (palabra.charAt(i)=='b') {
				b++;
			}
			else if (palabra.charAt(i)=='c') {
				c++;
			}
			else if (palabra.charAt(i)=='d') {
			d++;
			}
			else if (palabra.charAt(i)=='e') {
				e++;
			}
			else if (palabra.charAt(i)=='f') {
				f++;
			}
			else if (palabra.charAt(i)=='g') {
				g++;
			}
			else if (palabra.charAt(i)=='h') {
				h++;
			}
			else if (palabra.charAt(i)=='i') {
				ii++;
			}
			else if (palabra.charAt(i)=='j') {
				j++;
			}
			else if (palabra.charAt(i)=='k') {
				k++;
			}
			else if (palabra.charAt(i)=='l') {
				l++;
			}
			else if (palabra.charAt(i)=='m') {
				m++;
			}
			else if (palabra.charAt(i)=='o') {
				o++;
			}
			else if (palabra.charAt(i)=='p') {
				p++;
			}
			else if (palabra.charAt(i)=='q') {
				q++;
			}
			else if (palabra.charAt(i)=='r') {
				r++;
			}
			else if (palabra.charAt(i)=='s') {
				s++;
			}
			else if (palabra.charAt(i)=='t') {
				t++;
			}
			else if (palabra.charAt(i)=='v') {
				v++;
			}
			else if (palabra.charAt(i)=='u') {
				u++;
			}
			else if (palabra.charAt(i)=='w') {
				w++;
			}
			else if (palabra.charAt(i)=='x') {
				x++;
			}
			else if (palabra.charAt(i)=='y') {
				y++;
			}
			else if (palabra.charAt(i)=='z') {
				z++;
			}
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		System.out.println("g="+g);
		System.out.println("h="+h);
		System.out.println("i="+ii);
		System.out.println("j="+j);
		System.out.println("k="+k);
		System.out.println("l="+l);
		System.out.println("m="+m);
		System.out.println("n="+n);
		System.out.println("o="+o);
		System.out.println("p="+p);
		System.out.println("q="+q);
		System.out.println("r="+r);
		System.out.println("s="+s);
		System.out.println("t="+t);
		System.out.println("u="+u);
		System.out.println("v="+v);
		System.out.println("w="+w);
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		}
	}

}
