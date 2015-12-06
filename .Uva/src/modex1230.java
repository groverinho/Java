import java.util.Scanner;
import java.math.BigInteger;

class modex1230 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int c = in.nextInt();
    while (c-- > 0) {
      BigInteger x = BigInteger.valueOf(in.nextInt()); 
      BigInteger y = BigInteger.valueOf(in.nextInt());
      BigInteger n = BigInteger.valueOf(in.nextInt()); 
      System.out.println(x.modPow(y, n));
} } }

