
// leetcode 26. Remove Duplicates from Sorted Array

public class Ques3_leetcode_26 {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!= nums[i-1]) {
                 nums[index++] = nums[i];
            }
        }
        return index;
    }
}
