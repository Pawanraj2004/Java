//Roman to integer.
import java.util.*;
class M23 {
    public static int romanToInt(String s) {
    s = s.toUpperCase();
    int result = 0;
    int prevValue = 0; 
    
    for (int i = s.length() - 1; i >= 0; i--) {
        int currentValue = getValue(s.charAt(i));
        
        if (currentValue >= prevValue) {
            result += currentValue;
        } else {
            result -= currentValue;
        }
        
        prevValue = currentValue;
    }
    
    return result;
}

private static int getValue(char c) {
    switch (c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your string consistting of (I/V/X/L/C/D/M) : ");
    String str= sc.next();
    System.out.println("Integer value of "+str+" : "+ romanToInt(str));
    sc.close();
}
}