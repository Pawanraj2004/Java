import java.util.*;
public class E11{
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter your string :");
    String str= sc.next();
    String rev="";
    for(int i=0;i<str.length() ;i++){
        rev= str.charAt(i) + rev;
    }
    if(str.toLowerCase().equals(rev.toLowerCase()))
    System.out.println(str + " is a palindrome." );
    else
    System.out.println(str + " is not a palindrome.");
    sc.close();
   }
}