//Count the Number of Vowels in a String
import java.util.*;
public class E12 {
    public static void main(String[] args) {
        System.out.print("Enter your string :");
        Scanner sc = new Scanner (System.in);
        String str= sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ||
            str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U')
            count++;
        }
        System.out.print("Number of vowels in "+str+" are "+count);
        sc.close();
    }
}
