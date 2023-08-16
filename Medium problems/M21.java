//Valid Parenthesis.(Using stack)
import java.util.*;
class M21 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char arr[]=s.toCharArray();
        for (char c : arr) { 
            if (c == '(') 
                stack.push(')');
            else if (c == '{') 
                stack.push('}'); 
            else if (c == '[') 
                stack.push(']'); 
            else if (stack.isEmpty() || stack.pop() != c) 
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your parenthesis : ");
        String str= sc.next();
        System.out.print("Is your string valid ? :"+isValid(str));
        sc.close();
        }
}
