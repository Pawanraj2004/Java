import java.util.*;
public class E18 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        System.out.print("Enter power :");
        int pow=sc.nextInt();
        System.out.print(num+"^"+pow+" = "+Math.pow(num,pow));        
        sc.close();
    }
}
