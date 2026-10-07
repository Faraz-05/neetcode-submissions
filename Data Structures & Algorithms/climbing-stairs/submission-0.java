class Solution {
    public int climbStairs(int n) {
        // Base cases: 1 way to climb 1 step, 2 ways to climb 2 steps
        if (n <= 2) {
            return n;
        }
        
        int first = 1;
        int second = 2;
        
        // Iteratively calculate the ways to reach the nth step
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        
        return second;
    }
}
