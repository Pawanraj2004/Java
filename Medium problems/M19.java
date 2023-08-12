//Implementing Arraylist.
import java.util.*;
public class M19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arraylist = new ArrayList<>();
        System.out.println("ArrayList Program");
        System.out.println("\n1. Add Number");
            System.out.println("2. Display Numbers");
            System.out.println("3. Exit");
        int choice;
        do{
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    arraylist.add(num);
                    System.out.println("Number added to the list.");
                    break;
                case 2:
                    if (arraylist.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.print("Elements in the list:");
                        for (int number : arraylist) {
                            System.out.println(number);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exit.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }while(choice!=3);
    }
}

