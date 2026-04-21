// Leetcode 80: Remove Duplicates from Sorted Array II

public class Ques4_leetcode80 {
     public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
