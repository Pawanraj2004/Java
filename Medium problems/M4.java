//Find missing number in an array.
public class M4 {
    public static int findMissingNumber(int[] nums, int n) {
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 3, 5, 8};
        int n = nums.length+ 1;
        int missingNumber = findMissingNumber(nums,n);
        System.out.println("The missing number is: " + missingNumber);
    }
}