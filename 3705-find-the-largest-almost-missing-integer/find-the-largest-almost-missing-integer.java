class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        int ans = -1;

        // Check every possible number
        for (int i = 0; i < n; i++) {

            int count = 0;

            // Check every subarray of size k
            for (int start = 0; start <= n - k; start++) {

                boolean found = false;

                // Check whether nums[i] exists in this window
                for (int j = start; j < start + k; j++) {

                    if (nums[j] == nums[i]) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    count++;
                }
            }

            // Appears in exactly one subarray
            if (count == 1) {
                ans = Math.max(ans, nums[i]);
            }
        }

        return ans;
    }
}