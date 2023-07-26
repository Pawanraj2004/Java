import java.util.*;
public class E16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string :");
        String str1= sc.next();
        System.out.print("Enter second string :");
        String str2= sc.next();
        if (str1.length()!=str2.length())
        System.out.print("\nStrings are not anagram.");
        else{
            char char1 [] =str1.toLowerCase().toCharArray();
            char char2 [] =str2.toLowerCase().toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            if(Arrays.equals(char1,char2)){
                System.out.println("The strings "+str1+" and " +str2+
                " are Anagrams of each other!");
            }
            else
            System.out.print("The strings "+str1+" and " +str2+
                       " are not Anagrams of each other");
        }
        sc.close();
    }
}
