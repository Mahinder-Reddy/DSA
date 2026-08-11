class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        recpermu(nums, new ArrayList<>(), ans);

        return ans;
    }

    public void recpermu(int[] nums,
                         List<Integer> permu,
                         List<List<Integer>> ans) {

        if (nums.length == 0) {
            ans.add(new ArrayList<>(permu));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            int cur = nums[i];

            // Remove current element
            int[] newnums = new int[nums.length - 1];

            int j = 0;
            for (int k = 0; k < nums.length; k++) {
                if (k != i) {
                    newnums[j++] = nums[k];
                }
            }

            // Choose current element
            permu.add(cur);

            // Recursion
            recpermu(newnums, permu, ans);

            // Backtrack
            permu.remove(permu.size() - 1);
        }
    }
}