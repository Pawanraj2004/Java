import java.util.*;
public class E24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your binary value :");
        String str = sc.next();
        int decimal=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1')
            decimal+=Math.pow(2,str.length()-(i+1));
        }
        System.out.print("Decimal value of "+str+" : "+ decimal);
        sc.close();
    }
}
