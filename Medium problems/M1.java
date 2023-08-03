//BigInteger
import java.util.*;
import java.math.*;

public class M1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter a :");
    BigInteger a=new BigInteger(sc.nextLine());
    System.out.println("Enter b :");
    BigInteger b=new BigInteger(sc.nextLine());
    System.out.println("a+b:"+a.add(b));
    System.out.println("a*b:"+a.multiply(b));
    sc.close();
    }
}