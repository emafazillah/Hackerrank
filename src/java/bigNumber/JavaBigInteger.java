package bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = new BigInteger(s.next());
        BigInteger b = new BigInteger(s.next());
        BigInteger result1 = a.add(b);
        System.out.println(result1.toString());
        BigInteger result2 = a.multiply(b);
        System.out.println(result2.toString());
        s.close();
    }

}
