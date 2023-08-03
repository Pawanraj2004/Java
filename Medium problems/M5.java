//Remove duplicate elements.
import java.util.*;
class M5 {
    public static int removeDuplicate(int[] nums,int n) {
        if (n==0 || n==1) {
            return 0;
        }
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++; 
                nums[j] = nums[i]; 
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,6,8,2,2,3,4,5,8,3,4,1,7,1};
        int n = nums.length+1;
        Arrays.sort(nums);
        int len = removeDuplicate(nums,n);

        System.out.println("Non-duplicate array:");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
