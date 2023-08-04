//List implementation insertion and deletion..
import java.util.*;
class M7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter number of elements :");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
         System.out.println("Your list :"+list);
        System.out.print("Enter number of queries :");
        int q = sc.nextInt();
        while (q!=0){
            System.out.print("Enter 'Insert' or 'Delete' :");
            String s1=sc.next();
            if ("Insert".equals(s1)){
                System.out.println("Enter element to insert with location :");
                int e = sc.nextInt();
                int l = sc.nextInt();
                list.add(l,e);}
            else if("Delete".equals(s1)){
                System.out.println("Enter the element to delete:");
                int d = sc.nextInt();
                list.remove(Integer.valueOf(d));
            }
            else
            System.out.println("Enter valid choice.");
            q--;
            }
            System.out.println("Your new list :"+list);
            sc.close();
}
}