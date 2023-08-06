//Count words in a string.
import java.util.*;
public class M11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        String[] count = str.trim().split("\\s+");
        if(str==null || str.isEmpty()){
            System.out.println("Number of words in the string: 0");
        }
        else
        System.out.println("Number of words in the string: " + count.length);
        sc.close();
    }
}
