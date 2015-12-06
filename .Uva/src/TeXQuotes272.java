import java.io.*;
class TeXQuotes272
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws IOException
    {
        String line="";
        String temp="";
        int counter=0;
        char ch=' ';
        int i=0;
        int len=0;
        while(((line=br.readLine())!=null) && (line.length()!=0))
        {
            temp="";
            len=line.length();
            for(i=0;i<len;i++)
            {
                ch=line.charAt(i);
                if(ch=='"')
                {
                    if(counter%2==0)
                    {
                        temp=temp+"``";
                    }
                    else
                    {
                        temp=temp+"''";
                    }
                    counter++;
                }
                else
                {
                    temp=temp+ch;
                }
            }
            System.out.println(temp);
        }
    }
}