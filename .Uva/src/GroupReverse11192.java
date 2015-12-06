
import java.util.Scanner;
class GroupReverse11192
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        while(true)
        {
            int grupos=in.nextInt();
            if(grupos==0)
            {
                break;
            }
            String cad=in.next();
            int rango=(cad.length())/grupos;
            int cont=0;
            for(int i=0;i<grupos;i++)
            {
                reverse(cad.substring(cont,cont+rango));
                cont=cont+rango;
            }
            System.out.println();
        }
    }
    static void reverse(String s)
    {
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}