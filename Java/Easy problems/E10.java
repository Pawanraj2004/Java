//Reverse a string.
import java.util.*;
public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your string :");
        String str= sc.next();
        int n=str.length();
        String str2="";
        for(int i=0;i<n ;i++){
            str2=str.charAt(i)+ str2;
    }
    System.out.print(" Reverse of your string is :"+ str2);
    sc.close();
}
}
