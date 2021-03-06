package lin.E1_20150803;

import java.util.ArrayList;

/**
 * Created by Paul on 8/2/15.
 * http://www.lintcode.com/en/problem/fizz-buzz/
 */

//Fizz Buzz
//
//        81% Accepted
//        Given number n. Print number from 1 to n. But:
//
//        when number is divided by 3, print "fizz".
//        when number is divided by 5, print "buzz".
//        when number is divided by both 3 and 5, print "fizz buzz".
//        Have you met this question in a real interview? Yes
//        Example
//        If n = 15, you should return:
//
//        ["1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizz buzz"]
//
//        Tags Expand
public class E9FizzBuzz {
    /**
     * param n: As description.
     * return: A list of strings.
     */
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> results = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                results.add("fizz buzz");
            } else if (i % 5 == 0) {
                results.add("buzz");
            } else if (i % 3 == 0) {
                results.add("fizz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }
}
