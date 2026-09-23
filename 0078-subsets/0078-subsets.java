class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        getSubsets(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    void getSubsets(int[] nums, int idx, List<Integer> current,
                    List<List<Integer>> ans) {

        // Add current subset
        ans.add(new ArrayList<>(current));

        // Try every element from idx
        for (int i = idx; i < nums.length; i++) {

            // Choose
            current.add(nums[i]);

            // Recursion
            getSubsets(nums, i + 1, current, ans);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}