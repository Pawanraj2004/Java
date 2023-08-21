//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?

import java.util.*;

public class M25 {
    public static boolean threeSum(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    return true;
                }
            }
        }
    }
    return false;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("There are elements a, b, c in nums such that a + b + c = 0 : "+threeSum(arr));
        sc.close();
       }
    
}
