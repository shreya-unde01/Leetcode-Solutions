class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        if (Math.abs(target) > total) {
            return 0;
        }

        if ((total + target) % 2 != 0) {
            return 0;
        }

        int required = (total + target) / 2;

        int[] dp = new int[required + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = required; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[required];
    }
}