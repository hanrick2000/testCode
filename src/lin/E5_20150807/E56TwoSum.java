package lin.E5_20150807;

import java.util.HashMap;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/2-sum/
 *
 */
//2 Sum
//
//        27% Accepted
//        Given an array of integers, find two numbers such that they add up to a specific target number.
//
//        The function twoSum should return indices of the two numbers such that they add up to the target,
// where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are NOT zero-based.
//
//        Have you met this question in a real interview? Yes
//        Example
//        numbers=[2, 7, 11, 15], target=9
//
//        return [1, 2]
//
//        Note
//        You may assume that each input would have exactly one solution
//
//        Challenge
//        Either of the following solutions are acceptable:
//
//        O(1) Space, O(nlogn) Time
//        O(n) Space, O(n) Time
public class E56TwoSum {
    /*
 * @param numbers : An array of Integer
 * @param target : target = numbers[index1] + numbers[index2]
 * @return : [index1 + 1, index2 + 1] (index1 < index2)
 */
    public static int[] twoSum(int[] numbers, int target) {
        // write your code here
        HashMap<Integer, Integer> mapper = new HashMap<Integer, Integer>();
        for(int i = 0; i< numbers.length; i++) {
            if(mapper.containsKey(target-numbers[i])) {
                return new int[]{mapper.get(target - numbers[i]) + 1, i + 1};
            } else {
                mapper.put(numbers[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String [] args) {
//        numbers=[2, 7, 11, 15], target=9
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int [] returnvalues = twoSum(numbers, target);
    }
}
