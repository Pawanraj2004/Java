//Implement hashmap.(user input name and respective number)
import java.util.*;
public class M18 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number of entries :");
      int n = sc.nextInt();
      sc.nextLine();
      Map<String, Integer> maps = new HashMap<>(n);
      for(int i = 0; i<n; i++){
        System.out.print("Enter name : ");
        String str = sc.nextLine();
        System.out.print("Enter number : ");
        int m = sc.nextInt();
        sc.nextLine();
        maps.put(str,m);
      }
      String choice = "";
      do
      {
        System.out.print("Enter your name : ");
        String str2 = sc.nextLine();
        if (maps.containsKey(str2)) {
          System.out.println("Number of " + str2 + " = " + maps.get(str2));
        }else{
          System.out.println("Not found");
        }
        System.out.print("Do you want to continue ?(Y/N) : ");
        choice = sc.next();
        sc.nextLine();
      }while(choice.equals("Y"));
      sc.close();
  }
}
