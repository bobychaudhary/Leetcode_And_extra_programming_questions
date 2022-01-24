/*
Input: num = 14
Output: 6
Explanation: 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0.
*/
class Solution {
    public int numberOfSteps(int n) {
        return helper(n, 0);
    }
    static int helper(int n, int steps) {
        if(n==0) {
            return steps;
        }
        if(n%2==0) {
            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }
}