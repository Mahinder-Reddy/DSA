class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            // Duplicate found
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(s.charAt(right));

            // Calculate window length
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}