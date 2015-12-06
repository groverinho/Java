import java.io.*;  
class tutorial  {
  public static void main(String[] args) throws IOException  
  {   
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] numeros = in.readLine().split(" ");
    System.out.println(Long.parseLong(numeros[0]) + Long.parseLong(numeros[1]));  
  }
} 