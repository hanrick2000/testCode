package lin.M14_20150819;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/partition-array/
 */
//Partition Array
//
//        25% Accepted
//        Given an array nums of integers and an int k, partition the array (i.e move the elements in "nums") such that:
//
//        All elements < k are moved to the left
//        All elements >= k are moved to the right
//        Return the partitioning index, i.e the first index i nums[i] >= k.
//
//        Have you met this question in a real interview? Yes
//        Example
//        If nums = [3,2,2,1] and k=2, a valid answer is 1.
//
//        Note
//        You should do really partition in array nums instead of just counting the numbers of integers smaller than k.
//
//        If all elements in nums are smaller than k, then return nums.length
//
//        Challenge
//        Can you partition the array in-place and in O(n)?


public class M31ParitionArray {
    /**
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        //write your code here
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int left = -1;
        int right = nums.length;
        int i = 0;

        while(i < right) {
            if(nums[i] < k) {
                i++;
                left++;
            }else{
                swap(nums, i, --right);
            }
        }

        return left+1;

    }

    private void swap(int[] nums, int p1, int p2) {
        int tmp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = tmp;
    }
}
