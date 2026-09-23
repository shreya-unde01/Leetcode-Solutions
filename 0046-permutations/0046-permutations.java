class Solution {

    void getPerms(int[] nums, int idx, List<List<Integer>> ans) {

        if (idx == nums.length) {
            List<Integer> temp = new ArrayList<>();

            for (int x : nums) {
                temp.add(x);
            }

            ans.add(temp);
            return;
        }

        for (int i = idx; i < nums.length; i++) {

            // swap
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;

            getPerms(nums, idx + 1, ans);

            // backtracking
            temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        getPerms(nums, 0, ans);

        return ans;
    }
}