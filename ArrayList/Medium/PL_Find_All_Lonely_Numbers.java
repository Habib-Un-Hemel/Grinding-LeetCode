//Question LInk: https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/


import java.util.*;

public class PL_Find_All_Lonely_Numbers{
    public static ArrayList<Integer> find_lonely(ArrayList<Integer> nums){
        Collections.sort(nums);
        System.out.println(nums);
        ArrayList <Integer> result = new ArrayList<>();
        int n = nums.size();
        for(int i =0 ; i<n;i++){
            if ((i != 0 && (nums.get(i) == nums.get(i-1)  || nums.get(i)  - 1 == nums.get(i-1))) || 
                (i != n - 1 && (nums.get(i)  == nums.get(i+1) || nums.get(i)  + 1 == nums.get(i+1)))) {
            continue;
            }
            result.add(nums.get(i));
        System.out.println(result);

        }return result;
        
    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(8);
        nums.add(3);
        nums.add(5);
        nums.add(9);
        nums.add(11);
        nums.add(15);
         System.out.println(find_lonely(nums));
    }
}



/* my leetcode code
 * import java.util.*;
class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
        if ((i != 0 && (nums[i] == nums[i-1] || nums[i] - 1 == nums[i-1])) || 
                (i != n - 1 && (nums[i] == nums[i+1] || nums[i] + 1 == nums[i+1]))) {
        continue;
        }
            result.add(nums[i]);
        }
        return result;
    }
}

 */




/*  the error i got at the first -> shei shei 

 1. Operator Precedence:
In Java, different operators have different levels of precedence (priority). Operators with higher precedence are evaluated before those with lower precedence.

For example:

&& (AND) has a higher precedence than || (OR).
This means conditions using && are evaluated first, even if they are combined with ||.
2. How the Computer Reads the Condition:
Given this condition:



 +++++++++problem+++++++++++++++
if (i != 0 && nums[i] == nums[i-1] || nums[i]-1 == nums[i-1]) {
    continue;
}


The computer evaluates it as:
java
Copy code
(i != 0 && nums[i] == nums[i-1]) || nums[i]-1 == nums[i-1]
Here’s why:
&& between i != 0 and nums[i] == nums[i-1] is evaluated first because it has higher precedence.
|| connects this result to nums[i]-1 == nums[i-1].
So, even if i == 0, the part nums[i]-1 == nums[i-1] is still evaluated, which tries to access nums[-1].

3. Why i != 0 Doesn’t Stop the Error:
You might expect the check i != 0 to prevent the program from looking at nums[i-1].
However, because || allows the second part (nums[i]-1 == nums[i-1]) to be evaluated separately, the program doesn’t stop when i == 0.
4. How Parentheses Solve It:
When you add parentheses:

java
Copy code
if ((i != 0 && (nums[i] == nums[i-1] || nums[i]-1 == nums[i-1]))) {
    continue;
}
Now the computer is forced to evaluate the part inside (i != 0 && (...)) as a whole before moving to the ||.
This ensures that if i == 0, the program skips the entire check and never tries to access nums[-1].
In Simple Words:
Without parentheses:

The program sometimes ignores i != 0 because of the way && and || are prioritized.
It ends up checking nums[-1], which causes an error.
With parentheses:

The program is told to fully check i != 0 first before doing anything else.
This prevents it from accessing invalid parts of the array.


*/