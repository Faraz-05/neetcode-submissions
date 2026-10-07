class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int first = cost[0];
        int second = cost[1];
        
        // Calculate the minimum cost to reach each subsequent step
        for (int i = 2; i < cost.length; i++) {
            int current = cost[i] + Math.min(first, second);
            first = second;
            second = current;
        }
        
        // The top of the stairs can be reached from either the last or second-to-last step
        return Math.min(first, second);
    }
}
