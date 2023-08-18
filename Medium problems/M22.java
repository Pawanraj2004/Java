//Longest Common substring in two strings.
import java.util.*;
public class M22 {
    public static String longestCommonSubstring(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] arr = new int[m + 1][n + 1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                    if (arr[i][j] > maxLength) {
                        maxLength = arr[i][j];
                        endIndex = i;
                    }
                }
            }
        }

        return str1.substring(endIndex - maxLength, endIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str1 = sc.next();
        System.out.println("Enter second string : ");
        String str2 = sc.next();
        System.out.println("Longest common substring: " + longestCommonSubstring(str1, str2));
        sc.close();
    }
}
